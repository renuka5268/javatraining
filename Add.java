package com.company;

public class Add {

    public static int add(int firstNo, int secondNo){
        return firstNo+secondNo;
    }
    public static void main(String args[])
    {   int firstNo=5,secondNo=3;
        int res=add(firstNo,secondNo);

        System.out.println(res);

    }
}