import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        //Creamos un objetos Scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt(); //Escanea el proximo entero que es ingresado
        scan.close();//Cerramos el scaner si no lo usamos mas (Buena practica)
        if (nota > 92){
            System.out.println("Excelente");
        }else if(nota > 84){
            System.out.println("Sobresaliente");

        }else if(nota > 74){
            System.out.println("Distinguido");

        }else if(nota > 59){
            System.out.println("Bueno");

        }else{
            System.out.println("Desaprobado");

        }
    }
    
}
