package mockito;

import org.mockito.ArgumentCaptor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:17 PM
 */
public class $15_Capturing_arguments {
    public static void main(String[] args) {
        Person mock = spy(Person.class);
        ArgumentCaptor<Person> argument = ArgumentCaptor.forClass(Person.class);
        mock.doSomething(argument.capture());
        verify(mock).doSomething(argument.capture());
        assertEquals("John", argument.getValue().getName());
    }
}
