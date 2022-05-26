import java.util.Scanner;
public class Supermercado{
    public static void main (String [] args){
        try (Scanner scan = new Scanner(System.in)) {
            int tipo = scan.nextInt();
            int cantidad = scan.nextInt();
            int puntos;
            switch(tipo){
                case 1: puntos = 5*cantidad;
                System.out.println(puntos);
                    break;
                case 2: puntos = 10*cantidad;
                System.out.println(puntos);
                    break;
                case 3: puntos = 15*cantidad;
                System.out.println(puntos);
                    break;
            }
        }
    }
}