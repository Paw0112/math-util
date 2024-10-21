package com.pawpasta.mathutil.main;

import com.pawpasta.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnsWell();
        testFactorialGivenRightArgument5ReturnsWell();
    }
    //TEST CASE #2
    //DESCRIPTION: TO CHECK, TO VERIFY THE getFactorial() method with correct given argument, e.g n = 5
    // kiểm tra giai thừa có đúng với n = 5 hay ko?

    //STEP/PROCEDURES:
    //CALL getFactorial() method with valid arg: getFactorial(0)

    //EXPECTED RESULT (TA HY VỌNG HÀM TRẢ VỀ GÌ VỚI N = 5)
    // To have number 120 as the result of 5!

    //STATUS: (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP CHẠY HÀM)
    //PASSED, FAILED (BUG)
    //CHỜ XEM HÀM, APP XỬ LÍ ĐC SỐ MẤY - ACTUAL VALUE
    //VÀ ĐI SO SÁNH VỚI EXPECTED Ở TRÊN ĐỂ LUẬN ĐÚNG SAI!

    //VIẾT CODE TEST ĐỂ TEST HÀM CHÍNH GETFACTORIAL() CHAỴ ĐÚNG VỚI N = 0 HAY KO?

    static void  testFactorialGivenRightArgument5ReturnsWell(){
        int n = 5;
        long expectedValue = 120;
        long actualResult = MathUtility.getFactorial(5);
        System.out.println(n + "!= \n"
                            + "expected value: "+expectedValue + "\n"
                            + "actual value: "+actualResult);
    }
    //TA SẼ TEST HÀM CỦA TA VIẾT RA, GỌI LÀ UNIT TESTING - TEST NHỮNG ĐƠN VỊ
    //CODE CƠ BẢN NHẤT
    //TA CẦN TEST HÀM GETFACTORIAL() VỚI CÁC BỘ DATA ĐƯA VÀO => NHỮNG TEST CASE
    //TEST CASE: NHỮNG BỘ DATA ĐƯA VÀO HÀM, APP VÀ CÁCH THỨC XÀI BỘ DATA NÀY, KÌ VỌNG HÀM SẼ TRẢ VỀ

    //TEST CASE #1
    //DESCRIPTION (MÔ TẢ MỤC ĐÍCH TEST CASE, TEST CASE DÙNG TEST ĐIỀU GÌ?)
    //TO CHECK, TO VERIFY THE getFactorial() method with correct given argument, e.g n = 0
    // kiểm tra giai thừa có đúng với n = 0 hay ko?

    //STEP/PROCEDURES: (CÁC BƯỚC TEST HÀM/APP, NHẤN GÌ, NHẬP GÌ ...)
    //CALL getFactorial() method with valid arg: getFactorial(0)

    //EXPECTED RESULT (TA HY VỌNG HÀM TRẢ VỀ GÌ VỚI N = 0)
    // To have number 1 as the result of 0!

    //STATUS: (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP CHẠY HÀM)
    //PASSED, FAILED (BUG)
    //CHỜ XEM HÀM, APP XỬ LÍ ĐC SỐ MẤY - ACTUAL VALUE
    //VÀ ĐI SO SÁNH VỚI EXPECTED Ở TRÊN ĐỂ LUẬN ĐÚNG SAI!

    //VIẾT CODE TEST ĐỂ TEST HÀM CHÍNH GETFACTORIAL() CHAỴ ĐÚNG VỚI N = 0 HAY KO?

    static void testFactorialGivenRightArgument0ReturnsWell() {
        int n = 0; //dự tính 0!
        long expectedResult = 1; //0! hi vọng là 1
        long actualResult = MathUtility.getFactorial(0); //tính thử 0! bằng hàm

        System.out.println(n + "! = \n"
                + "expected value: " + expectedResult + "\n"
                + "actual value: " + actualResult);
    }
}