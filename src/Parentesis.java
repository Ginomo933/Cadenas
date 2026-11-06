public class Parentesis {
    static void main() {
        String cadena = "Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";
        String cadenaBien = "Está bien parentizado";
        String cadenamal = "Está mal parentizado";

        parenti(cadena, cadenaBien, cadenamal);
        int resultado  = parenti(cadena,cadenamal,cadenaBien);


        if (resultado == 0) {
            System.out.println(cadenaBien);
        }else  {
            System.out.println(cadenamal);
        }

    }
    public static int parenti(String cadena, String cadenamal, String cadenaBien) {
        String[] separado = cadena.split("\\s+");
        int contador = 0;
        boolean bien = true;


        for (int i = 0; i < separado.length; i++) {
            if (contador == -1){
                bien = false;
                break;
            }
            for (int j = 0; j < separado[i].length(); j++) {
                char Character = separado[i].charAt(j);
                if (Character == '(') {
                    contador++;
                }
                if (Character == ')') {
                    contador--;
                }
                if  (contador == -1) {
                    bien = false;
                    break;

                }

            }
        }
        if (!bien) {
            return contador;
        }
        else  {
            return contador;
        }
    }
}
