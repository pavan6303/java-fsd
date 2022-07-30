package defaultaccessmodifier;

class priaccessspecifier 
{ 
   @SuppressWarnings("unused")
private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class privateaccessspesifier {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		@SuppressWarnings("unused")
		priaccessspecifier  obj = new priaccessspecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}
}

