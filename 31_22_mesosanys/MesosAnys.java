/*Programa que demana un mes i un any, i escriu el mes anterior i el mes següent.
*/
  
        public class MesosAnys {
            public static void main(String[] args) {
                System.out.println("Mes?");
                int mes = Integer.parseInt(Entrada.readLine());                       
                System.out.println("Any?");
                int any = Integer.parseInt(Entrada.readLine());                  
                int mesAnterior = mes - 1;
                int mesSeguent = mes + 1; 
                int anySeguent = any + 1;
                int anyAnterior = any - 1;
                if (mes == 12) {
                    System.out.println("Mes anterior " + mesAnterior  + "/" + any + " i mes següent 1/" + anySeguent); 
                } else if (mes == 1) {
                    System.out.println("Mes anterior 12/" + anyAnterior + " i mes següent " + mesSeguent + "/" + any); 

                } else {
                    System.out.println("Mes anterior " + mesAnterior  + "/" + any + " i mes següent " + mesSeguent + "/" + any); 
        }
    }
}                                                                                                                                                                                                               
                                                                                                                                                                                                                  
                                                     
