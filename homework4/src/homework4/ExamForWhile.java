package homework4;

import java.util.*;

public class ExamForWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String check="";
		try{
			while(!check.equals("end")){
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
				case 6:
					check="end";
					break;
				default:
					System.out.print("잘못 입력하셨습니다.\n");
					continue;
				}
			}
		}
		finally{
			if(s!=null)
				s.close();
			System.out.println("프로그램 종료");
		}
	}
}
