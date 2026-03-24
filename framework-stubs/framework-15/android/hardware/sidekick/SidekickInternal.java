package android.hardware.sidekick;

public abstract class SidekickInternal {
    public SidekickInternal() {}
    public abstract boolean reset();
    public abstract boolean startDisplayControl(int p0);
    public abstract void endDisplayControl();
}
