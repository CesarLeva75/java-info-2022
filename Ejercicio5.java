import java.util.Scanner;

public class Ejercicio5 {
    /*Desarrollar un programa que dado un número entero ingresado, nos 
    retorne los valores de ese número multiplicado por 1, 2, 3, … y 10.
    */
    //Solucion for
    public static void main (String[] args){
        //Creamos un objetos Scanner que tomara los valores por consola
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();//Escaneo el proximo entero que es ingresado
        scan.close(); //Cerrramos el sacanner si no lo usamos mas (buena practica)

        for (int i=1; i <= 10; i++){
            System.out.println(nro + " * " + i + " = " + nro*i);
        }
     }


    
}
