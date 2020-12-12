public class BreakContinue{
    public static void windowPosSum(int[] a, int n){
		int length = a.length;
	    int[] temp_arr = new int[length];
		for(int i=0 ; i<length ; i++){
		    if (a[i] >= 0){
				int temp_num = 0;
			    for(int j=0 ; j<=n ; j++){
					if(i+j < length){
				        temp_num += a[i+j];
					}else{
					    continue;
					}
				}
				temp_arr[i] = temp_num;
			}else{
			    temp_arr[i] = a[i];
			}
		}
		System.out.println(java.util.Arrays.toString(temp_arr));
	}
	public static void main(String[] args){
	    int[] a = {1, -1, -1, 10, 5, -1};
		int n = 2;
		windowPosSum(a, n);
		System.out.println(java.util.Arrays.toString(a));
	}
}
