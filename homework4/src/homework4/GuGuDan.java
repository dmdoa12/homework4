package homework4;

import java.util.Scanner;

public class GuGuDan {
	void dan(){
		Scanner s = new Scanner(System.in);
		int dan;
		while(true){
			System.out.print("0~100������ ���ڸ� �Է�(Q:����) >> ");
			String n = s.nextLine();

			if(n.equals("Q")){
				System.out.println("");
				break;
			}
			else if(isNumeric(n)==false || Integer.parseInt(n)<2 || Integer.parseInt(n)>10){
				System.out.println("�߸� �Ϸ��ϼ̽��ϴ� �ٽ� �Է����ּ���.");
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
