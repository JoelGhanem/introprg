g30 /*programa que et diu quin dia de la setmana es segons el numero que escriguis
 29 */
 28  
 27     public class DiaSetmanaSwitchExpr {
 26         public static void main(String[] args) { 
 25             int dia = Integer.parseInt(args[0]);
 24             String diaSetmana;
 23             switch (dia) {
 22                         
 21                 case 1: 
 20                     System.out.println("Dilluns");
 19                         break;
 18                         
 17                 case 2: 
 16                     System.out.println("Dimarts");
 15                         break;
 14                        
 13                 case 3:
 12                     System.out.println("Dimecres");
 11                         break;
 10 
  9                 case 4: 
  8                     System.out.println("Dijous");
  7                         break;
  6                  
  5                 case 5:
  4                     System.out.println("Divendres");
  3                         break;
  2                        
  1                 case 6:
31                      System.out.println("Dissabte");
  1                         break;
  2                        
  3                 case 7:
  4                     System.out.println("Diumenge");
  5                         break;
  6                 default:
  7                     System.out.println("Error");
  8          
  9         }
 10     }
 11 }
~                                                                                                                                                                                                                  
~                                                                                                                                                                                                                  
~                                             
