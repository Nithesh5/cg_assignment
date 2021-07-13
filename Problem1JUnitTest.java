package cg_assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.BeforeClass;

public class Problem1JUnitTest {

	private static char validInputChar[];
	private static char inValidInputChar[];

	@BeforeClass
	public static void init() {
		validInputChar = new char[] { 'h', 'e', 'l', 'l', 'o' };
		inValidInputChar = new char[] { 'h', '\t', 'l', 'l', 'o' };
	}

	@Test
	public void checkConstraints_whenValidString() {
		assertEquals(true, Problem1.checkConstraints(validInputChar));
	}

	@Test
	public void checkConstraints_whenInValidString() {
		assertEquals(false, Problem1.checkConstraints(inValidInputChar));
		assertEquals(false, Problem1.checkConstraints(new char[] {}));
	}

	@Test
	public void stringReverse_withValidString() {
		String actual = String.valueOf(Problem1.stringReverse(validInputChar));
		assertEquals("olleh", actual);
	}
}
