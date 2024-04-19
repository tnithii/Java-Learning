package TestPackage;

public class ArrayAcendingOrder {

	public static void main(String[] args) {
		int[] a= {2,4,3,9,8,10,17,14};
		
		int j=1;
		for(int i=0;i<a.length-1;i++) {
		
				if(a[i]>a[j])//2<4,4<3
				{
					int temp=a[i];//temp = 
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
		}
		
			for(int b:a)
			System.out.println(b);
		}
		
		
	}


