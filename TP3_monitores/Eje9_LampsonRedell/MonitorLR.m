_monitor MonitorLR {

    _ private static final int N = 5; //Size of the buffer

    _var int[] buffer = new int[N];
    _var int front;
    _var int rear;
    _var int count;

    _condvar puedoProducir;
    _condvar puedoConsumir;  

    _proc void depositar(int data){
        while(count == N){
            _wait(puedoProducir);
        }
        _signal(puedoConsumir); //despierta al siguiente y sigue ejecutando.
        buffer[rear] = data;
        rear=(rear+1)%N;
        count++;
        //PREGUNTA: por mas que el proceso despertado espere, es necesario colocar el signal aca? estando arriba se nota bien que es un LR
    }

    _proc int consumir(){
        while(count == 0){
            _wait(puedoConsumir);
        }

        _signal(puedoProducir);
        int result = buffer[front];
        front= (front+1)%N;
        count--;
        _return result;
    }
}