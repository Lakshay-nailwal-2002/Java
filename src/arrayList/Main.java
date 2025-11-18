package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // basic array structure
        String[] arr = new String[3];
        arr[0] = "Lakshay";
        arr[1] = "Nailwal";
        arr[2] = "Google SDE3";
        System.out.println(Arrays.toString(arr));

        // Not advisable because it can contain anything its kinda general
        Object[] objArr = new Object[3];
        objArr[0] = 1;
        objArr[1] = "Lakshay";
        objArr[2] = true;
        System.out.println(Arrays.toString(objArr));

        // This is similar to above, when we donot define explicity the type it considers object
        ArrayList objectList = new ArrayList(); // Raw use

        // Size is not fixed, On capacity inc this copy into new arr of double capacity
        // donot support primitive types, Also Indexed
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(2);
        System.out.println(intArrayList);

        /*
            We have lots of methods in arraylist class such as
            1. indexOf(<Element>)
            2. size()
            3. isEmpty()
            4. sort()
                4.1 Comparator.naturalOrder()
                4.2 Comparator.reverseOrder()
            5. add() / remove()
            6. addAll() / removeAll()
            7. clear()
            8. contains()
        */

    }


}
