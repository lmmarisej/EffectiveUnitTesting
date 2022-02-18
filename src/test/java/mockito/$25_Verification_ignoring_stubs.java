package mockito;

import org.mockito.InOrder;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:40 PM
 */
public class $25_Verification_ignoring_stubs {
    public static void main(String[] args) {

        Cxk mock = mock(Cxk.class);
        Cxk mockTwo = mock(Cxk.class);

        verify(mock).foo();
        verify(mockTwo).bar();

        //ignores all stubbed methods:
        verifyNoMoreInteractions(ignoreStubs(mock, mockTwo));

        //creates InOrder that will ignore stubbed
        InOrder inOrder = inOrder(ignoreStubs(mock, mockTwo));
        inOrder.verify(mock).foo();
        inOrder.verify(mockTwo).bar();
        inOrder.verifyNoMoreInteractions();
    }

    static class Cxk {
        public void foo() {
        }

        public void bar() {
        }
    }
}
