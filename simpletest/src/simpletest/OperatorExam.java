package simpletest;

public class OperatorExam {

	public static void main(String[] args) {
//		operations ������ : ���꿡 ���Ǵ� ��ȣ
//		operand �ǿ����� : ���� ����� �Ǵ� ������ (����, ���ͷ�)
//		+,-,*,/,%  % = ������ ���� ������
//		++,--,���� ������ 1�� ���ϰų� ����
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // ���� ���ϰ� ���Ѱ��� i4�� �����Ѵ�.
		
		System.out.println(i4); // i3 = i3+1;
		System.out.println(i3);
		
		int i5 = i3++; // ���� ���� i5�� ������ �Ŀ� ���Ѵ�
		System.out.println(i5); // i3 = i3 + 1;
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i / (double)j); //ĳ���� ����
		System.out.println(i % j);//��ⷯ ����
	}

}
