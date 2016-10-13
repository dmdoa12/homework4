package homework4;

import java.util.*;
public class MaxAndMin {
	void checkNum(){
		Scanner s = new Scanner(System.in);
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		while(true){
			System.out.print("0~100������ ���ڸ� �Է�(Q:����) >> ");
			String n = s.nextLine();

			if(n.equals("Q")){
				System.out.println("����ū ���� "+max+"�̰�, �������� "+min+"�Դϴ�.");
				break;
			}
			else if(isNumeric(n)==false || Integer.parseInt(n)<0 || Integer.parseInt(n)>100){
				System.out.println("�߸� �Ϸ��ϼ̽��ϴ� �ٽ� �Է����ּ���.");
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
