package server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Myws {
	
	static Endpoint ep = Endpoint.create(new Myws());
	
	public String doSomething() { 
	    return "这是基于Java6的WebService"; 
	}
	
	@WebMethod(operationName="sayH")
	public String sayHello(String name) {
		return "Hello," + name + "!";
	}
	
	@WebMethod(operationName="stopWS")
	public void stop() {
		ep.stop();
	}
	public static void main(String[] args) { 
		String url="http://localhost:8080/myws"; 
	  	ep.publish(url,new Myws()); 
	} 
}
