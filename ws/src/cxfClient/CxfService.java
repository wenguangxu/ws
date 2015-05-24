package cxfClient;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CxfService {
	
	public String doSomething();
	
	public String sayHello(@WebParam(name="name") String name);
	
	public void stop();
}
