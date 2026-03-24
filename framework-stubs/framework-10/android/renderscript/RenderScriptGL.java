package android.renderscript;

public class RenderScriptGL extends android.renderscript.RenderScript {
    int mWidth;
    int mHeight;
    android.renderscript.RenderScriptGL.SurfaceConfig mSurfaceConfig;
    @android.annotation.UnsupportedAppUsage
    public RenderScriptGL(android.content.Context p0, android.renderscript.RenderScriptGL.SurfaceConfig p1) { super(null); }
    @android.annotation.UnsupportedAppUsage
    public void setSurface(android.view.SurfaceHolder p0, int p1, int p2) {}
    public void setSurfaceTexture(android.graphics.SurfaceTexture p0, int p1, int p2) {}
    public int getHeight() { return 0; }
    public int getWidth() { return 0; }
    public void pause() {}
    public void resume() {}
    @android.annotation.UnsupportedAppUsage
    public void bindRootScript(android.renderscript.Script p0) {}
    @android.annotation.UnsupportedAppUsage
    public void bindProgramStore(android.renderscript.ProgramStore p0) {}
    public void bindProgramFragment(android.renderscript.ProgramFragment p0) {}
    @android.annotation.UnsupportedAppUsage
    public void bindProgramRaster(android.renderscript.ProgramRaster p0) {}
    @android.annotation.UnsupportedAppUsage
    public void bindProgramVertex(android.renderscript.ProgramVertex p0) {}

    public static class SurfaceConfig {
        int mDepthMin;
        int mDepthPref;
        int mStencilMin;
        int mStencilPref;
        int mColorMin;
        int mColorPref;
        int mAlphaMin;
        int mAlphaPref;
        int mSamplesMin;
        int mSamplesPref;
        float mSamplesQ;
        @android.annotation.UnsupportedAppUsage
        public SurfaceConfig() {}
        public SurfaceConfig(android.renderscript.RenderScriptGL.SurfaceConfig p0) {}
        private void validateRange(int p0, int p1, int p2, int p3) {}
        public void setColor(int p0, int p1) {}
        public void setAlpha(int p0, int p1) {}
        @android.annotation.UnsupportedAppUsage
        public void setDepth(int p0, int p1) {}
        public void setSamples(int p0, int p1, float p2) {}
    }
}
