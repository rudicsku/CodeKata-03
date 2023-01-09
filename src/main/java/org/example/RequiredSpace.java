package org.example;

public class RequiredSpace {
    /**
    Required space for 20.000 residences (name, address, phoneNum)


    How to calculate String memory usage
    - multiply the number of characters of the String by two;
    - add 38;
    - if the result is not a multiple of 8, round up to the next multiple of 8;
    - the result is generally the minimum number of bytes taken up on the heap by the String.
     **/

    //max length 10 char --> 64 byte?
    String name;

    //max length 20 char --> 80 byte?
    String address;

    //max length 10 char --> 64 byte?
    String phoneNum;


    //~40 MB would be the memory usage
}
