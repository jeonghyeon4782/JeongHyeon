package helloworld;

class MyException extends Exception {
	int x;

	public MyException(int x) {
		this.x = x;
	}
	
	public String toString() {
		return "I am " + x;
	}
	
}

public class Main {
	public static void main(String[] args) {
		MyException me = new MyException(10);
		
		try {
			System.out.println("예외를 던지기 전");
			throw me;
		} catch (MyException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
