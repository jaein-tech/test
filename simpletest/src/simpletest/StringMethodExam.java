package simpletest;

public class StringMethodExam {

	public static void main(String[] args) {
		// Java���� String Class�� ���� ���� ���Ǳ� ������ �Ʒ��� ���� �ۼ��ص� �����ϴ�.
		// String class�� �̹� �������� �پ��� method���� �����ȴ�.
		
		// String str = new String("something"); ==
		String str = "something";
		
		System.out.println(str.length());
		
		System.out.println(str.concat(" lalala")); // lalala��� ���ڸ� �������� �̹� �ѹ����� ��������.
		System.out.println(str);
		
		// ��ü�� ��������� str�� �� ��ü�� ����
		// ��Ʈ�� Ŭ������ str�� ȥ�� �ż��带 �����Ѵٰ� �ؼ� ��Ʈ�� ��ü��ü�� �ٲ�����ٸ�
		// �ٸ� �����ϰ� �ִ� �����鿡�� ������ ���� ���� �ֱ⶧����
		// �ѹ� ������� ��ü�� �ٲ��� �ʴ´� = �Һ� Ŭ����
		
		str = str.concat(" lalala");
		System.out.println(str);
		
		System.out.println(str.substring(8)); // 8��° ���ں��� �߶�� = something lalala -> g lalala
		System.out.println(str.substring(2, 7)); // 2��° ���� 7���ڱ��� �߶�� = something lalala -> methi
	}

}
