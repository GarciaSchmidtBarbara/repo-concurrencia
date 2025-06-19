_monitor Despachador {  //HOARE

    _condvar cpu;

    _var int asignaciones0 = 0;
    _var int asignaciones1 = 0;
    _var boolean cpu0Libre = true;
    _var boolean cpu1Libre = true;

    _proc int adquirirCPU(int i){
        int proceso = i;
        while(!cpu0Libre && !cpu1Libre){
            _wait(cpu);
        }
        if(cpu0Libre){
            cpu0Libre = false;
            asignaciones0++;        
            _return 0; // Retorna el identificador de la CPU adquirida
        }else if(cpu1Libre){
            cpu1Libre = false;
            asignaciones1++;
            _return 1;
        }
    }

    _proc void liberarCPU(int cp, int proceso){
        if(cp == 0){
            cpu0Libre = true;     
        }else if(cp == 1){
            cpu1Libre = true;
        }
        _signal(cpu);
    }

}

//Para compilar y hacer un Singal and Wait es de esta manera    m2jr -sw MonitorTest.m
