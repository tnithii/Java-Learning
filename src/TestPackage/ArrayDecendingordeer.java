package TestPackage;

public class ArrayDecendingordeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {2,4,3,9,8,10,17};
		
		//int j=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j])//2<4,4<3
				{
					int temp=a[i];//temp = 
					a[i]=a[j];
					a[j]=temp;
				}
				//j++;
		}
		}
			
			for(int b:a)
			System.out.println(b);
	}

}
