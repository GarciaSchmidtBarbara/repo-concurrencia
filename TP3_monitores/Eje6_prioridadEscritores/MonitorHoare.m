_monitor MonitorHoare {  //prioridad escritores
    private static final int N = 5; //Size of the buffer

    _var int[] buffer = new int[N];
    _var int front;
    _var int rear;
    _var int count; 
    _var int cantLector;
    _var int cantEscritor;
    _var int escritoresEsperando;
    _var int lectoresEsperando;

    _condvar puedoEscribir;
    _condvar puedoLeer;  

    _proc void escribir(int data){
        escritoresEsperando++;
        while(cantLector > 0 || cantEscritor > 0 || count == N){ //si hay alguien leyendo o escribiendo espero
            _wait(puedoEscribir);
        }
        escritoresEsperando--;
        cantEscritor++;
        System.out.println(data + " escribe" );
        buffer[rear] = data;
        rear = (rear + 1) % N;
        count++;

        cantEscritor--;
        //prioridad escritores
        if(escritoresEsperando>0){
            _signal(puedoEscribir);//doy paso a los escritores 
        }else{
            _signal(puedoLeer); //si no hay escritores esperando, doy paso a un lector
        }
    }

    _proc void leer(){
        lectoresEsperando++;
        while(cantEscritor > 0 || escritoresEsperando >0 || count == 0){ //si hay alguien escribiendo o esperando un escritor o el buffer esta vacio espero
            _wait(puedoLeer);
        }
        lectoresEsperando--;
        cantLector++;
        int result = buffer[front];
        System.out.println(" lee : "+ result);
        front = (front + 1) % N;
        count--;

        cantLector--;
        if (cantLector == 0) {
            _signal(puedoEscribir);  // si fui el último lector, doy paso a un escritor
        } else {
            _signal(puedoLeer);  // hay más lectores activos, dejo pasar al siguiente
        }

    }

}

//Para compilar y hacer un Singal and Wait es de esta manera    m2jr -sw MonitorTest.m
