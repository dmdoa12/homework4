package homework4;

import java.util.Scanner;

public class SumAndAvg {
	void sumAvg(){
		Scanner s = new Scanner(System.in);
		int sum=0,cnt=0;
		double avg;

		while(true){
			System.out.print("���ڸ� �Է�(Q:����) >> ");
			String n = s.nextLine();
			if(n.equals("Q")){
				avg=sum/(double)cnt;
				System.out.printf("�հ�� %d�̰�, ����� %.2f�Դϴ�.\n",sum,avg);
				break;
			}
			else if(isNumeric(n)==false){
				System.out.println("�߸� �Ϸ��ϼ̽��ϴ� �ٽ� �Է����ּ���.");
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
