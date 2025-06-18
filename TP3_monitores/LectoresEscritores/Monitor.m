_monitor Monitor {
    private static final int N = 5; //Size of the buffer

    _var String[] buffer = new String[N];
    _var int front;
    _var int rear;
    _var int count;
    _var int cantLector;
    _var int cantEscritor;

    _condvar puedoEscribir;
    _condvar puedoLeer;  

    _proc void escribir(String data){
        while(cantLector > 0){
            _wait(puedoEscribir);
        }

        cantEscritor++;

        buffer[rear] = data;
        rear = (rear + 1) % N;
        count++;

        cantEscritor--;

        if(cantLector > 0){
            _signal(puedoLeer);
        }
    }

    _proc String leer(){
        cantLector++;

        if(cantEscritor > 0){
            _wait(puedoLeer);
        }

        String result = buffer[front];
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

/*
Este es el codigo para compilar un monitor que luego se utiliza 
en un programa .jr.
La manera en que se compila este monitor es la siguiente 
    m2jr  MonitorTest.m //monitor MESA Lampson y Redell
    m2jr -sw  MonitorTest.m //monitor Hoare 

Para compilar y hacer un Singal and exit es de esta manera
    m2jr -sx MonitorTest.m
*/