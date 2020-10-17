package Math;
import java.util.*;

public class Mabangjin {

	public static void main(String[] args) {
		System.out.println("[This is odd Number Mabangjin]");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Insert any odd number to make n dimension Mabangjin.");
			int inNum = sc.nextInt();
			if(inNum<3) {
				System.out.println("The number should be more than 3! Insert Again!");
				break;
			} else if(inNum%2 ==0){
				System.out.println("Only odd number! Insert Again!");
				break;
			}
			
			int[][] maPan = new int[inNum +2][inNum +2];
			int firstPoint = inNum/2 + 1;
			int lastNumber = inNum * inNum;		
			
			int i = 1;
			int j = firstPoint;
			
			for(int m = 1; m <= lastNumber; m++) {
				maPan[i][j] = m;
				if(i == 1 && j != inNum) {
					i = inNum;
					j++;
				} else if(i == 1 && j == inNum) {
					i++;
				} else if(i != 1 && j == inNum) {
					i--;
					j = 1;
				} else if(maPan[i-1][j+1] == 0) {
					i--;
					j++;
				} else if(maPan[i-1][j+1] != 0) {
					i++;			
				} 
			}
			
			System.out.println("* Mabanjin " + inNum + " Dimension *");

			for(i = 1; i <=inNum; i++) {
				System.out.print("====== \t");
				if(i == inNum) {
					System.out.println();
				}
			}
			
			for(i =1; i <= inNum; i++) {
				for(j =1; j<= inNum; j++) {
					System.out.print(maPan[i][j] + "\t");
					if(j == inNum) {
						System.out.println();
					}
				}
			}
			
			for(i = 1; i <=inNum; i++) {
				System.out.print("====== \t");
				if(i == inNum) {
					System.out.println();
				}
			}
			
		}

	}
}
