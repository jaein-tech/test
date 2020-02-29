package simpletest;

public class InnerExam {
//	내부 클래스 - 클래스 안에 선언된 클래스
//	(첫번쨰) class안에 인스턴스 변수, 즉 필드를 선언하는 위치에 선언되는 경우를 중첩클래스, 인스턴스 클래스라고 한다.
	class Cal{
		int value = 0; // 똑같이 필드를 선언하거나
		public void plus() { // 메소드를 정의할 수 있다.
			value++;
		}
	}
	
	
//	(두번째) 정적 중첩 클래스 또는 static 클래스
	static class Cal2{
		int value2 = 0; // 똑같이 필드를 선언하거나
		public void plus() { // 메소드를 정의할 수 있다.
			value2++;
		}
	}
	
	
//	(세번째) 지역중첩 클래스 또는 지역클래스, local class / method안에 선언되는 경우
	public void exec() {
		class Cal3{
			int value3 = 0;
			public void plus(){
				value3++;
			}
		}
	}
	
	
	

	public static void main(String[] args) {
//		혼자 독자적으로 생성될 수 없기 때문에 외부에 클래스를 먼저 불러온다.
		InnerExam t = new InnerExam();
//		위에 클래스를 이용해서 Cal객체를 이용할 수 있다.
		InnerExam.Cal cal = t.new Cal();
		cal.plus();
		System.out.println(cal.value);
		
//		(두번째 내부 클래스)
		InnerExam.Cal2 cal2 = new InnerExam.Cal2();
		cal2.plus();
		System.out.println(cal2.value2);
		
//		(세번째 내부 클래스)
		InnerExam q = new InnerExam();
		q.exec();
		System.out.println();
		
	}

}
