import java.util.Locale;
import java.util.Scanner;

public class Nombreusuario {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre y apellidos: ");
        String nombre = sc.nextLine();
        String [] palabras = nombre.trim().split(" ");
        String nombreformateado = "";



        for(int i = 0; i < palabras.length; i++){
            nombreformateado += palabras[i].substring(0,1).toUpperCase();
            nombreformateado += palabras[i].substring(1).toLowerCase() + " ";

        }

        System.out.println("Nombre formateado: " + nombreformateado);
        for(int i = 0; i < palabras.length; i++){
            System.out.println(palabras[i].substring(0,1).toUpperCase() + ".");
        }

        String usuario = "";
        usuario = palabras[0].substring(0,1).toLowerCase();
        usuario += palabras[1].toLowerCase() + " ";


        System.out.println(usuario);
    }
}
