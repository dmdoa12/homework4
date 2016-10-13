package homework4;

import java.util.*;
public class MaxAndMin {
	void checkNum(){
		Scanner s = new Scanner(System.in);
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		while(true){
			System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
			String n = s.nextLine();

			if(n.equals("Q")){
				System.out.println("가장큰 수는 "+max+"이고, 작은수는 "+min+"입니다.");
				break;
			}
			else if(isNumeric(n)==false || Integer.parseInt(n)<0 || Integer.parseInt(n)>100){
				System.out.println("잘못 일력하셨습니다 다시 입력해주세요.");
				continue;
			}
			else{
				int num = Integer.parseInt(n);
				if(num > max){
					max = num;
				}
				if(min > num){
					min = num;
				}
			}
		}//while
	}//method

	boolean isNumeric(String s) {  
		return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
