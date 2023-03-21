import java.util.Scanner;
import java.util.Random;

public class reto8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. Adivina cuál es.");

        int numeroAleatorio = aleatorio.nextInt(100) + 1;
        int intentos = 0;
        int intentosMaximos = 10;

        while (intentos < intentosMaximos) {
            System.out.println("Intento " + (intentos + 1) + " de " + intentosMaximos);
            int numeroIngresado = lector.nextInt();

            if (numeroIngresado < 1 || numeroIngresado > 100) {
                System.out.println("Número inválido. Debe estar entre 1 y 100. Inténtalo de nuevo.");
                continue;
            }

            if (numeroIngresado == numeroAleatorio) {
                System.out.println("¡Felicidades, adivinaste el número en " + (intentos + 1) + " intentos!");
                return;
            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número que estoy pensando es mayor.");
            } else {
                System.out.println("El número que estoy pensando es menor.");
            }

            intentos++;

            lector.close();
        }

        System.out.println("Lo siento, no adivinaste el número en " + intentosMaximos + " intentos.");
        System.out.println("El número que estaba pensando era " + numeroAleatorio + ".");

    
    }
}
