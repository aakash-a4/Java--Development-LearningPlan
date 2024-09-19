

public class OOPS {
	public static void main (String[]args){
		Pen p1 = new Pen();
		p1.setColor("Blue");
		
		System.out.println(p1.color);
		
		BankAccount B1 = new BankAccount();
		B1.username = "jdfj";
		B1.setpassword("sdf");
		System.out.println(B1);
	}
}

class BankAccount{
	public String username;
	private String password;
	public void setpassword(String pwd) {
		password = pwd;
	}
}
class Pen{
		String color;
		int tip;
		
		void setColor(String newColor) {
			color = newColor;
		}
		void setTip(int newtip) {
			tip = newtip;
		}
		class Student{
			String name;
			int age;
			float  percentage;
		void calcPercentage(int phy, int che, int mat) {
			percentage = (phy+mat+che)/3;
		}
		}

	}
	
