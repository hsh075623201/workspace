package cn.edu.shou.hsh.webservices;

import javax.xml.namespace.QName;  

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;  
import org.apache.axis2.client.Options;  
import org.apache.axis2.rpc.client.RPCServiceClient;  
/**
 * ����webservices
 * @author HSH
 *
 */
public class HelloWebServiceTest {

	/**
	 * @param args
	 * @throws AxisFault 
	 */
	public static void main(String[] args) throws AxisFault {
		// TODO Auto-generated method stub
		//  ʹ��RPC��ʽ����WebService          
	    RPCServiceClient serviceClient = new RPCServiceClient();  
	    Options options = serviceClient.getOptions();  
	    //  ָ������WebService��URL  
	    EndpointReference targetEPR = new EndpointReference(  
	            "http://localhost:8080/axis2/services/HelloWebService");  
	    options.setTo(targetEPR);  
	    //  ָ��webServiceTest�����Ĳ���ֵ  
	    Object[] opAddEntryArgs = new Object[] {};  
	    //  ָ��webServiceTest��������ֵ���������͵�Class����  
	    Class[] classes = new Class[] {String.class};  
	    //  ָ��Ҫ���õ�webServiceTest������WSDL�ļ��������ռ�  
	    QName opAddEntry = new QName("http://webservices.hsh.shou.edu.cn", "webServiceTest");  
	    //  ����webServiceTest����������÷����ķ���ֵ  
	    System.out.println(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs, classes)[0]); 
	}

}