package adapter;

public class PenAdapter implements Pen{
    PilotPen p = new PilotPen();

    @Override
    public void erase() {
        p.erase();
    }
}
