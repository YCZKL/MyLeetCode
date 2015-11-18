public class Solution {

    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<Character, Character>();  

        map.put('(', ')');//这里一定要用单引号，双引号会被认为是String类型  

        map.put('[',']');  

        map.put('{', '}');  

          

        Stack<Character> stack = new Stack<Character>();  

       for(int i=0; i< s.length(); i++)  

       {  

           char current = s.charAt(i);  

           if(map.keySet().contains(current))  

           {  

                stack.push(current);  

           }else if(map.values().contains(current))  

            {  

                if(!stack.empty()&&map.get(stack.peek())==current)  

                {  

                    stack.pop();  

                }else  

                    return false;  

           }  

        }  

       return stack.empty();  



    }

}
