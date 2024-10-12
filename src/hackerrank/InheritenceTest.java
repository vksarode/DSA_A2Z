package hackerrank;


interface A1 {
    public void fly();
}

class A1Impl implements  A1{

    @Override
    public void fly() {
        System.out.println("A1Impl");
    }
}

class A2Impl extends   A1Impl{

    @Override
    public void fly() {
        System.out.println("A2Impl");
    }
}
public class InheritenceTest {
    public static void main(String[] args) {

        A1  obj  = new A1Impl();

        obj.fly();

    }

}
