package android.media.effect;

public class EffectContext {
    android.filterfw.core.FilterContext mFilterContext;
    public static android.media.effect.EffectContext createWithCurrentGlContext() { return null; }
    public android.media.effect.EffectFactory getFactory() { return null; }
    public void release() {}
    final void assertValidGLState() {}
    final void saveGLState() {}
    final void restoreGLState() {}
}
