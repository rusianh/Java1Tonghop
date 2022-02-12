package hocxulyloi;

public class Program {

	public static void main(String[] args) {
		try {
			int x = 5;
			int y = 5/10;
			int z = x/y;
			System.out.println("x:" + x);
			System.out.println("y:" + y);
			System.out.println("z: " + z);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Have euro!!!!!!! ");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("still running.....!");
		}
		System.out.println("thanks for use!!!!!!!");
		System.out.println("See you soon ^^");
	}
}