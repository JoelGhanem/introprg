//En aquesta ocasió, desenvoluparem un programa que demani un text i el mostri codificat segons les següents instruccions://
public class CodificaBasic {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        if (!text.isEmpty()) {
            codifica(text, quants);
        }
    }
    public static void codifica(String text, int quants) {
        String cadena = "";
        String accents = "áàéèíìóòúù";
        char letra = text.charAt(0);
        if (!text.isEmpty()) {
            if (quants > 0) {
                //Separo la primer letra para poder tratarla mejor
                if (Character.isUpperCase(text.charAt(0))) {
                    cadena = cadena + text.charAt(0);
                } else {
                    letra = ((char)(letra + quants));
                    cadena = cadena + letra;
                }
                // Recorro toda la cadena para cambiar los valores
                for (int i = 1; i < text.length(); i++) {
                    letra = text.charAt(i);
                    if (Character.isLetter(letra)) {
                        // Separo los acentos para que no cambien al sumar valores
                        if (letra != 'à' && letra != 'á' && letra != 'è' && letra != 'é' && letra != 'í' && letra != 'ó' && letra != 'ò' && letra != 'ú') {
                            letra = ((char)(letra + quants));
                            cadena = cadena + letra;
                        } else {
                            cadena = cadena + letra;
                        }
                        if (letra >= 'z') {
                            letra = ((char)96);
                        }
                    } else {
                        cadena = cadena + letra;
                    }
                }
                System.out.println(cadena);
            } else if (quants == 0) {
                System.out.print(text);
            } else {
                System.out.println("No s'accepten números negatius");
            }
        }
    }
}

