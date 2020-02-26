package simpletest;

public class VariableScopeExam {
	
	int globalScope = 10;
	static int staticValue = 6;
	
	
	public void scpeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope); 수행되지 않음
//		System.out.println(value); 수행되지 않음
		System.out.println(value2);
		System.out.println(staticValue);
	}
	
	
	public static void main(String[] args) {
		// 변수의 scope와 static
		// 모든 class는 instance화 하지 않은 상태로는 사용할 수 없다.
		// static이라는 키워드를 붙여주면 class가 instance화 되지 않아도 사용가능
		
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticValue); // 6
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope); // instance변수
		
		v1.staticValue = 50;
		v2.staticValue = 100;
		System.out.println(v1.staticValue); // static한 변수, 값을 저장할 수 있는 공간이 하나밖에 없다.
		System.out.println(v2.staticValue); // class변수 값을 공유한다.
		System.out.println(VariableScopeExam.staticValue); // 따라서 class이름을 직접 사용가능
	}

}
