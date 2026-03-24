package android.media.effect;

public abstract class FilterEffect extends android.media.effect.Effect {
    protected android.media.effect.EffectContext mEffectContext;
    private java.lang.String mName;
    protected FilterEffect(android.media.effect.EffectContext p0, java.lang.String p1) { super(); }
    public java.lang.String getName() { return null; }
    protected void beginGLEffect() {}
    protected void endGLEffect() {}
    protected android.filterfw.core.FilterContext getFilterContext() { return null; }
    protected android.filterfw.core.Frame frameFromTexture(int p0, int p1, int p2) { return null; }
}
