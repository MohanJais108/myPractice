package Thread;

public class Display {
	
	public synchronized void displayN() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			
			
		}
	}
	
	public synchronized void displayC() {
		for(int i=65;i<75;i++) {
			System.out.println((char)i);
			
			
		}
	}

}
