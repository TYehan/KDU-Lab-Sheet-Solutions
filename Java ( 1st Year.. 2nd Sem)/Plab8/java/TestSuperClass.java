package plab.plab8;

public class TestSuperClass
{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.j = 17;
        s.i = s.j;
        s.printNum();
    }
}

