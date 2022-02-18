package mockito;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 10:28 PM
 */
public class $08_Finding_redundant_invocations {
    public static void main(String[] args) {
        List mockedList = mock(List.class);

        //using mocks
        mockedList.add("one");
        mockedList.add("two");

        verify(mockedList).add("one");

        //following verification will fail
        verifyNoMoreInteractions(mockedList);       // 不准有任何对mockedList的调用
    }
}
