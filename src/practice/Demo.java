package practice;

import java.util.HashMap;

public class Demo {

    public static void main(String[] args) {

        String expression = "(){{}}";

        HashMap<Character, Integer> characterHashMap = new HashMap<>();

        for(char c : expression.toCharArray()){
            characterHashMap.put(c, characterHashMap.getOrDefault(c,0) +1);
        }

       int x = (characterHashMap.get('(') + characterHashMap.get(')'));
        int y = (characterHashMap.get('{') + characterHashMap.get('}'));
         if(x%2 == 0 && y%2 ==0) {
             System.out.println("good String");
         }else {
             System.out.println("bad String");
         }
    }
}
