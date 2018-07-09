package question1;

import java.util.Arrays;

/**
 * Please implement Dynamic Array Interface 
 * @author 
 *
 */
public class MyCollection implements DynamicArray
{
// Uncomment commented section
	
	int i;
	int size_of_array;
	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private int[] numArray;
	private int[] numArray1;
	/**
	 * It constructs an empty Collection object with an array capacity specified by the integer
		parameter "arraySize".
	 */
	public MyCollection(int size_of_array){
		numArray = new int[size_of_array];
		this.size_of_array = size_of_array;
		i=0;
	}

	public int search(int searchingNum) 
	{
		// TODO Auto-generated method stub
		for(int j=0;j<numArray.length;j++)			
		{
			if(numArray[j] == searchingNum)
			{
				return j;
			}
			
		}
		
		return -1;
	}

	public boolean add(int numberToAdd) 
	{
		// TODO Auto-generated method stub
		int k = search(numberToAdd);
		if(i==size_of_array)
			doubleCapacity();
		if(k==-1)
		{
			numArray[i++] = numberToAdd;
			return true;
		}
		else
			return false;
	}

	public void doubleCapacity() 
	{
		// TODO Auto-generated method stub
		size_of_array = size_of_array*2;
		numArray = Arrays.copyOf(numArray, size_of_array);
	}

	public boolean remove(int numberToRemove) 
	{
		// TODO Auto-generated method stub
		int k = search(numberToRemove);
		if(k!=-1)
		{
			for(int j=k;j<getCount()-1;j++)
			{
				numArray[j] = numArray[j+1];
			}
			return true;
		}
		
		
		return false;
	}

	public int getCount() 
	{
		// TODO Auto-generated method stub
		return i;
	}

	public int[] rotate(int n) 
	{
		// TODO Auto-generated method stub
		int count=0;
		int a = getCount()-n;
		
		int another_Array[] = new int[15];
		//another_Array = numArray;
		
		for(int j=n;j<getCount();j++)
		{
			another_Array[count++] = numArray[j];
		}
		for(int j=0;j<n;j++)
		{
			another_Array[count++] = numArray[j];
		}
		numArray = another_Array;
		return null;
	}
	
	public String toString( )
	{
		
		String array = "{";
		for (int j=0;j<getCount();j++)
		{
			array = array.concat(String.valueOf(numArray[j]));
			if(j<getCount()-1)
				array = array + ",";
		}
		array = array + "}";
		return array;
		
	}

}
