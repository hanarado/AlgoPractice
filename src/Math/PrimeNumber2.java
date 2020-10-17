package Math;

import java.util.*;

public class PrimeNumber2 {

	public static void main(String[] args) {
		System.out.println("<Finding Prime Numbers!");		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();	
			
			System.out.println("Print Y? : Y OR N");
			String printYn = sc.next();
			
			System.out.println("Insert To-Number to count Prime Numbers! from 1");
			int toNum = sc.nextInt();
			
//	Method 1 : Using sqrt, 에라토스테네스 체 활용, 배열 값 이용, byte		
		    long startTime = System.currentTimeMillis();
		    
	    	byte[] primeArr = new byte[toNum +1];
			int forNum = (int) Math.sqrt(toNum);
			int delNum = 0;
			int cntNum = 0;
			
			primeArr[1] = 1;
			delNum++;

			for(int i = 1; i <= forNum; i++) {
				if(primeArr[i] == 0) {		
					for(int j = i+i; j <= toNum; j = j+i) {
						if(primeArr[j] ==0) {
							primeArr[j] = 1;
							delNum++;
						}
					};
				}
			}
			
			cntNum = toNum - delNum;
		    long endTime = System.currentTimeMillis();	
			
			if(printYn.equalsIgnoreCase("y")) {
				System.out.println("=============================== Sosu to " + toNum + " ===============================");
				int rowCnt = 0;
				for(int i =1; i <= toNum; i++) {
					if(primeArr[i] ==0) {
						rowCnt++;
						System.out.print(i + "\t");
					}
					if(rowCnt == 10) {
						rowCnt = 0;
						System.out.println();
					}
				}
				if(rowCnt != 10) {
					System.out.println();
				}
				System.out.println("=============================== Sosu to " + toNum + " ===============================");
			}
			
			System.out.println("[ Method 1 : Using sqrt, 에라토스테네스 체 활용, 배열 값 이용, byte ]");
			System.out.println("Prime Number from " + 1 + " to " + toNum + " : (Total) " + cntNum);
			
		    float runTime = ((float)(endTime - startTime) / 1000);
			System.out.println("==========================");
			System.out.println("Start Time = " + startTime);
			System.out.println("End Time   = " + endTime);
			System.out.println("Run Time   = " + runTime + " sec");
			System.out.println("* except print time *");			
			System.out.println("==========================");				
		}
		
	}
}