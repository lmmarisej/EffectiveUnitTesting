package mockito;

import static org.junit.Assert.assertEquals;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:52 PM
 */
public class $48_Mocking_static_methods {
    public static void main(String[] args) {
        assertEquals("foo", Foo.method());
//        try (MockedStatic mocked = mockStatic(Foo.class)) {
//            mocked.when(Foo::method).thenReturn("bar");
//            assertEquals("bar", Foo.method());
//            mocked.verify(Foo::method);
//        }
        assertEquals("foo", Foo.method());
    }


    static class Foo{
        public static String method() {
            return "";
        }
    }
}
