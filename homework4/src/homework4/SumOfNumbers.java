package homework4;

public class SumOfNumbers {
	void addsum(int num){
		int result=0;
		for(int i=1; i<=num; i++)
			result=result+i;
		
		System.out.println("총 합은"+result+"입니다.");
	}
}
