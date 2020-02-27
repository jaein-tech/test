package simpletest;

public class Car2Exam {

	public static void main(String[] args) {
		/// 생성자 
		// class를 만들고 해당 class를 이용해서 객체 즉, instance를 만드려면 new라는 연산자를 사용해야한다
		// new 다음에는 반드시 생성자가 나와야한다

		// Car c1 = new Car();   Car객체에 생성자가 생겼기 때문에 기본 생성자는 사용할 수 없다.
		Car c2 = new Car("택시");
		Car c3 = new Car("버스");
		
		System.out.println(c2.name);
		System.out.println(c3.name);
		
		//생성자 선언
//		public class 클래스명 {
//			타입 필드명;
//			
//			public 클래스명(매개변수 목록) {       생성자
//				,,,
//			}                                블록
//			
//			public 리턴타입 메소드명(매개변수 목록) {
//				,,,
//			}
//		}
	}

}
