package simpletest;

public class OperatorExam3 {

	public static void main(String[] args) {
		// ������ �켱����, ������ �Ʒ���
		// �ֿ켱 [], (),
		// ���� ������ ++, -- !, ~, +/- : ����, bit��ȯ > ��ȣ > ����
		// ��������� *, /, %, >, +, -, > shift/����Ʈ ������ >>, <<, >>>
		// �񱳿����� >, <, >=, <=, ==, !=
		// ��Ʈ������ &, |, ^, ~
		// �������� &&(���� and ������) > ||(���� or ������)
		// ���� ������ ���ǽ�?
		// ���� ������ =, *=, /=, +=, -=, %=
		
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c);
		
		System.out.println(a > 5 && b > 5);
		System.out.println(a > 4 && b > 5);
		System.out.println(a > 5 || b > 5);
		
		System.out.println(++a - 5); // 1
		System.out.println(a); // 6
		System.out.println(a++ - 5); // 1
		System.out.println(a); // 7
	}

}
