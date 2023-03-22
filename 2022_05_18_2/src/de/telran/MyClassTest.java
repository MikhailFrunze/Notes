package de.telran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyClassTest {
/*
* 1) подготовка исходных данных
* 2)вызов тестируемого метода
* 3)сравнение результата с ожиданиями
* */
    @Test
    public void isYearLeap_WhenYearDivBy4_shouldBeTrue() {
        MyClass myClass=new MyClass();
       int value=2004;
        boolean result=myClass.isYearLeap(value);
        Assertions.assertTrue(result);
    }

    @Test
    public void isYearLeap_WhenYear1900_shouldBeFalse() {
        MyClass myClass=new MyClass();
        int value=1900;
        boolean result=myClass.isYearLeap(value);
        Assertions.assertFalse(result);
    }

    @Test
    public void isYearLeap_WhenYear2000_shouldBeTrue() {
        MyClass myClass=new MyClass();
       int value=2000;
        boolean result=myClass.isYearLeap(value);
        Assertions.assertTrue(new MyClass().isYearLeap(2000));
    }

    @Test
    public void isYearLeap_WhenYearDivBy4_shouldBeFalse() {
        Assertions.assertFalse(new MyClass().isYearLeap(2000));
    }
}