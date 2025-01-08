package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static int[] getAnswer(int size,int m,int[] arr){
        int[] cache = new int[size];

        for (int x : arr){
            int pos = -1;
            for (int i=0; i<size; i++) if (x == cache[i]) pos = i;
            if (pos == -1){
                for (int i = size-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }else{
                for (int i=pos; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            cache[0] = x;
        }

        return cache;

    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];

        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }



        for (int a : getAnswer(n,m,arr)){
            System.out.print(a + " ");
        }


    }

}