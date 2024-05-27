package org.example;

import static org.example.CalculatorSystem.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorSystemTest {

    /**
     * Test method isInteger()
     */
    @Test
    public void testIsIntegerPositive() {
        assertTrue(isInteger(3), "3 is an integer");
    }

    @Test
    public void testIsIntegerZero() {
        assertTrue(isInteger(0), "0 is an integer");
    }

    @Test
    public void testIsIntegerNegative() {
        assertTrue(isInteger(-5), "-5 is an integer");
    }

    @Test
    public void testIsIntegerPositiveDouble() {
        assertFalse(isInteger(2.5), "2.5 is not an integer");
    }

    @Test
    public void testIsIntegerNegativeDouble() {
        assertFalse(isInteger(-2.5), "-2.5 is not an integer");
    }

    @Test
    public void testIsIntegerZeroDouble() {
        assertTrue(isInteger(0.0), "0.0 is an integer");
    }

    @Test
    public void testIsIntegerPositiveLong() {
        assertTrue(isInteger(5L), "5L is an integer");
    }

    @Test
    public void testIsIntegerNegativeLong() {
        assertTrue(isInteger(-4L), "-4L is an integer");
    }

    @Test
    public void testIsIntegerPositiveFloat() {
        assertFalse(isInteger(5.3f), "5.3f is not an integer");
    }

    @Test
    public void testIsIntegerNegativeFloat() {
        assertFalse(isInteger(-5.3f), "-5.3f is not an integer");
    }

    @Test
    public void testIsIntegerZeroFloat() {
        assertTrue(isInteger(0.0f), "0.0f is an integer");
    }

    @Test
    public void testIsIntegerPositiveIntFloat() {
        assertTrue(isInteger(2.0f), "2.0f is an integer");
    }

    @Test
    public void testIsIntegerPositiveIntDouble() {
        assertTrue(isInteger(2.0), "2.0 is an integer");
    }

    @Test
    public void testIsIntegerPositiveShort() {
        assertTrue(isInteger((short) 2), "(short) 2 is an integer");
    }

    @Test
    public void testIsIntegerNegativeIntFloat() {
        assertTrue(isInteger(-2.0f), "-2.0f is an integer");
    }

    @Test
    public void testIsIntegerNegativeIntDouble() {
        assertTrue(isInteger(-2.0), "-2.0 is an integer");
    }

    @Test
    public void testIsIntegerNegativeShort() {
        assertTrue(isInteger((short) -2), "(short) -2 is an integer");
    }

    @Test
    public void testIsIntegerZeroShort() {
        assertTrue(isInteger((short) 0), "(short) 0 is an integer");
    }

    /**
     * Test method addition()
     */
    @Test
    public void testAdditionBothPositive() {
        assertEquals("3", addition(1, 2), "1 + 2 = 3");
    }

    @Test
    public void testAdditionFirstNegative() {
        assertEquals("1", addition(-1, 2), "-1 + 2 = 1");
    }

    @Test
    public void testAdditionSecondNegative() {
        assertEquals("-1", addition(1, -2), "1 + (-2) = -1");
    }

    @Test
    public void testAdditionPositiveDouble() {
        assertEquals("6.7", addition(1.5, 5.2), "1.5 + 5.2 = 6.7");
    }

    @Test
    public void testAdditionNegativeDouble() {
        assertEquals("-6.7", addition(-1.5, -5.2), "-1.5 + (-5.2) = -6.7");
    }

    @Test
    public void testAdditionFirstPositiveDouble() {
        assertEquals("-3.7", addition(1.5, -5.2), "1.5 + (-5.2) = -3.7");
    }

    @Test
    public void testAdditionSecondPositiveDouble() {
        assertEquals("3.7", addition(-1.5, 5.2), "-1.5 + 5.2 = 3.7");
    }

    /**
     * Test method subtraction()
     */
    @Test
    public void testSubtractionBothPositive() {
        assertEquals("-1", subtraction(1, 2), "1 - 2 = -1");
    }

    @Test
    public void testSubtractionFirstNegative() {
        assertEquals("-3", subtraction(-1, 2), "-1 - 2 = -3");
    }

    @Test
    public void testSubtractionSecondNegative() {
        assertEquals("3", subtraction(1, -2), "1 - (-2) = 3");
    }

    @Test
    public void testSubtractionPositiveDouble() {
        assertEquals("-3.7", subtraction(1.5, 5.2), "1.5 - 5.2 = -3.7");
    }

    @Test
    public void testSubtractionNegativeDouble() {
        assertEquals("3.7", subtraction(-1.5, -5.2), "-1.5 - (-5.2) = 3.7");
    }

    @Test
    public void testSubtractionFirstPositiveDouble() {
        assertEquals("6.7", subtraction(1.5, -5.2), "1.5 - (-5.2) = -6.7");
    }

    @Test
    public void testSubtractionSecondPositiveDouble() {
        assertEquals("-6.7", subtraction(-1.5, 5.2), "-1.5 - 5.2 = -6.7");
    }

    /**
     * Test method multiplication()
     */
    @Test
    public void testMultiplicationBothPositive() {
        assertEquals("2", multiplication(1, 2), "1 * 2 = 2");
    }

    @Test
    public void testMultiplicationFirstNegative() {
        assertEquals("-2", multiplication(-1, 2), "-1 * 2 = -2");
    }

    @Test
    public void testMultiplicationSecondNegative() {
        assertEquals("-2", multiplication(1, -2), "1 * (-2) = -2");
    }

    @Test
    public void testMultiplicationPositiveDouble() {
        assertEquals("7.8", multiplication(1.5, 5.2), "1.5 * 5.2 = 7.8");
    }

    @Test
    public void testMultiplicationNegativeDouble() {
        assertEquals("7.8", multiplication(-1.5, -5.2), "-1.5 * (-5.2) = 7.8");
    }

    @Test
    public void testMultiplicationFirstPositiveDouble() {
        assertEquals("-7.8", multiplication(1.5, -5.2), "1.5 * (-5.2) = -7.8");
    }

    @Test
    public void testMultiplicationSecondPositiveDouble() {
        assertEquals("-7.8", multiplication(-1.5, 5.2), "-1.5 * 5.2 = -7.8");
    }

    @Test
    public void testMultiplicationSecondZero() {
        assertEquals("0", multiplication(-1.5, 0), "-1.5 * 0 = 0");
    }

    @Test
    public void testMultiplicationFirstZero() {
        assertEquals("0", multiplication(0, 5), "0 * 5= 0");
    }

    /**
     * Test method dividing()
     */
    @Test
    public void testDividingBothPositive() {
        assertEquals("0.5", dividing(1, 2), "1 / 2 = 0.5");
    }

    @Test
    public void testDividingFirstNegative() {
        assertEquals("-0.5", dividing(-1, 2), "-1 / 2 = -0.5");
    }

    @Test
    public void testDividingSecondNegative() {
        assertEquals("-0.5", dividing(1, -2), "1 / (-2) = -0.5");
    }

    @Test
    public void testDividingPositiveDouble() {
        assertEquals("0.288", dividing(1.5, 5.2), "1.5 / 5.2 = 0.288");
    }

    @Test
    public void testDividingNegativeDouble() {
        assertEquals("0.288", dividing(-1.5, -5.2), "-1.5 / (-5.2) = 0.288");
    }

    @Test
    public void testDividingFirstPositiveDouble() {
        assertEquals("-0.288", dividing(1.5, -5.2), "1.5 / (-5.2) = -0.288");
    }

    @Test
    public void testDividingSecondPositiveDouble() {
        assertEquals("-0.288", dividing(-1.5, 5.2), "-1.5 / 5.2 = -0.288");
    }

    @Test
    public void testDividingSecondZero() {
        assertEquals("Error!", dividing(-1.5, 0), "-1.5 / 0 = Error!");
    }

    @Test
    public void testDividingSecondZeroDouble() {
        assertEquals("Error!", dividing(-1.5, 0.0), "-1.5 / 0.0 = Error!");
    }

    @Test
    public void testDividingFirstZero() {
        assertEquals("0", dividing(0, 5), "0 / 5= 0");
    }

    /**
     * Test method getRoot()
     */

    @Test
    public void testGetRootOfInt() {
        assertEquals("2", getRoot(4), "Root of 4 = 2");
    }

    @Test
    public void testGetRootOfNegativeInt() {
        assertEquals("Not specified!", getRoot(-4), "Root of -4 = Not specified!");
    }

    @Test
    public void testGetRootOfNegativeDouble() {
        assertEquals("Not specified!", getRoot(-4.5), "Root of -4.5 = Not specified!");
    }

    @Test
    public void testGetRootOfZero() {
        assertEquals("0", getRoot(0.0), "Root of 0.0 = 0");
    }

    @Test
    public void testGetRootOfPositiveDouble() {
        assertEquals("2.121", getRoot(4.5), "Root of 4.5 = 2.121");
    }

    @Test
    public void testGetRootOfLong() {
        assertEquals("12", getRoot(144L), "Root of 144L = 12");
    }

    /**
     * Test method getOneOfSomething()
     */
    @Test
    public void testGetOneOfSomething() {
        assertEquals("0.25", getOneOfSomething(4), "1/4 = 0.25");
    }

    @Test
    public void testGetOneOfSomethingOfNegativeInt() {
        assertEquals("-0.25", getOneOfSomething(-4), "1/-4 = -0.25");
    }

    @Test
    public void testGetOneOfSomethingOfPositiveDouble() {
        assertEquals("0.222", getOneOfSomething(4.5), "1/4.5 = 0.222");
    }

    @Test
    public void testGetOneOfSomethingOfNegativeDouble() {
        assertEquals("-0.222", getOneOfSomething(-4.5), "1/-4.5 = -0.222");
    }

    @Test
    public void testGetOneOfSomethingOfPositiveFloat() {
        assertEquals("0.222", CalculatorSystem.getOneOfSomething(4.5f), "1/4.5f = 0.222");
    }

    @Test
    public void testGetOneOfSomethingOfNegativeFloat() {
        assertEquals("-0.222", getOneOfSomething(-4.5f), "1/-4.5f = -0.222");
    }

    @Test
    public void testGetOneOfSomethingOfPositiveLong() {
        assertEquals("0.25", getOneOfSomething(4L), "1/4L = 0.25");
    }

    @Test
    public void testGetOneOfSomethingOfNegativeLong() {
        assertEquals("-0.25", getOneOfSomething(-4L), "1/-4L = -0.25");
    }

    @Test
    public void testGetOneOfSomethingOfIntZero() {
        assertEquals("Error!", getOneOfSomething(0), "1/0 = Error!");
    }

    @Test
    public void testGetOneOfSomethingOfRealZero() {
        assertEquals("Error!", getOneOfSomething(0.0), "1/0.0 = Error!");
    }

    /**
     * Test method getPower()
     */
    @Test
    public void testGetPower() {
        assertEquals("16", getPower(4), "4^2 = 16");
    }

    @Test
    public void testGetPowerOfNegativeInt() {
        assertEquals("16", getPower(-4), "-4^2 = 16");
    }

    @Test
    public void testGetPowerOfPositiveDouble() {
        assertEquals("20.25", getPower(4.5), "4.5^2 = 20.25");
    }

    @Test
    public void testGetPowerOfNegativeDouble() {
        assertEquals("20.25", getPower(-4.5), "-4.5^2 = 20.25");
    }

    @Test
    public void testGetPowerOfPositiveFloat() {
        assertEquals("20.25", getPower(4.5f), "4.5f^2 = 20.25");
    }

    @Test
    public void testGetPowerOfNegativeFloat() {
        assertEquals("20.25", getPower(-4.5f), "-4.5f^2 = 20.25");
    }

    @Test
    public void testGetPowerOfPositiveLong() {
        assertEquals("16", getPower(4L), "4L^2 = 16");
    }

    @Test
    public void testGetPowerOfNegativeLong() {
        assertEquals("16", getPower(-4L), "-4L^2 = 16");
    }

    @Test
    public void testGetPowerOfIntZero() {
        assertEquals("0", getPower(0), "0^2 = 0");
    }

    @Test
    public void testGetPowerOfRealZero() {
        assertEquals("0", getPower(0.0), "0.0^2 = 0");
    }

    /**
     * Test method getPercent()
     */
    @Test
    public void testGetPercent() {
        assertEquals("4", getPercent(40, 10), "40 % 10 = 4");
    }

    @Test
    public void testGetPercentFromNegative() {
        assertEquals("-4", getPercent(-40, 10), "-40 % 10 = -4");
    }

    @Test
    public void testGetPercentWithNegative() {
        assertEquals("-4", getPercent(40, -10), "40 % -10 = -4");
    }

    @Test
    public void testGetPercentBothNegative() {
        assertEquals("4", getPercent(-40, -10), "-40 % -10 = 4");
    }

    @Test
    public void testGetPercentDoble() {
        assertEquals("4.55", getPercent(45.5, 10), "45.5 % 10 = 4.55");
    }

    @Test
    public void testGetPercentFromNegativeDoble() {
        assertEquals("-4.55", getPercent(-45.5, 10), "-40 % 10 = -4.55");
    }

    @Test
    public void testGetPercentWithNegativeDoble() {
        assertEquals("-4.55", getPercent(45.5, -10), "40 % -10 = -4.55");
    }

    @Test
    public void testGetPercentBothNegativeDoble() {
        assertEquals("4.55", getPercent(-45.5, -10), "-40 % -10 = 4.55");
    }

    @Test
    public void testGetPercentWithZero() {
        assertEquals("0", getPercent(-45.5, 0), "-40 % 0 = 0");
    }

    @Test
    public void testGetPercentFromZero() {
        assertEquals("0", getPercent(0, 10.5), "0 % 10.5 = 0");
    }

    /**
     * Test method getSin()
     */
    @Test
    public void testGetSinZero() {
        assertEquals("0", getSin(0), "sin(0) = 0");
    }

    @Test
    public void testGetSinNinety() {
        assertEquals("1", getSin(90), "sin(90) = 1");
    }

    @Test
    public void testGetSinOneEighty() {
        assertEquals("0", getSin(180), "sin(180) = 0");
    }

    @Test
    public void testGetSinTwoSeventy() {
        assertEquals("-1", getSin(270), "sin(270) = -1");
    }

    @Test
    public void testGetSinThreeSixty() {
        assertEquals("0", getSin(360), "sin(360) = 0");
    }

    @Test
    public void testGetSinPositiveAngle() {
        assertEquals("0.5", getSin(30), "sin(30) = 0.5");
    }

    @Test
    public void testGetSinNegativeAngle() {
        assertEquals("-0.5", getSin(-30), "sin(-30) = -0.5");
    }

    @Test
    public void testGetSinFractionalAngle() {
        assertEquals("0.707", getSin(45), "sin(45) = 0.707");
    }

    @Test
    public void testGetSinNegativeFractionalAngle() {
        assertEquals("-0.707", getSin(-45), "sin(-45) = -0.707");
    }

    @Test
    public void testGetSinAngleGreaterThan360() {
        assertEquals("0.5", getSin(390), "sin(390) = sin(30) = 0.5");
    }

    @Test
    public void testGetSinNegativeAngleGreaterThan360() {
        assertEquals("-0.5", getSin(-390), "sin(-390) = sin(-30) = -0.5");
    }

    @Test
    public void testGetSinLargePositiveAngle() {
        assertEquals("0", getSin(720), "sin(720) = sin(0) = 0");
    }

    @Test
    public void testGetSinLargeNegativeAngle() {
        assertEquals("0", getSin(-720), "sin(-720) = sin(0) = 0");
    }

    /**
     * Test method getCos()
     */
    @Test
    public void testGetCosZero() {
        assertEquals("1", getCos(0), "cos(0) = 1");
    }

    @Test
    public void testGetCosNinety() {
        assertEquals("0", getCos(90), "cos(90) = 0");
    }

    @Test
    public void testGetCosOneEighty() {
        assertEquals("-1", getCos(180), "cos(180) = -1");
    }

    @Test
    public void testGetCosTwoSeventy() {
        assertEquals("0", getCos(270), "cos(270) = 0");
    }

    @Test
    public void testGetCosThreeSixty() {
        assertEquals("1", getCos(360), "cos(360) = 1");
    }

    @Test
    public void testGetCosPositiveAngle() {
        assertEquals("0.866", getCos(30), "cos(30) = 0.866");
    }

    @Test
    public void testGetCosNegativeAngle() {
        assertEquals("0.866", getCos(-30), "cos(-30) = 0.866");
    }

    @Test
    public void testGetCosFractionalAngle() {
        assertEquals("0.707", getCos(45), "cos(45) = 0.707");
    }

    @Test
    public void testGetCosNegativeFractionalAngle() {
        assertEquals("0.707", getCos(-45), "cos(-45) = 0.707");
    }

    @Test
    public void testGetCosAngleGreaterThan360() {
        assertEquals("0.866", getCos(390), "cos(390) = cos(30) = 0.866");
    }

    @Test
    public void testGetCosNegativeAngleGreaterThan360() {
        assertEquals("0.866", getCos(-390), "cos(-390) = cos(-30) = 0.866");
    }

    @Test
    public void testGetCosLargePositiveAngle() {
        assertEquals("1", getCos(720), "cos(720) = cos(0) = 1");
    }

    @Test
    public void testGetCosLargeNegativeAngle() {
        assertEquals("1", getCos(-720), "cos(-720) = cos(0) = 1");
    }

    /**
     * Test method getTg()
     */
    @Test
    public void testGetTgZero() {
        assertEquals("0", getTg(0), "tan(0) = 0");
    }

    @Test
    public void testGetTgFortyFive() {
        assertEquals("1", getTg(45), "tan(45) = 1");
    }

    @Test
    public void testGetTgNegativeFortyFive() {
        assertEquals("-1", getTg(-45), "tan(-45) = -1");
    }

    @Test
    public void testGetTgOneEighty() {
        assertEquals("0", getTg(180), "tan(180) = 0");
    }

    @Test
    public void testGetTgTwoSeventy() {
        assertEquals("0", getTg(270), "tan(270) = 0 (undefined, returning 0 for test purposes)");
    }

    @Test
    public void testGetTgPositiveAngle() {
        assertEquals("0.577", getTg(30), "tan(30) = 0.577");
    }

    @Test
    public void testGetTgNegativeAngle() {
        assertEquals("-0.577", getTg(-30), "tan(-30) = -0.577");
    }

    @Test
    public void testGetTgGreaterThan360() {
        assertEquals("0.577", getTg(390), "tan(390) = tan(30) = 0.577");
    }

    @Test
    public void testGetTgNegativeGreaterThan360() {
        assertEquals("-0.577", getTg(-390), "tan(-390) = tan(-30) = -0.577");
    }

    @Test
    public void testGetTgLargePositiveAngle() {
        assertEquals("0", getTg(540), "tan(540) = tan(180) = 0");
    }

    @Test
    public void testGetTgLargeNegativeAngle() {
        assertEquals("0", getTg(-540), "tan(-540) = tan(180) = 0");
    }

    /**
     * Test method getCtg()
     */
    @Test
    public void testGetCtgFortyFive() {
        assertEquals("1", getCtg(45), "ctg(45) = 1");
    }

    @Test
    public void testGetCtgNegativeFortyFive() {
        assertEquals("-1", getCtg(-45), "ctg(-45) = -1");
    }

    @Test
    public void testGetCtgNinety() {
        assertEquals("0", getCtg(90), "ctg(90) = 0");
    }

    @Test
    public void testGetCtgTwoSeventy() {
        assertEquals("0", getCtg(270), "ctg(270) = 0 (undefined, returning 0 for test purposes)");
    }

    @Test
    public void testGetCtgPositiveAngle() {
        assertEquals("1.732", getCtg(30), "ctg(30) = 1.732");
    }

    @Test
    public void testGetCtgNegativeAngle() {
        assertEquals("-1.732", getCtg(-30), "ctg(-30) = -1.732");
    }

    @Test
    public void testGetCtgGreaterThan360() {
        assertEquals("1.732", getCtg(390), "ctg(390) = ctg(30) = 1.732");
    }

    @Test
    public void testGetCtgNegativeGreaterThan360() {
        assertEquals("-1.732", getCtg(-390), "ctg(-390) = ctg(-30) = -1.732");
    }

    @Test
    public void testGetCtgSixty() {
        assertEquals("0.577", getCtg(60), "ctg(60) = 0.577");
    }

    @Test
    public void testGetCtgNegativeSixty() {
        assertEquals("-0.577", getCtg(-60), "ctg(-60) = -0.577");
    }
}