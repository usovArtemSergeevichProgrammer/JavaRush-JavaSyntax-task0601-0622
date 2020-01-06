package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numIn = Integer.parseInt(reader.readLine());

        while(true){
            int num = numIn % 10;
            if(num == 0){
                break;
            } else if(num % 2 == 0){
                even++;
            } else{
                odd++;
            }
            numIn = numIn /10 ;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
