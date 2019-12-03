package com.oca.tbt;

import com.oca.tbt.interfaces.T1;
import com.oca.tbt.interfaces.T2;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    //T1 Q36
//    public static long main(String[] args) {
//        System.out.println("hi");
//        return 10L;
//    }

    public static void main(String[] args) throws Exception, Throwable {
        //T1 Q29
        A o1 = new C();
        B o2 = (B) o1;
        System.out.println(o1.m1() + "; o2.m1(): " + o2.m1());
        System.out.println((o1.i + "; o2.i: " + o2.i));


        System.out.println(C.kkk);

        byte adsada = 0;
        int asdasdaa = 0;
        adsada *= asdasdaa;
//        adsada = adsada * asdasdaa;

        Integer ii = 1;
        Integer qwea = new Integer(1);
        int iii = 1;
        boolean qwer = (ii == iii);
        boolean qweb = ii.equals(qwea);
        boolean qwec = (ii == qwea);
        System.out.println("aaaaaaa:" +qwer + qweb + qwec);
//        //T2 Q42
//        int[] a = null;
//        int i = a[m1()];
        System.out.println(10.00f);



        boolean bA[] = new boolean[1];
        int iA[] = new int[1];
        String sA[] = new String[4];
        System.out.println(iA[0]);
        System.out.println(bA[0]);
        if(bA[0]){
            System.out.println("zzzz");

        }
        System.out.println(sA[0] + " sads");
    }

    public static int m1() throws Exception{
        throw new Exception("Some exception");
    }
}

class A {
    void testConstrExc() throws Exception{

    }
    A() throws Exception{

    }

    static int kkk = 12; int i=10; int m1() { return i;}
    //T1 Q45
//    public byte getValue(){ return 1;}
    //
}
class B extends A {
    void testConstrExc() throws FileNotFoundException{

    }
    B() throws Throwable {

    }

    static{
    System.out.println("zzzzz");
}int i=20; int m1() { return i;}
    //T1 Q45, Q52
//    public short getValue(){ return 2;}
    //
}
class C extends B {
    C() throws Throwable{

    }
    int i=30; int m1() { return i;}}



//TO DO: T1 Q49
