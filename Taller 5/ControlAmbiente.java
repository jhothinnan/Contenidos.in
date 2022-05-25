import java.util.Scanner;

public class ControlAmbiente {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        SensorActuador sa1 = new SensorActuador(5,1,10);
        for(int i = 1;i<=4;i++){
                if(i<=2){
                    int a = scan.nextInt();
                    sa1.disminuirTemp(a);
                }
                else{
                    int a = scan.nextInt();
                    sa1.aumentarTemp(a);
                }
            }
            System.out.println(sa1.getTemperatura());
    }
}