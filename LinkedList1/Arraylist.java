package arraylist;

import java.util.ArrayList;

public class ArrayListDemo{

    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>(20);
        //  ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1,80)
        arr.remove(20);
    //    arr.set(0,100)// replaces value
        Integer i=10;
        arr.remove(i);

         for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        // Enhanced for loop - for each loop
        for(int i:arr){
          System.out.println(i);
        }

        //System.out.println(arr.size());
        //System.out.println(arr.get(1));

    }
}
