public static void main(String[] args) 
{
	validatePin("1234");
}
	
public static void validatePin(String pin) 
{
	boolean isValid = true;
		
	if(pin.length() == 4 || pin.length() == 6)
	{
		try
		{
			int num = Integer.parseInt(pin);
			isValid = true;
			System.out.println("true");
		}
		catch (NumberFormatException e)
		{
			isValid = false;
			System.out.println("false");
		}
	}
}
