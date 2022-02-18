package mockito;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 10:32 PM
 */
public class $09_ArticleManagerTest {
    @Mock
    private ArticleCalculator calculator;
    @Mock
    private ArticleDatabase database;
    @Mock
    private UserProvider userProvider;

    private ArticleManager manager;

    @org.junit.jupiter.api.Test
    void testSomethingInJunit5(ArticleDatabase database) {
    }

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
}
