package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by keval on 30-03-2017.
 */
public class sheep1
{
    public static int T;
    public static ArrayList<Integer> inputnum=new ArrayList<Integer>();
    public static ArrayList<String> sNumbers = new ArrayList<String>();
    public static ArrayList<Integer> digits =new ArrayList<Integer>();
    public static Set<Integer> set=new HashSet<Integer>();
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {

        T=sc.nextInt();
        ArrayList<Integer> numbers=new ArrayList<Integer>(input(T));
        //System.out.println(numbers);
        ntoc(numbers);
        //System.out.println(sNumbers);
        //cal(numbers);

        int a[]=new int[sNumbers.size()];
        for(int i =0;i<sNumbers.size();i++)
        {
            a[i] = Integer.parseInt(sNumbers.get(i));
           // System.out.println(a[i]);
        }
        cal(a);

    }

    private static void cal(int[] a)
    {

     for (int i=0;i<a.length;i++)
        {
         for (int j=1;j<=200;j++)
            {
                int temp = a[i] * j;
                System.out.println(temp);
                while (temp > 0)
                {
                    int temp1;
                    temp1=  temp % 10;
                    set.add(temp1);

                    temp = temp / 10;


                }
                if(set.size()==10)
                {
                   System.out.println("temp= "+a[i]*j);
                    break;
                }

//System.out.println(a[i]*j);
            }
            System.out.println(set);
         set.clear();
        }

    }

    public static ArrayList<Integer> input(int n)
    {
        int arr[]=new int[n];
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=sc.nextInt();
           inputnum.add(arr[i]);
       }
       return inputnum;
    }



    public static ArrayList<String> ntoc( ArrayList<Integer> num)
    {

        for (Integer i: num) {
            sNumbers.add(String.valueOf(i));
        }
        //System.out.println(sNumbers);
        return sNumbers;
    }



}
