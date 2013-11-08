/*L
 *  Copyright SAIC, Ellumen and RSNA (CTP)
 *
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/national-biomedical-image-archive/LICENSE.txt for details.
 */

/**
 * MappingConsole.java
 *
 * This file was generated by MapForce 2011r2sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */


package com.mapforce;

import com.altova.types.*;


public class MappingConsole {

	public static void main(String[] args) {
		System.out.println("Mapping Application");


		try { // Mapping
			TraceTargetConsole ttc = new TraceTargetConsole();


			MappingMapToAIM_v2_rv15_XML MappingMapToAIM_v2_rv15_XMLObject = new MappingMapToAIM_v2_rv15_XML();


			MappingMapToAIM_v2_rv15_XMLObject.registerTraceTarget(ttc);
	

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// MappingMapToAIM_v2_rv15_XMLObject.setCloseObjectsAfterRun(false);

			{
				com.altova.io.Input AIM_v3_rv9_XML2Source = com.altova.io.StreamInput.createInput("C:/workspace_nbia/software_apr08/cedaraAIMMapping/testdata/222/218/218_aim1.xml");

				MappingMapToAIM_v2_rv15_XMLObject.run(
						AIM_v3_rv9_XML2Source);
			}



			System.out.println("Finished");
		} 
		catch (com.altova.UserException ue) 
		{
			System.out.print("USER EXCEPTION:");
			System.out.println( ue.getMessage() );
			System.exit(1);
		}
		catch (com.altova.AltovaException e)
		{
			System.out.print("ERROR: ");
			System.out.println( e.getMessage() );
			if (e.getInnerException() != null)
			{
				System.out.print("Inner exception: ");
				System.out.println(e.getInnerException().getMessage());
				if (e.getInnerException().getCause() != null)
				{
					System.out.print("Cause: ");
					System.out.println(e.getInnerException().getCause().getMessage());
				}
			}
			System.out.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}
		
		catch (Exception e) {
			System.out.print("ERROR: ");
			System.out.println( e.getMessage() );
			System.out.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}

	}
}


class TraceTargetConsole implements com.altova.TraceTarget {
	public void writeTrace(String info) {
		System.out.println(info);
	}
}
