package simpletest;

public class Fid1 {

	public static void main(String[] args) {
		// class�� �Ӽ��� field��� �Ѵ�.
		// Ÿ��, ������, �ʵ��
		
		Car c1 = new Car("");
		Car c2 = new Car("");
		
		// .�� ������ Car ��ü�� ������ �ִ°��� ����� �� �ִ�.
		c1.name = "�ڵ���";
		c1.number = 5123;
		
		c2.name = "�������";
		c2.number = 5513;
		
		System.out.println(c1.name);
		System.out.println(c2.name);

	}

}
