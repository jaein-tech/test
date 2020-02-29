package simpletest;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = divide(i, j);
		System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}

//	throw�� �̿��ؼ� ���� exception �߻���Ű�� - throws�� throw�� ���� �Բ� ���δ�.
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j == 0) {
			throw new IllegalArgumentException("0���� ���� �� �����ϴ�.");
		}
		int k = i/j;
		return k;  // �߸��Ȱ��� return�Ǿ �Ѿ�� ��쵵 ������ �߻��� �� �ֱ� ������ exception�� �߻����Ѿ� �� ��Ȳ�� �ʿ��ϴ�.
	}

}
