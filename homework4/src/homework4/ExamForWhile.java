package homework4;

import java.util.*;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
			while(true){
				System.out.print("���ϴ� �޴���:");
				int menu = s.nextInt();
				switch(menu){
				case 1:
					new SumOfNumbers().addsum();
					break;
				case 2:
					new MaxAndMin().checkNum();
					break;
				case 3:
					new SumAndAvg().sumAvg();
					break;
				case 4:
					new GuGuDan().dan();
					break;
				case 6:
					break;
				default:
					System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
					continue;
				}
			}
		}
		finally{
			if(s!=null)
				s.close();
		}
	}
}
