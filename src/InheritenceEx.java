//This is an example of inheritence in java

class Learn{
    void learn(){
        System.out.println("Learning :");
    }
}

class Java extends Learn{
    void java(){
        System.out.println("Java");
    }
}

class Kotlin extends Java{
    void kotlin(){
        System.out.println("Kotlin");
    }
}

class Android extends Kotlin{
    void android(){
        System.out.println("Android");
    }
}

public class InheritenceEx {
    public static void main(String []args)
    {
        Android a = new Android();
        //java
        a.learn();
        a.java();
        //kotlin + android
        a.learn();
        a.kotlin();
        a.android();
    }
}
