package note;

public class study {
	public static void main(String[] args) {
		int[][] test = {{10,20,30} , {40,50,60}} ;
		test[0][2] = 300; 
		System.out.println(test[0][2]);
		for(int i =0 ; i<test.length; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.printf("test[%d][%d] = %d\n", i, j, test[i][j]);
			}
		}
	}
}