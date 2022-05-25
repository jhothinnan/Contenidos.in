import java.util.Scanner;

public class SubTextoMejorado {
    public static void main(String[]args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            String texto = scan.nextLine();
            int inicio = scan.nextInt();
            int end = scan.nextInt();
            
            if(end>texto.length()){
                System.out.println("Error");
            }
            else if(inicio>end){
                System.out.println("Error2");
            }
            
            else{
                System.out.println(texto.substring(inicio,(end+1)));
            }
            
        }
    }
}