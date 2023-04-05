package chapter11;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// Collection<E> => List<E> => ArrayList<E>
		// String 타입의 객체를 저장 => String 타입의 인스턴스를 참조하는 참조값을 저장
		ArrayList<String> list = new ArrayList<String>();
		
		
		// 인스턴스 저장 => 요소를 저장한다., add()
		list.add("손흥민");
		list.add(new String("박지성"));
		list.add(new String("이강인"));
		
		// 데이터 참조 : get()
		String name = list.get(0);
		System.out.println(name);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		System.out.println("----------");
		// 특정 위치의 요소 삽입
		list.add(1, "안정환");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		// 저장된 요소의 개수 : size()
		System.out.println("저장된 이름의 개수 : " + list.size());
		System.out.println("index : 0 ~ " + (list.size()-1));
		
		System.out.println("------------");
		// 반복문을 이용해서 일괄 처리
		for(int i=0; i<list.size(); i++) {
			System.out.println( list.get(i) + " : " + list.get(i).charAt(0) );
		}
	
		
		System.out.println("------------------");
		for(String playerName : list) {
			System.out.println(playerName + " : " + playerName.charAt(2));
		}
	
	if(list.contains("손흥민")) {
		System.out.println("잘하자~ 잘하자");
	}
		
		
	if(list.contains("안정환")) {
		// 안정환은 하차
		list.remove("안정환");
		list.remove(0);
	}
		System.out.println("------------");
		for(String playerName : list ) {
			System.out.println(playerName + " : " + playerName.charAt(2));
		}
		
		// 전체 요소 삭제
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());

	
	}
	
}
