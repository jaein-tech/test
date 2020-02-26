package simpletest;

public class ForEachExam {

	public static void main(String[] args) {
		// for each
		
		int[] iarr = {10,20,30,40,50};
		
		for(int i = 0; i < iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		
		
		// for each문으로 바꿔보기
		// :앞에 값을 받아낼 변수
		// :뒤에 출력하고 싶은 자료구조를 입력
		for(int value:iarr) {
			System.out.println(value);
		}
		// 위와 결과는 같다.
	}

}
