package simpletest;

public class ActionExam {

	public static void main(String[] args) {
		// 내부클래스 - 익명클래스
//		Action action = new MyAction();
//		action.exec();
		
		Action action = new Action() {  // 생성자 다음에 나오는 {}는 해당 생성자 이름에 해당하는 클래스를 상속받은 이름없는 객체를 만든다는것을 의미
//			method를 구현하거나 추가할 수 있다.
//			이렇게 생성된 이름없는 객체를 action이라는 참조변수가 참조하도록 하였다.
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
		
//		익명클래스를 사용하는 경우는 상속받는 클래스를 굳이 만들어낼 필요가 없는경우에 사용할 수 있다.
//		ex) 해당클래스 안에서만 사용되고 다른클래스에서는 전혀 필요없는 경우
	}

}
