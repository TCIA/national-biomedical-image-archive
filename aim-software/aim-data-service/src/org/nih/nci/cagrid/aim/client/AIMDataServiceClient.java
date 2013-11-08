/*L
 *  Copyright SAIC, Ellumen and RSNA (CTP)
 *
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/national-biomedical-image-archive/LICENSE.txt for details.
 */

package org.nih.nci.cagrid.aim.client;

import java.io.InputStream;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.AxisClient;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.types.URI.MalformedURIException;

import org.oasis.wsrf.properties.GetResourcePropertyResponse;

import org.globus.gsi.GlobusCredential;

import org.nih.nci.cagrid.aim.stubs.AIMDataServicePortType;
import org.nih.nci.cagrid.aim.stubs.service.AIMDataServiceAddressingLocator;
import org.nih.nci.cagrid.aim.common.AIMDataServiceI;
import gov.nih.nci.cagrid.introduce.security.client.ServiceSecurityClient;

/**
 * This class is autogenerated, DO NOT EDIT GENERATED GRID SERVICE ACCESS METHODS.
 *
 * This client is generated automatically by Introduce to provide a clean unwrapped API to the
 * service.
 *
 * On construction the class instance will contact the remote service and retrieve it's security
 * metadata description which it will use to configure the Stub specifically for each method call.
 * 
 * @created by Introduce Toolkit version 1.3
 */
public class AIMDataServiceClient extends AIMDataServiceClientBase implements AIMDataServiceI {	

	public AIMDataServiceClient(String url) throws MalformedURIException, RemoteException {
		this(url,null);	
	}

	public AIMDataServiceClient(String url, GlobusCredential proxy) throws MalformedURIException, RemoteException {
	   	super(url,proxy);
	}
	
	public AIMDataServiceClient(EndpointReferenceType epr) throws MalformedURIException, RemoteException {
	   	this(epr,null);
	}
	
	public AIMDataServiceClient(EndpointReferenceType epr, GlobusCredential proxy) throws MalformedURIException, RemoteException {
	   	super(epr,proxy);
	}

	public static void usage(){
		System.out.println(AIMDataServiceClient.class.getName() + " -url <service url>");
	}
	
	public static void main(String [] args){
	    System.out.println("Running the Grid Service Client");
		try{
		if(!(args.length < 2)){
			if(args[0].equals("-url")){
			  AIMDataServiceClient client = new AIMDataServiceClient(args[1]);
			  // place client calls here if you want to use this main as a
			  // test....
			} else {
				usage();
				System.exit(1);
			}
		} else {
			usage();
			System.exit(1);
		}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

  public org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse getMultipleResourceProperties(org.oasis.wsrf.properties.GetMultipleResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getMultipleResourceProperties");
    return portType.getMultipleResourceProperties(params);
    }
  }

  public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getResourceProperty");
    return portType.getResourceProperty(params);
    }
  }

  public org.oasis.wsrf.properties.QueryResourcePropertiesResponse queryResourceProperties(org.oasis.wsrf.properties.QueryResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"queryResourceProperties");
    return portType.queryResourceProperties(params);
    }
  }

  public gov.nih.nci.cagrid.cqlresultset.CQLQueryResults query(gov.nih.nci.cagrid.cqlquery.CQLQuery cqlQuery) throws RemoteException, gov.nih.nci.cagrid.data.faults.QueryProcessingExceptionType, gov.nih.nci.cagrid.data.faults.MalformedQueryExceptionType {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"query");
    gov.nih.nci.cagrid.data.QueryRequest params = new gov.nih.nci.cagrid.data.QueryRequest();
    gov.nih.nci.cagrid.data.QueryRequestCqlQuery cqlQueryContainer = new gov.nih.nci.cagrid.data.QueryRequestCqlQuery();
    cqlQueryContainer.setCQLQuery(cqlQuery);
    params.setCqlQuery(cqlQueryContainer);
    gov.nih.nci.cagrid.data.QueryResponse boxedResult = portType.query(params);
    return boxedResult.getCQLQueryResultCollection();
    }
  }

  public void submit(java.lang.String[] xmls) throws RemoteException, gov.nih.nci.cagrid.data.faults.QueryProcessingExceptionType, gov.nih.nci.cagrid.data.faults.MalformedQueryExceptionType {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"submit");
    org.nih.nci.cagrid.aim.stubs.SubmitRequest params = new org.nih.nci.cagrid.aim.stubs.SubmitRequest();
    params.setXmls(xmls);
    org.nih.nci.cagrid.aim.stubs.SubmitResponse boxedResult = portType.submit(params);
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference queryByTransfer(gov.nih.nci.cagrid.cqlquery.CQLQuery cqlQuery) throws RemoteException, gov.nih.nci.cagrid.data.faults.QueryProcessingExceptionType, gov.nih.nci.cagrid.data.faults.MalformedQueryExceptionType {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"queryByTransfer");
    org.nih.nci.cagrid.aim.stubs.QueryByTransferRequest params = new org.nih.nci.cagrid.aim.stubs.QueryByTransferRequest();
    org.nih.nci.cagrid.aim.stubs.QueryByTransferRequestCqlQuery cqlQueryContainer = new org.nih.nci.cagrid.aim.stubs.QueryByTransferRequestCqlQuery();
    cqlQueryContainer.setCQLQuery(cqlQuery);
    params.setCqlQuery(cqlQueryContainer);
    org.nih.nci.cagrid.aim.stubs.QueryByTransferResponse boxedResult = portType.queryByTransfer(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

  public org.cagrid.transfer.context.stubs.types.TransferServiceContextReference submitByTransfer() throws RemoteException, gov.nih.nci.cagrid.data.faults.QueryProcessingExceptionType, gov.nih.nci.cagrid.data.faults.MalformedQueryExceptionType {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"submitByTransfer");
    org.nih.nci.cagrid.aim.stubs.SubmitByTransferRequest params = new org.nih.nci.cagrid.aim.stubs.SubmitByTransferRequest();
    org.nih.nci.cagrid.aim.stubs.SubmitByTransferResponse boxedResult = portType.submitByTransfer(params);
    return boxedResult.getTransferServiceContextReference();
    }
  }

}
