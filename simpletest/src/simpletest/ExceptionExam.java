package simpletest;

public class ExceptionExam {

	public static void main(String[] args) {
		// ����ó�� - ���α׷������� ����ġ ���� ����� ���ܶ�� �Ѵ�.
		int i = 10;
		int j = 0;
		try {
			int k = i/j;
			// �ڹٴ� ������ 0���� ������ exception�� �߻���Ų��.
			System.out.println(k); // exception�� �߻��ϸ� �߻��������� ���α׷��� ����ȴ�. �Ʒ��� �ڵ�� �������� �ʴ´�.
		}catch(ArithmeticException a) {
			System.out.println("0���δ� ���� �� �����ϴ�."+a.toString()); // .toString();���ܿ� ���� ������ �˷��ִ� method
		}finally {
			System.out.println("�ݵ�� ����ȴ�.");
		}
		System.out.println("lalala");
		
//		Exception Ŭ�������� ��� exception�̶�� Ŭ������ ��ӹް� �Ǵµ� 
//		���� Ŭ������ exception�̶�� �ΰ� �ȴٸ� � ������ �߻��ϴ������� �ϳ��� catch��Ͽ��� ��� ������ ó���� �� �ִ�.
		
		
		
//		try-catch-finally(finally��������)

//		try {                               ������ �ڵ�
//			,,,                             ���� �߻� ���ɼ��� �ִ� ���
//		}catch(����Ŭ���� ������) {
//			,,,                             ���� ó�� ���,, ������ ������ �߻��Ѵٸ� catch����� ������ �� �� �ִ�.
//		}finally {
//			,,,                             ���� �߻����ο� ������� �ݵ�� ����
//		}                                   (��������)
		

	}

}
