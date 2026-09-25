import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre por favor: ");
        String nombre = scanner.nextLine();


        try {
            System.out.println("Ingrese su edad por favor: ");
            int edad = scanner.nextInt();

            if (edad >= 18) {
            System.out.println("Edad registrada: " + edad + "%nAcceso autorizado.");} else {
                System.out.println("Acceso restringido. ");
            }

        }
        catch (InputMismatchException e) {
                System.out.println("Por favor ingrese una edad correcta.");
            }

    }
}