/**
Given a list of strings return the group of strings which form anagram
Link : https://leetcode.com/problems/group-anagrams/
Complexity : O(N*S) where S is the maximum length of string
*/
import java.io.*;
import java.util.*;
public class AnagramGroupOptimized{

  static List<List<String>> getAnagrams(String[] strs) {
        Map<Map<Character,Integer>,List<String>> map = new HashMap<>();
        for(String each : strs){
            char[] charArray = each.toCharArray();
            Map<Character,Integer> charMap = new HashMap<>();
            for(char charEach : charArray){
                if(charMap.containsKey(charEach)){
                    charMap.put(charEach,charMap.get(charEach)+1);
                }
                else{
                    charMap.put(charEach,1);
                }
            }
            if(map.containsKey(charMap)){
                List<String> stringList = map.get(charMap);
                stringList.add(each);
                map.put(charMap,stringList);
            }
            else{
                List<String> stringList = new ArrayList<>();
                stringList.add(each);
                map.put(charMap,stringList);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> each : map.values()){
            ans.add(each);
        }
        return ans;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input strings");
    String[] stringArray = br.readLine().split(" ");
    System.out.println("The group anagrams are "+getAnagrams(stringArray));
  }
}
