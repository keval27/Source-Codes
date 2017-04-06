package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by keval on 30-03-2017.
 */
public class pancake1 {

    public static int T;
   public static Scanner sc=new Scanner(System.in);
   public static  ArrayList<String> inputs =new ArrayList<String>();

    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("D:\\codes-master\\codes-master\\src\\com\\company\\A-small.in"))));
        T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            inputs.add(sc.next());
        }

       // System.out.println(inputs);
        String output = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\codes-master\\codes-master\\src\\com\\company\\A-small.out")));

        for(int i=0;i<inputs.size();i++)
        {
            char[] ch=inputs.get(i).toCharArray();
            int count=0;
                for (int i1 = 1; i1<ch.length; i1++)
                {
                    if (ch[i1] != ch[i1-1]) count++;
                }
                if (ch[ch.length-1] == '-') count++;
            output += "Case #" + (i+1) + ": " + count + "\n";
           // System.out.println(inputs.get(i)+" "+count);
        } bw.write(output);
        bw.close();
    }
}
