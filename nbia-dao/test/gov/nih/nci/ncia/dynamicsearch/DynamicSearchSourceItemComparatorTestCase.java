package gov.nih.nci.ncia.dynamicsearch;

import junit.framework.TestCase;
import java.util.*;
import gov.nih.nci.ncia.xmlobject.SourceItem;
import java.util.*;

public class DynamicSearchSourceItemComparatorTestCase extends TestCase {

	public void testEqual() {
		SourceItem s1 = new SourceItem();
		s1.setItemLabel("l1");
		
		SourceItem s2 = new SourceItem();
		s2.setItemLabel("l1");
		
		int result = comparator.compare(s1, s2);
		assertEquals(result, 0);
	}
	
	public void testNotEqual() {
		SourceItem s1 = new SourceItem();
		s1.setItemLabel("l1");
		
		SourceItem s2 = new SourceItem();
		s2.setItemLabel("l2");
		
		int result = comparator.compare(s1, s2);
		super.assertNotSame(result, 0);
	}	
	
	
	public void testNull() {
		SourceItem s1 = new SourceItem();
		s1.setItemLabel("l1");
		
		int result = comparator.compare(null, null);
		assertEquals(result, 0);
		
		result = comparator.compare(null, s1);
		super.assertNotSame(result, 0);
		
		result = comparator.compare(s1, null);
		super.assertNotSame(result, 0);		
		
		List<SourceItem> collection = new ArrayList<SourceItem>();
		collection.add(null);
		collection.add(null);
		collection.add(s1);
		Collections.sort(collection, comparator);
		
		assertEquals(collection.get(0), s1);
		assertNull(collection.get(1));
		assertNull(collection.get(2));
		
	}	

	protected void setUp() {
		comparator = new DynamicSearchSourceItemComparator();
	}
	
	private Comparator<SourceItem> comparator;
}
