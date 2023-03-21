import java.util.Scanner;
import java.util.Random;

public class reto7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int dinero = 100;
        int numJuegos = 0;
        int apuesta;
        int resultado;
        
        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera!");
        System.out.println("Empiezas con $100. ¿Cuánto quieres apostar?");
        
        do {
            apuesta = lector.nextInt();
            if (apuesta > dinero) {
                System.out.println("No tienes suficiente dinero. Inténtalo de nuevo.");
            }
        } while (apuesta > dinero);
        
        while (numJuegos < 3 && dinero > 0) {
            System.out.println("Elige tu jugada (1 = piedra, 2 = papel, 3 = tijera):");
            int jugada = lector.nextInt();
            
            if (jugada < 1 || jugada > 3) {
                System.out.println("Jugada inválida. Inténtalo de nuevo.");
                continue;
            }
            
            int jugadaMaquina = aleatorio.nextInt(3) + 1;
            
            System.out.println("jugador: " + jugada);
            System.out.println("Jugada de la máquina: " + jugadaMaquina);
            
            if (jugada == jugadaMaquina) {
                resultado = 0;
                System.out.println("Empate!");
            } else if ((jugada == 1 && jugadaMaquina == 3) ||
                       (jugada == 2 && jugadaMaquina == 1) ||
                       (jugada == 3 && jugadaMaquina == 2)) {
                resultado = 1;
                System.out.println("Ganaste!");
            } else {
                resultado = -1;
                System.out.println("Perdiste!");
            }
            
            dinero += resultado * apuesta;
            numJuegos++;
            
            if (dinero <= 0) {
                System.out.println("Lo siento, no tienes más dinero. Fin del juego.");
            } else if (numJuegos < 3) {
                System.out.println("Tienes $" + dinero + " ahora. ¿Quieres jugar de nuevo? (s/n)");
                String respuesta = lector.next();
                if (respuesta.equals("n")) {
                    break;
                } else {
                    System.out.println("Cuánto quieres apostar?");
                    do {
                        apuesta = lector.nextInt();
                        if (apuesta > dinero) {
                            System.out.println("No tienes suficiente dinero. Inténtalo de nuevo.");
                        }
                    } while (apuesta > dinero);
                }
            }
        }
        
        System.out.println("Jugaste " + numJuegos + " veces y tienes $" + dinero + " ahora. Gracias por jugar!");
    
        lector.close();
    }

}
