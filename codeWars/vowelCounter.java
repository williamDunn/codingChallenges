public static void main(String[] args) {
        	
    	String str = "abracadabra";
    	
    	int vowelCount = 0;
    	
    	char[] letters = new char[str.length()];
    	
    	for(int i = 0; i < str.length(); i++)
    	{
    		letters[i] = str.charAt(i);
    		System.out.println(letters[i]);
    		
    		if(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u')
    		{
    			vowelCount++;
    		}
    		else
    		{
    			continue;
    		}
    	}  	
    	
    	System.out.println(vowelCount);
	}
