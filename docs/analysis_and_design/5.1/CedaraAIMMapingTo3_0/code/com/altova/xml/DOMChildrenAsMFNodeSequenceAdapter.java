/*L
 *  Copyright SAIC, Ellumen and RSNA (CTP)
 *
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/national-biomedical-image-archive/LICENSE.txt for details.
 */

/**
 * DOMChildrenAsMFNodeSequenceAdapter.java
 *
 * This file was generated by MapForce 2011r2sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */

package com.altova.xml;

import org.w3c.dom.Node;
import com.altova.mapforce.IEnumerable;
import com.altova.mapforce.IEnumerator;

public class DOMChildrenAsMFNodeSequenceAdapter implements IEnumerable 
{
	public static class Enumerator implements IEnumerator
	{
		Node current = null;
		Node from;
		int pos = 0;
		
		public Enumerator(Node from)
		{
			this.from = from;
		}
		
		public Object current()
		{
			if (current == null) throw new UnsupportedOperationException("No current.");
				return new DOMNodeAsMFNodeAdapter(current);
		}
		
		public int position() {return pos;}
		
		public boolean moveNext()
		{
			if (current == null)
				current = from.getFirstChild();
			else
				current = current.getNextSibling();
			if (current != null)
			{
				pos++;
				return true;
			}
			return false;
		}
		
		public void close() {}
	}
	
	Node from;
	
	public DOMChildrenAsMFNodeSequenceAdapter(Node from)
	{
		this.from = from;
	}
	
	public IEnumerator enumerator() 
	{
		return new Enumerator(from);
	}
}
