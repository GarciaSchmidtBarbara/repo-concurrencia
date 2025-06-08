_monitor Monitor {

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

        buffer[rear] = data;
        rear = (rear + 1) % N;
        count++;

        _signal(puedoConsumir);
    }

    _proc int consumir(){
        while(count == 0){
            _wait(puedoConsumir);
        }

        int result = buffer[front];
        front = (front + 1) % N;
        count--;

        _signal(puedoProducir);

        _return result;
     }
}