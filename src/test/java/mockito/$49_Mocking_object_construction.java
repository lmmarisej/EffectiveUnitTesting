package mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:53 PM
 */
public class $49_Mocking_object_construction {
    public static void main(String[] args) {
        assertEquals("foo", new Foo().method());
//        try (MockedConstruction mocked = mockConstruction(Foo.class)) {
//            Foo foo = new Foo();
//            when(foo.method()).thenReturn("bar");
//            assertEquals("bar", foo.method());
//            verify(foo).method();
//        }
        assertEquals("foo", new Foo().method());
    }

    static class Foo{

        public String method() {
            return null;
        }
    }
}
