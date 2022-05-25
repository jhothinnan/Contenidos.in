import java.util.Scanner;

public class Conteo100 {
    public static void main(String[]args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x = 0;
            int cont=0;
            while(x==0){
                int num = scan.nextInt();
                if(num>100){
                    cont++;
                }
                else if(num==0){
                    System.out.println(cont);
                    break;
                }
            }
        }
    }
}