
/*SIMULAMOS UN SEMAFORO CON MONITORES*/
_monitor monitorSemaforo {

    _var int count = 5; // Valor inicial del semaforo
    _condvar colaProcesos;
 
    _proc void Mwait(){
        count--;
        if(count < 0) _wait(colaProcesos);    //si no hay recursos bloqueo proceso
    }

    _proc void Msignal(){
        count++;
        if(count <= 0){
            _signal(colaProcesos); // si hay procesos bloqueados, despierto uno
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