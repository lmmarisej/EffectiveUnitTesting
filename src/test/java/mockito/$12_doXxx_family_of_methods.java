package mockito;

import java.util.List;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 10:52 PM
 */
public class $12_doXxx_family_of_methods {
    public static void main(String[] args) {
        List mockedList = mock(List.class);

        // You can use doThrow(), doAnswer(), doNothing(), doReturn() and doCallRealMethod() in place of the corresponding
        // call with when(), for any method. It is necessary when you
        doThrow(new RuntimeException()).when(mockedList).clear();

        //following throws RuntimeException:
        mockedList.clear();
    }
}
