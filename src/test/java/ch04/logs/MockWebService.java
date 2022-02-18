package ch04.logs;


public class MockWebService implements WebService {
	public String lastError;
	@Override
	public void logError(String message) {
		lastError = message;
	}
}
