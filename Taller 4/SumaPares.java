import java.util.Scanner;

public class SumaPares {
    public static void main(String[]args){
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int suma = 0;
            int i = 0;
            while(i<n){
                int num = scan.nextInt();
                if(num%2==0){
                    suma = suma+num;
                    i++;
                }
                else{
                    i++;
                }
            }
            System.out.println(suma);
        }
    }
}