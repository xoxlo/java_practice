package practice;

import java.util.*;

public class Ex11_05 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// Iterator는 1회용이라 다 쓰고나면 다시 얻어와야 한다.
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
