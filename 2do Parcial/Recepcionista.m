
_monitor Recepcionista {

    _ private static final int M = 3; //cantidad de medicos

    _var boolean[] medicoLibre = new boolean[M];
    _var int pacientesEsperando;

    _condvar salaEspera;

    _proc void iniciarSala(){
        for(int i=0; i<M; i++){
            medicoLibre[i]=false;
        }
    }
    _proc void ingresarMedico(int idMedico){
        medico[idMedico]=true;
    }

    _proc int pedirTurno(int i){
        pacientesEsperando++;
        int idPaciente = i;
        while(!medicoLibre[0] && !medicoLibre[1] && !medicoLibre[2]){
            _wait(salaEspera); //si no hay medico libre lo pongo en espera
        }
        if(medicoLibre[0]){
            medicoLibre[0] = false;       
            _return 1; // Retorna el identificador del medico asignado
        }else if(medicoLibre[1]){
            medicoLibre[1] = false;
            _return 2;
        }else if(medicoLibre[2]){
            medicoLibre[2] = false;
            _return 3;
        }
        pacientesEsperando--;
    }

    _proc void finalizarConsulta(int idMedico){
        if(idMedico == 0){
            medicoLibre[0] = true;     
        }else if(idMedico == 1){
            medicoLibre[1] = true;
        }else if(idMedico == 2){
            medicoLibre[2] = true;
        }
        _signal(salaEspera);
    }

    
}