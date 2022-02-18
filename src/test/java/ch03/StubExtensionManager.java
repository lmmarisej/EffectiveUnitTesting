/**
 * 
 */
package ch03;


public class StubExtensionManager implements ExtensionManager {
	public boolean shouldExtensionsBeValid;

	public boolean isValid(String fileName) {
		return shouldExtensionsBeValid;
	}
}