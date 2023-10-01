package com.hd.spring_boot_unit_testing.junit_example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoUtilsTest {


    @Test
    void testEqualsAndNotEquals() {
        //set up
        DemoUtils demoUtils = new DemoUtils();

        //Beklenen
        int expected = 6;

        //execute
        //actual gerçek değer demek
        int actual = demoUtils.add(2,4);

        //assert
        //İddia demek asset doğrulama da denebilir. message kısmı 3 üncü parametre hata olursa verieceği hatadır.
        Assertions.assertEquals(expected , actual , "2+4 must be 6");

    }
}