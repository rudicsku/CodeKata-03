package org.example;

public class BinaryRepresentation {

    /**
     Roughly how many binary digits (bit) are required for the unsigned representation of numbers:
     **/

    //Built-in function
    public static String binaryRepresentation(int num) {
        return Integer.toBinaryString(num);
    }

    public static String intToBinary(int num) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.insert(0, ((num % 2) == 0 ? "0" : "1"));
            num = num / 2;
        }
        //return "We need " + result.length() + " bits to represent this number.";
        return result.toString();
    }

}
