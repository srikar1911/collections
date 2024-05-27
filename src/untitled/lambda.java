package untitled;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {

     public static void main(String[] args) {

//         I1 obj = (float a, int b) ->  {
//             System.out.println("");
//
//         };

         List<Integer> ls = new ArrayList<>();
         ls.add(3);
         ls.add(8);
         ls.add(7);ls.add(1);
         ls.add(6);ls.add(4);ls.add(4);


         System.out.println(ls.stream().collect(Collectors.toSet()));





//        obj.m1(5, 6);

//         System.out.println(obj);

     }
//
//     interface I1{
//         void m1(float a, int b);
//     }
//
//     class b implements I1 {
//
//         @Override
//         public void m1(float a, int b) {
//
//         }
//     }
}


