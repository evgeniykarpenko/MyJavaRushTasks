package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000

    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netA = new byte[ip.length];
        for (int i = 0; i < netA.length; i++) {
            netA[i] = (byte) (ip[i] & mask[i]);
        }
        return netA;
    }

    public static void print(byte[] bytes) {
    StringBuilder sb = new StringBuilder();
        for (byte a : bytes) {
            String bit = (Integer.toBinaryString(Byte.toUnsignedInt(a)));
           if(bit.length()<8) {
               int cout = 8 - bit.length();
               for (int i = 0; i < cout; i++) {
                   sb.append("0");
               }
               sb.append(bit + " ");
           }
           else  sb.append(bit + " ");


        }
        System.out.println(sb.toString());
    }
}
