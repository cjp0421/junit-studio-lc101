package test;

import org.junit.Test;

import static org.junit.Assert.*;
import main.BalancedBrackets;

public class BalancedBracketsTest {
//positive test cases = return true;
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        String spec = "a single set of balanced brackets returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void pairOfBracketsAroundOtherCharacters(){
        String spec = "a pair of balanced brackets around other characters returns true";
        String testData = "[Launchcode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void threeConsecutivePairsOfBrackets(){
        String spec = "three consecutive pairs of brackets before other characters returns true";
        String testData = "[][][]Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec,result);
    }

    @Test
    public void threePairsOfNestedBrackets(){
        String spec = "three pairs of brackets nested within each other returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec,result);
    }
//negative test cases = return false
    @Test
    public void singleOpeningBracket(){
        String spec = "a single opening bracket without a closing bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void singleClosingBracket(){
        String spec = "a single closing bracket without an opening bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void pairOfReversedBrackets(){
        String spec = "a pair of brackets in reverse order returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void singleOpeningBracketBeforeOtherCharacters(){
        String spec = "a single opening bracket before other characters returns false";
        String testData = "[Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void pairOfReversedBracketsAmongOtherCharacters(){
        String spec = "pair of reversed brackets among other characters returns false";
        String testData = "]Launch[code";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void multipleMismatchedBrackets(){
        String spec = "multiple mismatched sets of brackets";
        String testData = "][][][[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void stringWithoutBrackets(){
        String spec = "a string with no brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void emptyString(){
        String spec = "an empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

}
