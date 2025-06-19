_monitor MonitorPizza {
   _condvar AgregarQueso;
   _condvar AgregarSalsa;
   _condvar AgregarMorron;

   _proc void EsperarQueso() {
       _wait(AgregarQueso);
   }

   _proc void EsperarSalsa() {
       _wait(AgregarSalsa);
   }

   _proc void EsperarMorron() {
       _wait(AgregarMorron);
   }

   _proc void ValidarIngredientes(char[] ingre, int size) {
       if (!contiene(ingre, size, 'Q')) {
           _signal(AgregarQueso);
       }
       if (!contiene(ingre, size, 'S')) {
           _signal(AgregarSalsa);
       }
       if (!contiene(ingre, size, 'M')) {
           _signal(AgregarMorron);
       }
   }

   _proc boolean contiene(char[] arr, int size, char c) {
       for (int i = 0; i < size; i++) {
           if (arr[i] == c) return true;
       }
       return false;
   }
}
