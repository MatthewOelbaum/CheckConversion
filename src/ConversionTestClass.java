import static org.junit.Assert.*;

import org.junit.Test;

public class ConversionTestClass {

	
	public void test() {
        ConversionClass test = new ConversionClass();
		
    
		
	 
	
	}
	
	@Test
	public void numberConversion() {
		  ConversionClass test = new ConversionClass();
		  System.out.println();
		  
		assertEquals(test.numberConversion(69), "sixtey nine dollars only" );
		
		assertEquals(test.numberConversion(12), "twelve dollars only" );
		
		assertEquals(test.numberConversion(13), "thirteen dollars only" );
		
		assertEquals(test.numberConversion(05), "five dollars only" );
			
		assertEquals(test.numberConversion(20), "twenty dollars only" );	
		
	}

}
