package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

// List객체를 배열로 변환 : toArray()
public class T2_toArray {
	public static void main(String[] args) {
		List<Integer> vos = new ArrayList<>();
		vos.add(10);
		vos.add(20);
		vos.add(30);
		vos.add(40);
		vos.add(50);
		System.out.println("1. vos : " + vos);
		System.out.println();

		Object[] objects = vos.toArray();
		System.out.println("2. objects : " + objects);
		System.out.println();

		int cnt = 0;
		for (Object obj : objects) {
			System.out.println("obj[" + cnt + "] : " + obj + " , " + ((Integer) obj) + 10);
			cnt++;
		}
		System.out.println();

		Integer[] integers = vos.toArray(new Integer[vos.size()]); //정확하게 하려면 이렇게
		cnt = 0;
		for (Integer ii : integers) {
			System.out.println("Integer[" + cnt + "] : " + ii + " , " + (ii + 10));
			cnt++;
		}
		System.out.println();

		Integer[] integers2 = vos.toArray(new Integer[0]); //알아서 커짐 0을넣어도 
		cnt = 0;
		for (Integer ii : integers) {
			System.out.println("Integer[" + cnt + "] : " + ii + " , " + (ii + 10));
			cnt++;
		}
		System.out.println();
	}

}
