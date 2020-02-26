package simpletest;

public class ArrayExam {

	public static void main(String[] args) {
		// 참조형 타입
		// 배열 - 여러가지 변수가 필요한 경우
		int [] array1 = new int[100]; 
		// 배열은 [](대괄호)사용, 변수를 생성할때 new라는 키워드 반드시 입력, []안에 몇가지 변수를 넣을건지 선언
		
		array1[0] = 50;
		array1[10] = 100;
		
		
		int[] array2 = new int[] {1,2,3,4}; // 배열 생성 및 값을 바로 넣어줌
		System.out.println(array2[1]);
		
		
		int[] array3 = {1,2,3,4}; // 위와 같음
		System.out.println(array3[1]);
		
		int value = array3[0];
		System.out.println(value);
		
		
	}

}
