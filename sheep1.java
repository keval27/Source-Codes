package com.company;

import java.io.*;
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

    public static void main(String args[]) throws IOException
    {
         Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("D:\\codes-master\\codes-master\\src\\com\\company\\A-small.in"))));
        T=sc.nextInt();
        //System.out.println(T);
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        int arr[]=new int[T];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            inputnum.add(arr[i]);
        }
        ntoc(inputnum);
        int a[]=new int[sNumbers.size()];
        for(int i =0;i<sNumbers.size();i++)
        {
            a[i] = Integer.parseInt(sNumbers.get(i));
            //System.out.println(a[i]);
        }
        cal(a);
    }
    public static void cal(int[] a) throws IOException
    {
        String output = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\codes-master\\codes-master\\src\\com\\company\\A-small.out")));
        for (int i=0;i<a.length;i++) {
            int count=0;
            if(a[i]==0)
            {
                output += "Case #" + (i+1) + ": INSOMNIA\n";
                continue;
            }
            for (int j = 1; j <= 200; j++) {
                int temp = a[i] * j;
                while (temp > 0) {
                    int temp1;
                    temp1 = temp % 10;
                    set.add(temp1);
                    temp = temp / 10;
                }
                if (set.size() == 10) {

                    output += "Case #" + (i+1) + ": " + a[i]*j + "\n";
                    break;
                }
            }
            set.clear();
        }
        bw.write(output);
        bw.close();
    }
    public static ArrayList<String> ntoc( ArrayList<Integer> num)
    {

        for (int i: num) {
            sNumbers.add(String.valueOf(i));
        }
        //System.out.println(sNumbers);
        return sNumbers;
    }
}

