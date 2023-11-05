package vn.amela.springbaseproject.util;

public class CommonUtil {
	
	/**
	 * Find first not null element in array
	 * @param elements
	 * @return
	 * @param <T>
	 */
	public static <T> T firstNotNull(T...elements) {
		if (elements == null || elements.length == 0) {
			return null;
		}
		
		for (T e : elements) {
			if (e != null) {
				return e;
			}
		}
		
		return null;
	}
}
