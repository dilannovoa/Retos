import java.util.Random;
import java.util.Scanner;

public class reto3 {
    private static Random aleatorio = new Random();
    
    public static boolean lanzamientoMoneda() {
        int resultado = aleatorio.nextInt(2);
        if (resultado == 0) {
            System.out.println("Cara");
            return true;
        } else {
            System.out.println("Sello");
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido al juego de cara o sello.");
        System.out.print("¿Cuál es su nombre? ");
        String nombreJugador = lector.nextLine();
        System.out.print("¿Cuánto dinero va a apostar? Debe apostar al menos 10,000: ");
        int dineroJugador = lector.nextInt();
        while (dineroJugador < 10000) {
            System.out.print("Debe apostar al menos 10,000 para jugar. ¿Cuánto dinero apuesta? ");
            dineroJugador = lector.nextInt();
        }
        System.out.print("¿Cara o sello? ");
        String eleccionJugador = lector.next().toLowerCase();
        while (!eleccionJugador.equals("cara") && !eleccionJugador.equals("sello")) {
            System.out.print("Elige cara o sello: ");
            eleccionJugador = lector.next().toLowerCase();
        }
        boolean resultadoLanzamiento = lanzamientoMoneda();
        if ((resultadoLanzamiento && eleccionJugador.equals("cara")) || (!resultadoLanzamiento && eleccionJugador.equals("sello"))) {
            dineroJugador *= 2;
            System.out.println(nombreJugador + ", ganaste " + dineroJugador + " pesos.");
        } else {
            dineroJugador = 0;
            System.out.println(nombreJugador + ", perdiste toda tu apuesta.");
        }
        System.out.println("Dinero restante: " + dineroJugador);

        lector.close();
    }
}

