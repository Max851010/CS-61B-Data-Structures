public class Max{
    public static int max(int[] m){
		int max_value = m[0];
	    for(int i = 1 ; i < m.length-1 ; i++){
			if(m[i] >= max_value){ 
			    max_value = m[i];
			} else {
			    continue;
			}
		}
	   return max_value;	
	}
	public static void main(String[] args){
	   	int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
        System.out.println(max(numbers));
	}
}

