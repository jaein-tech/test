package simpletest;

// 인터페이스 사용하기
public class LedExam {

	public static void main(String[] args) {
//		인터페이스도 타입이 될 수 있다
		TV tv = new LedTV();
		
//		상속에서 사용한 개념과 비슷하다.
		tv.turnOn();
		tv.turnOff();
		tv.changeChannel(15);
		tv.changeVolume(20);
		
	}	

}
