_monitor MonitorHoare {
    private static final int N = 5; //Size of the buffer

    _var int[] buffer = new int[N];
    _var int front;
    _var int rear;
    _var int count;
    _var int cantLector;
    _var int cantEscritor;

    _condvar puedoEscribir;
    _condvar puedoLeer;  

    _proc void escribir(int data){
        while(cantLector > 0){
            _wait(puedoEscribir);
        }

        cantEscritor++;
        System.out.println(data + " escribe" );
        buffer[rear] = data;
        rear = (rear + 1) % N;
        count++;

        cantEscritor--;

        if(cantLector > 0){
            _signal(puedoLeer);
        }
    }

    _proc void leer(){
        cantLector++;

        if(cantEscritor > 0){
            _wait(puedoLeer);
        }

        int result = buffer[front];
        System.out.println(" lee : "+ result);
        front = (front + 1) % N;
        count--;
    }

    _proc void salir(){
        cantLector--;
        if(cantLector == 0){
            _signal(puedoEscribir);
        }
    }
}

//Para compilar y hacer un Singal and Wait es de esta manera    m2jr -sw MonitorTest.m
