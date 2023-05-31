
public class Validation {
	
	boolean isLength(String str, int len) {
		if (str.length() < len) {
			return true;
		} else {
			return false;
		}
	}
}