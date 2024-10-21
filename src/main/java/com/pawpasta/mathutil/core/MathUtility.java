package com.pawpasta.mathutil.core;

public class MathUtility {
    //class nay se cung cap cac ham tien ich
    //tien ich cho moi noi dung => thuong thiet ke la static

    //ham tinh n! = 1.2.3.4...n
    //<0! va 21! > ta 0 tính, 0 có âm giai thừa. 20! vừa đủ kiểu long
    //0! và 21! 21! ta sẽ chửi, ném ra except
    public  static long getFactorial(int n) {

        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 .. 20!");

        if (n == 0 || n == 1)
            return 1;

        //sống sót đến bước này n = 2, 3, 4 ...20
        long result = 1; //tích ban đầu là 1
        for (int i = 2; i <= n; i++)
            result *= i; //nhân dồn con i vào kết quả

        return result;
    }
}
