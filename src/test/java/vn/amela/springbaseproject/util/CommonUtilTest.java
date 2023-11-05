package vn.amela.springbaseproject.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommonUtilTest {
	@Test
	public void should_find_first_not_null_correctly() {
		assertEquals(CommonUtil.firstNotNull(null, 1, 2, 3), 1);
		assertEquals(CommonUtil.firstNotNull(1, null, 2, 3), 1);
		assertEquals(CommonUtil.firstNotNull(1, 2, null, 3), 1);
		assertEquals(CommonUtil.firstNotNull(1, 2, 3, null), 1);
		assertEquals(CommonUtil.firstNotNull(null, 2, 3, null), 2);
		assertEquals(CommonUtil.firstNotNull(null, null, 3, null), 3);
		assertNull(CommonUtil.firstNotNull(null, null, null, (Integer) null));
	}
}
