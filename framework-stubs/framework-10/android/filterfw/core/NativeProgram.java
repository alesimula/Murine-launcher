package android.filterfw.core;

public class NativeProgram extends android.filterfw.core.Program {
    private int nativeProgramId;
    private boolean mHasInitFunction;
    private boolean mHasTeardownFunction;
    private boolean mHasSetValueFunction;
    private boolean mHasGetValueFunction;
    private boolean mHasResetFunction;
    private boolean mTornDown;
    public NativeProgram(java.lang.String p0, java.lang.String p1) { super(); }
    public void tearDown() {}
    public void reset() {}
    protected void finalize() throws java.lang.Throwable {}
    public void process(android.filterfw.core.Frame[] p0, android.filterfw.core.Frame p1) {}
    public void setHostValue(java.lang.String p0, java.lang.Object p1) {}
    public java.lang.Object getHostValue(java.lang.String p0) { return null; }
    private native boolean allocate();
    private native boolean deallocate();
    private native boolean nativeInit();
    private native boolean openNativeLibrary(java.lang.String p0);
    private native boolean bindInitFunction(java.lang.String p0);
    private native boolean bindSetValueFunction(java.lang.String p0);
    private native boolean bindGetValueFunction(java.lang.String p0);
    private native boolean bindProcessFunction(java.lang.String p0);
    private native boolean bindResetFunction(java.lang.String p0);
    private native boolean bindTeardownFunction(java.lang.String p0);
    private native boolean callNativeInit();
    private native boolean callNativeSetValue(java.lang.String p0, java.lang.String p1);
    private native java.lang.String callNativeGetValue(java.lang.String p0);
    private native boolean callNativeProcess(android.filterfw.core.NativeFrame[] p0, android.filterfw.core.NativeFrame p1);
    private native boolean callNativeReset();
    private native boolean callNativeTeardown();
}
