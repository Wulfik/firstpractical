package com.student.practical;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    @Test
    public void test_SanityTest_JUnitWorks() {

        Assert.assertEquals(3, 1 + 2);
    }

    @Test
    public void test_ConstructorWith2Parametrs_Fraction2Parameters() {
        Assert.assertEquals((5 + "/" + 7), new Fraction(5, 7).toString());
    }

    @Test
    public void test_CreateConstructorWith1Parametrs_Fraction1Parameter() {
        Assert.assertEquals((2 + "/" + 1), new Fraction(2).toString());
    }

    @Test
    public void test_ConstructWithoutParameter_DefaultParametrs() {
        Assert.assertEquals((0 + "/" + 1), new Fraction().toString());
    }

    @Test
    public void test_NegativeDenominator_NegativeNumerator() {
        Assert.assertEquals((-2 + "/" + 7), new Fraction(2, -7).toString());
    }

    @Test
    public void test_FractionDenominatorAndNumeratorNegative_ReduceMinus() {
        Assert.assertEquals((2 + "/" + 7), new Fraction(-2, -7).toString());
    }

    @Test /*До кінця не впенений що саме так потрібно було зробити, не зовсім зрозумів завдання з текстовим представленням*/
    public void test_ToString_StringFraction (){
        Assert.assertEquals (("-5/7"), new Fraction(5,-7).toString());
           }

    /*@Test
    public double test_double_doubleResult () {
        Assert.assertEquals(0.5,new Fraction(2,4).toDouble());
    } Намагався зробити, но чомусь постійно мені assertEquals починає перекреслювати якщо пишу значення. Це останній
    з варіантів як я намагався реалізувати, попередні також неадалі*/


    @Test
    public void test_inverse_ChangeDenominatorWithNumerator () {
        Assert.assertEquals((2 + "/" + 5), new Fraction(5,2).inverse().toString());
    }

    @Test
    public void test_isProper_Property() {
        Assert.assertEquals(true, new Fraction(-2, -7).isProper());
        Assert.assertEquals(false, new Fraction(1, 1).isProper());
        Assert.assertEquals(false, new Fraction(4, 3).isProper());
    }

    @Test
    public void test_simplify_ReduceFraction() {
        Assert.assertEquals((1 + "/" + 2), new Fraction(8, 16).simplify().toString());
        Assert.assertEquals((1 + "/" + 2), new Fraction(-8, -16).simplify().toString());
        Assert.assertEquals((-1 + "/" + 2), new Fraction(-8, 16).simplify().toString());
        Assert.assertEquals((-1 + "/" + 2), new Fraction(8, -16).simplify().toString());
    }

    @Test
    public void test_Addition_FractionAdd() {
        Assert.assertEquals(( 1+ "/" + 3), Fraction.add(new Fraction(2, 3), new Fraction(-3, 9)).simplify().toString());
        Assert.assertEquals((5 + "/" + 4), Fraction.add(new Fraction(2, 3), new Fraction(7, 12)).simplify().toString());
    }

    @Test
    public void test_subtraction_FractionSubtraction() {
        Assert.assertEquals(( 1+ "/" + 1), Fraction.subtract(new Fraction(2, 3), new Fraction(-3, 9)).simplify().toString());
        Assert.assertEquals((1 + "/" + 12), Fraction.subtract(new Fraction(2, 3), new Fraction(7, 12)).simplify().toString());
    }

    @Test
    public void test_multiplication_FractiondMultiplication() {
        Assert.assertEquals(( -2+ "/" + 9), Fraction.multiply(new Fraction(2, 3), new Fraction(-3, 9)).simplify().toString());
        Assert.assertEquals((7 + "/" + 18), Fraction.multiply(new Fraction(2, 3), new Fraction(7, 12)).simplify().toString());
    }

    @Test
    public void test_Division_FractionDivision() {
        Assert.assertEquals(( -2+ "/" + 1), Fraction.divide(new Fraction(2, 3), new Fraction(-3, 9)).simplify().toString());
        Assert.assertEquals((8 + "/" + 7), Fraction.divide(new Fraction(2, 3), new Fraction(7, 12)).simplify().toString());
    }

}




