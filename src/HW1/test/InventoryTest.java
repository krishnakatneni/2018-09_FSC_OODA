package HW1.Test;

/*01392300 Aditya
 * @01392295 Nikhil
 * @01390645 Raghunandan
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import HW1.Inventory;

import org.junit.jupiter.api.Test;

class InventoryTest {
	Inventory inventory;
	private List<Guitar> guitars = new LinkedList<Guitar>();
	@BeforeEach
	void setUp() throws Exception 
	{
		
		this.inventory=new Inventory();
				inventory.addGuitar(
				"V95693",
				1499.95,
				"Fender",
				"Stratocastor",
				"electric",
				"Alder",
				"Alder"
				);
				
				{
	Guitar guiter=new Guitar("V95693",
			1499.95,
			"Fender",
			"Stratocastor",
			"electric",
			"Alder",
			"Alder");
	guitars.add(guiter);
				}
				
		}
	@Test
	void testGetManufacturer() //this test fail  due to the case sensitivity problem
	{
		String expected="fender";
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getManufacturer().toString();//here we get "Fender" in result but we have not converted to lower case
		      
		}
		assertEquals(expected, result);
		
		
	}
	@Test
	void testGetManufacturercasesensitivity()
	{
		String expected="fender";
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getManufacturer().toString().toLowerCase();//here we get "fender" in result but we have  converted to lower case
			
			
			
			/*boolean res=expected.equalsIgnoreCase(result);   we can use this method also as we used in inventory class but it internally use tolowercase to compare
			if(res==false)
			{
				result=null;
			}
			else {
				result=result.toLowerCase();
			}*/
			
			
			
		      
		}
		assertEquals(expected, result);
	}
	@Test
	void testGetModel()
	{
		String expected="stratocastor".toLowerCase();
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getModel().toString().toLowerCase();//dealing with case sensitivity for model
		      
		}
		assertEquals(expected, result);
	}
	@Test
	void testGetType()//to compare type in  the inventory to given type with case sentivity
	{
		String expected="electric".toLowerCase();
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getType().toString().toLowerCase();
		      
		}
		assertEquals(expected, result);
	}
	@Test
	void testbackWood()
	{
		String expected="Alder".toLowerCase();//converting "Alder" to lower case as we are converting comparing element to lower case
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getBackWood().toString().toLowerCase();
		      
		}
		assertEquals(expected, result);
	}
	@Test
	void testTopwood()
	{
		String expected="Alder".toLowerCase();//converting "Alder" to lower case as we are converting comparing element to lower case
		String result = "";
		Iterator i;
		for ( i = guitars.iterator(); i.hasNext(); ) 
		{
			Guitar guitar = (Guitar)i.next();
			result=guitar.getBackWood().toString().toLowerCase();
		      
		}
		assertEquals(expected, result);
		
	}
	
}
