package homework4;

import java.util.*;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String check="";
		try{
			while(!check.equals("end")){
				mainMenu();
				System.out.print("원하는 메뉴는:");
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
					System.out.print("잘못 입력하셨습니다.\n");
					continue;
				}//switch
			}//while
		}
		finally{
			if(s!=null)
				s.close();
			System.out.println("프로그램 종료");
		}
	}
	
	static void mainMenu(){
		System.out.println("1.1부터 입력한 수까지 더하기");
		System.out.println("2.최대값/최소값구하기");
		System.out.println("3.입력받은숫자의 합계와 평균구하기");
		System.out.println("4.원하는 구구단 출력하기 ");
		System.out.println("5.짝수단/홀수단 출력하기 ");
		System.out.println("6.종료하기 ");
	}
}
