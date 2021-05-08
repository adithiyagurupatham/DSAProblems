/**
Given a list of strings return the group of strings which form anagram
Link : https://leetcode.com/problems/group-anagrams/
Complexity : O(N*SlogS) where S is the maximum length of string
*/
import java.io.*;
import java.util.*;
public class AnagramGroupNormal{
  static String sort(String input){
        char[] array = input.toCharArray();
        Arrays.sort(array);
        return String.valueOf(array);
    }

    static List<List<String>> getAnagrams(String[] string_list) {
        Map<String,List<String>> map = new HashMap<>();
        for(String string : string_list){
            String each = sort(string);
            if(map.containsKey(each)){
                List<String> list = map.get(each);
                list.add(string);
                map.put(each,list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(each,list);
            }
        }
        List<List<String>> send = new ArrayList<>();
        for(Map.Entry<String,List<String>> each : map.entrySet()){
            send.add(each.getValue());
        }
        return send;
    }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the input strings");
    String[] stringArray = br.readLine().split(" ");
    System.out.println("The group anagrams are "+getAnagrams(stringArray));
  }
}
