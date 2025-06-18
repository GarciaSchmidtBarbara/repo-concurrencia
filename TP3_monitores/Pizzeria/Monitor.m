_monitor Monitor {  

    _condvar ponerQueso;
    _condvar ponerSalsa;
    _condvar ponerMorron;
    _condvar prepararPizza;  
    _condvar ayudantesListos;

    _private static int ingrediente;
    _private static int cantAyudantes=0;

    _proc void ayudanteListo(){
        cantAyudantes++;
        if(cantAyudantes==3){
            _signal(ayudantesListos);
        }
    }

    _proc void colocarQueso(){
        _wait(ponerQueso);
        System.out.println("poner queso");
        _signal(prepararPizza);
        
    }

    _proc void colocarMorron(){
        _wait(ponerMorron);
        System.out.println("poner morron");
        
    }

    _proc void colocarSalsa(){
        _wait(ponerSalsa);
        System.out.println("poner salsa");
        
    }

    _proc void terminarPizza(int i){
        ingrediente=i;
        _wait(ayudantesListos);
        if(i==1){
            System.out.println("llamar a queso");
            _signal(ponerQueso);
        }else if(i==2){
            System.out.println("llamar a salsa");
            _signal(ponerSalsa);
        }else {
            System.out.println("llamar a morron");
            _signal(ponerMorron);
        }
        totales++;
    }


}

//Para compilar y hacer un Singal and Wait es de esta manera    m2jr -sw MonitorTest.m
