package com.oca.tbt;

import java.util.ArrayList;
import java.util.List;

public class E {
    public static final int j = 1;
    E(){ print(); }
    void print(){
        System.out.println("E");
    }
}

class F extends E {
    public static final int j=2;
    int i = 4;
    public static void main(String[] args){
        //T2 Q56
        E f = new F();
        f.print();

        short s = 9;
        int i=9;

        System.out.println(args);
    }

    void print(){
        System.out.println(i);
    }
}
