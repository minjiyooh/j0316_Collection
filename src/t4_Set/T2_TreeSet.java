package t4_Set;

import java.util.ArrayList;
import java.util.TreeSet;

/*
 		TreeSet : Set계열자료구조, 집합자료구조, HashSet과의 차이점을 순서가 없이 들어가있는자료를 꺼낼때는 오름차순 정렬되어 꺼내준다.
*/
public class T2_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for(int i=0; i<10; i++) {
			treeSet.add((int)(Math.random()*100)+1);
		}
		treeSet.add(5);
		System.out.println("1.크기 : " + treeSet.size());
		System.out.println("1.treeSet: " + treeSet);
		System.out.println();
	}
}
