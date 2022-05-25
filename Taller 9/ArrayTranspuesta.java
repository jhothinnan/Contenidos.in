public class ArrayTranspuesta {
	public static int sumaDiagonal(int [][]arr){
	    int sum = 0;
	    for(int i = 0; i<arr.length; i++){
	        for(int j = 0; j<arr.length; j++){
	            if(arr[i]==arr[j]){
	                sum+=arr[i][j];
	            }
	        }
	    }
	    return sum;
	}
}