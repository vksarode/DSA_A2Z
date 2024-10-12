package hackerrank;

interface A{
    public default void  dummy(){
        System.out.println("dummy");

    }

    public void walk();
}

interface B  extends  A{
    public void fly();
}

interface C extends  A {
    public void eat();
}

public class InterfaceTest  implements A,  B, C{

    @Override
    public void fly() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }
}
