package ch03.setterinjection;

import ch03.ExtensionManager;
import ch03.FileExtensionManager;
import ch03.FileHelper;

public class LogAnalyzer {
	private ExtensionManager extensions;

	public LogAnalyzer() {
		extensions = new FileExtensionManager();
	}

	public void setExtensionManager(ExtensionManager extensions) {
		this.extensions = extensions;
	}

	public boolean isValidLogFileName(String fileName) {
		return extensions.isValid(fileName)
				&& FileHelper.basenameWithoutExtension(fileName).length() > 5;
	}
}
