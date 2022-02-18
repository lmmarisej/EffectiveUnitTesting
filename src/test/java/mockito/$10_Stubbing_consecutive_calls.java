package mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 10:36 PM
 */
public class $10_Stubbing_consecutive_calls {
    public static void main(String[] args) {
        List mock = mock(List.class);

        when(mock.get(1)).thenThrow(new RuntimeException()).thenReturn("foo");

        //First call: throws runtime exception:
        mock.add("some arg");

        //Second call: prints "foo"
        System.out.println(mock.get(1));

        //Any consecutive call: prints "foo" as well (last stubbing wins).
        System.out.println(mock.get(1));

        when(mock.get(1)).thenReturn("one", "two", "three");

        //All mock.someMethod("some arg") calls will return "two"
        when(mock.get(1)).thenReturn("one");
        when(mock.get(2)).thenReturn("two");
    }
}
