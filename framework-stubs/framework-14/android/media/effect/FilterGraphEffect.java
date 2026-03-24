package android.media.effect;

public class FilterGraphEffect extends android.media.effect.FilterEffect {
    protected java.lang.String mInputName;
    protected java.lang.String mOutputName;
    protected android.filterfw.core.GraphRunner mRunner;
    protected android.filterfw.core.FilterGraph mGraph;
    protected java.lang.Class mSchedulerClass;
    public FilterGraphEffect(android.media.effect.EffectContext p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Class p5) { super(null, null); }
    public void apply(int p0, int p1, int p2, int p3) {}
    public void setParameter(java.lang.String p0, java.lang.Object p1) {}
    public void release() {}
}
