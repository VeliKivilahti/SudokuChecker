import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
SudokuVerifier v = new SudokuVerifier();

	@Test //Test number  3
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test //Test number 6
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	// Test number 1
	@Test 
    public void testTooShortString() {
        String s = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
        int a = v.verify(s);
        assertEquals("incorrect string", a, -1);
    }
	
	//Test number 2
    @Test
    public void testTooLongString() {
        String s = "4173698256321589479587243168254371697915864323469127582896435715732916841648752911";
        int a = v.verify(s);
        assertEquals("incorrect string", a, -1);
    }
    
 // Test number 4
    @Test
    public void testIncludesNegativeNumber() {
        String s = "-4173698256321589479587243168254371697915864323469127582896435715732916841648752931";
        int a = v.verify(s);
        assertEquals("incorrect string", a, -1);
    }

    
    //Test number 5
    @Test
    public void testSpecialChar() {
        String s = "41736982563215894795872431682543716979158643234691275828964357157329168416487529Â";
        int a = v.verify(s);
        assertEquals("incorrect string", a, 1);
    }
    
    
    //Test number 7
    @Test
    public void testRowContainsDuplicateNumber() {
        String s = "617369825432158947958724316825437169791586432346912758289643571573291684164875293";
        int a = v.verify(s);
        assertEquals("incorrect string", a, -3);
    }

    //Test number 8
    @Test
    public void testColumnContainsDuplicateNumber() {
        String s = "147369825632158947958724316825437169791586432346912758289643571573291684164875293";
        int a = v.verify(s);
        assertEquals("incorrect string", a, -4);
    }

    
    

    

	
}
