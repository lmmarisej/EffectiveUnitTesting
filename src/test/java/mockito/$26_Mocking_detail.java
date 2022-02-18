package mockito;

import org.mockito.MockingDetails;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:43 PM
 */
public class $26_Mocking_detail {
    public static void main(String[] args) {
        $25_Verification_ignoring_stubs.Cxk someObject = mock($25_Verification_ignoring_stubs.Cxk.class);

        //To identify whether a particular object is a mock or a spy:
        mockingDetails(someObject).isMock();
        mockingDetails(someObject).isSpy();

        //Getting details like type to mock or default answer:
        MockingDetails details = mockingDetails(someObject);

        //Getting invocations and stubbings of the mock:
        MockingDetails details2 = mockingDetails(someObject);
        details2.getInvocations();

        //Printing all interactions (including stubbing, unused stubs)
    }
}
