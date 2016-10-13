package homework4;

import java.util.Scanner;

public class GuGuDan {
	void dan(){
		Scanner s = new Scanner(System.in);
		int dan;
		while(true){
			System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
			String n = s.nextLine();

			if(n.equals("Q")){
				System.out.println("");
				break;
			}
			else if(isNumeric(n)==false || Integer.parseInt(n)<2 || Integer.parseInt(n)>10){
				System.out.println("잘못 일력하셨습니다 다시 입력해주세요.");
				continue;
			}
			else{
				
			}
		}//while
	}//method

	boolean isNumeric(String s) {  
		return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
