package cg_assignment;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Problem4JUnitTest {

	static String textWithChristmas;
	static String textWithOutChristmas;
	static String noFile;

	@BeforeClass
	public static void init() {
		textWithChristmas = "C:\\Users\\nithe\\workspace\\JavaPractice\\src\\cg_assignment\\data.txt";
		textWithOutChristmas = "C:\\Users\\nithe\\workspace\\JavaPractice\\src\\cg_assignment\\data2.txt";
		noFile = "";
	}

	@Test
	public void checkConstraints_withWord() {
		assertEquals("Keyword \"Christmas\" exists in the given file", Problem4.checkChristmas(textWithChristmas));
	}

	@Test
	public void checkConstraints_withoutWord() {
		assertEquals("Keyword \"Christmas\" does not exists in the given file",
				Problem4.checkChristmas(textWithOutChristmas));
	}

	@Test
	public void checkConstraints_withoutFile() {
		assertEquals("Exception Occured", Problem4.checkChristmas(noFile));
	}
}
