package textToInteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TextToNumber {
	
	private static HashMap<String,Integer> NumberLookup = new HashMap<String, Integer>();
	private static HashMap<String,Integer> MagnitudeLookup = new HashMap<String, Integer>();
	
	static {
		BuildNumberDictionaries();
	}

	public static long Convert(String Text){
		ArrayList<Long> finalResult = new ArrayList<Long>();
		long currentResult = 0;
		String[] pieces = Text.split("\\s+");
		
		for (int i = 0; i < pieces.length; i++) {
			try{
				Integer nowChecking = NumberLookup.get(pieces[i].toLowerCase());
				if (nowChecking != null){
					currentResult = currentResult+nowChecking;
					continue;
				}
				nowChecking = MagnitudeLookup.get(pieces[i].toLowerCase());
				if(nowChecking == null)
					return -1;  // we had a text that we did not understand somewhere in the input string
				if (nowChecking == 100)
					currentResult = currentResult*nowChecking;
				else{						
					finalResult.add((long)currentResult*(long)nowChecking);
					currentResult = 0;
				}									
			} catch (Exception ex){
				return -1;
			}
		}
		for(Iterator<Long> i = finalResult.iterator(); i.hasNext(); ) {
			currentResult = currentResult+i.next();
		}
		return currentResult;
	}
	
	
    private static void BuildNumberDictionaries() {
       NumberLookup.put("one", 1);
       NumberLookup.put("two", 2);
       NumberLookup.put("three", 3);
       NumberLookup.put("four", 4);
       NumberLookup.put("five", 5);
       NumberLookup.put("six", 6);
       NumberLookup.put("seven", 7);
       NumberLookup.put("eight", 8);
       NumberLookup.put("nine", 9);
       NumberLookup.put("ten", 10);
       NumberLookup.put("eleven", 11);
       NumberLookup.put("twelve", 12);
       NumberLookup.put("thirteen", 13);
       NumberLookup.put("fourteen", 14);
       NumberLookup.put("fifteen", 15);
       NumberLookup.put("sixteen", 16);
       NumberLookup.put("seventeen", 17);
       NumberLookup.put("eighteen", 18);
       NumberLookup.put("nineteen", 19);
       NumberLookup.put("twenty", 20);
       NumberLookup.put("thirty", 30);
       NumberLookup.put("forty", 40);
       NumberLookup.put("fifty", 50);
       NumberLookup.put("sixty", 60);
       NumberLookup.put("seventy", 70);
       NumberLookup.put("eigthy", 80);
       NumberLookup.put("ninety", 90);
       MagnitudeLookup.put("billion", 1000000000);
       MagnitudeLookup.put("million", 1000000);
       MagnitudeLookup.put("thousand", 1000);
       MagnitudeLookup.put("hundred", 100);
   }
}
