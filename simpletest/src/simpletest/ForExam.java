package simpletest;

public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		
		// for 반복문, 변수초기화, 조건식, 증감식이 모두 한줄에 표시된다.
		for(int i = 1; i <= 100; i++) {
			total = total + i;
		}
		
		System.out.println(total);
		
		
		
		int total2 = 0;
		// 1부터 100까지의 합중에서 ~
		for(int i2 = 1; i2 <=100; i2++) {
			if(i2 % 2 != 0) {
				continue; // 변수 i2가 홀수라면 바로 아래쪽에 반복문에 해당하는 구문은 실행하지않는다.
			}
			total2 = total2 + i2; // 변수 i2가 홀수라면 실행되지 않고 바로 i2가 1증가.
		}
		
		System.out.println(total2);
		
		
		int total3 = 0;
		// 1부터 100까지의 합중에서 ~
		for(int i3 = 1; i3 <=100; i3++) {
			
			total3 = total3 + i3;
			if(i3 == 50) { // 50까지 출력하고 싶다.
				break; // break;를 만나는 순간 바로 반복문에서 빠져나온다.
			}
		}
			
		System.out.println(total3);

	}

}
