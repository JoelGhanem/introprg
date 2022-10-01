/*programa que et diu quin dia de la setmana es segons el numero que escriguis
*/
 
    public class DiaSetmanaSwitchExpr {
        public static void main(String[] args) { 
            int dia = Integer.parseInt(args[0]);
            String diaSetmana;
            switch (dia) {
                case 0: diaSetmana = "Error";
                        break;
                case 1: diaSetmana = "Dilluns";
                        break;
                case 2: diaSetmana = "Dimarts";
                        break;
                case 3: diaSetmana = "Dimecres";
                        break;
                case 4: diaSetmana = "Dijous";
                        break;
                case 5: diaSetmana = "Divendres";
                        break;
                case 6: diaSetmana = "Dissabte";
                        break;
                case 7: diaSetmana = "Diumenge";
                        break;
                default: diaSetmana = "Error";
                        break;
        }
    }
}
