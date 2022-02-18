package mockito;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 8:55 PM
 */
public class $02_stubbing {
    public static void main(String[] args) {
        //You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);

        //stubbing
        // 定义接口的实现
        when(mockedList.get(0)).thenReturn("first");                // 谓词，定义调用mockedList.get(0)将返回first
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        //following prints "first"
        System.out.println(mockedList.get(0));

        //following throws runtime exception
        assert mockedList.get(1) instanceof RuntimeException;

        //following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));

        //Although it is possible to verify a stubbed invocation, usually it's just redundant
        //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
        //If your code doesn't care what get(0) returns, then it should not be stubbed.
        verify(mockedList).get(0);      // 验证mockedList的get(0)至少被调用过一次


    }
}
