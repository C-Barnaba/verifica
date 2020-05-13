/**
 * <UL><LI>calcolo di potenza</UL>
 * @author Casciaro 
 * */
public class CasciaroClass {
	
	public CasciaroClass() {}
	
	public float CasciaroMet (int b, int e) {
		int val1=1; 		
			for (int i=1; i<=b; i++){
				val1 = val1 * b;
			}
			return val1;
		}


	public static void main(String[] args) {
		CasciaroClass c=new CasciaroClass();
		System.out.println(c.CasciaroMet(10, 5));
	}

}
