_monitor MonitorHoare { //sin prioridades
    private static final int N = 5; //Size of the buffer

    _var int[] buffer = new int[N];
    _var int front;
    _var int rear;
    _var int cantLector;
    _var int cantEscritor;
    _var int lectoresEsperando;
    _var int escritoresEsperando;

    _condvar puedoEscribir;
    _condvar puedoLeer;  

    _proc void escribir(int data){
        escritoresEsperando++;
        //While: despues de despertar, el proceso vuelve a verificar la condicion, 
        // y solo entra al monitor si se sigue cumpliendo lo que esperaba.
        while(cantLector > 0 || cantEscritor > 0 ){
            _wait(puedoEscribir);
        }
        escritoresEsperando--;
        cantEscritor++;

        System.out.println(data + " escribe" );
        buffer[rear] = data;
        rear = (rear + 1) % N;

        cantEscritor--;
        if(escritoresEsperando>0){
            _signal(puedoEscribir);
        }else{
            _signal(puedoLeer);
        } 
    }

    _proc void leer(){
        lectoresEsperando++;
        while(cantEscritor>0 || escritoresEsperando>0){
            _wait(puedoLeer);
        }
        lectoresEsperando--;
        cantLector++;

        int result = buffer[front];
        System.out.println(" lee : "+ result);
        front = (front + 1) % N;

        cantLector--;
        if(cantLector == 0 && escritoresEsperando>0){
            _signal(puedoEscribir);
        }else{
            _signal(puedoLeer);
        }
    }

}

//Para compilar y hacer un Singal and Wait es de esta manera    m2jr -sw MonitorTest.m
