package android.view;

public abstract class InputEventSender {
    public InputEventSender(android.view.InputChannel p0, android.os.Looper p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void dispose() {}
    public void onInputEventFinished(int p0, boolean p1) {}
    public void onTimelineReported(int p0, long p1, long p2) {}
    public final boolean sendInputEvent(int p0, android.view.InputEvent p1) { return false; }
}
