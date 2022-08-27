package agua;

// Programa Java para calcular el gasto de agua en m^3
import java.util.Scanner;

public class Agua {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, gasto; 

        System.out.print("Ingrese los mts^3 de agua gastados: ");
        x = sc.nextInt();
        if (x <= 50){
            gasto = 0;
        }else if (x > 50 & x < 200){
            gasto = 2000 * (x-50);
        }else
            gasto = (3000 * (x-200)) + (2000 * (x-51));
        int precio = gasto + 10000;   
        
        System.out.println("Su precio a pagar es: $" + precio);
}
}




