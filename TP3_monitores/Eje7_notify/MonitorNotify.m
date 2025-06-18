_monitor MonitorNotify {  //prioridad lectores
    // _signal(condvar) = despierta uno.
    // _broadcast(condvar) = despierta a todos los que esperan en esa condicion.
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
        if(lectoresEsperando > 0){ //si hay lectores esperando, les doy prioridad
            _broadcast(puedoLeer); //despiesto a TODOS los lectores (si hay alguno esperando)
        } else {
            _signal(puedoEscribir); //si no hay lectores esperando, doy paso a un escritor
        }
        
        //Permite que multiples lectores accedan simultaneamente si es seguro hacerlo.
        //Mejora el rendimiento porque evita tener lectores esperando innecesariamente.
        //Requiere cuidado: todos los procesos despertados deben volver a verificar la condicion con while.
    }

    _proc void leer(){
        lectoresEsperando++;
        while(cantEscritor > 0 || count == 0){ 
            _wait(puedoLeer);
        }
        lectoresEsperando--;
        cantLector++;
        int result = buffer[front];
        System.out.println(" lee : "+ result);
        front = (front + 1) % N;
        count--;

        cantLector--;
        if(cantLector == 0){
            _signal(puedoEscribir); //cuando no haya mas lectores doy paso a un escritor
        }else {
            _signal(puedoLeer); //si hay mas lectores, doy paso al siguiente
        }
    }

}

//Para compilar y hacer un Singal and Wait es de esta manera    m2jr MonitorTest.m
