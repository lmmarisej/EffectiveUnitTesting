package mockito;

import org.mockito.ArgumentMatcher;

import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 8:59 PM
 */
public class $03_Argument_matchers {
    public static void main(String[] args) {
        List mockedList = mock(List.class);

        //stubbing using built-in anyInt() argument matcher
        when(mockedList.get(anyInt())).thenReturn("element");

        //stubbing using custom matcher (let's say isValid() returns your own matcher implementation):
        when(mockedList.contains(argThat(new ArgumentMatcher<>() {
            @Override
            public boolean matches(Object argument) {
                return false;
            }
        }))).thenReturn(true);

        //following prints "element"
        System.out.println(mockedList.get(999));

        //you can also verify using an argument matcher
        verify(mockedList).get(anyInt());

        //argument matchers can also be written as Java 8 Lambdas
        verify(mockedList).add(argThat(new ArgumentMatcher<>() {
            @Override
            public boolean matches(Object argument) {
                return false;
            }
        }));
    }
}
