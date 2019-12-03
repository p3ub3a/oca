package com.oca.tbt;

public class Statics {

    public static void main(String[] args){
        X b = new Y();
        System.out.println("\n\n\n\n");
    }
}

class X{
    static {System.out.println("X's Static Init");}
    {System.out.println("X's Init Block");}
    public X(){System.out.println("X's Constructor");}
}

class Y extends X{
    static{System.out.println("Y's Static Init");}
    {System.out.println("Y's Init Block");}
    public Y(){System.out.println("Y's Constructor");}
}
