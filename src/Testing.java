import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

class Testing {
	

	@Test
	void FailSortEquals() {//fail test for check Equality on the object array 
		Factory factor=new Factory(49);
		assertEquals("the array not in the same size",50,factor.workers.length);
		factor.failSort();
	}
	@Test
	void  BubbleSortEquals()//success test for equality on the size array
	{
		Factory factor=new Factory(50);
		assertEquals("the array not in the same size",50,factor.workers.length);
		factor.BubbleSort();
	}
	@Test
	void MergeSortEquals()//success test for equality on the size array
	{
		Factory factor=new Factory(50);
		assertEquals("the array not in the same size",50,factor.workers.length);
		factor.manageMergeSort(0, 49);	
	}
	@Test
	void FailSortNull() {//fail test for null object
		Factory factor=null;
		assertNotNull("the object not created",factor);
		factor.failSort();
	}
	@Test
	void  BubbleSortNull()//success test for non null object
	{
		Factory factor=new Factory(50);
		assertNotNull("the object not created",factor);
		factor.BubbleSort();	
	}
	@Test
	void MergeSortNull()//success test for non null object
	{
		Factory factor=new Factory(50);
		assertNotNull("the object not created",factor);
		factor.manageMergeSort(0, 49);	
	}
	@Test
	void FailSortSorting() {//fail test for sorting
		Factory factor=new Factory(50);
		assertEquals("the array not in the same size",50,factor.workers.length);
		assertNotNull("the object not created",factor);
		factor.failSort();	
		int i;
		for(i=0;i<49;i++)
		{
			if(factor.workers[i].salary>factor.workers[i+1].salary)
			{
				assertFalse("the array not sorted",true);
			}
			if(factor.workers[i]==null)
			{
				assertNotNull("the object not created",factor.workers[i]);
			}
		}
		assertTrue("the array sorted",true);
	}
	@Test
	void  BubbleSortSorting()//success test for Bubble sort
	{
		Factory factor=new Factory(50);
		assertEquals("the array not in the same size",50,factor.workers.length);
		assertNotNull("the object not created",factor);
		factor.BubbleSort();	
		int i;
		for(i=0;i<49;i++)
		{
			if(factor.workers[i].salary>factor.workers[i+1].salary)
			{
				assertFalse("the array not sorted",true);
			}
			if(factor.workers[i]==null)
			{
				assertNotNull("the object not created",factor.workers[i]);
			}
		}
		factor.printArray();
		assertTrue("the array sorted",true);
	}
	@Test
	void MergeSortSorting()//success test for Merge sort
	{
		Factory factor=new Factory(50);
		assertEquals("the array not in the same size",50,factor.workers.length);
		assertNotNull("the object not created",factor);
		factor.manageMergeSort(0, 49);	
		int i;
		for(i=0;i<9;i++)
		{
			if(factor.workers[i].salary>factor.workers[i+1].salary)
			{
				assertFalse("the array not sorted",true);
			}
			if(factor.workers[i]==null)
			{
				assertNotNull("the object not created",factor.workers[i]);
			}
		}
		factor.printArray();
		assertTrue("the array sorted",true);
	}


}
