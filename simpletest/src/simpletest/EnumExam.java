package simpletest;

public class EnumExam {
	public static final String MALE="MALE"; // ����� �����Ҷ��� ��ü�� �������� �빮�ڷ� ���°��� ����
	public static final String FEMALE="FEMALE";
	
	public static void main(String[] args) {
		// ������Ÿ���� �̿��Ͽ� ������ ������ �� ����Ÿ������ ����� �� �ִ�.
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy"; // complie error�� �߻����� ������ ������ ����
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy"; = complie error
		
		// Ư�� ���� ������ ����ؾ� �Ѵٸ� �������� ����ϴ°��� ����.
	}

}
//enum �̸� {��1,��2;}
enum Gender{
	MALE, FEMALE;
}