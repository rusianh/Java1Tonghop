package hocthrow;

public class ProgramThrow {

	
	public static void PtBac1(int a, int b) throws Exception
	{
		try 
		{
			System.out.println("x+"+(-b/a));
		} 
		catch (Exception e) 
		{
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			PtBac1(0, 4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
