_monitor Monitor {

    _var int buffer; //buffer simple
    _var boolean lleno = false;  // true si el buffer tiene un dato válido

    _condvar puedoProducir;
    _condvar puedoConsumir;  

    _proc void depositar(int data){
        while(lleno){ // Espera si el buffer ya tiene un dato
            _wait(puedoProducir);
        }
        buffer = data;
        lleno = true; // Indica que el buffer tiene un dato válido
        _signal(puedoConsumir);
    }

    _proc int consumir(){
        while(!lleno){ // Espera si el buffer está vacío
            _wait(puedoConsumir);
        }
        lleno = false; // Indica que el buffer ya no tiene un dato válido
        int valor = buffer;
        _signal(puedoProducir);   
        _return valor; // Devuelve el dato consumido
    }
}