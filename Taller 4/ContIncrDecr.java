import java.util.Scanner;

public class ContIncrDecr {
    public static void main(String[]args) {
        try (Scanner scan = new Scanner(System.in)) {
            double i = scan.nextDouble();
            double a = 0;
            int cont = 0;
            while(i!=0){
                if(i>=a){
                    a=i;
                    cont++;
                    System.out.println("+1");
                }
                else{
                    a=i;
                    cont--;
                    System.out.println("-1");
                }
                i = scan.nextDouble();
                
            }
            System.out.println("Contador: " + cont);
        }
        
        
    }
    
}