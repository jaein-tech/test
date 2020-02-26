package simpletest;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 2차원 배열, 배열의 배열
		
		// 3개의 배열 생성, 각 배열의 4개의 변수가 들어가는 배열 생성
		int[][] array4 = new int[3][4]; // 배열의 크기 지정, 
		
		// 0번째 index가 가르키는 배열
		// 앞에 []는 실제 int를 넣는 자리가 아니고 int형 배열을 가르키는 참조변수이다. 따라서 정수값을 담을수는 없다.
		// 실제 값을 담을때는 다음 index (다음[])까지 지정해 줘야 한다.
		
		array4[0][3] = 10; // array4 3개중 1번째 배열에 4자리중 4번째에 10값을 담는다. 
		System.out.println(array4[0][3]);
		
		
		
		int[][] array5 = new int[3][]; // array5에 배열 3개 생성
		array5[0] = new int[1]; // array5에 3개의 배열중 1번째 배열은 1의 변수만 담을 수 있는 배열
		array5[0][0] = 10;
		
		array5[1] = new int[4]; // array5에 3개의 배열중 2번째 배열은 4의 변수만 담을 수 있는 배열
		array5[2] = new int[2]; // array5에 3개의 배열중 3번째 배열은 2의 변수만 담을 수 있는 배열
		System.out.println(array5[0][0]);
		
		
		int[][] array6 = {{1,2}, {1,2,3,4,5}, {1,2,3}};
		
		System.out.println(array6[0][1]); // 1번째 배열중 2번째 값 = 2
		System.out.println(array6[1][4]); // 2번째 배열중 5번째 값 = 5
		System.out.println(array6[2][2]); // 3번째 배열중 3번째 값 = 3
		
		
	}

}
