package simpletest;

public class TruckExam {

	public static void main(String[] args) {
		Truck t = new Truck();
		// = Car3의 기본 생성자 입니다. + Truck의 기본생성자 입니다.
		// Truck이 instance화 될때 Truck객체의 부모인 Car3객체도 메모리에 올라간다.
		
		// super키워드 - 부모 객체를 나타내는 키워드 : 부모의 생성자가 호출된다.
		
		
		t.run();

// ----------------------------		
		
		Car3 c = new Truck(); // 부모타입인 Car3 타입으로 자식타입인 Truck을 가르킬 수 있다.
		c.run(); // 사용가능
//		c.stop(); // 부모가 자식을 가르키고 있는 상태지만 부모가 가지고 있는 내용만 사용할 수 있다.
		
//		class 형변환
		Truck truck = (Truck)c; // Truck이 참조하는 객체가 Car3이기 때문에 가능
		truck.run();
		truck.stop();
		
	}

}
