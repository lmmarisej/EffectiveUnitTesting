package mockito;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:38 PM
 */
public class $24_One_liner_stubs {
    public class CarTest {
        Car boringStubbedCar = when(mock(Car.class).shiftGear()).thenThrow(EngineNotStarted.class).getMock();

        @Test
        public void should() {
        }
    }
}
