package Math;
import java.util.Scanner;

// 작은 수에서 큰수가지 더하기 알고리즘별 시간 측정
// 1 ~ 큰수 까지를 더한 후, 1 ~ 작은 수 직전까지 더한것을 뺀다	

public class AddingNum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Calcuration from low number to high number ]");
			System.out.println("Insert any 2 number! x,b style!");
			String input[] = sc.nextLine().split(",");
			
			long startTime = System.currentTimeMillis();

			System.out.println("input number = " + input[0] + "," + input[1]);
			
			long inNum1 = Long.parseLong(input[0]);
			long inNum2 = Long.parseLong(input[1]);
			
			long lowNum, highNum; 
			long sum = 0;
			if(inNum1 > inNum2) {
				lowNum = inNum2;
				highNum = inNum1;
			} else {
				lowNum = inNum1;
				highNum = inNum2;
			}
// 1 ~ 큰수 까지를 더한 후, 1 ~ 작은 수 직전까지 더한것을 뺀다			
			for(long i = lowNum; i <= highNum; i++) {
				sum += i;
			}
//			
			System.out.println( "Sum from " + lowNum + " to " + highNum + " = " + sum);
			System.out.println("===========================");
			long endTime = System.currentTimeMillis();
			System.out.println("Start Time = " + startTime);
			System.out.println("End   Time = " + endTime);
			System.out.println("Run   Time = " + ((float)(endTime - startTime)) / 1000 + " sec");
			System.out.println();
		}
		
	}
}

