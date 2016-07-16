package LAB10;

public class timeexecute 
{
	public static void main(String args[])
	{
		int arr[]=new int [100000];
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=intRandom(0,100000);
		}
		int key=intRandom(0,100000);
		
		
		long start=System.nanoTime ();
		int n=linear(arr,key);
		long end=System.nanoTime ();
		long execute=end-start;
		System.out.println("The execution time is "
			    + execute+" and the key is at index "+n);
	
	    start = System.nanoTime ();
	    selectionSort(arr);
	    end= System.nanoTime ();
	    execute = end - start;
	   
	     System.out.println("The execution time for selection sort is "+ execute);
	   
	   
	  start = System.nanoTime ();
	  i =binarySearch(arr, key);
	  end = System.nanoTime ();
	  execute = end - start;
	   
	  
	  System.out.println("The execution time for binary search is "+ execute);
	  System.out.println("The key is " + key + " and it is at index " + i);
	 
	}
	 
	 public static int intRandom(int min, int max) 
	 {
		 return (int) (min + Math.random() * (max - min + 1));
	 }
	 
	 public static void selectionSort(int[] list) 
	 {
	  for (int i = 0; i < list.length - 1; i++) 
	  {
		  int currentMin = list[i];
		  int currentMinIndex = i;
	 
		  for (int j = i + 1; j < list.length; j++) 
		  {
			  if (currentMin > list[j]) 
			  {
				  currentMin = list[j];
				  currentMinIndex = j;
			  }
		  }
	   if (currentMinIndex != i) 
	   {
	    list[currentMinIndex] = list[i];
	    list[i] = currentMin;
	   }
	  }
	 }
	 
	 public static int linear(int[] search, int key) 
	 {
	  for (int i = 0; i < search.length; i++) 
	  {
	   if (key == search[i])
	    return i;
	  }
	  return -1;
	 }
	 
	 
	 public static int binarySearch(int[] search, int key) {
	  int low = 0;
	  int high = search.length - 1;
	 
	  while (high >= low) 
	  {
	   int mid = (low + high) / 2;
	   if (key < search[mid])
	    high = mid - 1;
	   else if (key == search[mid])
	    return mid;
	   else
	    low = mid + 1;
	  }
	 
	  return low - 1; 
	 }
	 
	}


