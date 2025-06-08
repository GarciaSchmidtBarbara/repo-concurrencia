//a)	Puede haber N clientes esperando en la barbería, además de quien está sentado en el sillón de corte.
//b)	Hay un único sillón para corte y un único Barbero que además cobra en la única caja disponible.
_monitor MonitorBarberia {

    _ private static final int N = 5; //Sillas de clientes

    _var int[] buffer = new int[N];
    _var int sig; //proximo a ser atendido
    _var int ult; //ultimo en la fila
    _var int cant:
    _var int clientesEsperando;

    _condvar puedoEsperar;
    _condvar puedoAtender;  

    _proc void dormir(){
        while(clientesEsperando=0){
            _wait(puedoAtender);
        }
    }

    _proc bool hayLugar(){
        if(cant<N) return true;
        else return false
    }

    _proc void ingresaCliente(int data){
        if(clientesEsperando==0){
            _signal(puedoAtender)
        }
        while(count == N){
            _wait(puedoProducir);
        }
        _signal(puedoConsumir); //despierta al siguiente y sigue ejecutando.
        buffer[rear] = data;
        rear=(rear+1)%N;
        count++;
        //PREGUNTA: por mas que el proceso despertado espere, es necesario colocar el signal aca? estando arriba se nota bien que es un LR
    }

    _proc void atenderCliente(){
        while(count == 0){
            _wait(puedoConsumir);
        }

        _signal(puedoProducir);
        int result = buffer[front];
        front= (front+1)%N;
        count--;
        _return result;
    }

    _proc void cobrar(){

    }

    
}