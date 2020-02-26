package simpletest;

public class StringExam {

	public static void main(String[] args) {
		// 가장 많이 사용하는 클래스 문자열
		// new를 사용하지 않고도 인스턴스를 만들 수 있다.
		String str1 = "hello";
		String str2 = "hello";
		// 상수들이 저장되는 값에 저장됨.
		
		String str3 = new String("hello");
		// 변수들이 저장되는 값에 저장됨.
		
		if (str1 == str2) // str1.equals(str2)도 ==와 값은 결과를 낸다.
			System.out.println("str1과 str2는 같인 레퍼런스 입니다.");
		
		
		if (str2 == str3) { 
			System.out.println("str2와 str3은 같인 레퍼런스 입니다.");
		}else {
			System.out.println("str2와 str3은 다른 레퍼런스 입니다.");
		}
		
		// .을 누르면  그 class가 가진 method들을 볼 수 있음
		System.out.println(str1.substring(3)); // index를 3번째 부터 짤라라
		System.out.println(str1); // 다시 원래값으로 돌아옴
		
		// String이 가지고 있는 class는 내부의 값이 변하지 않는다.
		// String이 가지고 있는 모든 method들이 string값을 반환한다.
	}

}
