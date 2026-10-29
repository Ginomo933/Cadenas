import java.util.Scanner;

public class Analizar {
    static void main() {
        String texto = "";
        int numeroa = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un texto: ");
        texto = sc.nextLine();

        System.out.println("Longitud" + texto.length());
        System.out.println("Primera letra: " + texto.charAt(0));
        System.out.println("Última letra: " + texto.charAt(texto.length() - 1));
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minisculas: " + texto.toLowerCase());

        for (int i = 0; i < texto.length(); i++) {
            char a = Character.toLowerCase(texto.charAt(i));
            if ("a".indexOf(a) != -1) {
                numeroa++;
            }
        }
        System.out.println("Numero de letras 'a': " + numeroa);

    }
}

