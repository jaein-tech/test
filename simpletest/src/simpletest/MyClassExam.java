package simpletest;

public class MyClassExam {

	public static void main(String[] args) {
		// class가 가진 method를 사용하기 위해서는 객체로 만들어야 사용 할 수 있다.
		
		Myclass myclass = new Myclass();
		
		myclass.method1(); // m1이 실행되면...
		
		myclass.method2(1); // (1), 1를 이용한 m2 실행
		
		int value = myclass.method3(); // m3이 실행
		System.out.println("m3이 return한 값 : " + value); // m3이 return한 값 : 10
		
		myclass.method4(2,3); // (2+3), 5를 이용한 m4 실행
		
		int value2 = myclass.method5(4); // (4), 4를 이용한  m5 실행
		System.out.println("m5가 ruturn한 값 : " + value2); // m5가 ruturn한 값 : 6
	}

}
