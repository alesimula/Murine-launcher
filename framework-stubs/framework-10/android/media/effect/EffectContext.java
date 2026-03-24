package android.media.effect;

public class EffectContext {
    private final int GL_STATE_FBO = 0;
    private final int GL_STATE_PROGRAM = 0;
    private final int GL_STATE_ARRAYBUFFER = 0;
    private final int GL_STATE_COUNT = 0;
    android.filterfw.core.FilterContext mFilterContext;
    private android.media.effect.EffectFactory mFactory;
    private int[] mOldState;
    public static android.media.effect.EffectContext createWithCurrentGlContext() { return null; }
    public android.media.effect.EffectFactory getFactory() { return null; }
    public void release() {}
    private EffectContext() {}
    private void initInCurrentGlContext() {}
    final void assertValidGLState() {}
    final void saveGLState() {}
    final void restoreGLState() {}
}
