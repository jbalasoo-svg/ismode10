public class Ismod10 {
	
	static int [] numberArrayTest;
	static int sumTotalTest =0;

    public static boolean IsValidMod10Number(String  number)
    {  	
    	int[] numberArray = new int[number.length()];
    	
    	numberArrayTest = new int[number.length()];
    	
		boolean checkBit = false;
		
		int sumTotal =0;
		sumTotalTest  = 0;
		
		for(int i=0; i < number.length() ; i++)
		{
			numberArray[i] = (int)number.charAt(i);
			numberArrayTest[i] = (int)number.charAt(i);
			
			/*numberArray[i] = Integer.parseInt(number.substring(i,i+1)); 
			numberArrayTest[i] = Integer.parseInt(number.substring(i,i+1));*/
	   	 }
	    for(int index = numberArray.length -1 ; index >= 0 ; index--)
	    {
		if(checkBit)
		{
			numberArray[index] *=2;
			numberArrayTest[index] *=2;
			
			if(numberArray[index] > 9)
		      {
			        numberArray[index] -= 9;
			        numberArrayTest[index] -=9;
			  }
	    }
	       sumTotal += numberArray[index];
	       sumTotalTest += numberArray[index];
	       checkBit = !checkBit;
	   }
	    
	    return sumTotal % 10 == 0;
	    
	  /* if(number.length()==0)
	   return false;
	   else
	   return sumTotal % 10 == 0;*/
	   
	  
	}
    
    public static int getTotalSum()
    {

	    return sumTotalTest;
    }
    
    public static int[] getNumArray()
    {
	   return numberArrayTest;
    }
}