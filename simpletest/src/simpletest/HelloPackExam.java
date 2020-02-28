package simpletest;

import com.testpack.simpletest.HelloPack; 
//import com.testpack.simpletest.*;는 패키지 안에 있는 모든것을 사용한다는 뜻

public class HelloPackExam {

	public static void main (String[] args) {
		// ctrl + shift + o 패키지를 import 해주는 단축키
		HelloPack hello = new HelloPack();

		// 위와 동일한 코드. import를 사용하지 않는다면 패키지를 사용할때마다 아래와 같이 작성하여야 한다.
//		com.testpack.simpletest.HelloPack hello = new com.testpack.simpletest.HelloPack();
		
	}
	
}
