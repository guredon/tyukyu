package kitaken_kadai.kanpe_Java08;

import java.util.ArrayList;

public class KanpeJava08 {
	public static void main(String[] args){
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(10);
		array.add(5);
		array.add(34);
		array.add(512);
		array.add(63);
		
		Integer state = array.get(4) + array.get(2);
		System.out.println(state);
	}
}