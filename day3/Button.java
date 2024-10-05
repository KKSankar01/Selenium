package week3.day3;

public class Button extends WebElementGP {
	
	public void submit() {
		System.out.println("This is a submit method from Button parent class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button pc=new Button();
		pc.click();
		pc.setText("This is new text called from parent class to grandparent class");
		pc.submit();
	}

}
