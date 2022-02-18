package mockito;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:25 PM
 */
public class $16_Real_partial_mocks {
    public static void main(String[] args) {
        //you can create partial mock with spy() method:
        List list = spy(new LinkedList());      // 模仿间谍，但是只指定部分真实方法被调用

        //you can enable partial mock capabilities selectively on mocks:
        Foo mock = mock(Foo.class);
        //Be sure the real implementation is 'safe'.
        //If real implementation throws exceptions or depends on specific state of the object then you're in trouble.
        when(mock.someMethod()).thenCallRealMethod();       // 当本方法被调用时，调用真实方法
        mock.someMethod();
    }

    class Foo {
        public Object someMethod() {
            System.out.println("鸡你太美");
            return "cxk";
        }
    }
}
