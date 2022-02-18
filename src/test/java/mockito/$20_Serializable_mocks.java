package mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:32 PM
 */
public class $20_Serializable_mocks {
    public static void main(String[] args) {
        List serializableMock = mock(List.class, withSettings().serializable());

        List<Object> list = new ArrayList<>();
        List<Object> spy = mock(ArrayList.class, withSettings()
                .spiedInstance(list)
                .defaultAnswer(CALLS_REAL_METHODS)
                .serializable());
    }
}
