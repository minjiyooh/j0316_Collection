package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T1_Basic {
	public static void main(String[] args) {
		// ArrayList<String> arrayList = new ArrayList<String>();
		// ArrayList<String> arrayList = new ArrayList<>();
		// List<String> arrayList = new ArrayList<>(20); //용량 capacity() - 기본은 10
		List<String> arrayList = new ArrayList<>();

		System.out.println("1.arrayList크기 : " + arrayList.size());
		System.out.println("1.arrayList크기 : " + arrayList.toString());
		System.out.println("1.arrayList크기 : " + arrayList);
		System.out.println();

		// 자료추가(add)
		arrayList.add("100");
		arrayList.add("홍길동");
		arrayList.add("Hong Kil Dong");
		arrayList.add("홍길동");
		arrayList.add("김말숙");
		arrayList.add("이기자");

		System.out.println("2. arrayList크기 : " + arrayList.size());
		System.out.println("2. toString크기 : " + arrayList); // 중복허용 순서가중요
		System.out.println();

		// 특정위치(인덱스)에 자료 추가? .add (인덱스,자료)

		arrayList.add(2, "소나무");

		System.out.println("3. arrayList크기 : " + arrayList.size());
		System.out.println("3. toString크기 : " + arrayList);
		System.out.println();

		// 검색 : .get(인덱스)
		String name = arrayList.get(2);
		System.out.println("4. name : " + name);

		// 변경 : set(인덱스 , 자료)
		arrayList.set(2, "감나무");
		System.out.println("5. arrayList크기 : " + arrayList.size());
		System.out.println("5. toString크기 : " + arrayList);
		System.out.println();

		// 삭제 : remove(인덱스) or remove ("값")
		arrayList.remove(2);
		arrayList.remove("홍길동");
		System.out.println("6. arrayList크기 : " + arrayList.size());
		System.out.println("6. toString크기 : " + arrayList);
		System.out.println();

		List<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(0);
		for (int i = 1; i < 5; i++)
			arrayList2.add(i, (i * 100));

		System.out.println("7. arrayList크기 : " + arrayList2.size());
		System.out.println("7. toString크기 : " + arrayList2);
		System.out.println();

		// arrayList2.remove(200); //오류
		arrayList2.remove(new Integer(200)); // 실제 값을 삭제하려면 객체형식으로 삭제처리 한다.
		System.out.println("8. arrayList크기 : " + arrayList2.size());
		System.out.println("8. toString크기 : " + arrayList2);
		System.out.println();

		// 향상된 for문을 이용한 ArrayList객체의 활용
		String str = " ";
		for (String s : arrayList) {
			str += s + "/";
		}
		str = str.substring(0, str.length() - 1);

		System.out.println("9. str : " + str);

		// 일반 for문
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(i + "번째 : " + arrayList.get(i));
		}
		System.out.println();
		
		//모든 자료 삭제 (clear()) 
		arrayList.clear();
		System.out.println("10. arrayList크기 : " + arrayList.size());
		System.out.println("10. toString크기 : " + arrayList);
		System.out.println();

		ArrayList<String> arrayList3 = new ArrayList<>();
		arrayList3.add("서울");
		arrayList3.add("청주");
		arrayList3.add("부산");
		arrayList3.add("제주");
		System.out.println("11. arrayList크기 : " + arrayList3.size());
		System.out.println("11. toString크기 : " + arrayList3);
		System.out.println();
		
		//ArrayList객체의 내용을 모두 추가(합치기) : addAll()
		
		arrayList.addAll(arrayList3);
		System.out.println("12. arrayList크기 : " + arrayList.size());
		System.out.println("12. toString크기 : " + arrayList);
		System.out.println();
		
		arrayList.addAll(1,arrayList3);
		System.out.println("13. arrayList크기 : " + arrayList.size());
		System.out.println("13. toString크기 : " + arrayList);
		System.out.println();
		
		arrayList.addAll(arrayList);
		System.out.println("14. arrayList크기 : " + arrayList.size());
		System.out.println("14. toString크기 : " + arrayList);
		System.out.println();
	}
}
