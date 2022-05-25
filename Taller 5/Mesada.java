import java.util.Scanner;
public class Mesada {
    
    public static void main(String[]args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nombre = scan.nextLine();
            while(true){
                int num = scan.nextInt();
                if (num>500) {
                    System.out.println(nombre+" eres mi angel");
                    break;
                }
                
                    System.out.println(nombre+" me decepcionas");
                
                
            }
        }
    }
}