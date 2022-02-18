package ch03.factoryclass;

import ch03.ExtensionManager;
import ch03.FileExtensionManager;

public class ExtensionManagerFactory {
	private static ExtensionManager customImplementation = null;
	
	public static ExtensionManager create() {
		if (customImplementation != null) {
			return customImplementation;
		}
		return new FileExtensionManager();
	}
	
	public static void setInstance(ExtensionManager implementation) {
		customImplementation = implementation;
	}
}