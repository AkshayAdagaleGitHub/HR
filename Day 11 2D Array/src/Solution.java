import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int array[][]= new int[6][6];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++) {
				array[i][j]= in.nextInt();
			}
		sum(array);
		in.close();
	}

	public static void sum(int array[][]) {
		int max=0,maxSum=-9999,mSum,tSum,bSum;
		for(int x=0;x<4;x++) {
			for(int y=0;y<4;y++ ) {
				tSum= array[x][y]+ array[x][y+1] + array[x][y+2];
				mSum = array[x+1][y+1];
				bSum = array[x+2][y] + array[x+2][y+1] + array[x+2][y+2];
				max = tSum+mSum+bSum;
				System.out.println("Maximum is :" + max);
				if(max > maxSum) {
					maxSum=max;
				}
			}
		}
		System.out.println(maxSum);
	}
}
