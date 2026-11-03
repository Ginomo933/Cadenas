public class Digitos {
    static void main() {
        String texto = "123a 901a 134 140 29a";
        int resultado = contarDigitos(texto);
        System.out.println("Digitos: " + resultado);

    }


    public static int contarDigitos(String texto) {
        String[] cadenas = texto.split("\\s");
        int contador = 0;

        for (int i= 0; i < cadenas.length; i++){
            for (int j= 0; j < cadenas[i].length(); j++){
                if (Character.isDigit(cadenas[i].charAt(j))){
                    contador++;
                }
            }
        }   return contador;
    }
}
