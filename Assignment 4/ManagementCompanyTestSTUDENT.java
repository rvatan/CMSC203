package PropertyManagement;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property p1, p2, p3, p4, p5, p6;
	ManagementCompany propManCo;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		propManCo = new ManagementCompany("VatanCo","6345",6);
		//student add three properties, with plots, to mgmt co
		p1 = new Property ("Postoak","Potomac",3500,"Alex Johnson",1,1,3,3);
		p2 = new Property ("Rollins","Rockville",2750,"Dave Jones",1,4,2,2);
		p3 = new Property ("Tuckerman","Bethesda",1950,"Patrick Smith",4,1,1,1);
		propManCo.addProperty(p1);
		propManCo.addProperty(p2);
		propManCo.addProperty(p3);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null
		propManCo = null;
		
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property ("Deep Creek","Germantown",1600,"Bob Jackson");
		assertEquals(propManCo.addProperty(p4),3,0.1);
		//student should add property with 8 args
		p5 = new Property ("Morgans","Laurel",2450,"Tim Schwartz",4,4,2,2);
		assertEquals(propManCo.addProperty(p5),4,0.1);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		p6 = new Property ("Randolph","Olney",4270,"Tom Williams",4,2,1,1);
		assertEquals(propManCo.addProperty(p6),-1,0.1);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(propManCo.maxRentProp(),3500,0.1);
		
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(propManCo.totalRent(),8200,0.1);
	}

 }