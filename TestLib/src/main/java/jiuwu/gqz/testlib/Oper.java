package jiuwu.gqz.testlib;

public class Oper {
    public Oper() {

    }

    public int sum(int a, int b) {
        return a + b;
    }

    public float ave(int a, int b) {
        return ((float) a + (float) b) / 2f;
    }

    public int kt_sum(int a, int b) {
        Utils u = new Utils();
        return u.sum(a, b);
    }

}
