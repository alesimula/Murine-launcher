package android.webkit;

public abstract class RenderProcessGoneDetail {
    @java.lang.Deprecated
    public RenderProcessGoneDetail() {}
    public abstract boolean didCrash();
    public abstract int rendererPriorityAtExit();
}
