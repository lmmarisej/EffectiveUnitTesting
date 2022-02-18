package ch03.factoryclass;

import ch03.ExtensionManager;
import ch03.FileHelper;

public class LogAnalyzer {
	private ExtensionManager extensions;

	public LogAnalyzer() {
		this.extensions = ExtensionManagerFactory.create();
	}

	public boolean isValidLogFileName(String fileName) {
		return extensions.isValid(fileName)
				&& FileHelper.basenameWithoutExtension(fileName).length() > 5;
	}
}
