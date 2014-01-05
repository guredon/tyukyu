package kitaken_kadai.kanpe_Java09;

import java.util.HashMap;

public class KanpeJava09 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("りんご", "apple");
		map.put("ぶどう", "grapes");
		if (map.containsKey("りんご")) {
			System.out.print("りんごを英語にすると");
			System.out.println(map.get("りんご"));
		} else {
			System.out.println("指定したキーは存在しません");
		}
	}
}