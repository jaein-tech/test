package simpletest;

public class OperatorExam5 {

	public static void main(String[] args) {
		// 삼항연산자, if 구문과 비슷함
		int a1 = (3 > 4) ? 50 : 40;
		// a1의 결과가 맞다면 (?) return 50
		// a1의 결과가 틀리다면 (:) return 40
		System.out.println(a1); // 40

		
		int a2 = 0;
		if(3 > 4) {
			a2 = 50;
		}else {
			a2 = 40;
		}
		
		System.out.println(a2);
	}

}
