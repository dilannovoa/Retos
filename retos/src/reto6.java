import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int apuesta;
        int dineroAcumulado = 0;
        int contadorJuegos = 0;
        String[] opciones = {"Cara", "Sello"};
        String jugador;
        String resultado;
        
        System.out.println("Bienvenido al juego del Cara o Sello!");
        System.out.print("Por favor, ingrese su nombre: ");
        jugador = lector.nextLine();
        
        do {
            System.out.print("\n" + jugador + ", ingrese la cantidad de dinero que desea apostar: $");
            apuesta = lector.nextInt();
            
            if (apuesta <= dineroAcumulado) {
                System.out.println("Ha ingresado una apuesta menor o igual al dinero acumulado, intente nuevamente.");
                continue;
            }
            
            int opcionMaquina = (int) Math.floor(Math.random() * opciones.length);
            System.out.println("La máquina ha seleccionado " + opciones[opcionMaquina]);
            
            int opcionJugador;
            do {
                System.out.println("Seleccione Cara (0) o Sello (1): ");
                opcionJugador = lector.nextInt();
            } while (opcionJugador < 0 || opcionJugador > 1);
            
            if (opcionMaquina == opcionJugador) {
                resultado = "ganó";
                dineroAcumulado += apuesta;
            } else {
                resultado = "perdió";
                dineroAcumulado -= apuesta;
            }
            
            contadorJuegos++;
            
            System.out.println("Usted " + resultado + " $" + apuesta + ".");
            System.out.println("Dinero acumulado: $" + dineroAcumulado);
            System.out.println("Cantidad de juegos: " + contadorJuegos);
            
        } while (dineroAcumulado > 0 && lector.next().equalsIgnoreCase("si"));
        
        if (dineroAcumulado > 0) {
            System.out.println("¡Felicitaciones, " + jugador + ", ha ganado el juego del Cara o Sello!");
        } else {
            System.out.println("Lo siento, " + jugador + ", ha perdido el juego del Cara o Sello.");
        }
        
        System.out.println("Dinero acumulado: $" + dineroAcumulado);
        System.out.println("Cantidad de juegos: " + contadorJuegos);

        lector.close();
    }
}
