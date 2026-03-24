package android.opengl;

class GLLogWrapper extends android.opengl.GLWrapperBase {
    private static final int FORMAT_INT = 0;
    private static final int FORMAT_FLOAT = 1;
    private static final int FORMAT_FIXED = 2;
    private java.io.Writer mLog;
    private boolean mLogArgumentNames;
    private int mArgCount;
    private android.opengl.GLLogWrapper.PointerInfo mColorPointer;
    private android.opengl.GLLogWrapper.PointerInfo mNormalPointer;
    private android.opengl.GLLogWrapper.PointerInfo mTexCoordPointer;
    private android.opengl.GLLogWrapper.PointerInfo mVertexPointer;
    boolean mColorArrayEnabled;
    boolean mNormalArrayEnabled;
    boolean mTextureCoordArrayEnabled;
    boolean mVertexArrayEnabled;
    java.lang.StringBuilder mStringBuilder;
    public GLLogWrapper(javax.microedition.khronos.opengles.GL p0, java.io.Writer p1, boolean p2) { super(null); }
    private void checkError() {}
    private void logLine(java.lang.String p0) {}
    private void log(java.lang.String p0) {}
    private void begin(java.lang.String p0) {}
    private void arg(java.lang.String p0, java.lang.String p1) {}
    private void end() {}
    private void flush() {}
    private void arg(java.lang.String p0, boolean p1) {}
    private void arg(java.lang.String p0, int p1) {}
    private void arg(java.lang.String p0, float p1) {}
    private void returns(java.lang.String p0) {}
    private void returns(int p0) {}
    private void arg(java.lang.String p0, int p1, int[] p2, int p3) {}
    private void arg(java.lang.String p0, int p1, short[] p2, int p3) {}
    private void arg(java.lang.String p0, int p1, float[] p2, int p3) {}
    private void formattedAppend(java.lang.StringBuilder p0, int p1, int p2) {}
    private java.lang.String toString(int p0, int p1, int[] p2, int p3) { return null; }
    private java.lang.String toString(int p0, short[] p1, int p2) { return null; }
    private java.lang.String toString(int p0, float[] p1, int p2) { return null; }
    private java.lang.String toString(int p0, java.nio.FloatBuffer p1) { return null; }
    private java.lang.String toString(int p0, int p1, java.nio.IntBuffer p2) { return null; }
    private java.lang.String toString(int p0, java.nio.ShortBuffer p1) { return null; }
    private void arg(java.lang.String p0, int p1, java.nio.FloatBuffer p2) {}
    private void arg(java.lang.String p0, int p1, java.nio.IntBuffer p2) {}
    private void arg(java.lang.String p0, int p1, java.nio.ShortBuffer p2) {}
    private void argPointer(int p0, int p1, int p2, java.nio.Buffer p3) {}
    private static java.lang.String getHex(int p0) { return null; }
    public static java.lang.String getErrorString(int p0) { return null; }
    private java.lang.String getClearBufferMask(int p0) { return null; }
    private java.lang.String getFactor(int p0) { return null; }
    private java.lang.String getShadeModel(int p0) { return null; }
    private java.lang.String getTextureTarget(int p0) { return null; }
    private java.lang.String getTextureEnvTarget(int p0) { return null; }
    private java.lang.String getTextureEnvPName(int p0) { return null; }
    private int getTextureEnvParamCount(int p0) { return 0; }
    private java.lang.String getTextureEnvParamName(float p0) { return null; }
    private java.lang.String getMatrixMode(int p0) { return null; }
    private java.lang.String getClientState(int p0) { return null; }
    private java.lang.String getCap(int p0) { return null; }
    private java.lang.String getTexturePName(int p0) { return null; }
    private java.lang.String getTextureParamName(float p0) { return null; }
    private java.lang.String getFogPName(int p0) { return null; }
    private int getFogParamCount(int p0) { return 0; }
    private java.lang.String getBeginMode(int p0) { return null; }
    private java.lang.String getIndexType(int p0) { return null; }
    private java.lang.String getIntegerStateName(int p0) { return null; }
    private int getIntegerStateSize(int p0) { return 0; }
    private int getIntegerStateFormat(int p0) { return 0; }
    private java.lang.String getHintTarget(int p0) { return null; }
    private java.lang.String getHintMode(int p0) { return null; }
    private java.lang.String getFaceName(int p0) { return null; }
    private java.lang.String getMaterialPName(int p0) { return null; }
    private int getMaterialParamCount(int p0) { return 0; }
    private java.lang.String getLightName(int p0) { return null; }
    private java.lang.String getLightPName(int p0) { return null; }
    private int getLightParamCount(int p0) { return 0; }
    private java.lang.String getLightModelPName(int p0) { return null; }
    private int getLightModelParamCount(int p0) { return 0; }
    private java.lang.String getPointerTypeName(int p0) { return null; }
    private java.nio.ByteBuffer toByteBuffer(int p0, java.nio.Buffer p1) { return null; }
    private char[] toCharIndices(int p0, int p1, java.nio.Buffer p2) { return null; }
    private void doArrayElement(java.lang.StringBuilder p0, boolean p1, java.lang.String p2, android.opengl.GLLogWrapper.PointerInfo p3, int p4) {}
    private void doElement(java.lang.StringBuilder p0, int p1, int p2) {}
    private void bindArrays() {}
    private void unbindArrays() {}
    private void startLogIndices() {}
    private void endLogIndices() {}
    public void glActiveTexture(int p0) {}
    public void glAlphaFunc(int p0, float p1) {}
    public void glAlphaFuncx(int p0, int p1) {}
    public void glBindTexture(int p0, int p1) {}
    public void glBlendFunc(int p0, int p1) {}
    public void glClear(int p0) {}
    public void glClearColor(float p0, float p1, float p2, float p3) {}
    public void glClearColorx(int p0, int p1, int p2, int p3) {}
    public void glClearDepthf(float p0) {}
    public void glClearDepthx(int p0) {}
    public void glClearStencil(int p0) {}
    public void glClientActiveTexture(int p0) {}
    public void glColor4f(float p0, float p1, float p2, float p3) {}
    public void glColor4x(int p0, int p1, int p2, int p3) {}
    public void glColorMask(boolean p0, boolean p1, boolean p2, boolean p3) {}
    public void glColorPointer(int p0, int p1, int p2, java.nio.Buffer p3) {}
    public void glCompressedTexImage2D(int p0, int p1, int p2, int p3, int p4, int p5, int p6, java.nio.Buffer p7) {}
    public void glCompressedTexSubImage2D(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.nio.Buffer p8) {}
    public void glCopyTexImage2D(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public void glCopyTexSubImage2D(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) {}
    public void glCullFace(int p0) {}
    public void glDeleteTextures(int p0, int[] p1, int p2) {}
    public void glDeleteTextures(int p0, java.nio.IntBuffer p1) {}
    public void glDepthFunc(int p0) {}
    public void glDepthMask(boolean p0) {}
    public void glDepthRangef(float p0, float p1) {}
    public void glDepthRangex(int p0, int p1) {}
    public void glDisable(int p0) {}
    public void glDisableClientState(int p0) {}
    public void glDrawArrays(int p0, int p1, int p2) {}
    public void glDrawElements(int p0, int p1, int p2, java.nio.Buffer p3) {}
    public void glEnable(int p0) {}
    public void glEnableClientState(int p0) {}
    public void glFinish() {}
    public void glFlush() {}
    public void glFogf(int p0, float p1) {}
    public void glFogfv(int p0, float[] p1, int p2) {}
    public void glFogfv(int p0, java.nio.FloatBuffer p1) {}
    public void glFogx(int p0, int p1) {}
    public void glFogxv(int p0, int[] p1, int p2) {}
    public void glFogxv(int p0, java.nio.IntBuffer p1) {}
    public void glFrontFace(int p0) {}
    public void glFrustumf(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void glFrustumx(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void glGenTextures(int p0, int[] p1, int p2) {}
    public void glGenTextures(int p0, java.nio.IntBuffer p1) {}
    public int glGetError() { return 0; }
    public void glGetIntegerv(int p0, int[] p1, int p2) {}
    public void glGetIntegerv(int p0, java.nio.IntBuffer p1) {}
    public java.lang.String glGetString(int p0) { return null; }
    public void glHint(int p0, int p1) {}
    public void glLightModelf(int p0, float p1) {}
    public void glLightModelfv(int p0, float[] p1, int p2) {}
    public void glLightModelfv(int p0, java.nio.FloatBuffer p1) {}
    public void glLightModelx(int p0, int p1) {}
    public void glLightModelxv(int p0, int[] p1, int p2) {}
    public void glLightModelxv(int p0, java.nio.IntBuffer p1) {}
    public void glLightf(int p0, int p1, float p2) {}
    public void glLightfv(int p0, int p1, float[] p2, int p3) {}
    public void glLightfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glLightx(int p0, int p1, int p2) {}
    public void glLightxv(int p0, int p1, int[] p2, int p3) {}
    public void glLightxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glLineWidth(float p0) {}
    public void glLineWidthx(int p0) {}
    public void glLoadIdentity() {}
    public void glLoadMatrixf(float[] p0, int p1) {}
    public void glLoadMatrixf(java.nio.FloatBuffer p0) {}
    public void glLoadMatrixx(int[] p0, int p1) {}
    public void glLoadMatrixx(java.nio.IntBuffer p0) {}
    public void glLogicOp(int p0) {}
    public void glMaterialf(int p0, int p1, float p2) {}
    public void glMaterialfv(int p0, int p1, float[] p2, int p3) {}
    public void glMaterialfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glMaterialx(int p0, int p1, int p2) {}
    public void glMaterialxv(int p0, int p1, int[] p2, int p3) {}
    public void glMaterialxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glMatrixMode(int p0) {}
    public void glMultMatrixf(float[] p0, int p1) {}
    public void glMultMatrixf(java.nio.FloatBuffer p0) {}
    public void glMultMatrixx(int[] p0, int p1) {}
    public void glMultMatrixx(java.nio.IntBuffer p0) {}
    public void glMultiTexCoord4f(int p0, float p1, float p2, float p3, float p4) {}
    public void glMultiTexCoord4x(int p0, int p1, int p2, int p3, int p4) {}
    public void glNormal3f(float p0, float p1, float p2) {}
    public void glNormal3x(int p0, int p1, int p2) {}
    public void glNormalPointer(int p0, int p1, java.nio.Buffer p2) {}
    public void glOrthof(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void glOrthox(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void glPixelStorei(int p0, int p1) {}
    public void glPointSize(float p0) {}
    public void glPointSizex(int p0) {}
    public void glPolygonOffset(float p0, float p1) {}
    public void glPolygonOffsetx(int p0, int p1) {}
    public void glPopMatrix() {}
    public void glPushMatrix() {}
    public void glReadPixels(int p0, int p1, int p2, int p3, int p4, int p5, java.nio.Buffer p6) {}
    public void glRotatef(float p0, float p1, float p2, float p3) {}
    public void glRotatex(int p0, int p1, int p2, int p3) {}
    public void glSampleCoverage(float p0, boolean p1) {}
    public void glSampleCoveragex(int p0, boolean p1) {}
    public void glScalef(float p0, float p1, float p2) {}
    public void glScalex(int p0, int p1, int p2) {}
    public void glScissor(int p0, int p1, int p2, int p3) {}
    public void glShadeModel(int p0) {}
    public void glStencilFunc(int p0, int p1, int p2) {}
    public void glStencilMask(int p0) {}
    public void glStencilOp(int p0, int p1, int p2) {}
    public void glTexCoordPointer(int p0, int p1, int p2, java.nio.Buffer p3) {}
    public void glTexEnvf(int p0, int p1, float p2) {}
    public void glTexEnvfv(int p0, int p1, float[] p2, int p3) {}
    public void glTexEnvfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glTexEnvx(int p0, int p1, int p2) {}
    public void glTexEnvxv(int p0, int p1, int[] p2, int p3) {}
    public void glTexEnvxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glTexImage2D(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.nio.Buffer p8) {}
    public void glTexParameterf(int p0, int p1, float p2) {}
    public void glTexParameterx(int p0, int p1, int p2) {}
    public void glTexParameteriv(int p0, int p1, int[] p2, int p3) {}
    public void glTexParameteriv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glTexSubImage2D(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.nio.Buffer p8) {}
    public void glTranslatef(float p0, float p1, float p2) {}
    public void glTranslatex(int p0, int p1, int p2) {}
    public void glVertexPointer(int p0, int p1, int p2, java.nio.Buffer p3) {}
    public void glViewport(int p0, int p1, int p2, int p3) {}
    public void glClipPlanef(int p0, float[] p1, int p2) {}
    public void glClipPlanef(int p0, java.nio.FloatBuffer p1) {}
    public void glClipPlanex(int p0, int[] p1, int p2) {}
    public void glClipPlanex(int p0, java.nio.IntBuffer p1) {}
    public void glDrawTexfOES(float p0, float p1, float p2, float p3, float p4) {}
    public void glDrawTexfvOES(float[] p0, int p1) {}
    public void glDrawTexfvOES(java.nio.FloatBuffer p0) {}
    public void glDrawTexiOES(int p0, int p1, int p2, int p3, int p4) {}
    public void glDrawTexivOES(int[] p0, int p1) {}
    public void glDrawTexivOES(java.nio.IntBuffer p0) {}
    public void glDrawTexsOES(short p0, short p1, short p2, short p3, short p4) {}
    public void glDrawTexsvOES(short[] p0, int p1) {}
    public void glDrawTexsvOES(java.nio.ShortBuffer p0) {}
    public void glDrawTexxOES(int p0, int p1, int p2, int p3, int p4) {}
    public void glDrawTexxvOES(int[] p0, int p1) {}
    public void glDrawTexxvOES(java.nio.IntBuffer p0) {}
    public int glQueryMatrixxOES(int[] p0, int p1, int[] p2, int p3) { return 0; }
    public int glQueryMatrixxOES(java.nio.IntBuffer p0, java.nio.IntBuffer p1) { return 0; }
    public void glBindBuffer(int p0, int p1) {}
    public void glBufferData(int p0, int p1, java.nio.Buffer p2, int p3) {}
    public void glBufferSubData(int p0, int p1, int p2, java.nio.Buffer p3) {}
    public void glColor4ub(byte p0, byte p1, byte p2, byte p3) {}
    public void glDeleteBuffers(int p0, int[] p1, int p2) {}
    public void glDeleteBuffers(int p0, java.nio.IntBuffer p1) {}
    public void glGenBuffers(int p0, int[] p1, int p2) {}
    public void glGenBuffers(int p0, java.nio.IntBuffer p1) {}
    public void glGetBooleanv(int p0, boolean[] p1, int p2) {}
    public void glGetBooleanv(int p0, java.nio.IntBuffer p1) {}
    public void glGetBufferParameteriv(int p0, int p1, int[] p2, int p3) {}
    public void glGetBufferParameteriv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glGetClipPlanef(int p0, float[] p1, int p2) {}
    public void glGetClipPlanef(int p0, java.nio.FloatBuffer p1) {}
    public void glGetClipPlanex(int p0, int[] p1, int p2) {}
    public void glGetClipPlanex(int p0, java.nio.IntBuffer p1) {}
    public void glGetFixedv(int p0, int[] p1, int p2) {}
    public void glGetFixedv(int p0, java.nio.IntBuffer p1) {}
    public void glGetFloatv(int p0, float[] p1, int p2) {}
    public void glGetFloatv(int p0, java.nio.FloatBuffer p1) {}
    public void glGetLightfv(int p0, int p1, float[] p2, int p3) {}
    public void glGetLightfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glGetLightxv(int p0, int p1, int[] p2, int p3) {}
    public void glGetLightxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glGetMaterialfv(int p0, int p1, float[] p2, int p3) {}
    public void glGetMaterialfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glGetMaterialxv(int p0, int p1, int[] p2, int p3) {}
    public void glGetMaterialxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glGetTexEnviv(int p0, int p1, int[] p2, int p3) {}
    public void glGetTexEnviv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glGetTexEnvxv(int p0, int p1, int[] p2, int p3) {}
    public void glGetTexEnvxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glGetTexParameterfv(int p0, int p1, float[] p2, int p3) {}
    public void glGetTexParameterfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glGetTexParameteriv(int p0, int p1, int[] p2, int p3) {}
    public void glGetTexParameteriv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glGetTexParameterxv(int p0, int p1, int[] p2, int p3) {}
    public void glGetTexParameterxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public boolean glIsBuffer(int p0) { return false; }
    public boolean glIsEnabled(int p0) { return false; }
    public boolean glIsTexture(int p0) { return false; }
    public void glPointParameterf(int p0, float p1) {}
    public void glPointParameterfv(int p0, float[] p1, int p2) {}
    public void glPointParameterfv(int p0, java.nio.FloatBuffer p1) {}
    public void glPointParameterx(int p0, int p1) {}
    public void glPointParameterxv(int p0, int[] p1, int p2) {}
    public void glPointParameterxv(int p0, java.nio.IntBuffer p1) {}
    public void glPointSizePointerOES(int p0, int p1, java.nio.Buffer p2) {}
    public void glTexEnvi(int p0, int p1, int p2) {}
    public void glTexEnviv(int p0, int p1, int[] p2, int p3) {}
    public void glTexEnviv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glTexParameterfv(int p0, int p1, float[] p2, int p3) {}
    public void glTexParameterfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glTexParameteri(int p0, int p1, int p2) {}
    public void glTexParameterxv(int p0, int p1, int[] p2, int p3) {}
    public void glTexParameterxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glColorPointer(int p0, int p1, int p2, int p3) {}
    public void glDrawElements(int p0, int p1, int p2, int p3) {}
    public void glGetPointerv(int p0, java.nio.Buffer[] p1) {}
    public void glNormalPointer(int p0, int p1, int p2) {}
    public void glTexCoordPointer(int p0, int p1, int p2, int p3) {}
    public void glVertexPointer(int p0, int p1, int p2, int p3) {}
    public void glCurrentPaletteMatrixOES(int p0) {}
    public void glLoadPaletteFromModelViewMatrixOES() {}
    public void glMatrixIndexPointerOES(int p0, int p1, int p2, java.nio.Buffer p3) {}
    public void glMatrixIndexPointerOES(int p0, int p1, int p2, int p3) {}
    public void glWeightPointerOES(int p0, int p1, int p2, java.nio.Buffer p3) {}
    public void glWeightPointerOES(int p0, int p1, int p2, int p3) {}
    public void glBindFramebufferOES(int p0, int p1) {}
    public void glBindRenderbufferOES(int p0, int p1) {}
    public void glBlendEquation(int p0) {}
    public void glBlendEquationSeparate(int p0, int p1) {}
    public void glBlendFuncSeparate(int p0, int p1, int p2, int p3) {}
    public int glCheckFramebufferStatusOES(int p0) { return 0; }
    public void glDeleteFramebuffersOES(int p0, int[] p1, int p2) {}
    public void glDeleteFramebuffersOES(int p0, java.nio.IntBuffer p1) {}
    public void glDeleteRenderbuffersOES(int p0, int[] p1, int p2) {}
    public void glDeleteRenderbuffersOES(int p0, java.nio.IntBuffer p1) {}
    public void glFramebufferRenderbufferOES(int p0, int p1, int p2, int p3) {}
    public void glFramebufferTexture2DOES(int p0, int p1, int p2, int p3, int p4) {}
    public void glGenerateMipmapOES(int p0) {}
    public void glGenFramebuffersOES(int p0, int[] p1, int p2) {}
    public void glGenFramebuffersOES(int p0, java.nio.IntBuffer p1) {}
    public void glGenRenderbuffersOES(int p0, int[] p1, int p2) {}
    public void glGenRenderbuffersOES(int p0, java.nio.IntBuffer p1) {}
    public void glGetFramebufferAttachmentParameterivOES(int p0, int p1, int p2, int[] p3, int p4) {}
    public void glGetFramebufferAttachmentParameterivOES(int p0, int p1, int p2, java.nio.IntBuffer p3) {}
    public void glGetRenderbufferParameterivOES(int p0, int p1, int[] p2, int p3) {}
    public void glGetRenderbufferParameterivOES(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glGetTexGenfv(int p0, int p1, float[] p2, int p3) {}
    public void glGetTexGenfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glGetTexGeniv(int p0, int p1, int[] p2, int p3) {}
    public void glGetTexGeniv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glGetTexGenxv(int p0, int p1, int[] p2, int p3) {}
    public void glGetTexGenxv(int p0, int p1, java.nio.IntBuffer p2) {}
    public boolean glIsFramebufferOES(int p0) { return false; }
    public boolean glIsRenderbufferOES(int p0) { return false; }
    public void glRenderbufferStorageOES(int p0, int p1, int p2, int p3) {}
    public void glTexGenf(int p0, int p1, float p2) {}
    public void glTexGenfv(int p0, int p1, float[] p2, int p3) {}
    public void glTexGenfv(int p0, int p1, java.nio.FloatBuffer p2) {}
    public void glTexGeni(int p0, int p1, int p2) {}
    public void glTexGeniv(int p0, int p1, int[] p2, int p3) {}
    public void glTexGeniv(int p0, int p1, java.nio.IntBuffer p2) {}
    public void glTexGenx(int p0, int p1, int p2) {}
    public void glTexGenxv(int p0, int p1, int[] p2, int p3) {}
    public void glTexGenxv(int p0, int p1, java.nio.IntBuffer p2) {}

    private class PointerInfo {
        public int mSize;
        public int mType;
        public int mStride;
        public java.nio.Buffer mPointer;
        public java.nio.ByteBuffer mTempByteBuffer;
        public PointerInfo(android.opengl.GLLogWrapper p0) {}
        public PointerInfo(android.opengl.GLLogWrapper p0, int p1, int p2, int p3, java.nio.Buffer p4) {}
        public int sizeof(int p0) { return 0; }
        public int getStride() { return 0; }
        public void bindByteBuffer() {}
        public void unbindByteBuffer() {}
    }
}
