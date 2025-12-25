public class Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    public void set_marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    public int sum() {
        return mark1 + mark2 + mark3;
    }

    public double avg() {
        return sum() / 3.0;
    }
}