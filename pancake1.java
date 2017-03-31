package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by keval on 30-03-2017.
 */
public class pancake1 {

    public static int T;
   public static Scanner sc=new Scanner(System.in);
   public static  ArrayList<String> inputs =new ArrayList<String>();

    public static void main(String args[])
    {
        T=sc.nextInt();
        generatestr(T);
        System.out.println(inputs);

        for(int i=0;i<inputs.size();i++)
        {

            char[] ch=inputs.get(i).toCharArray();



                int count=0;
                for (int i1 = 1; i1 < ch.length; i1++) {
                    if (ch[i1] != ch[i1-1]) count++;
                }
                if (ch[ch.length-1] == '-') count++;

            System.out.println(inputs.get(i)+" "+count);

        }


    }



    public static ArrayList<String> generatestr(int T)
    {

        for(int i=0;i<T;i++)
        {
          inputs.add(sc.next());
        }
        return inputs;
    }
}
