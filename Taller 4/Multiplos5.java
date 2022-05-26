import java.util.Scanner;
public class Multiplos5{
    public static void main(String[]Args){
        try (Scanner scan = new Scanner(System.in)) {
            int n=5;
            int num = scan.nextInt();
            while(num>=n){
                System.out.println(n);
                n = n+5;
            }
        }
    }
}