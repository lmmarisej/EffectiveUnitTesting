package ch03.constructorinjection.anotherpackage;

import ch03.ExtensionManager;
import ch03.constructorinjection.LogAnalyzer;
import org.junit.Assert;
import org.junit.Test;

import ch03.StubExtensionManager;

public class InstantiatingLogAnalyzerFromAnotherPackageTest {
	private class LogAnalyzerProxy extends LogAnalyzer {
		public LogAnalyzerProxy(ExtensionManager extensions) {
			super(extensions);
		}
	}

	@Test
	public void nameShorterThan6CharactersIsNotValidEvenWithSupportedExtension() {
		StubExtensionManager fake = new StubExtensionManager();
		fake.shouldExtensionsBeValid = true;

		LogAnalyzer log = new LogAnalyzerProxy(fake);

		Assert.assertFalse(log.isValidLogFileName("short.ext"));
	}
}
