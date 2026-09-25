// import java.util.Scanner;
// import java.util.InputMismatchException;

public class Main {
    public static void main(String [] args) {

        Estudiante estudiante1 = new Estudiante("Juan", 28, "Gastronomía");

        estudiante1.Estudiar();

        // int edad = 20;
        // double descuento = 0.10;

        // double total = 50000;
        // double totalFinal = total - (total * descuento);
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ingrese su nombre por favor: ");
        // String nombre = scanner.nextLine();

        // //Aquí hacemos el try de lo que queremos conseguir
        // try {
        //     System.out.println("Ingrese su edad por favor: ");
        //     int edad = scanner.nextInt();

        //     if (edad >= 18) {
        //     System.out.println("Edad registrada: " + edad + "%nAcceso autorizado.");} else {
        //         System.out.println("Acceso restringido. ");
        //     }
        // /* Aquí va el catch en caso de que ocurra el error de arriba lo atrape 
        // el InputMismatchException, así no arruinar el proceso y que le podamos
        // entregar un mensaje a la persona de qué error cometió.*/
        // }
        // catch (InputMismatchException e) {
        //         System.out.println("Por favor ingrese una edad correcta.");
        //     }

    }
}