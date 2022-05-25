import java.util.ArrayList;
public class Repetidos{
    public static int detectorDeRepetidos(ArrayList<Integer>a){
        int cont = 0;
        for(int i = 0; i < a.size()-1; i++){
            if(a.get(i)==a.get(i+1)){
                cont++;
                if(a.get(i)==a.get(i+1) && a.get(i)==a.get(i+2)){
                    break;
                }
            }
        }
        return cont;
    }
}