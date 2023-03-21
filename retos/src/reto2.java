import java.util.Scanner;

public class reto2 {

    // vacuna bebe
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido al programa de vacunas.");
        System.out.print("Ingresa el nombre de la madre: ");
        String nombreMama = lector.nextLine();
        System.out.print("Ingresa el peso del bebé (en kilogramos): ");
        double peso = lector.nextDouble();
        System.out.print("Ingresa la edad del bebé (en meses): ");
        int edad = lector.nextInt();
        double dosis = calcularDosisVacuna(peso, edad);
        System.out.println("Dosis de vacuna necesaria para el bebé:");
        System.out.println("Dosis : " + dosis + " ml");
 
        lector.close();
    }

    public static double calcularDosisVacuna(double peso, int edad) {
        return peso * edad / 10.0;
        
    }
}
   