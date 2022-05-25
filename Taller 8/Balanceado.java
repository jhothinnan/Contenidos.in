public class Balanceado {
    public static boolean balancear(int[]a){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length / 2; i++){
            sum1 += a[i];
        }
        for (int i = (a.length/2)+1; i < a.length; i++){
            sum2 += a[i];
        }
        if (sum1==sum2){
        return true;
        }
        return false;
    }
}