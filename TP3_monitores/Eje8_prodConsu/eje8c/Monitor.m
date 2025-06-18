_monitor Monitor { //HOARE. Búffer ilimitado, n productores y m consumidores.

    _var java.util.LinkedList<Integer> buffer = new java.util.LinkedList<Integer>();
    
    _condvar puedoProducir;
    _condvar puedoConsumir;  

    _proc void depositar(int data){
        //No necesita esperar nunca, ya que el búffer es ilimitado.
        buffer.addLast(data);  // agregamos al final del búffer (FIFO)
        _signal(puedoConsumir);  // notificamos que hay algo para consumir
    }

    _proc int consumir(){
        while (buffer.isEmpty()) {
            _wait(puedoConsumir);  // esperamos si el búffer está vacío
        }

        int result = buffer.removeFirst();  // consumimos del frente (FIFO)

        _return result;
     }
}