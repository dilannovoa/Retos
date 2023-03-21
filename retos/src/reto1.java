import java.util.Scanner;

public class reto1

// convertidor kelvin a celsisus
{
    public static void main(String[] args)
    {
        double kelvin, celsius;
        System.out.println("Ingrese grados Kelvin: ");
        Scanner lector = new Scanner(System.in);
        kelvin = lector.nextDouble();
        celsius = kelvin - 273.15;
        System.out.println(kelvin + " grados Kelvin son " + celsius + " grados Celsius");

        lector.close();
    }

}
