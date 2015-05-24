package cxfClient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CxfServiceClient implements Serializable{
	
	public static void main(String[] args) {
		//µ÷ÓÃWebService
		//JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		
		int a = 0;
		int c = 0;
		do{
			--c;
			a = a-1;
		
		}while(a>0);

		System.out.println(c);
	}
	
	public static CxfServiceClient c = null;
	
	public static synchronized CxfServiceClient getInstance() {
		if(c == null) {
			c = new CxfServiceClient();
			return c;
		}
		return c;
	}
}
