package ch04.config;

import org.junit.Before;


public abstract class AbstractConfigTestCase {
	protected Configuration c;

	// 抽取公共部分，以重用
	@Before
	public void instantiateDefaultConfiguration() {
		c = new Configuration();
		c.processArguments(args());
	}

	// 特定场景中覆盖默认值
	protected String[] args() {
		return new String[] {};
	}
}