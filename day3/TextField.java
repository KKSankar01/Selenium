package week3.day3;

public class TextField extends WebElementGP{
	
	public void getText() {
		System.out.println("This is getText method calling from TextField class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField tf=new TextField();
		tf.click();
		tf.getText();
		tf.setText("This is new text from WebElementGP method calling from texxtField class");		
		
	}

}
