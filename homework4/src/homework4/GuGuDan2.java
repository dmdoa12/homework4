package homework4;

import java.util.Scanner;

public class GuGuDan2 {
	void dan2(){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("E:¦����, O:Ȧ����(Q:����) >> ");
			String n = s.nextLine();

			if(n.equals("Q")){
				System.out.println("");
				break;
			}
			else if(n.equals("E")){
				for(int i=1; i<10; i++){
					for(int j=2; j<10; j=j+2)
						System.out.printf("%d * %d = %d\t",j,i,i*j);

					System.out.printf("\n");
				}
			}
			else if(n.equals("O")){
				for(int i=1; i<10; i++){
					for(int j=3; j<10; j=j+2)
						System.out.printf("%d * %d = %d\t",j,i,i*j);

					System.out.printf("\n");
				}
			}
			
			else{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			System.out.printf("\n");
		}//while
	}

	boolean isNumeric(String s) {  
		return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
