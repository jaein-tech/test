package simpletest;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// do while문은 무조건 한번은 실행된다.
		int value = 0;
		Scanner scan = new Scanner(System.in); // 키보드로 부터 값을 입력받는다
		
				
		// 항상 do부터 시작되기 때문에 한번은 수행됨
		do {
			// 실제로 반복할 문장들
			value = scan.nextInt();
			System.out.println("입력갑 :" +value);
			
		}while(value != 10);
		
		System.out.println("반복문 종료");

	}

}
