package simpletest;

public class StringMethodExam {

	public static void main(String[] args) {
		// Java에서 String Class는 워낙 많이 사용되기 때문에 아래와 같이 작성해도 동일하다.
		// String class는 이미 만들어놓은 다양한 method들이 제공된다.
		
		// String str = new String("something"); ==
		String str = "something";
		
		System.out.println(str.length());
		
		System.out.println(str.concat(" lalala")); // lalala라는 문자를 붙혔지만 이번 한번에만 붙혀진다.
		System.out.println(str);
		
		// 객체가 만들어지면 str이 그 객체를 참조
		// 스트링 클래스는 str이 혼자 매서드를 수행한다고 해서 스트링 객체자체를 바꿔버린다면
		// 다른 참조하고 있는 변수들에게 문제가 생길 수도 있기때문ㅇ
		// 한번 만들어진 객체를 바꾸지 않는다 = 불변 클래스
		
		str = str.concat(" lalala");
		System.out.println(str);
		
		System.out.println(str.substring(8)); // 8번째 글자부터 잘라라 = something lalala -> g lalala
		System.out.println(str.substring(2, 7)); // 2번째 부터 7글자까지 잘라라 = something lalala -> methi
	}

}
