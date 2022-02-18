package mockito;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:33 PM
 */
public class $22_Verification_with_timeout {
    public static void main(String[] args) {
        Ckx mock = spy(Ckx.class);
        //passes when someMethod() is called no later than within 100 ms
        //exits immediately when verification is satisfied (e.g. may not wait full 100 ms)
        mock.someMethod();
        mock.someMethod();
        verify(mock, timeout(1000)).someMethod();       // 限定方法调用超时
        //above is an alias to:
        verify(mock, timeout(1000).times(1)).someMethod();

        //passes as soon as someMethod() has been called 2 times under 100 ms
        verify(mock, timeout(1000).times(2)).someMethod();

        //equivalent: this also passes as soon as someMethod() has been called 2 times under 100 ms
        verify(mock, timeout(1000).atLeast(2)).someMethod();

    }

    static class Ckx {

        public void someMethod() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
