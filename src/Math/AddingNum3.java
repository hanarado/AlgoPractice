package Math;
import java.util.Scanner;

// 작은 수에서 큰수가지 더하기 알고리즘별 시간 측정
// (작은 수 + 큰 수) * pair수  

public class AddingNum3 {

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
			sum = (highNum - lowNum + 1) * (highNum + lowNum) / 2;
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

/*
 로직 추가 : 
 for문이 아닌 1+100 / 2 를 큰수에서 작은수로 빼는 로직으로 시간차 구현!
 수학적 알고리즘 사용
  [1] 기본
     1. 작은 수를 받는다
     2. 큰 수를 받는다
     3. 1에서 큰수까지의 더하기를 계산한다
        = (큰수 + 1) * (큰수/2)
     4. 1에서 작은수 직전까지의 더하기를 계산한다
        = ((작은수 -1) + 1) * ((작은수 -1)/2)
     5. 상기 3의 결과에서 4의 결과를 뺀다.
     6. 결과값을 출력한다.

  [2] 심화
     1. 작은 수를 받는다
     2. 큰 수를 받는다
     3. 작은수에서 큰수까지의 더하기를 계산한다
        = (작은수 + 큰수) * (큰수 - 작은수 + 1) / 2
     4. 결과값을 출력한다.
        
*/

