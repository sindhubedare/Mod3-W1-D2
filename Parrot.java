
public class Parrot {
	static boolean getUp (boolean sqwak, int currentHour) {
		 
		 if (currentHour < 6) {
			 sqwak = true;
		 }
		 else if(currentHour > 22) {
			 sqwak = true;
		 }
		 	return sqwak;
		}

		public static void main (String[] args) {
			System.out.println(getUp(true, 2));
		}
}
