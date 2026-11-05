public class LongitudITest {
    static void main() {
     int k = 4;
     int contador = 0;
     String frase = "Hola cómo estás hoy";
     comprueba(k,contador,frase);

    }
    public static int comprueba(int k, int contador, String frase) {
        String [] palabras = frase.split("\\s");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == k) {
                contador++;
            }
        }
        return k;
    }
}
