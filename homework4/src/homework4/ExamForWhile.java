package homework4;

import java.util.*;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String check="";
		try{
			while(!check.equals("end")){
				mainMenu();
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
				case 5:
					new GuGuDan2().dan2();
					break;
				case 6:
					check="end";
					break;
				default:
					System.out.print("�߸� �Է��ϼ̽��ϴ�.\n");
					continue;
				}//switch
			}//while
		}
		finally{
			if(s!=null)
				s.close();
			System.out.println("���α׷� ����");
		}
	}
	
	static void mainMenu(){
		System.out.println("1.1���� �Է��� ������ ���ϱ�");
		System.out.println("2.�ִ밪/�ּҰ����ϱ�");
		System.out.println("3.�Է¹��������� �հ�� ��ձ��ϱ�");
		System.out.println("4.���ϴ� ������ ����ϱ� ");
		System.out.println("5.¦����/Ȧ���� ����ϱ� ");
		System.out.println("6.�����ϱ� ");
	}
}
