import java.util.Scanner;

public class nuevaVersion {
    /*Otra variante usando la sentencia do-while:
    En la sentencia while, la condición para ejecutar un ciclo del bucle se evalúa al 
    principio. De esta forma, es posible que dicha evaluación sea falsa desde el principio y 
    el bucle itera 0 veces (o no itere).
    En cambio con la sentencia do-while evalúa la condición de fin al final del bucle, 
    quiere decir que el bucle mínimamente iterara 1 vez. En el siguiente ejemplo se 
    realiza la misma versión del código anterior pero con el bucle do-while.
    */
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int continuar = 1;
        int nro;
        do {
            System.out.println("Por favor ingrese un n úmero: ");
            nro = scan.nextInt();
            System.out.println("El numero ingresado es : " + nro);

            System.out.println("Si desea continuar presione 1, sino cualquier otro numero");
            continuar = scan.nextInt(); //Escanea un  umero y lo asigna a la variable para evaluar luego si continua o no
        }while (continuar == 1);
        scan.close();

    }

}
