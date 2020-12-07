package ex11_13ex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Product {
	String name;
	int price;
	int bonusPoint;

	Product(String name, int price) {
		this.name = name;
		this.price = 0;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {	
	Tv(String name, int price) {
		super(name, price);		
	}
}

class Computer extends Product {	
	Computer(String name, int price) {
		super(name, price);		
	}
}

class Audio extends Product {	
	Audio(String name, int price) {
		super(name, price);
	}
}

public class zProductTest {
	static ArrayList<Product> items = new ArrayList<Product>();
	static int cnt = 0;
	static int salesCnt = 0;

	static void insertMenu() {
		int name = 0;
		int price;
		System.out.println("��ǰ������ ��ȣ�� �Է��ϼ���(1.Tv 2.Computer 3.Audio)");
		name = keyboard.nextInt();
		System.out.println("������ �Է��ϼ���.");
		price = keyboard.nextInt();
		cnt++;
		if(name == 1) {
			Product tv = new Tv("Tv", price);
			items.add(tv);
			System.out.println("��ǰ�� ��ϵǾ����ϴ�.");
		}else if(name ==2) {
			Product computer = new Computer("Computer",price);
			items.add(computer);
			System.out.println("��ǰ�� ��ϵǾ����ϴ�.");			
		}else {
			Product audio = new Audio("Audio", price);
			items.add(audio);
			System.out.println("��ǰ�� ��ϵǾ����ϴ�.");
		}
	}
	
	static void buyMenu() {
		System.out.println("� ��ǰ�� �����Ͻðڽ��ϱ�.(1.Tv 2.Computer 3.Audio)");
		int choice = keyboard.nextInt();
		if(choice ==1 ) {
			System.out.println("Tv�� �����ϼ̽��ϴ�.");
			salesCnt++;
		}else if(choice == 2 ) {
			System.out.println("Computer�� �����ϼ̽��ϴ�.");
			salesCnt++;
		}else {
			System.out.println("Audio�� �����ϼ̽��ϴ�.");
			salesCnt++;
		}
	}

	static void stockMenu() {
		System.out.println("���������� " + cnt + "���Դϴ�.");
	}

	static void saleNum() {
		System.out.println("�ǸŰ����� " + salesCnt + "���Դϴ�.");
	}

	public static void mainMenu() {
		System.out.println("1.��ǰ���  2.��ǰ����  3.�����ȸ  4.�Ǹ�����  5.����");
		System.out.println("��ȣ�� �����ϼ���.");
	}

	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {
			mainMenu();
			int input;
			input = keyboard.nextInt();
			switch (input) {
			case 1:
				insertMenu();
				break;
			case 2:
				buyMenu();
				break;
			case 3:
				stockMenu();
				break;
			case 4:
				saleNum();
				break;
			case 5:
				System.out.println("����");
				break;
			}
		}
	}

}

/*
 * Product�� ����ȭ, �԰� ��ǰ�Ǹ��ϴ� ��ü�� Ŭ���� ��ǰ ���(�԰�), ��� ��ȸ, �Ǹ� ���� ����
 */