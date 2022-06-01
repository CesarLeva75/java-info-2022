import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String[] args) {
        //Creo un objeto Scanner que leera los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();//Escanea el proximo entero que es ingresado
        int b = scan.nextInt();//Si ingresamos un string u otro tipo lanza una Exception InputMismatchException
        int c = scan.nextInt();

        System.out.println("El primer número ingresado es: " + a);
        System.out.println("El segundo número ingresado es: " + b);
        System.out.println("El tercer número ingresado es: " + c);
        scan.close();
    }
    
}
