import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationTest {
	
	//@Test
	void test() {
		fail("まだ実装されていません");
	}
	
	
	@Test
	void 正常系_長さチェック() {
		String str = "aiueo"; //5文字
		Validation v = new Validation();
		boolean result = v.isLength(str, 20);
		
		// assertTrue で result の返り値がtrueになっているか判別する
		assertTrue(result);
	}
	
	@Test
	void 異常系_長さチェック_1文字オーバー() {
		String str = "aiueoaiueoaiueoaiueoa"; //21文字
		Validation v = new Validation();
		boolean result = v.isLength(str, 20);
		
		// assertFalse で result の返り値がFalseになっているか判別する
		assertFalse(result);
	}
	
	@Test
	void 正常系_メールチェック() {
		String mail = "test@test.com";
		Validation v = new Validation();
		String result = v.checkMail(mail);
		
		assertEquals(null, result);
	}
	
	@Test
	void 異常系_メールチェック_未入力() {
		String mail = "";
		Validation v = new Validation();
		String result = v.checkMail(mail);
		
		assertEquals("入力してください", result);
	}
	
	@Test
	void 異常系_メールチェック_1文字オーバー() {
		String mail = "testtesttesttesttesttesttesttest@test.com";
		Validation v = new Validation();
		String result = v.checkMail(mail);
		
		assertEquals("メールが長すぎます", result);
	}

}
