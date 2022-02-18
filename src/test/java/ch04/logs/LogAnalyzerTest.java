package ch04.logs;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogAnalyzerTest {
	@Test
	public void webServiceIsCalledWhenFilenameIsTooShort() throws Exception {
		MockWebService mockWebService = new MockWebService();
		LogAnalyzer log = new LogAnalyzer(mockWebService);
		String tooShort = "abc.ext";
		log.analyze(tooShort);
		assertEquals("Filename too short: abc.ext", mockWebService.lastError);
	}
}
