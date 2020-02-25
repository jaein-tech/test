package simpletest;

public class OperatorExam4 {

	public static void main(String[] args) {
//		논리연산자;
//		논리곱(and) - A&&B, 피연산자가 모두 true 일때만 return true;
//		논리합(or) - A||B (shift + \(역슬래쉬)), 피연산자가 둘 중 하나만 true 여도 return true;
//		논리부정(not) - !A, 결과를 반대로 변경, 피연산자 앞에 붙음
//		베타적논리합 - A^B  쉬프트 육 익스크루시브 오아, 피연산자가 하나는 true 이고, 하나는 false 일때만 return true;
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); // false
		System.out.println(b1 && b3); // true
		
		System.out.println(b1 || b3); // true
		System.out.println(b1 || b2); // true
		
		System.out.println(!b3); // false
		
		System.out.println(b1 ^ b2); // true
		System.out.println(b1 ^ b3); // false
		
		// 예제
		int number = 68;
		if(number <=100 && number >=70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}

	}

}
