package assignments;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
public class GroupAnagram {
	
	public static List<List<String>> groupAnagram(String[] strArr)
	{
		Map<String,List<String>> groupAnagram=new HashMap();
		for(String str:strArr)
		{
			char[] charArr=str.toCharArray();
			Arrays.sort(charArr);
			String sortedStr=String.valueOf(charArr);
			if(!groupAnagram.containsKey(sortedStr))
			{
				groupAnagram.put(sortedStr,new ArrayList());
			}
			
			groupAnagram.get(sortedStr).add(str);
			
		}
		return new ArrayList<>(groupAnagram.values());
	}
	
	public static void main(String[] args)
	{
		GroupAnagram groups=new GroupAnagram();
		String[] str= {"eat","cat","tan","ate","nat","bat"};
		System.out.println(groups.groupAnagram(str));
	}

}
