package android.renderscript;

public class ProgramRaster extends android.renderscript.BaseObj {
    boolean mPointSprite;
    android.renderscript.ProgramRaster.CullMode mCullMode;
    ProgramRaster(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public boolean isPointSpriteEnabled() { return false; }
    public android.renderscript.ProgramRaster.CullMode getCullMode() { return null; }
    public static android.renderscript.ProgramRaster CULL_BACK(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramRaster CULL_FRONT(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramRaster CULL_NONE(android.renderscript.RenderScript p0) { return null; }

    public static class Builder {
        android.renderscript.RenderScript mRS;
        boolean mPointSprite;
        android.renderscript.ProgramRaster.CullMode mCullMode;
        public Builder(android.renderscript.RenderScript p0) {}
        public android.renderscript.ProgramRaster.Builder setPointSpriteEnabled(boolean p0) { return null; }
        public android.renderscript.ProgramRaster.Builder setCullMode(android.renderscript.ProgramRaster.CullMode p0) { return null; }
        public android.renderscript.ProgramRaster create() { return null; }
    }

    public static enum CullMode {
        BACK,
        FRONT,
        NONE;
        int mID;
        private CullMode() {}
    }
}
