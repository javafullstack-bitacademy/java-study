package anonymousobject;

public interface RemoteControl {
	public int MAX_VOLUMN = 10;
	public int MIN_VOLUMN = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolumn(int volumn);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó��");
		} else {
			System.out.println("��������");
		}
	}
	
	static void changeBattery() {
		System.out.println("���͸� ��ȯ");
	}
}
