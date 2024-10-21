package com.pawpasta.mathutil.core.test;

import com.pawpasta.mathutil.core.MathUtility;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

import  static  org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilityTest {
    //Test case structure : ID, Description, Step/Procedures
    //                      Expected Result, Status (Passed, Failed)
    //                      Bug ID( Bugzilla, jira)
    //Test case 4: check getFactorial() with n = -1 -2 -3 -4 -5 21 22 23 24
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {
//       MathUtility.getFactorial(-5); chưa bắt xem có ngoại le nhu ki vong hay khong

        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-100);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(21);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(22);});
    }
    //Thấy ngoaại lệ, mừng rơi nước mắt
    //Vì hàm thiết kế đưa N<0 hoặc N>20 thì ngoại l phải udwojcd ném ra
    //Vậy nếu hm ném ngoại le khi N=-5 ro ràng là hàm đúng, hàm đúng thi phai xanh
    //Xanh vi tra ve ngoai le dung nhu ki vong


    //Test case 3: check getFactorial() with n = 2 3 4 5 6 ...
    //Test case 1: check getFactorial() with n = 0
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(1,MathUtility.getFactorial(0));
        assertEquals(1,MathUtility.getFactorial(1));
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));
        assertEquals(720,MathUtility.getFactorial(6));
    }

    // bad smells = đoạn code bốc mùi
    // code bị lặp lại, trộn lộn xộn test data và lệnh kiểm thử
    // ta cần tinh chỉnh, tối ưu code - REFACTOR,REFACTORING
    @Test
    public void testFactorialGivenRightArgument0ReturnsWell(){
        long expectedValue = 1; // hy vong 0! tra ve 1
        long actualValue = MathUtility.getFactorial(0); //gia bo ham tra ve 10

        //so sanh 2 thang expected vs actual
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void testFactorialGivenRightArgument1ReturnWell(){
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(1);

        assertEquals(expectedValue,actualValue);
    }
}
