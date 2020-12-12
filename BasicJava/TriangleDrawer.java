public class TriangleDrawer{
    public static void drawTriangle(int N){
		int i = 0;
		while (i < N){
			int j = i + 1;
			while(j != 0){
			    System.out.print("*");
					j--;
			}
			System.out.print("\n");
			i++;
		}
	}

	public static void main(String[] args){
	    drawTriangle(10);
	}
}
