package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
//	英単語を追加する
	HashMap<String,String> InFormation = new HashMap<String,String>();{
	
	InFormation.put("apple","リンゴ");
	InFormation.put("peach","桃");
	InFormation.put("banana","バナナ");
	InFormation.put("lemon","レモン");
	InFormation.put("pear","なし");
	InFormation.put("kiwi","キウイ");
	InFormation.put("strawberry","いちご");
	InFormation.put("grape","ぶどう");
	InFormation.put("muscat","マスカット");
	InFormation.put("cherry","さくらんぼ");
	}
	public void Search(String[] wordArray) {
        for(String word : wordArray){
        	if (InFormation.containsKey(word)) {
                String meaning = InFormation.get(word);
                System.out.println(word + "の意味は" + meaning);
        	} else {
                System.out.println(word + "は辞書に存在しません");
        }
    }
	}
}
