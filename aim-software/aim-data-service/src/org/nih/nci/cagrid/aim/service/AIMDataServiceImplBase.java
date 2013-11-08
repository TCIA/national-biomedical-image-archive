/*L
 *  Copyright SAIC, Ellumen and RSNA (CTP)
 *
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/national-biomedical-image-archive/LICENSE.txt for details.
 */

package org.nih.nci.cagrid.aim.service;

import org.nih.nci.cagrid.aim.service.globus.resource.AIMDataServiceResource;
import  org.nih.nci.cagrid.aim.service.AIMDataServiceConfiguration;

import java.rmi.RemoteException;

import javax.naming.InitialContext;
import javax.xml.namespace.QName;

import org.apache.axis.MessageContext;
import org.globus.wsrf.Constants;
import org.globus.wsrf.ResourceContext;
import org.globus.wsrf.ResourceContextException;
import org.globus.wsrf.ResourceException;
import org.globus.wsrf.ResourceHome;
import org.globus.wsrf.ResourceProperty;
import org.globus.wsrf.ResourcePropertySet;


/** 
 * DO NOT EDIT:  This class is autogenerated!
 *
 * Provides some simple accessors for the Impl.
 * 
 * @created by Introduce Toolkit version 1.3
 * 
 */
public abstract class AIMDataServiceImplBase {
	
	public AIMDataServiceImplBase() throws RemoteException {
	
	}
	
	public AIMDataServiceConfiguration getConfiguration() throws Exception {
		return AIMDataServiceConfiguration.getConfiguration();
	}
	
	
	public org.nih.nci.cagrid.aim.service.globus.resource.AIMDataServiceResourceHome getResourceHome() throws Exception {
		ResourceHome resource = getResourceHome("home");
		return (org.nih.nci.cagrid.aim.service.globus.resource.AIMDataServiceResourceHome)resource;
	}

	
	
	
	
	protected ResourceHome getResourceHome(String resourceKey) throws Exception {
		MessageContext ctx = MessageContext.getCurrentContext();

		ResourceHome resourceHome = null;
		
		String servicePath = ctx.getTargetService();

		String jndiName = Constants.JNDI_SERVICES_BASE_NAME + servicePath + "/" + resourceKey;
		try {
			javax.naming.Context initialContext = new InitialContext();
			resourceHome = (ResourceHome) initialContext.lookup(jndiName);
		} catch (Exception e) {
			throw new Exception("Unable to instantiate resource home. : " + resourceKey, e);
		}

		return resourceHome;
	}


}

