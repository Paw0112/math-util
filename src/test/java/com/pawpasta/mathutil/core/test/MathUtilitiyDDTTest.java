package com.pawpasta.mathutil.core.test;

import com.pawpasta.mathutil.core.MathUtility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import  static  org.junit.jupiter.api.Assertions.*;


public class MathUtilitiyDDTTest {
    //Class nay se chua cac ham kiem thu code theo style DDT
    //DATA DRIVEN TESTING, TA TACH CODE KIEM THU (CAC LENH ASSERT()) RIENG)
    //kHONG GOP CHUNG VOI BO DATA KIEM THU
    //MUC TIEU: DE DOC CODE KIEM THU, DE DANH GIA DUOC XEM CO BAO NHIEU TEST
    //CASE DANG DUOC TEST, DA DU HAY CHUA, VI NO RAT DE THAY DO DATA NAM RIENG
    //-> GIUP NGUYEN LI PESTICIDE PARADOX
    //BO DATA DUA VAO TEST SE DE RIENG O 1 HAM PUBLIC STATIC

    //Ham nay tra ve 1 mang cac con so < 0 hoac >-20 do la nhung n gay ra
    //exception khi ta xai ham getF(). Ta test xem ham co nem ngoai le
    //voi data ca chon hay khong
    public static Integer[] initWrongDataSet() {
        return new Integer[] {-1,-2,-3,-4,-100,-1000,21,22,23,100,1000};
    }

    //Test case : check if getFactorial() throws IlleagalArgumentException
    //      in case of n < 0 or n > 20
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);
        });
    }

    //Test case #... : check getFactorial() with right argument and runs well
    //                                      n = 0 1 2 3 4 ... 18 19 20

    public static Object[][] initRightDataSet() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
        };
    }
    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightArgumentsRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
