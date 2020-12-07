package array_ex;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println("占쏙옙占쏙옙占쏙옙 - arr.length:"+arr.length);
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		int[] tmp = new int[arr.length*2];
		
		//占썼열 arr占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占썼열 tmp占쏙옙 占쏙옙占쏙옙占싼댐옙.
		for(int i=0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp; // tmp占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙 arr占쏙옙 占쏙옙占쏙옙占싼댐옙.
		
		System.out.println("占쏙옙占쏙옙占쏙옙 - arr.length:"+arr.length);
		for(int i=0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
	}
}
