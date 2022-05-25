public class Sortario {
    public static boolean detectorDeMalaSuerte(int[] a){
	    for(int i = 0; i < a.length; i++){
  	        if(a[i] == 1 || a[i] == 3 || a[i]==13){
  		        return true;
            }
        }
    return false;  
    }
}