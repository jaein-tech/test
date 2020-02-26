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
//		System.out.println(localScope); ������� ����
//		System.out.println(value); ������� ����
		System.out.println(value2);
		System.out.println(staticValue);
	}
	
	
	public static void main(String[] args) {
		// ������ scope�� static
		// ��� class�� instanceȭ ���� ���� ���·δ� ����� �� ����.
		// static�̶�� Ű���带 �ٿ��ָ� class�� instanceȭ ���� �ʾƵ� ��밡��
		
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
		System.out.println(v2.globalScope); // instance����
		
		v1.staticValue = 50;
		v2.staticValue = 100;
		System.out.println(v1.staticValue); // static�� ����, ���� ������ �� �ִ� ������ �ϳ��ۿ� ����.
		System.out.println(v2.staticValue); // class���� ���� �����Ѵ�.
		System.out.println(VariableScopeExam.staticValue); // ���� class�̸��� ���� ��밡��
	}

}
