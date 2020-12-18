public static void main(String[] args) 
{
  testSolution(25);
}
	
public static void testSolution(int number)
{
  int sum = 0;
	    
   for (int n = 0; n < number; n++)
   {
   
    if(n % 3 == 0 && n % 5 == 0)
    {
      sum = sum + n;
    }
    else if (n % 3 == 0 || n % 5 == 0)
    {
      sum = sum + n;
    }
    else
    {
      continue;
    }
    
  }	    
  System.out.println(sum);
}
