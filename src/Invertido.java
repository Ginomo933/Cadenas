import java.util.Scanner;
public class Invertido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        String[] palabras = frase.split("\\s+");

        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i]);

            if (i > 0) {
                System.out.print(" ");
            }
        }

        teclado.close();
    }
}