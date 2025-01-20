import java.util.Scanner;

class shortestDirection{

	public static float findShortestPath(String str){

		int x=0,y=0;

		for (int i=0;i<str.length() ;i++ ) {

			char dir = str.charAt(i);

			// South direction

			if (dir == 'S' || dir== 's') {

				y--;
			}
			// Northdirection
			else if (dir == 'N' || dir == 'n') {
				y++;
				
			}
			// East  direction
			else if (dir == 'E' || dir =='e') {

				x++;
			}
			// west  direction
			else if (dir == 'W' || dir =='w') {

				x--;
				
			}
			
		}

		int x2= x*x;
		int y2 = y*y;

		return (float)Math.sqrt(x2+y2);


	}
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the Direstion like (WSENSES) : to find the shortest path :}");

		String  str = sc.nextLine();

		System.out.println(str+" shorest Direction of string  : "+ findShortestPath(str));




	}
}