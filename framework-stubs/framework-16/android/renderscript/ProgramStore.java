package android.renderscript;

@java.lang.Deprecated
public class ProgramStore extends android.renderscript.BaseObj {
    android.renderscript.ProgramStore.DepthFunc mDepthFunc;
    boolean mDepthMask;
    boolean mColorMaskR;
    boolean mColorMaskG;
    boolean mColorMaskB;
    boolean mColorMaskA;
    android.renderscript.ProgramStore.BlendSrcFunc mBlendSrc;
    android.renderscript.ProgramStore.BlendDstFunc mBlendDst;
    boolean mDither;
    ProgramStore(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public android.renderscript.ProgramStore.DepthFunc getDepthFunc() { return null; }
    public boolean isDepthMaskEnabled() { return false; }
    public boolean isColorMaskRedEnabled() { return false; }
    public boolean isColorMaskGreenEnabled() { return false; }
    public boolean isColorMaskBlueEnabled() { return false; }
    public boolean isColorMaskAlphaEnabled() { return false; }
    public android.renderscript.ProgramStore.BlendSrcFunc getBlendSrcFunc() { return null; }
    public android.renderscript.ProgramStore.BlendDstFunc getBlendDstFunc() { return null; }
    public boolean isDitherEnabled() { return false; }
    public static android.renderscript.ProgramStore BLEND_NONE_DEPTH_TEST(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramStore BLEND_NONE_DEPTH_NONE(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramStore BLEND_ALPHA_DEPTH_TEST(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.ProgramStore BLEND_ALPHA_DEPTH_NONE(android.renderscript.RenderScript p0) { return null; }

    public static enum BlendDstFunc {
        ZERO,
        ONE,
        SRC_COLOR,
        ONE_MINUS_SRC_COLOR,
        SRC_ALPHA,
        ONE_MINUS_SRC_ALPHA,
        DST_ALPHA,
        ONE_MINUS_DST_ALPHA;
        int mID;
    }

    public static enum BlendSrcFunc {
        ZERO,
        ONE,
        DST_COLOR,
        ONE_MINUS_DST_COLOR,
        SRC_ALPHA,
        ONE_MINUS_SRC_ALPHA,
        DST_ALPHA,
        ONE_MINUS_DST_ALPHA,
        SRC_ALPHA_SATURATE;
        int mID;
    }

    public static class Builder {
        android.renderscript.RenderScript mRS;
        android.renderscript.ProgramStore.DepthFunc mDepthFunc;
        boolean mDepthMask;
        boolean mColorMaskR;
        boolean mColorMaskG;
        boolean mColorMaskB;
        boolean mColorMaskA;
        android.renderscript.ProgramStore.BlendSrcFunc mBlendSrc;
        android.renderscript.ProgramStore.BlendDstFunc mBlendDst;
        boolean mDither;
        public Builder(android.renderscript.RenderScript p0) {}
        public android.renderscript.ProgramStore.Builder setDepthFunc(android.renderscript.ProgramStore.DepthFunc p0) { return null; }
        public android.renderscript.ProgramStore.Builder setDepthMaskEnabled(boolean p0) { return null; }
        public android.renderscript.ProgramStore.Builder setColorMaskEnabled(boolean p0, boolean p1, boolean p2, boolean p3) { return null; }
        public android.renderscript.ProgramStore.Builder setBlendFunc(android.renderscript.ProgramStore.BlendSrcFunc p0, android.renderscript.ProgramStore.BlendDstFunc p1) { return null; }
        public android.renderscript.ProgramStore.Builder setDitherEnabled(boolean p0) { return null; }
        public android.renderscript.ProgramStore create() { return null; }
    }

    public static enum DepthFunc {
        ALWAYS,
        LESS,
        LESS_OR_EQUAL,
        GREATER,
        GREATER_OR_EQUAL,
        EQUAL,
        NOT_EQUAL;
        int mID;
    }
}
