package Instanceof;

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}

public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
		
		System.out.println(fe.getClass().getName());

	}

}


