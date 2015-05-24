package server;

import qq.QqOnlineWebService;
import qq.QqOnlineWebServiceSoap;
import trans.ArrayOfString;
import trans.TranslatorWebService;
import trans.TranslatorWebServiceSoap;
import client.MywsService;
import client.Myws;

public class Test {
	
	public static void main(String[] args) {
		testMyWS();		
	}
	
	public static void testMyWS() {
		Myws ws = new MywsService().getMywsPort();
		String result = ws.doSomething();
		String result2 = ws.sayH("wenger");
		System.out.println(result);
		System.out.println(result2);
		ws.stopWS();
	}
	
	public static void testOnlineWs() {
		TranslatorWebServiceSoap ws = new TranslatorWebService().getTranslatorWebServiceSoap();
		ArrayOfString result = ws.getEnCnTwoWayTranslator("ÄãºÃ");
		System.out.println(result.getString());
	}
	
	public static void testqq(){
		QqOnlineWebServiceSoap ws = new QqOnlineWebService().getQqOnlineWebServiceSoap();
		String result = ws.qqCheckOnline("704467076");
		System.out.println(result);
	}
	
}


