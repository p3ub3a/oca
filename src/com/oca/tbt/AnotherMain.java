package com.oca.tbt;

public class AnotherMain {
    static String printer = "some text";
    static float f;

    static AnotherMain getAReference(){
        return null;
    }

    void testLong(long x){
        System.out.println("in long");
    };
    void testDouble(double x){
        System.out.println("in double");
    };

    public static void main(String[] args){
        Object am = new AnotherMain();
        ((AnotherMain) am).testLong(5);
        int x = 4;
        float y = 5.0f;
        short h = 5;
        short j = 4;
        short xxx = (short)(h*j);
        //numeric overflow
        short s = (short)1234567;
        short s2 = (short)-1234567;
        AnotherMain anotherMain = new AnotherMain();
        anotherMain.testLong(x);
        anotherMain.testDouble(y);

        StringBuilder sb = new StringBuilder("12345");
        sb.append("kkk");
        String sbStr = sb.insert(0, 000).deleteCharAt(3).delete(3,4).substring(3,4);
        System.out.println(sb + "\nsbStr: "+ sbStr);

        String String = "zzz";
        System.out.println(String);

        int result = x++ + x++ + x--;
        System.out.println("result: " + result);


        label6: switch(x){
            case 5:
                label1231:
                System.out.println("case5");
                break label6;
            case 4:
                System.out.println("hmmm ");
            case 3:
        }


        label2: if(x == 5){
            System.out.println("trece");
            break label2;
        } else label4: if(x==4){
            System.out.println("break label2");
            break label2;
        }

        label1: for(int i=0; i<10; i++){
            label3: if(i==2){
                break label3;
            }
        }


        //nu arunca nullpointer
        System.out.println(getAReference().printer);
        System.out.println("overflow test: " + s + " s2: " + s2);

//        walk(1);
        walk(1, 2,3,4,5,6,7);
        walk(1, new int[1]);

        String[] myStrArray = new String[1];
        System.out.println("myStrArr:" + myStrArray[0]);

        Object obj = new Integer(5);
        Integer obj2 = (Integer) obj;
        Integer.parseInt("0");



        int [] myIntArray = new int[]{4};
        int [][] myIntArray1 = new int[][]   {new int[1],{4}};
        int [] myIntArray3[] = new int[][]   {new int[1],{4}};
        int [] myIntArray2 = {4};
        System.out.println(myIntArray3[1][0]);

        for(int i=0;i<3;i++);

        String Null = null;
        System.out.println("c" + Null);

        int iiiii = 3;
        System.out.println(2+""+3==2+""+iiiii);


        String[] noArgStrArray = new String[0];
        System.out.println("noArgStrArray: " + noArgStrArray.length);

        int switchInt = 5;
        int switchInt2 = 5;
        short switchShort =4;
        switch(switchInt){
            default:
                System.out.println(-8>>>2);
                System.out.println((byte)-512>>2);
                long zzzzz = Long.parseLong("3");
                //numeric overflow
                System.out.println(Long.valueOf(30000000).shortValue());
                long anotherLong = new Long(4);
                long anotherLong2 = 6l;
                System.out.println(""+anotherLong + anotherLong2);
                System.out.println(anotherLong + anotherLong2+"");

                String str1 = "123";
                String str2 = "123";
                String str3 = "12" + "3";
                String str4 = new String("123");
                String str5 = "1";
                String str6 = str5 + "23";

                System.out.println("str1 == str2:" + (str1 == str2));
                System.out.println("str1 == str3:" + (str1 == str3));
                System.out.println("str1 == str4:" + (str1 == str4));
                System.out.println("str1 == str5:" + (str1 == str5));
                System.out.println("str1 == str6:" + (str1 == str6.intern()));

                System.out.println("~-4: " + ~-4);
                System.out.println("~4: " + ~4);
                if(~ 4 + 1 == -(1 + ~ - 4)){
                    System.out.println("in if");
                }
            case 4:
                break;
            case 07232132451:
                break;
        }

        System.out.println(f);

        System.out.println("finish");
    }

    public static void walk(int a, int... b){
        System.out.println("b[0]:" + b[0]);
        System.out.println(b.length);
    }
}
