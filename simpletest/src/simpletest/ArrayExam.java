package simpletest;

public class ArrayExam {

	public static void main(String[] args) {
		// ������ Ÿ��
		// �迭 - �������� ������ �ʿ��� ���
		int [] array1 = new int[100]; 
		// �迭�� [](���ȣ)���, ������ �����Ҷ� new��� Ű���� �ݵ�� �Է�, []�ȿ� ��� ������ �������� ����
		
		array1[0] = 50;
		array1[10] = 100;
		
		
		int[] array2 = new int[] {1,2,3,4}; // �迭 ���� �� ���� �ٷ� �־���
		System.out.println(array2[1]);
		
		
		int[] array3 = {1,2,3,4}; // ���� ����
		System.out.println(array3[1]);
		
		int value = array3[0];
		System.out.println(value);
		
		
	}

}
