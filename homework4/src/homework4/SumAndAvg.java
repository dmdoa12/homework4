package homework4;

import java.util.Scanner;

public class SumAndAvg {
	void sumAvg(){
		Scanner s = new Scanner(System.in);
		int sum=0,cnt=0;
		double avg;

		while(true){
			System.out.print("숫자를 입력(Q:종료) >> ");
			String n = s.nextLine();
			if(n.equals("Q")){
				avg=sum/(double)cnt;
				System.out.printf("합계는 %d이고, 평균은 %.2f입니다.\n",sum,avg);
				break;
			}
			else if(isNumeric(n)==false){
				System.out.println("잘못 일력하셨습니다 다시 입력해주세요.");
				continue;
			}
			else{
				int num = Integer.parseInt(n);
				sum=sum+num;
				cnt++;
			}
		}//while
	}//sumAvg

	boolean isNumeric(String s) {  
		return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
