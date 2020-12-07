package ex11_13;

interface IPrinterable{
	public void print();
	public default void cancel() {
		System.out.println("Printer Cancel");
	};
}

class InkJetPrinter implements IPrinterable{
	
	@Override
	public void print() {
		System.out.println("InkJetPrinter Print");
		
	}
	
	@Override
	public void cancel() {
		System.out.println("InkJetPrinter Cancel");
	}
}

class LaserPrinter implements IPrinterable{
	
	@Override
	public void print() {
		System.out.println("LaserPrinter Print");
	}
}

public class DefualtMethodExample {
	public static void main(String[] args) {
		
		IPrinterable printer = null;
		
		printer = new InkJetPrinter();
		printer.print();
		printer.cancel();
		
		printer = new LaserPrinter();
		printer.print();
		printer.cancel();
		
	}
}











