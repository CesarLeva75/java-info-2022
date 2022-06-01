import java.util.Scanner;

public class Ejercicio6 {

    /*Debemos realizar un programa que nos realizará una pregunta si queremos realizar 
    una operación dada o si deseamos salir/terminar el programa.
     Utilizaremos en este caso una simple operación que nos pide un número y luego 
     lo imprime.*/

     public static void main(String[] args) {
         //Creamos un objeto Scanner que tomara los valores de la consola
         Scanner scan = new Scanner(System.in);
         int continuar = 1;
         int nro;
         while (continuar == 1){
             System.out.print("Por favor, ingrese un número: ");
             nro = scan.nextInt(); //Escanea el proximo número entero que es ingresado
             System.out.println("El número ingresado es : " +  nro);

             System.out.println("Si desea continuar presione 1, sino cualquier otro numero: ");
             continuar = scan.nextInt();//Escanee el nro y lo asigna a la variable para evaluar luego si continua o no

         }
         scan.close(); //Cerramos el scanner

     }
}
