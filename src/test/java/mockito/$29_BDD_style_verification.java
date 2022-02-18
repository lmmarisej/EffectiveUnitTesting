package mockito;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:44 PM
 */
public class $29_BDD_style_verification {
    public static void main(String[] args) {
        Dog dog = mock(Dog.class);
        Person person = mock(Person.class);
        given(dog.bark()).willReturn(2);
        then(person).should(times(2)).ride(new Object());
    }

    static class Dog {

        public int bark() {
            return 2;
        }

        public void doSomething() {

        }
    }

    static class Person {

        public void ride(Object o) {
            System.out.println("ride");
        }
    }
}
