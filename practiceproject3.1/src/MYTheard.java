public class MYTheard extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		MYTheard mt = new  MYTheard();
  		mt.start();
 	}
}

