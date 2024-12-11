import  java.util.Scanner;
public class Arrayfun{
	public static void update(int marks[]){
		for (int i=0;i<marks.length;i++ ) {
			marks[i]=marks[i]+5 ;
		}
	}
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int marks[]={90,102,22};
		update(marks);
		for (int i=0;i<marks.length;i++ ) {
			System.out.println(marks[i]+" ");
		}
	// 	System.out.println("Enter the Subject marks ");
	// 	marks[0]=sc.nextInt();
	// 	marks[1]=sc.nextInt();
	// 	marks[2]=sc.nextInt();
	// 	marks[3]= sc.nextInt();
	// System.out.println("Persentage "+(marks[0]+marks	s[1]+marks[2]+marks[3])/4 + "%");
	// System.out.println("Array Length : "+marks.length);



	}
}