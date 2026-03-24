package android.renderscript;

@java.lang.Deprecated
public class Program extends android.renderscript.BaseObj {
    static final int MAX_INPUT = 8;
    static final int MAX_OUTPUT = 8;
    static final int MAX_CONSTANT = 8;
    static final int MAX_TEXTURE = 8;
    android.renderscript.Element[] mInputs;
    android.renderscript.Element[] mOutputs;
    android.renderscript.Type[] mConstants;
    android.renderscript.Program.TextureType[] mTextures;
    java.lang.String[] mTextureNames;
    int mTextureCount;
    java.lang.String mShader;
    Program(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    public int getConstantCount() { return 0; }
    public android.renderscript.Type getConstant(int p0) { return null; }
    public int getTextureCount() { return 0; }
    public android.renderscript.Program.TextureType getTextureType(int p0) { return null; }
    public java.lang.String getTextureName(int p0) { return null; }
    public void bindConstants(android.renderscript.Allocation p0, int p1) {}
    public void bindTexture(android.renderscript.Allocation p0, int p1) throws java.lang.IllegalArgumentException {}
    public void bindSampler(android.renderscript.Sampler p0, int p1) throws java.lang.IllegalArgumentException {}

    public static class BaseProgramBuilder {
        android.renderscript.RenderScript mRS;
        android.renderscript.Element[] mInputs;
        android.renderscript.Element[] mOutputs;
        android.renderscript.Type[] mConstants;
        android.renderscript.Type[] mTextures;
        android.renderscript.Program.TextureType[] mTextureTypes;
        java.lang.String[] mTextureNames;
        int mInputCount;
        int mOutputCount;
        int mConstantCount;
        int mTextureCount;
        java.lang.String mShader;
        protected BaseProgramBuilder(android.renderscript.RenderScript p0) {}
        public android.renderscript.Program.BaseProgramBuilder setShader(java.lang.String p0) { return null; }
        public android.renderscript.Program.BaseProgramBuilder setShader(android.content.res.Resources p0, int p1) { return null; }
        public int getCurrentConstantIndex() { return 0; }
        public int getCurrentTextureIndex() { return 0; }
        public android.renderscript.Program.BaseProgramBuilder addConstant(android.renderscript.Type p0) throws java.lang.IllegalStateException { return null; }
        public android.renderscript.Program.BaseProgramBuilder addTexture(android.renderscript.Program.TextureType p0) throws java.lang.IllegalArgumentException { return null; }
        public android.renderscript.Program.BaseProgramBuilder addTexture(android.renderscript.Program.TextureType p0, java.lang.String p1) throws java.lang.IllegalArgumentException { return null; }
        protected void initProgram(android.renderscript.Program p0) {}
    }

    static enum ProgramParam {
        INPUT,
        OUTPUT,
        CONSTANT,
        TEXTURE_TYPE;
        int mID;
    }

    public static enum TextureType {
        TEXTURE_2D,
        TEXTURE_CUBE;
        int mID;
    }
}
