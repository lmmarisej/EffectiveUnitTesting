package mockito;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:27 PM
 */
public class $17_Resetting_mocks {
    public static void main(String[] args) {
        List mock = mock(List.class);
        when(mock.size()).thenReturn(10);
        mock.add(1);

        reset(mock);        // 重置伪造的对象
        //at this point the mock forgot any interactions and stubbing
    }
}
