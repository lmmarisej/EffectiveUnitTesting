package mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:50 PM
 */
public class $37_Java_8_Custom_Answer_Support {
    public static void main(String[] args) {
        $29_BDD_style_verification.Dog mock = mock($29_BDD_style_verification.Dog.class);
        // answer by returning 12 every time
        doAnswer(invocation -> 12).when(mock).doSomething();

        // answer by using one of the parameters - converting into the right
        // type as your go - in this case, returning the length of the second string parameter
        // as the answer. This gets long-winded quickly, with casting of parameters.
//        doAnswer(invocation -> ((String)invocation.getArgument(1)).length())
//                .when(mock).doSomething(anyString(), anyString(), anyString());
    }
}
