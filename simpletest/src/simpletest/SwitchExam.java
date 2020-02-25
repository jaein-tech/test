package simpletest;

public class SwitchExam {

	public static void main(String[] args) {
		// switch, case, default, break
		// switch문은 어떤 변수의 값에 따라서 문장을 실행할 수 있도록 하는 제어문
		
		int value = 2;
		
		
		switch(value) {
			case 1: // 1은 실행되지 않음
				System.out.println("1");
			case 2: // value가 2 이기 때문에 2부터 밑으로 주르륵 실행
				System.out.println("2");
			case 3:
				System.out.println("3");
				break; // break가 있기 때문에 밑에 default값은 실행되지 않는다.
			default:
				System.out.println("그 외");
				
		} // 해당되는 케이스만 사용하고 싶다면 반드시 break사용
		// jdk 7 버전 전에는 value에 정수만 들어갈 수 있었다
		// jdk 7 이후부터 value에 문자열도 들어갈 수 있다.
		
		String str = "G";
		switch(str) {
			case "D":
				System.out.println("D");
				break;
			case "G": {
				System.out.println("G");
				break;
			}
		}

	}

}
