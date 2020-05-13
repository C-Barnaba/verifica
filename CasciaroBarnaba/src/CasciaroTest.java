import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CasciaroTest {

	@Test
	void testCasciaroMet() {
		CasciaroClass c=new CasciaroClass();
		int n=1;
		int risAtteso=2187;
		float risOttenuto=c.CasciaroMet(3, 7);
	}
	@Test
	void testCasciaroMet2() {
		CasciaroClass c=new CasciaroClass();
		int n=44;
		int risAtteso=0;
		float risOttenuto=c.CasciaroMet(0, 1);
	}
	@Test
	void testCasciaroMet3() {
		CasciaroClass c=new CasciaroClass();
		int n=0;
		int risAtteso=1;
		float risOttenuto=c.CasciaroMet(1, 0);
	}

}
