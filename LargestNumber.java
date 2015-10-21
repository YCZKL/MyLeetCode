c class Solution {

    public static int compareString(String s1, String s2){

    String tmp1 = s1 + s2;

    String tmp2 = s2 + s1;

    if(tmp1.compareTo(tmp2) > 0){

        return -1;

    }else if(tmp1.compareTo(tmp2) < 0){

        return 1;

    }

    return 0;



}



public String largestNumber(int[] num) {

   List<String> listNums = new ArrayList<String>();

    for(int i = 0; i < num.length; ++i){

        listNums.add(Integer.toString(num[i]));

    }

    Collections.sort(listNums, new Comparator(){

        public int compare(Object s1, Object s2){

            return compareString((String)s1, (String)s2);

        }

    });



    StringBuffer sb = new StringBuffer();

    for(int i = 0; i < listNums.size();++i){    

        sb.append(listNums.get(i));

    }

    for(int i = 0;i < sb.length();++i){

        if(sb.charAt(i) != '0'){

            return sb.substring(i);

        }

    }

    return "0";

}



}
