package simpletest;

public class StringExam {

	public static void main(String[] args) {
		// ���� ���� ����ϴ� Ŭ���� ���ڿ�
		// new�� ������� �ʰ� �ν��Ͻ��� ���� �� �ִ�.
		String str1 = "hello";
		String str2 = "hello";
		// ������� ����Ǵ� ���� �����.
		
		String str3 = new String("hello");
		// �������� ����Ǵ� ���� �����.
		
		if (str1 == str2) // str1.equals(str2)�� ==�� ���� ����� ����.
			System.out.println("str1�� str2�� ���� ���۷��� �Դϴ�.");
		
		
		if (str2 == str3) { 
			System.out.println("str2�� str3�� ���� ���۷��� �Դϴ�.");
		}else {
			System.out.println("str2�� str3�� �ٸ� ���۷��� �Դϴ�.");
		}
		
		// .�� ������  �� class�� ���� method���� �� �� ����
		System.out.println(str1.substring(3)); // index�� 3��° ���� ©���
		System.out.println(str1); // �ٽ� ���������� ���ƿ�
		
		// String�� ������ �ִ� class�� ������ ���� ������ �ʴ´�.
		// String�� ������ �ִ� ��� method���� string���� ��ȯ�Ѵ�.
	}

}
