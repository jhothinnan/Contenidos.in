import java.util.Scanner;
public class Helado2{
    public static void main (String [] args){
    try (Scanner scan = new Scanner(System.in)) {
        int temperatura = scan.nextInt();
        int edad = scan.nextInt();
        if(temperatura>27&&edad>=18){
            System.out.println("Comprar helado cerveza");
        }
        else{
            System.out.println("Lo sentimos juventud");        
        }
    }
        
    }
}