package mockito;

import java.util.List;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 9:45 PM
 */
public class $05_exceptions {
    public static void main(String[] args) {

        List mockedList = mock(List.class);

        doThrow(new RuntimeException()).when(mockedList).clear();

        //following throws RuntimeException:
        mockedList.clear();
    }
}
