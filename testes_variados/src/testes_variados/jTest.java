package testes_variados;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class jTest {

	@Test
	void test() {


		assertEquals(Main.getIfor(0,0),7);
		assertEquals(Main.getIfor(0,1),8);
		assertEquals(Main.getIfor(0,2),9);
		assertEquals(Main.getIfor(0,3),1);
		assertEquals(Main.getIfor(0,4),2);
		assertEquals(Main.getIfor(0,5),3);
		assertEquals(Main.getIfor(0,6),4);
		assertEquals(Main.getIfor(0,7),5);
		assertEquals(Main.getIfor(0,8),6);
		assertEquals(Main.getIfor(0,9),7);
		assertEquals(Main.getIfor(0,10),8);
		assertEquals(Main.getIfor(0,11),9);
		assertEquals(Main.getIfor(0,12),1);
		
		
		
		
		assertEquals(Main.getIfor(1,0),8);
		assertEquals(Main.getIfor(1,1),9);
		assertEquals(Main.getIfor(1,2),0);
		assertEquals(Main.getIfor(1,3),2);
		assertEquals(Main.getIfor(1,4),3);
		assertEquals(Main.getIfor(1,5),4);
		assertEquals(Main.getIfor(1,6),5);
		assertEquals(Main.getIfor(1,7),6);
		assertEquals(Main.getIfor(1,8),7);
		assertEquals(Main.getIfor(1,9),8);
		assertEquals(Main.getIfor(1,10),9);
		assertEquals(Main.getIfor(1,11),0);
		assertEquals(Main.getIfor(1,12),2);
		assertEquals(Main.getIfor(1,20),0);
		assertEquals(Main.getIfor(1,21),2);
		assertEquals(Main.getIfor(1,22),3);
		
		
		
//		1345678901345678901345678901345678901345
		
		assertEquals(Main.getIfor(2,0),9);
		assertEquals(Main.getIfor(2,1),0);
		assertEquals(Main.getIfor(2,2),1);
		assertEquals(Main.getIfor(2,3),3);
		assertEquals(Main.getIfor(2,4),4);
		assertEquals(Main.getIfor(2,5),5);
		assertEquals(Main.getIfor(2,6),6);
		assertEquals(Main.getIfor(2,7),7);
		assertEquals(Main.getIfor(2,8),8);
		assertEquals(Main.getIfor(2,9),9);
		assertEquals(Main.getIfor(2,10),0);		
		assertEquals(Main.getIfor(2,11),1);
		assertEquals(Main.getIfor(2,12),3);
		assertEquals(Main.getIfor(2,13),4);
		assertEquals(Main.getIfor(2,14),5);
		assertEquals(Main.getIfor(2,15),6);
		assertEquals(Main.getIfor(2,16),7);
		assertEquals(Main.getIfor(2,17),8);
		assertEquals(Main.getIfor(2,18),9);
		assertEquals(Main.getIfor(2,19),0);
		assertEquals(Main.getIfor(2,20),1);
		assertEquals(Main.getIfor(2,21),3);
		
		



		assertEquals(Main.getIfor(3,0),0);
		assertEquals(Main.getIfor(3,1),1);
		assertEquals(Main.getIfor(3,2),2);
		assertEquals(Main.getIfor(3,3),4);
		assertEquals(Main.getIfor(3,4),5);
		assertEquals(Main.getIfor(3,5),6);
		assertEquals(Main.getIfor(3,6),7);
		assertEquals(Main.getIfor(3,7),8);
		assertEquals(Main.getIfor(3,8),9);
		assertEquals(Main.getIfor(3,9),0);
		assertEquals(Main.getIfor(3,10),1);		
		assertEquals(Main.getIfor(3,11),2);
		assertEquals(Main.getIfor(3,12),4);
		assertEquals(Main.getIfor(3,13),5);
		assertEquals(Main.getIfor(3,14),6);
		assertEquals(Main.getIfor(3,15),7);
		assertEquals(Main.getIfor(3,16),8);
		assertEquals(Main.getIfor(3,17),9);
		assertEquals(Main.getIfor(3,18),0);
		assertEquals(Main.getIfor(3,19),1);
		assertEquals(Main.getIfor(3,20),2);
		assertEquals(Main.getIfor(3,21),4);
		
		
		
		
		
		
		
		
	}

}
