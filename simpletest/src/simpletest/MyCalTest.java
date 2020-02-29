package simpletest;

public class MyCalTest {

	public static void main(String[] args) {
		
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(7, 8);
//		interface에 default method는 .으로 불러올 수 있다.
		System.out.println(i);
		
		int x = Calculator.exec2(3, 4);
//		interface에 static method는 .으로는 불러올 수 없고 인터페이스명.메소드명();으로 호출해야 한다.
		System.out.println(x);

	}

}
