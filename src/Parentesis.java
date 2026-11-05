public class Parentesis {
    static void main() {
        String cadena = "Esto (es (un ejemplo) (de) una (cadena bien) parentizada)\n";
        int contador = 0;
        parenti(cadena, contador);
        System.out.println(contador);
    }
    public static int parenti(String cadena, int contador) {
        String[] separado = cadena.split("\\s+");
        for (int i = 0; i < separado.length; i++) {
            for (int j = 0; j < separado[i].length(); j++) {
                char Character = separado[i].charAt(j);


            }
        }
        return contador;
    }
}
