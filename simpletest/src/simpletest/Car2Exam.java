package simpletest;

public class Car2Exam {

	public static void main(String[] args) {
		/// ������ 
		// class�� ����� �ش� class�� �̿��ؼ� ��ü ��, instance�� ������� new��� �����ڸ� ����ؾ��Ѵ�
		// new �������� �ݵ�� �����ڰ� ���;��Ѵ�

		// Car c1 = new Car();   Car��ü�� �����ڰ� ����� ������ �⺻ �����ڴ� ����� �� ����.
		Car c2 = new Car("�ý�");
		Car c3 = new Car("����");
		
		System.out.println(c2.name);
		System.out.println(c3.name);
		
		//������ ����
//		public class Ŭ������ {
//			Ÿ�� �ʵ��;
//			
//			public Ŭ������(�Ű����� ���) {       ������
//				,,,
//			}                                ���
//			
//			public ����Ÿ�� �޼ҵ��(�Ű����� ���) {
//				,,,
//			}
//		}
	}

}
