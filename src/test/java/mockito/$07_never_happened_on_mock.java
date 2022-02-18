package mockito;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 10:15 PM
 */
public class $07_never_happened_on_mock {
    public static void main(String[] args) {
        List mockOne = mock(List.class);

        //using mocks - only mockOne is interacted
        mockOne.add("one");

        //ordinary verification
        verify(mockOne).add("one");

        //verify that method was never called on a mock
        verify(
                mockOne,        // 被验证的mock对象
                never()         // 验证规则
        ).add("two");           // 综合，永远没有调用add("two")方法
    }
}
