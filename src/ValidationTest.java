import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationTest {
	
	//@Test
	void test() {
		fail("まだ実装されていません");
	}
	
	
	@Test
	void 正常系_長さチェック() {
		String str = "aiueo";
		Validation v = new Validation();
		boolean result = v.isLength(str, 20);
		
		assertTrue(result);
	}

}
