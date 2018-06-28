package lab1_7.lab1_7_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    static void SumEven(Integer[] arr, Predicate<Integer> integerPredicate){

        int sum=0;
        for(int number: arr){
            if (integerPredicate.test(number)){
                sum+=number;
            }
        }
        System.out.println(sum);

    }

    static void printJStr(List<String> list,Predicate<String> stringPredicate){


        for(String word: list){
                char x=word.charAt(0);
                String string=String.valueOf(x);

                if(stringPredicate.test(string)){
                    System.out.println(word);
            }



        }

    }

    public static void main(String[] args) {
        Integer [] arr=new Integer[100];
        for(int y=0;y<arr.length;y++){
            arr[y]=(((int)((Math.random())*1000)));
        }

        Arrays.sort(arr,(o1, o2) -> o1-o2);
        SumEven(arr,n->n>900);




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
        printJStr(list,p->p.equals("a"));










    }

}
