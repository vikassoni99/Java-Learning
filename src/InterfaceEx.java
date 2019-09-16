//This program is an example of interface
interface Learning{
    void learn();
}

class C1 implements Learning{

    @Override
    public void learn() {
        System.out.println("Learning Kotlin");
    }
}
class C2 implements Learning{

    @Override
    public void learn() {
        System.out.println("Learning Android");
    }
}

public class InterfaceEx {
    public static void main(String []args)
    {
        C1 a = new C1();
        a.learn();

        C2 b = new C2();
        b.learn();
    }
}
