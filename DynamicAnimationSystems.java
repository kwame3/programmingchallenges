// Transfers all the 0's in an array to the beginning of the array
public class DynamicAnimationSystems {
	public static void main (String[] args)
	{

		//int[] array = {1, 2, 0, 0, 5};
		//int[] array = {1, 2, 5, 0, 0};
		//int[] array = {1, 2, 5, 3, 6};
		int[] array = {0, 0, 1, 2, 5};
		//int[] array = {0, 0, 0, 0, 0};
		
		int[] arrayCopy = new int[array.length];
		int arrayCopyPosition = 0; 
		int zeroCounter = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				zeroCounter++;
			}
			
			else
			{
				arrayCopy[arrayCopyPosition] = array[i];
				arrayCopyPosition++;
			}
		}
	
		if (zeroCounter > 0)
		{
			for (int j = arrayCopyPosition; j < array.length; j++)
			{
				arrayCopy[arrayCopyPosition] = 0;
			}
		}

		System.out.print("{");
		
		for (int k = 0; k < arrayCopy.length; k++)
		{
			if (k != arrayCopy.length-1)
			{
				System.out.print(arrayCopy[k] + ", ");
			}
			
			else
			{
				System.out.print(arrayCopy[k]+ "} ");
			}
		}
		
	}
}
