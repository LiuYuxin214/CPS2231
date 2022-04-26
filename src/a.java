public class a {
    public static void main(String[] args) {
        b asd= new c();
        c asd2= (c)asd;
    }
}

class b {
    b() {

    }

    void m() {
        System.out.println("b.m");
    }
}

class c extends b {
    c() {
    }

    void a() {
        m();
    }
}
