/*programa que et diu quin dia de la setmana es segons el numero que escriguis
*/
 
    public class DiaSetmanaSwitchExpr {
        public static void main(String[] args) { 
            int dia = Integer.parseInt(args[0]);
            String diaSetmana;
            switch (dia) {

                case 1: 
                   System.out.println("Dilluns");
                        
                case 2: 
                   System.out.println("Dimarts");
                       
                case 3:
                   System.out.println("Dimecres");
                
                case 4: 
                System.out.println("Dijous");
                 
                case 5:
                System.out.println("Divendres");
                       
                case 6:
                   System.out.println("Dissabtes");
                       
                case 7:
                   System.out.println("Diumenge");
                    
                default:
                System.out.println("Error");
                        
        }
    }
}
