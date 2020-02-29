package simpletest;

public class InnerExam {
//	���� Ŭ���� - Ŭ���� �ȿ� ����� Ŭ����
//	(ù����) class�ȿ� �ν��Ͻ� ����, �� �ʵ带 �����ϴ� ��ġ�� ����Ǵ� ��츦 ��øŬ����, �ν��Ͻ� Ŭ������� �Ѵ�.
	class Cal{
		int value = 0; // �Ȱ��� �ʵ带 �����ϰų�
		public void plus() { // �޼ҵ带 ������ �� �ִ�.
			value++;
		}
	}
	
	
//	(�ι�°) ���� ��ø Ŭ���� �Ǵ� static Ŭ����
	static class Cal2{
		int value2 = 0; // �Ȱ��� �ʵ带 �����ϰų�
		public void plus() { // �޼ҵ带 ������ �� �ִ�.
			value2++;
		}
	}
	
	
//	(����°) ������ø Ŭ���� �Ǵ� ����Ŭ����, local class / method�ȿ� ����Ǵ� ���
	public void exec() {
		class Cal3{
			int value3 = 0;
			public void plus(){
				value3++;
			}
		}
	}
	
	
	

	public static void main(String[] args) {
//		ȥ�� ���������� ������ �� ���� ������ �ܺο� Ŭ������ ���� �ҷ��´�.
		InnerExam t = new InnerExam();
//		���� Ŭ������ �̿��ؼ� Cal��ü�� �̿��� �� �ִ�.
		InnerExam.Cal cal = t.new Cal();
		cal.plus();
		System.out.println(cal.value);
		
//		(�ι�° ���� Ŭ����)
		InnerExam.Cal2 cal2 = new InnerExam.Cal2();
		cal2.plus();
		System.out.println(cal2.value2);
		
//		(����° ���� Ŭ����)
		InnerExam q = new InnerExam();
		q.exec();
		System.out.println();
		
	}

}
