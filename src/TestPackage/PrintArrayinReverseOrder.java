package TestPackage;

public class PrintArrayinReverseOrder {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int[] array= {1,2,3,7,2,9,5};
	int start=0;

	int end=array.length-1;

	while(start<end)
	{
		
		int temp=array[start];
		array[start]=array[end];
		array[end]=temp;

		start++;
		end--;
		
		
	}
	for(int i:array)
	{
		System.out.println(i);
	}

		}

	}
