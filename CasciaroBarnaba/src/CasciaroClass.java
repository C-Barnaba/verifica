/**
 * <UL><LI>calcolo di potenza</UL>
 * @author Casciaro 
 * */
public class CasciaroClass {
	
	public CasciaroClass() {}
	
	public float CasciaroMet (int b, int e) {
		int val1=b;   // val1 deve essere uguale a b non a uno
		for (int i=1; i<e; i++){
		val1 = val1 * b;
		}
		return val1;
		}


	public static void main(String[] args) {
		CasciaroClass c=new CasciaroClass();
		System.out.println(c.CasciaroMet(10, 5));
	}

}
