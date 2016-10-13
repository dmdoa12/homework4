package homework4;
import java.util.*;

public class SumOfNumbers {
	void addsum(){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("마지막 수를 입력(Q는 종료)>>");
			String n = s.nextLine();
			if(n.equals("Q"))
				break;
			else if(isNumeric(n)==false){
				System.out.println("잘못 일력하셨습니다 다시 입력해주세요.");
				continue;
			}
			else{
				int num = Integer.parseInt(n);
				int result=0;
				for(int i=1; i<=num; i++)
					result=result+i;
				System.out.println("총 합은 "+result+" 입니다.");
			}
		}
	}
	boolean isNumeric(String s) {  
		return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
