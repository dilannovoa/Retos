import java.util.Scanner;
import java.util.Random;

public class reto4 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();
        
        System.out.println("Bienvenido al juego de piedra, papel o tijera.");
        System.out.println("Para jugar, debe apostar un mínimo de 10,000 pesos.");
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.nextLine();
        
        int apuesta = 0;
        while (apuesta < 10000) {
            System.out.print("Ingrese la cantidad a apostar (mínimo 10,000): ");
            apuesta = lector.nextInt();
            if (apuesta < 10000) {
                System.out.println("Debe apostar al menos 10,000 pesos.");
            }
        }
        
        System.out.println("Ingrese su jugada:");
        System.out.println("p -> piedra");
        System.out.println("t -> tijera");
        System.out.println("pa -> papel");
        
        String jugadaJugador = lector.next();
        String[] opciones = {"p", "t", "pa"};
        int jugadaMaquinaIndex = aleatorio.nextInt(3);
        String jugadaMaquina = opciones[jugadaMaquinaIndex];
        
        System.out.println("Jugador: " + jugadaJugador);
        System.out.println("Máquina: " + jugadaMaquina);
        
        if (jugadaJugador.equals(jugadaMaquina)) {
            System.out.println("Empate!");
        } else if ((jugadaJugador.equals("p") && jugadaMaquina.equals("t")) ||
                   (jugadaJugador.equals("t") && jugadaMaquina.equals("pa")) ||
                   (jugadaJugador.equals("pa") && jugadaMaquina.equals("p"))) {
            System.out.println("¡Ganaste!");
            int dineroGanado = apuesta * 2;
            System.out.println("Ganaste " + dineroGanado + " pesos.");
        } else {
            System.out.println("Perdiste.");
            System.out.println("Perdiste " + apuesta + " pesos.");
        }
        lector.close();
    }

}

