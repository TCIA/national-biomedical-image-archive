package gov.nih.nci.ncia.util;

import junit.framework.TestCase;

public class AdapterUtilTestCase extends TestCase {

	public void testConvertToAgeGroup() throws Exception  {
		String ageGroup = AdapterUtil.convertToAgeGroup("3");
		assertEquals(ageGroup, "");
		
		ageGroup = AdapterUtil.convertToAgeGroup("3Y");
		assertEquals(ageGroup, "000Y");

		ageGroup = AdapterUtil.convertToAgeGroup("5Y");
		assertEquals(ageGroup, "010Y");

		ageGroup = AdapterUtil.convertToAgeGroup("15Y");
		assertEquals(ageGroup, "020Y");
		
		ageGroup = AdapterUtil.convertToAgeGroup("25Y");
		assertEquals(ageGroup, "030Y");
		
		ageGroup = AdapterUtil.convertToAgeGroup("35Y");
		assertEquals(ageGroup, "040Y");
		
		ageGroup = AdapterUtil.convertToAgeGroup("45Y");
		assertEquals(ageGroup, "050Y");
		
		ageGroup = AdapterUtil.convertToAgeGroup("55Y");
		assertEquals(ageGroup, "060Y");
		
		ageGroup = AdapterUtil.convertToAgeGroup("65Y");
		assertEquals(ageGroup, "070Y");
		
		ageGroup = AdapterUtil.convertToAgeGroup("75Y");
		assertEquals(ageGroup, "080Y");	
		
		ageGroup = AdapterUtil.convertToAgeGroup("85Y");
		assertEquals(ageGroup, "090Y");
		
		ageGroup = AdapterUtil.convertToAgeGroup("95Y");
		assertEquals(ageGroup, "100Y");	
	
	}

}
