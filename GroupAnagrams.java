public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();

       for(String str : strs){

           String sortedstr = Sortstr(str);

           if(map.containsKey(sortedstr)){

               map.get(sortedstr).add(str);

           }

           else{

               map.put(sortedstr,new ArrayList<String>());

               map.get(sortedstr).add(str);

           }

       }

       List<List<String>> result = new ArrayList<List<String>>(map.values());

       for(List<String> res : result){

           Collections.sort(res);

       }

       return result;

    }

    private String Sortstr(String str){

        char[] char1 = str.toCharArray();

        Arrays.sort(char1);

        return new String(char1);

    }



}
