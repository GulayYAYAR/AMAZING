package practice.String;
import java.util.*;

public class removeSomeValues {


        public static void main(String[] args) {
//        (ArrayList) Remove Some Values
//        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
//
//        Solution 1:

            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

            ArrayList<Integer> list2 = new ArrayList<>();

            for(int  each : list1)

                if( each < 100)

                    list2.add(each);



            list1=list2;

            System.out.println(list1);



//        Solution 2:

            List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

            Iterator<Integer> it = list.iterator();

            while(it.hasNext())

                if(it.next()>100)

                    it.remove();


            System.out.println(list);

            // Solution 3:

            List<Integer> list11 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

            for(ListIterator<Integer> il = list11.listIterator(); il.hasNext();)

                if(il.next()>100)

                    il.remove();



            System.out.println(list);

//        Solution 4:

            ArrayList<Integer> list22 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

            list22.removeIf(p -> p>100);

            System.out.println(list22);
        }
    }

