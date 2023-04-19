/*Aquest arxiu ens permet mostrar pel terminal la posicio del gat renat un cop ha creat un de nou i en cas de que no es pugui mostrara una excepcio*/ 
public class UsaGatRenat {
      public static void main(String[] args){
          try {
              GatPosicio posicio = GatPosicio.fromString(args[0]);
              GatRenat renat = new GatRenat(posicio);
              System.out.println("El gat Renat està: " + renat.getPosicio());
         } catch (IllegalArgumentException e) {
             System.out.println(e);
         }
      }
 }
