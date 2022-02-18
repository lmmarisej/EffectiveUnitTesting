package mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 7:56 PM
 */
public class $01_ListMock {
    public static void main(String[] args) {
        //mock creation
        List mockedList2 = mock(List.class);

        //using mock object
        mockedList2.add("one");
        mockedList2.clear();

        //verification
        verify(mockedList2).add("one");
        verify(mockedList2).clear();
    }
}
