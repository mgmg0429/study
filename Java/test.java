import java.util.Scanner;

public class ArrayAcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		System.out.println("가장 큰 수를 입력하세요.");
		for(int i=0; i<5; i++)
		{
			intArray[i] = s.nextInt();;
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 "+max+"이다.");
	}
}
