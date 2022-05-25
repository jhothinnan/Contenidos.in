import java.util.Scanner;

public class Infinito{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while(true){
                int num = scan.nextInt();
                if(num==0){
                    break;
                }
                System.out.println(num*3);
                
            }
        }
    }
}
