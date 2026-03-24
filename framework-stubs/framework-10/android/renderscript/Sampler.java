package android.renderscript;

public class Sampler extends android.renderscript.BaseObj {
    android.renderscript.Sampler.Value mMin;
    android.renderscript.Sampler.Value mMag;
    android.renderscript.Sampler.Value mWrapS;
    android.renderscript.Sampler.Value mWrapT;
    android.renderscript.Sampler.Value mWrapR;
    float mAniso;
    Sampler(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public android.renderscript.Sampler.Value getMinification() { return null; }
    public android.renderscript.Sampler.Value getMagnification() { return null; }
    public android.renderscript.Sampler.Value getWrapS() { return null; }
    public android.renderscript.Sampler.Value getWrapT() { return null; }
    public float getAnisotropy() { return 0.0f; }
    public static android.renderscript.Sampler CLAMP_NEAREST(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Sampler CLAMP_LINEAR(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Sampler CLAMP_LINEAR_MIP_LINEAR(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Sampler WRAP_NEAREST(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Sampler WRAP_LINEAR(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Sampler WRAP_LINEAR_MIP_LINEAR(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Sampler MIRRORED_REPEAT_NEAREST(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Sampler MIRRORED_REPEAT_LINEAR(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Sampler MIRRORED_REPEAT_LINEAR_MIP_LINEAR(android.renderscript.RenderScript p0) { return null; }

    public static enum Value {
        NEAREST,
        LINEAR,
        LINEAR_MIP_LINEAR,
        LINEAR_MIP_NEAREST,
        WRAP,
        CLAMP,
        MIRRORED_REPEAT;
        int mID;
        private Value() {}
    }

    public static class Builder {
        android.renderscript.RenderScript mRS;
        android.renderscript.Sampler.Value mMin;
        android.renderscript.Sampler.Value mMag;
        android.renderscript.Sampler.Value mWrapS;
        android.renderscript.Sampler.Value mWrapT;
        android.renderscript.Sampler.Value mWrapR;
        float mAniso;
        public Builder(android.renderscript.RenderScript p0) {}
        public void setMinification(android.renderscript.Sampler.Value p0) {}
        public void setMagnification(android.renderscript.Sampler.Value p0) {}
        public void setWrapS(android.renderscript.Sampler.Value p0) {}
        public void setWrapT(android.renderscript.Sampler.Value p0) {}
        public void setAnisotropy(float p0) {}
        public android.renderscript.Sampler create() { return null; }
    }
}
