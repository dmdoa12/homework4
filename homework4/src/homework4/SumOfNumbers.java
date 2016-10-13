package homework4;
import java.util.*;

public class SumOfNumbers {
	void addsum(){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("������ ���� �Է�(Q�� ����)>>");
			String n = s.nextLine();
			if(n.equals("Q"))
				break;
			else if(isNumeric(n)==false){
				System.out.println("�߸� �Ϸ��ϼ̽��ϴ� �ٽ� �Է����ּ���.");
				continue;
			}
			else{
				int num = Integer.parseInt(n);
				int result=0;
				for(int i=1; i<=num; i++)
					result=result+i;
				System.out.println("�� ���� "+result+" �Դϴ�.");
			}
		}
	}
	boolean isNumeric(String s) {  
		return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
