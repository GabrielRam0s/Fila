public class Fila {
        private static Fila instancia;
    
        private Fila() {
        }
    
        public static Fila getInstance(){
            if(instancia == null){
                instancia = new Fila();
            }
            return instancia;
      }
      public void ImprimirDocumento(){
      }
      public void RemoverDocumento(){
      }
      public void RemoverAmbosDocumentos(){
      }
 }
    

