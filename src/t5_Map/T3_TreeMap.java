package t5_Map;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class T3_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); // 정렬을 하고싶을 때 트리맵

		System.out.println("1.크기 :" + treeMap.size()); // 키로 정렬돼서 나옴
		System.out.println("1.toString : " + treeMap.toString());
		System.out.println("1.toString : " + treeMap);
		System.out.println();

		treeMap.put(11, "홍길동");
		treeMap.put(13, "김말숙");
		treeMap.put(21, "고인돌");
		treeMap.put(15, "이기자");
		treeMap.put(17, "강감찬");
		treeMap.put(19, "오사랑");

		System.out.println("2.크기 :" + treeMap.size());
		System.out.println("2.toString : " + treeMap.toString());
		System.out.println("2.toString : " + treeMap);
		System.out.println();

		// 역순으로 TreeMap에 값을 입력한 후 출력시키면 키값으로 오름차순 정렬되어 출력된다.
		for (int i = 20; i > 0; i -= 2) {
			System.out.println(" i : " + i);
			treeMap.put(i, i + "번째"); // map계열은 put
		}
		System.out.println();

		System.out.println("3.크기 :" + treeMap.size());
		System.out.println("3.toString : " + treeMap.toString());
		System.out.println("3.toString : " + treeMap);
		System.out.println();

		// 첫번째 키값 보여주기 : firstKey() , 마지막키/값 : lastKey()
		System.out.println("4.첫번째 키 : " + treeMap.firstKey());
		System.out.println("4.첫번째 키와 값 : " + treeMap.firstEntry());
		System.out.println("4.마지막 키 : " + treeMap.lastKey());
		System.out.println("4.마지막 키와 값 : " + treeMap.lastKey());
		System.out.println();

		// 검색키보다 작은 자료중에서 최고값?,최저값? : highKey(), lowerKey()

		System.out.println("5.검색키보다 작은 자료중의 최고값 : " + treeMap.lowerKey(11));
		System.out.println("5.검색키보다 작은 자료중의 최고값 : " + treeMap.lowerKey(10));
		System.out.println("5.검색키보다 큰 자료중의 최저값 : " + treeMap.higherKey(11));
		System.out.println("5.검색키보다 큰 자료중의 최저값 : " + treeMap.higherKey(10));
		System.out.println();
		System.out.println("5.크기 :" + treeMap.size());
		System.out.println("5.toString : " + treeMap);
		System.out.println();

		// 자료제거 : 첫 번째 자료제거 - pollFirstEntry(), 마지막 자료 제거 - pollLastEntry()
		System.out.println("6. 첫 번째 자료 꺼내기 : " + treeMap.pollFirstEntry());
		System.out.println("6. 첫 번째 자료 꺼내기 : " + treeMap.pollLastEntry());
		System.out.println("6.크기 :" + treeMap.size());
		System.out.println("6.toString : " + treeMap);
		System.out.println();

		// SortedMap객체 : 부분집합 자료 표현
		SortedMap<Integer, String> sortedMap = treeMap.headMap(10);
		System.out.println("7: 10번보다 작은 자료들의 집합 :" + sortedMap);

		// NavigableMap객체 : 부분집합 자료 표현
		NavigableMap<Integer, String> navigableMap = treeMap.headMap(10,true);
		System.out.println("7: 10번을 포함한 작은 자료들의 집합 :" + navigableMap);
		System.out.println();
		
		// SortedMap객체 : 부분집합 자료 표현
		sortedMap = treeMap.tailMap(10,false);
		System.out.println("7: 10번을 포함한 큰 자료들의 집합 :" + sortedMap);

		// NavigableMap객체 : 부분집합 자료 표현
	  navigableMap = treeMap.headMap(10,true);
		System.out.println("7: 10번보다 큰 자료들의 집합 :" + navigableMap);
		
		//정렬
		System.out.println("8. 원본자료");
		NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
		System.out.println("8. 정렬자료(키값 내림차순) : "  + navigableSet);
		System.out.println("8. 앞의 자료를 다시 거꾸로 정렬해서 출력하기 : "  + navigableSet.descendingSet());
		System.out.println();
		
		navigableMap = treeMap.descendingMap();
		System.out.println("9: 모든 자료를 키값 오름차순 : " + navigableMap);
		System.out.println("9: 앞의 자료를 다시 거꾸로 정렬해서 출력하기: " + navigableMap.descendingMap());
	}
}
