package homework4;

import java.util.Scanner;

public class GuGuDan {
	void dan(){
		Scanner s = new Scanner(System.in);
		int dan;
		while(true){
			System.out.print("출력하고 싶은 단(Q:종료) >> ");
			String n = s.nextLine();

			if(n.equals("Q")){
				System.out.println("");
				break;
			}
			else if(isNumeric(n)==false || Integer.parseInt(n)<2 || Integer.parseInt(n)>9){
				System.out.println("잘못 일력하셨습니다 다시 입력해주세요.");
				continue;
			}
			else{
				dan = Integer.parseInt(n);
				for(int i=1; i<10; i++){
					System.out.printf("%d * %d = %d\t",dan,i,dan*i);
					if(i%2==0)
						System.out.printf("\n");
					
					
				}
			}
			System.out.printf("\n");
		}//while
	}//method

	boolean isNumeric(String s) {  
		return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
