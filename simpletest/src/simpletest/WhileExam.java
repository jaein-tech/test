package simpletest;

public class WhileExam {

	public static void main(String[] args) {
		// 반복문 while
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++; //i = i+1;
		} //while문은 잘못하면 무한으로 반복된다.

		int total = 0;
		int e = 1;
		
		while(e<=100) {
			total = total + e;
			e++;
		}
		System.out.println(total);
		
		// while(true){ } 무한반복
	}

}
