package OOPS;

class A {
    A() {
        System.out.println("in constructor of A");
    }
}

class B extends A {
    B() {
        System.out.println("in constructor of B");
    }
}

class C extends B {
    C() {
        System.out.println("in constructor of C");
    }
}

public class MulInherit {
    public static void main(String[] args) {
        // A o1 = new A();
        // B o2 = new B();
        // C o3 = new C();
    }
}
