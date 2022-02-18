package ch03.factorymethod;

import ch03.ExtensionManager;
import ch03.FileExtensionManager;
import ch03.FileHelper;

public class LogAnalyzer {

	protected ExtensionManager getExtensionManager() {
		return new FileExtensionManager();
	}

	public boolean isValidLogFileName(String fileName) {
		return getExtensionManager().isValid(fileName)
				&& FileHelper.basenameWithoutExtension(fileName).length() > 5;
	}
}
