
public class ConversionClass {
	//Collections used for storing string text
String[] singleVal = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

String[] tenVal = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
String[] doubleVal = {"ten", "twenty", "thirty", "fourty", "fifty", "sixtey"};
String[] largeVal = {"hundred", "thousand", "million"};


public ConversionClass() {
	
}


public String numberConversion(int value) {
	
	String result = "";
	String word = Integer.toString(value);
//	int length = word.length();
	
result = conversionGroup(word);
	
	return result;
}

public String conversionGroup(String value) {
	
	String result = "";
	if(value.length() == 2) {
		
		if(Character.getNumericValue(value.charAt(0)) == 1) {
		
			result += tenVal[Character.getNumericValue(value.charAt(1)) - 1] + " ";
		}
		else if(Character.getNumericValue(value.charAt(0)) != 0)
		result += doubleVal[Character.getNumericValue(value.charAt(0)) - 1]  + " ";
		
		
		if(Character.getNumericValue(value.charAt(1)) != 0 && Character.getNumericValue(value.charAt(0)) != 1 )
			result += singleVal[Character.getNumericValue(value.charAt(1)) - 1]  + " ";
	}
	
	else if(value.length() == 1) {
		if( Character.getNumericValue(value.charAt(0)) != 1 )
			result += singleVal[Character.getNumericValue(value.charAt(0)) - 1]  + " ";
		else
			result += "zero ";
			
	}
	
	
	

	result += "dollars ";
	//dependent on cents
	result += "only";
	
	return result;
}

	
}
