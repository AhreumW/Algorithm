package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class studygroup_0422_1 {

	public static void main(String[] args) {
		
		Set<Integer> hashset = new HashSet<Integer>();
		Set<Integer> lickedhashset = new LinkedHashSet<Integer>();
		Set<Integer> treeset = new TreeSet<Integer>();
		
		//set 중 가장 빠른 임의 접근 속도
		hashset.add(3);
		hashset.add(14);
		hashset.add(2);
		
		Iterator<Integer> it = hashset.iterator();
		
		while(it.hasNext()) {
			System.out.println(hashset);
			System.out.println(it.next());
		}
		
		
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		
		setA.add(5);
		setA.add(2);
		setA.add(1);
		setB.add(5);
		setB.add(4);
		setB.add(3);
		
		//부분집합인지 true false 확인
		System.out.println(setA.contains(2));	
		System.out.println(setA.containsAll(setB));
		
		
		//setA.retainAll(setB);	//교집합
		
		setA.removeAll(setB);	//차집합
		
		//setA.addAll(setB);	//합집합
		
		//setA.clear();	//모두 삭제
		
		Iterator<Integer> itAB = setA.iterator();
		
		while(itAB.hasNext()) {
			System.out.println(setA);
			System.out.println(itAB.next());
		}
		
		/*
		//넣은 순서대로 
		lickedhashset.add(3);
		lickedhashset.add(14);
		lickedhashset.add(2);
		Iterator<Integer> it2 = lickedhashset.iterator();
		
		while(it2.hasNext()) {
			System.out.println(lickedhashset);
			System.out.println(it2.next());
		}
		
		//오름차순 정렬(기본값)
		treeset.add(3);
		treeset.add(14);
		treeset.add(2);
		Iterator<Integer> it3 = treeset.iterator();
		
		while(it3.hasNext()) {
			System.out.println(treeset);
			System.out.println(it3.next());
		}
		*/
		
	}
}
