package simpletest;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 2���� �迭, �迭�� �迭
		
		// 3���� �迭 ����, �� �迭�� 4���� ������ ���� �迭 ����
		int[][] array4 = new int[3][4]; // �迭�� ũ�� ����, 
		
		// 0��° index�� ����Ű�� �迭
		// �տ� []�� ���� int�� �ִ� �ڸ��� �ƴϰ� int�� �迭�� ����Ű�� ���������̴�. ���� �������� �������� ����.
		// ���� ���� �������� ���� index (����[])���� ������ ��� �Ѵ�.
		
		array4[0][3] = 10; // array4 3���� 1��° �迭�� 4�ڸ��� 4��°�� 10���� ��´�. 
		System.out.println(array4[0][3]);
		
		
		
		int[][] array5 = new int[3][]; // array5�� �迭 3�� ����
		array5[0] = new int[1]; // array5�� 3���� �迭�� 1��° �迭�� 1�� ������ ���� �� �ִ� �迭
		array5[0][0] = 10;
		
		array5[1] = new int[4]; // array5�� 3���� �迭�� 2��° �迭�� 4�� ������ ���� �� �ִ� �迭
		array5[2] = new int[2]; // array5�� 3���� �迭�� 3��° �迭�� 2�� ������ ���� �� �ִ� �迭
		System.out.println(array5[0][0]);
		
		
		int[][] array6 = {{1,2}, {1,2,3,4,5}, {1,2,3}};
		
		System.out.println(array6[0][1]); // 1��° �迭�� 2��° �� = 2
		System.out.println(array6[1][4]); // 2��° �迭�� 5��° �� = 5
		System.out.println(array6[2][2]); // 3��° �迭�� 3��° �� = 3
		
		
	}

}
