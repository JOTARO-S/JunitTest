
public class Validation {
	
	boolean isLength(String str, int len) {
		if (str.length() < len) {
			return true;
		} else {
			return false;
		}
	}
	
	String checkMail(String mail) {
		if (mail == null || mail.isEmpty()) {
			return "入力してください";
		} else if (40 < mail.length()) {
			return "メールが長すぎます";
		} else {
			return null;
		}
	}
	
}