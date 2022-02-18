package mockito;

import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 10:42 PM
 */
public class $11_Stubbing_with_callbacks {
    public static void main(String[] args) {
        List mock = mock(List.class);

        when(mock.get(anyInt())).thenAnswer((Answer) invocation -> {        // 设置一个符合提交方法被调用后的回调
            Object[] args1 = invocation.getArguments();
            Object mock1 = invocation.getMock();
            return "called with arguments: " + Arrays.toString(args1);
        });

        //Following prints "called with arguments: [foo]"
        System.out.println(mock.get(78347));
    }
}
