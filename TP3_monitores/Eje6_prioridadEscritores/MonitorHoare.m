_monitor MonitorHoare {  //prioridad escritores
    private static final int N = 5; //Size of the buffer

    _var int[] buffer = new int[N];
    _var int front;
    _var int rear;
    _var int cantLector;
    _var int cantEscritor;
    _var int escritoresEsperando;

    _condvar puedoEscribir;
    _condvar puedoLeer;  

    _proc void escribir(int data){
        escritoresEsperando++;
        while(cantLector > 0 || cantEscritor > 0){ //si hay alguien leyendo o escribiendo espero
            _wait(puedoEscribir);
        }
        escritoresEsperando--;
        cantEscritor++;
        System.out.println(data + " escribe" );
        buffer[rear] = data;
        rear = (rear + 1) % N;

        cantEscritor--;
        //prioridad escritores
        if(escritoresEsperando>0){
            _signal(puedoEscribir);//doy paso a los escritores 
        }else{
            _signal(puedoLeer);//doy paso a los lectores si hay alguno esperando
        }
    }

    _proc void leer(){
        while(cantEscritor > 0 || escritoresEsperando>0){
            _wait(puedoLeer);
        }
        cantLector++;
        int result = buffer[front];
        System.out.println(" lee : "+ result);
        front = (front + 1) % N;

        cantLector--;
        if(cantLector == 0){
            _signal(puedoEscribir); //cuando no haya mas lectores doy paso a los escritores
        }
    }

}

//Para compilar y hacer un Singal and Wait es de esta manera    m2jr -sw MonitorTest.m
