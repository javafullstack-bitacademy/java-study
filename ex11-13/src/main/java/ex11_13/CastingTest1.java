package ex11_13;

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

public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	//car = (Car)fe;에서 형변환이 생략
		//car.water();
		fe2 = (FireEngine)car;	// 자손타입 <- 조상타입
		fe2.water();

	}

}
