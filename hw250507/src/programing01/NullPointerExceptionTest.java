package programing01;

public class NullPointerExceptionTest {
	public static void main(String[] args) {
		MyDate d = new MyDate(2035, 12, 25);
		
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
	}

}