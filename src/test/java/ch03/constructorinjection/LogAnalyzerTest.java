package ch03.constructorinjection;

import org.junit.Assert;
import org.junit.Test;

import ch03.StubExtensionManager;

public class LogAnalyzerTest {
	@Test
	public void nameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() {
		StubExtensionManager fake = new StubExtensionManager();
		fake.shouldExtensionsBeValid = true;

		LogAnalyzer log = new LogAnalyzer(fake);

		Assert.assertFalse(log.isValidLogFileName("short.ext"));
	}
}
