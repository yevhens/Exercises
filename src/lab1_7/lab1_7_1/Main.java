package lab1_7.lab1_7_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer [] arr=new Integer[100];
        for(int y=0;y<arr.length;y++){
            arr[y]=(((int)((Math.random())*1000)));
        }

        Arrays.sort(arr,(o1, o2) -> o1-o2);

        System.out.println(Arrays.toString(arr));

        List<String> list=new ArrayList<String>();
        list.add("zeta");
        list.add("way");
        list.add("south");
        list.add("tobe");
        list.add("ocean");
        list.add("business");
        list.add("aka");
        list.add("ace");


        Collections.sort(list,(s1,s2)->s1.toString().compareTo(s2.toString()));

        for(String st: list){
            System.out.println(st);
        }








    }

}
