package android.renderscript;

public class ProgramFragmentFixedFunction extends android.renderscript.ProgramFragment {
    ProgramFragmentFixedFunction(long p0, android.renderscript.RenderScript p1) { super(0L, null); }

    static class InternalBuilder extends android.renderscript.Program.BaseProgramBuilder {
        public InternalBuilder(android.renderscript.RenderScript p0) { super(null); }
        public android.renderscript.ProgramFragmentFixedFunction create() { return null; }
    }

    public static class Builder {
        public static final int MAX_TEXTURE = 2;
        int mNumTextures;
        boolean mPointSpriteEnable;
        boolean mVaryingColorEnable;
        java.lang.String mShader;
        android.renderscript.RenderScript mRS;
        android.renderscript.ProgramFragmentFixedFunction.Builder.Slot[] mSlots;
        private void buildShaderString() {}
        @android.annotation.UnsupportedAppUsage
        public Builder(android.renderscript.RenderScript p0) {}
        @android.annotation.UnsupportedAppUsage
        public android.renderscript.ProgramFragmentFixedFunction.Builder setTexture(android.renderscript.ProgramFragmentFixedFunction.Builder.EnvMode p0, android.renderscript.ProgramFragmentFixedFunction.Builder.Format p1, int p2) throws java.lang.IllegalArgumentException { return null; }
        public android.renderscript.ProgramFragmentFixedFunction.Builder setPointSpriteTexCoordinateReplacement(boolean p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.renderscript.ProgramFragmentFixedFunction.Builder setVaryingColor(boolean p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.renderscript.ProgramFragmentFixedFunction create() { return null; }

        private class Slot {
            android.renderscript.ProgramFragmentFixedFunction.Builder.EnvMode env;
            android.renderscript.ProgramFragmentFixedFunction.Builder.Format format;
            Slot(android.renderscript.ProgramFragmentFixedFunction.Builder p0, android.renderscript.ProgramFragmentFixedFunction.Builder.EnvMode p1, android.renderscript.ProgramFragmentFixedFunction.Builder.Format p2) {}
        }

        public static enum Format {
            ALPHA,
            LUMINANCE_ALPHA,
            RGB,
            RGBA;
            int mID;
            private Format() {}
        }

        public static enum EnvMode {
            REPLACE,
            MODULATE,
            DECAL;
            int mID;
            private EnvMode() {}
        }
    }
}
