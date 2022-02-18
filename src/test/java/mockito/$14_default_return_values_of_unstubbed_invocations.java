package mockito;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:14 PM
 */
public class $14_default_return_values_of_unstubbed_invocations {
    public static void main(String[] args) {
        Object mock = mock(Object.class, Mockito.RETURNS_SMART_NULLS);
        Object mockTwo = mock(Object.class, "");
        System.out.println(mock);
        System.out.println(mockTwo);
    }
}
