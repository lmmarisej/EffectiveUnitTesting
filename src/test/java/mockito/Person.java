package mockito;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:17 PM
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doSomething(Person capture) {
        capture.setName("John");
        System.out.println("doSomething called, capture=" + capture);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
