package com.bl;

import java.util.Scanner;

public class VowelsConso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character");
        char ch = 'x';
        if(ch =='a'||ch == 'e'||ch =='i'||ch=='o'||ch=='u'){
            System.out.println(ch+ " is vowel ");
        }else {
            System.out.println(ch+ " is consonant");
        }

    }
}

