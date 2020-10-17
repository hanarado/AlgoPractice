package Math;

import java.util.*;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();	
			System.out.println("<Finding Prime Numbers!");
			System.out.println("Inser <from No/to No/Print Y/N>(a,b,p format) to find Prime Numbers!");
			String inPut[] = sc.next().split(",");

			int fromNum = Integer.parseInt(inPut[0]);
			int toNum = Integer.parseInt(inPut[1]);
			String printYn = inPut[2];
			
			int forNum = (int) Math.sqrt(toNum);
			
			int delCnt = 0;
			int cntNum = 0;
					
			byte[] primeArr = new byte[toNum +1];
			
			primeArr[1] = 1;
			delCnt++;

			for(int i = 2; i <= forNum; i++) {
				if(primeArr[i] == 0) {			
					for(int j = i+i; j <= toNum; j = j+i) {
						if(primeArr[j] ==0) {
							primeArr[j] = 1;
							delCnt++;
						}
					}
				}
			}
			
			if(printYn.equalsIgnoreCase("Y")) {
				for(int i = 1; i <= toNum; i++) {
					if(primeArr[i] == 0) {
						System.out.print("(" + i + ") \t");	
					} else {
						System.out.print(0 + "\t");
					}
					
					if(i%10 ==0) {
						System.out.println();
					}
				}
			}
			
			cntNum = toNum - delCnt; 

			System.out.println();
			System.out.println("===================================");
			System.out.println("Prime Number from " + fromNum + " to " + toNum + " : " + cntNum);
		}
		
	}
}