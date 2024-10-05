package week3.day3;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("This is endpoint for APIClient: " + endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("This is endpoint for APIClient: "+ endpoint +"This is the requested body: "+ requestBody + "This is the request status: "+requestStatus);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient obj=new APIClient();
		obj.sendRequest("Database");
		obj.sendRequest("Database","Amazon",false);
	}
}
