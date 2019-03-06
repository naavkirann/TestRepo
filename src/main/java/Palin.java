
public class Palin {
	
	public boolean palindrone (String s) 
	{
		int i=0;
		int j=s.length()-1;
		
		while( i!=j)
		{
			if ( s.charAt(i) == s.charAt(j))
			{
				i++;
				j--;
				
			}
			else 
			{
				return false;
			
			}
			
		}
		return true;
	}
	
	public static void main ( String[] args)
	{
		String s = "level";
		Palin n = new Palin();
		System.out.println(n.palindrone(s));		

	//char a1[]= new char[] {'l','o','l'};
	
}
	
}
