package simpletest;

public class MyClass2 {
	// Method Overloading
	
	// 매개변수의 개수나 타입이 조금씩 다르지만 비슷한 기능을 하는 method들이 여러개가 있을 수 있다.
	// 이 method들이 각각 다른이름으로 정의되어 있다면 언제 어떤 method를 사용해야 하는지 구분하기 어려운 경우가 있다.
	// 매개변수의 수나 타입이 다른경우 동일한 이름으로 method를 여러가지 정의 할 수 있다.
	
	
	// 아래는 똑같은 이름으로 method를 3개 정의해 보았다. 
	// method overloading에서 중요한것은 매개변수의 수나 타입이다. 
	public int plus (int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {  // 위에 method와 매개변수의 수는 다르지만 타입이 int로 같기 때문에 가능
		return x + y + z;
		
	}
	
	public String plus(String x, String y) {  // 첫번째의 method와 타입이 서로 다르지만 매개변수의 수가 같아서 가능
		return x + y;
	}
	
//	아래처럼 매개변수의 이름이 다르다고 해서 첫번째 method와 다르다고 판단하지는 않는다. 타입이 중요하다.
//	public int plus (int i, int u) {
//		return i + u;
//	}	
}
