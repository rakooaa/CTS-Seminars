package adapter;

public class ProgMain {
    public static void main(String[] args) {
        Pen penFav = new PenAdapter();
        Student student = new Student();
        student.getPen(penFav);
        student.write();

    }
}
