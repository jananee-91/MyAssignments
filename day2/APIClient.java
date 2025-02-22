package week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		
		System.out.println("The endpoint is " + endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("The endpoint is " + endpoint + "The request body is " + requestBody + "The request status is " + requestStatus);

	}
	public static void main(String[] args) {
		APIClient c = new APIClient();
		c.sendRequest("www.google.com");
		c.sendRequest("www.google.com", "Requested body", true);

	}

}
