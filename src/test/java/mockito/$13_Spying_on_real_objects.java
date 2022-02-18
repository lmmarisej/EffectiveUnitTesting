package mockito;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 10:59 PM
 */
public class $13_Spying_on_real_objects {
    public static void main(String[] args) {
        List list = new LinkedList();
        List spy = spy(list);       // 间谍，调用mock方法时，会调用真实对象的方法

        //optionally, you can stub out some methods:
        when(spy.size()).thenReturn(100);       // 间谍可以修改真实方法

        //using the spy calls *real* methods
        spy.add("one");         // 间谍可以调用真实方法
        spy.add("two");

        //prints "one" - the first element of a list
        System.out.println(spy.get(0));

        //size() method was stubbed - 100 is printed
        System.out.println(spy.size());

        //optionally, you can verify
        verify(spy).add("one");
        verify(spy).add("two");

        //===========================

        List list1 = new LinkedList();
        List spy1 = spy(list1);

        //Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the list is yet empty)
        when(spy1.get(0)).thenReturn("foo");

        //You have to use doReturn() for stubbing
        doReturn("foo").when(spy1).get(0);
    }
}
