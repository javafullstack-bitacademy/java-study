package linkedlist;

import java.util.Iterator;

import arraylist.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		//list.add(40);
		//list.add(50);
		/*list.add(50);
		list.add(2,25);
		System.out.println("���� ������ ��: " + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "��° ������: " + list.get(i));
		}
		System.out.println();
		
		list.remove(4);
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "��° ������: " + list.get(i));
		}*/
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
		
	}

}
