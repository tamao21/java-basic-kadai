package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
//	英単語を追加する
	HashMap<String,String> dictionary = new HashMap<String,String>();{
	
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
	public void search(String[] wordArray) {
        for(String word : wordArray){
        	if (dictionary.containsKey(word)) {
                String meaning = dictionary.get(word);
                System.out.println(word + "の意味は" + meaning);
        	} else {
                System.out.println(word + "は辞書に存在しません");
        }
    }
	}
}
