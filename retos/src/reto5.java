import java.util.ArrayList;
import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ArrayList<Float> precios = new ArrayList<Float>();
        float totalCompra = 0;
        
        System.out.print("Ingrese la cantidad de productos que desea comprar: ");
        int n = lectura.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            float precio = lectura.nextFloat();
            precios.add(precio);
            totalCompra += precio;
        }

        System.out.println("Total de la compra es = " + totalCompra);
        System.out.print("¿Está registrado como cliente? (s/n): ");
        char respuesta = lectura.next().charAt(0);
        if (respuesta == 'n') {
            System.out.println("Debe registrarse para poder realizar la compra.");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("Total del producto " + (i+1) + " = " + precios.get(i));
            }
            System.out.print("Ingrese el monto con el que desea pagar: ");
            float montoPago = lectura.nextFloat();
            if (montoPago < totalCompra) {
                System.out.println("El monto ingresado no es suficiente para pagar la compra.");
            } else {
                float vueltas = montoPago - totalCompra;
                if (vueltas > 0) {
                    System.out.println("Su cambio es de " + vueltas + ".");
                }
                System.out.println("Gracias por su compra.");
            }
        }
        
       lectura.close();
    }
}
