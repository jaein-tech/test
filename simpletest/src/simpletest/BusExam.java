package simpletest;

public class BusExam {

	public static void main(String[] args) {
		Car2 bus = new Car2();
		bus.run();
		bus.name = "마을버스";
		System.out.println(bus.name);
		
		// 부모클래스는 자식의 클래스를 사용할 수는 없다.

	}

}
