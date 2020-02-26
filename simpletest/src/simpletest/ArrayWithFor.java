package simpletest;

public class ArrayWithFor {

	public static void main(String[] args) {
		// 
		int [] iarray = new int[100];
		// iarray[0] = 1;
		// iarray[1] = 2;
		
		// 배열은 배열의 크기를 알아낼 수 있다. (.length) = 크기 및 길이를 알려줌
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;
		}
		System.out.println(iarray[50]);

		
		// 변수는 선언한 지점이 어디냐에 따라서 그 변수를 사용할 수 있는 범위가 달라짐 (변수의 스코프)
		// 기본적으로 변수가 선언된 지점을 감싸고 있는 괄호안이 그 변수의 스코프
		// 변수는 선언될대 생성되었다가 해당블럭이 끝나면 소멸한다.
		int sum = 0;
		for(int i = 0; i < iarray.length; i++) {
			sum = sum + iarray[i];
		}
		System.out.println(sum);
	}

}
