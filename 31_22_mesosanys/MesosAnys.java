/*Programa que demana un mes i un any, i escriu el mes anterior i el mes següent.
*/
  
        public class MesosAnys {
            public static void main(String[] args) {
                System.out.println("Mes?");
                int mes = Integer.parseInt(args[0]);
                    
                System.out.println("Any?");
                int any = Integer.parseInt(args[0]);
                
                int mesAnterior = mes - 1;

                int mesSeguent = mes + 1; 
                System.out.println("Mes anterior " + mesAnterior  + "/" + any + " i mes següent " + mesSeguent +"/" + any); 
    }
}
                                                                                                                                                                                                               
                                                                                                                                                                                                                  
                                                     
