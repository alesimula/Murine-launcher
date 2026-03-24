package android.renderscript;

public class RenderScript {
    static final long TRACE_TAG = 32768L;
    static final java.lang.String LOG_TAG = "RenderScript_jni";
    static final boolean DEBUG = false;
    static final boolean LOG_ENABLED = false;
    private static java.util.ArrayList<android.renderscript.RenderScript> mProcessContextList;
    private boolean mIsProcessContext;
    private int mContextFlags;
    private int mContextSdkVersion;
    private android.content.Context mApplicationContext;
    static boolean sInitialized;
    static java.lang.Object sRuntime;
    static java.lang.reflect.Method registerNativeAllocation;
    static java.lang.reflect.Method registerNativeFree;
    public static final int CREATE_FLAG_NONE = 0;
    public static final int CREATE_FLAG_LOW_LATENCY = 2;
    public static final int CREATE_FLAG_LOW_POWER = 4;
    public static final int CREATE_FLAG_WAIT_FOR_ATTACH = 8;
    @android.annotation.UnsupportedAppUsage
    static int sPointerSize;
    static final long sMinorVersion = 1L;
    android.renderscript.RenderScript.ContextType mContextType;
    java.util.concurrent.locks.ReentrantReadWriteLock mRWLock;
    long mContext;
    private boolean mDestroyed;
    android.renderscript.RenderScript.MessageThread mMessageThread;
    volatile android.renderscript.Element mElement_U8;
    volatile android.renderscript.Element mElement_I8;
    volatile android.renderscript.Element mElement_U16;
    volatile android.renderscript.Element mElement_I16;
    volatile android.renderscript.Element mElement_U32;
    volatile android.renderscript.Element mElement_I32;
    volatile android.renderscript.Element mElement_U64;
    volatile android.renderscript.Element mElement_I64;
    volatile android.renderscript.Element mElement_F16;
    volatile android.renderscript.Element mElement_F32;
    volatile android.renderscript.Element mElement_F64;
    volatile android.renderscript.Element mElement_BOOLEAN;
    volatile android.renderscript.Element mElement_ELEMENT;
    volatile android.renderscript.Element mElement_TYPE;
    volatile android.renderscript.Element mElement_ALLOCATION;
    volatile android.renderscript.Element mElement_SAMPLER;
    volatile android.renderscript.Element mElement_SCRIPT;
    volatile android.renderscript.Element mElement_MESH;
    volatile android.renderscript.Element mElement_PROGRAM_FRAGMENT;
    volatile android.renderscript.Element mElement_PROGRAM_VERTEX;
    volatile android.renderscript.Element mElement_PROGRAM_RASTER;
    volatile android.renderscript.Element mElement_PROGRAM_STORE;
    volatile android.renderscript.Element mElement_FONT;
    volatile android.renderscript.Element mElement_A_8;
    volatile android.renderscript.Element mElement_RGB_565;
    volatile android.renderscript.Element mElement_RGB_888;
    volatile android.renderscript.Element mElement_RGBA_5551;
    volatile android.renderscript.Element mElement_RGBA_4444;
    volatile android.renderscript.Element mElement_RGBA_8888;
    volatile android.renderscript.Element mElement_HALF_2;
    volatile android.renderscript.Element mElement_HALF_3;
    volatile android.renderscript.Element mElement_HALF_4;
    volatile android.renderscript.Element mElement_FLOAT_2;
    volatile android.renderscript.Element mElement_FLOAT_3;
    volatile android.renderscript.Element mElement_FLOAT_4;
    volatile android.renderscript.Element mElement_DOUBLE_2;
    volatile android.renderscript.Element mElement_DOUBLE_3;
    volatile android.renderscript.Element mElement_DOUBLE_4;
    volatile android.renderscript.Element mElement_UCHAR_2;
    volatile android.renderscript.Element mElement_UCHAR_3;
    volatile android.renderscript.Element mElement_UCHAR_4;
    volatile android.renderscript.Element mElement_CHAR_2;
    volatile android.renderscript.Element mElement_CHAR_3;
    volatile android.renderscript.Element mElement_CHAR_4;
    volatile android.renderscript.Element mElement_USHORT_2;
    volatile android.renderscript.Element mElement_USHORT_3;
    volatile android.renderscript.Element mElement_USHORT_4;
    volatile android.renderscript.Element mElement_SHORT_2;
    volatile android.renderscript.Element mElement_SHORT_3;
    volatile android.renderscript.Element mElement_SHORT_4;
    volatile android.renderscript.Element mElement_UINT_2;
    volatile android.renderscript.Element mElement_UINT_3;
    volatile android.renderscript.Element mElement_UINT_4;
    volatile android.renderscript.Element mElement_INT_2;
    volatile android.renderscript.Element mElement_INT_3;
    volatile android.renderscript.Element mElement_INT_4;
    volatile android.renderscript.Element mElement_ULONG_2;
    volatile android.renderscript.Element mElement_ULONG_3;
    volatile android.renderscript.Element mElement_ULONG_4;
    volatile android.renderscript.Element mElement_LONG_2;
    volatile android.renderscript.Element mElement_LONG_3;
    volatile android.renderscript.Element mElement_LONG_4;
    volatile android.renderscript.Element mElement_YUV;
    volatile android.renderscript.Element mElement_MATRIX_4X4;
    volatile android.renderscript.Element mElement_MATRIX_3X3;
    volatile android.renderscript.Element mElement_MATRIX_2X2;
    volatile android.renderscript.Sampler mSampler_CLAMP_NEAREST;
    volatile android.renderscript.Sampler mSampler_CLAMP_LINEAR;
    volatile android.renderscript.Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
    volatile android.renderscript.Sampler mSampler_WRAP_NEAREST;
    volatile android.renderscript.Sampler mSampler_WRAP_LINEAR;
    volatile android.renderscript.Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
    volatile android.renderscript.Sampler mSampler_MIRRORED_REPEAT_NEAREST;
    volatile android.renderscript.Sampler mSampler_MIRRORED_REPEAT_LINEAR;
    volatile android.renderscript.Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    android.renderscript.ProgramStore mProgramStore_BLEND_NONE_DEPTH_TEST;
    android.renderscript.ProgramStore mProgramStore_BLEND_NONE_DEPTH_NO_DEPTH;
    android.renderscript.ProgramStore mProgramStore_BLEND_ALPHA_DEPTH_TEST;
    android.renderscript.ProgramStore mProgramStore_BLEND_ALPHA_DEPTH_NO_DEPTH;
    android.renderscript.ProgramRaster mProgramRaster_CULL_BACK;
    android.renderscript.ProgramRaster mProgramRaster_CULL_FRONT;
    android.renderscript.ProgramRaster mProgramRaster_CULL_NONE;
    @android.annotation.UnsupportedAppUsage
    android.renderscript.RenderScript.RSMessageHandler mMessageCallback;
    android.renderscript.RenderScript.RSErrorHandler mErrorCallback;
    private static java.lang.String mCachePath;
    static native void _nInit();
    static native int rsnSystemGetPointerSize();
    native long nDeviceCreate();
    native void nDeviceDestroy(long p0);
    native void nDeviceSetConfig(long p0, int p1, int p2);
    native int nContextGetUserMessage(long p0, int[] p1);
    native java.lang.String nContextGetErrorMessage(long p0);
    native int nContextPeekMessage(long p0, int[] p1);
    native void nContextInitToClient(long p0);
    native void nContextDeinitToClient(long p0);
    @android.annotation.UnsupportedAppUsage
    public static long getMinorID() { return 0L; }
    public static long getMinorVersion() { return 0L; }
    native long rsnContextCreateGL(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, float p13, int p14);
    synchronized long nContextCreateGL(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12, float p13, int p14) { return 0L; }
    native long rsnContextCreate(long p0, int p1, int p2, int p3);
    synchronized long nContextCreate(long p0, int p1, int p2, int p3) { return 0L; }
    native void rsnContextDestroy(long p0);
    synchronized void nContextDestroy() {}
    native void rsnContextSetSurface(long p0, int p1, int p2, android.view.Surface p3);
    synchronized void nContextSetSurface(int p0, int p1, android.view.Surface p2) {}
    native void rsnContextSetSurfaceTexture(long p0, int p1, int p2, android.graphics.SurfaceTexture p3);
    synchronized void nContextSetSurfaceTexture(int p0, int p1, android.graphics.SurfaceTexture p2) {}
    native void rsnContextSetPriority(long p0, int p1);
    synchronized void nContextSetPriority(int p0) {}
    native void rsnContextSetCacheDir(long p0, java.lang.String p1);
    synchronized void nContextSetCacheDir(java.lang.String p0) {}
    native void rsnContextDump(long p0, int p1);
    synchronized void nContextDump(int p0) {}
    native void rsnContextFinish(long p0);
    synchronized void nContextFinish() {}
    native void rsnContextSendMessage(long p0, int p1, int[] p2);
    synchronized void nContextSendMessage(int p0, int[] p1) {}
    native void rsnContextBindRootScript(long p0, long p1);
    synchronized void nContextBindRootScript(long p0) {}
    native void rsnContextBindSampler(long p0, int p1, int p2);
    synchronized void nContextBindSampler(int p0, int p1) {}
    native void rsnContextBindProgramStore(long p0, long p1);
    synchronized void nContextBindProgramStore(long p0) {}
    native void rsnContextBindProgramFragment(long p0, long p1);
    synchronized void nContextBindProgramFragment(long p0) {}
    native void rsnContextBindProgramVertex(long p0, long p1);
    synchronized void nContextBindProgramVertex(long p0) {}
    native void rsnContextBindProgramRaster(long p0, long p1);
    synchronized void nContextBindProgramRaster(long p0) {}
    native void rsnContextPause(long p0);
    synchronized void nContextPause() {}
    native void rsnContextResume(long p0);
    synchronized void nContextResume() {}
    native long rsnClosureCreate(long p0, long p1, long p2, long[] p3, long[] p4, int[] p5, long[] p6, long[] p7);
    synchronized long nClosureCreate(long p0, long p1, long[] p2, long[] p3, int[] p4, long[] p5, long[] p6) { return 0L; }
    native long rsnInvokeClosureCreate(long p0, long p1, byte[] p2, long[] p3, long[] p4, int[] p5);
    synchronized long nInvokeClosureCreate(long p0, byte[] p1, long[] p2, long[] p3, int[] p4) { return 0L; }
    native void rsnClosureSetArg(long p0, long p1, int p2, long p3, int p4);
    synchronized void nClosureSetArg(long p0, int p1, long p2, int p3) {}
    native void rsnClosureSetGlobal(long p0, long p1, long p2, long p3, int p4);
    synchronized void nClosureSetGlobal(long p0, long p1, long p2, int p3) {}
    native long rsnScriptGroup2Create(long p0, java.lang.String p1, java.lang.String p2, long[] p3);
    synchronized long nScriptGroup2Create(java.lang.String p0, java.lang.String p1, long[] p2) { return 0L; }
    native void rsnScriptGroup2Execute(long p0, long p1);
    synchronized void nScriptGroup2Execute(long p0) {}
    native void rsnAssignName(long p0, long p1, byte[] p2);
    synchronized void nAssignName(long p0, byte[] p1) {}
    native java.lang.String rsnGetName(long p0, long p1);
    synchronized java.lang.String nGetName(long p0) { return null; }
    native void rsnObjDestroy(long p0, long p1);
    void nObjDestroy(long p0) {}
    native long rsnElementCreate(long p0, long p1, int p2, boolean p3, int p4);
    synchronized long nElementCreate(long p0, int p1, boolean p2, int p3) { return 0L; }
    native long rsnElementCreate2(long p0, long[] p1, java.lang.String[] p2, int[] p3);
    synchronized long nElementCreate2(long[] p0, java.lang.String[] p1, int[] p2) { return 0L; }
    native void rsnElementGetNativeData(long p0, long p1, int[] p2);
    synchronized void nElementGetNativeData(long p0, int[] p1) {}
    native void rsnElementGetSubElements(long p0, long p1, long[] p2, java.lang.String[] p3, int[] p4);
    synchronized void nElementGetSubElements(long p0, long[] p1, java.lang.String[] p2, int[] p3) {}
    native long rsnTypeCreate(long p0, long p1, int p2, int p3, int p4, boolean p5, boolean p6, int p7);
    synchronized long nTypeCreate(long p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6) { return 0L; }
    native void rsnTypeGetNativeData(long p0, long p1, long[] p2);
    synchronized void nTypeGetNativeData(long p0, long[] p1) {}
    native long rsnAllocationCreateTyped(long p0, long p1, int p2, int p3, long p4);
    synchronized long nAllocationCreateTyped(long p0, int p1, int p2, long p3) { return 0L; }
    native long rsnAllocationCreateFromBitmap(long p0, long p1, int p2, long p3, int p4);
    synchronized long nAllocationCreateFromBitmap(long p0, int p1, android.graphics.Bitmap p2, int p3) { return 0L; }
    native long rsnAllocationCreateBitmapBackedAllocation(long p0, long p1, int p2, long p3, int p4);
    synchronized long nAllocationCreateBitmapBackedAllocation(long p0, int p1, android.graphics.Bitmap p2, int p3) { return 0L; }
    native long rsnAllocationCubeCreateFromBitmap(long p0, long p1, int p2, long p3, int p4);
    synchronized long nAllocationCubeCreateFromBitmap(long p0, int p1, android.graphics.Bitmap p2, int p3) { return 0L; }
    native long rsnAllocationCreateBitmapRef(long p0, long p1, long p2);
    synchronized long nAllocationCreateBitmapRef(long p0, android.graphics.Bitmap p1) { return 0L; }
    native long rsnAllocationCreateFromAssetStream(long p0, int p1, int p2, int p3);
    synchronized long nAllocationCreateFromAssetStream(int p0, int p1, int p2) { return 0L; }
    native void rsnAllocationCopyToBitmap(long p0, long p1, long p2);
    synchronized void nAllocationCopyToBitmap(long p0, android.graphics.Bitmap p1) {}
    native void rsnAllocationSyncAll(long p0, long p1, int p2);
    synchronized void nAllocationSyncAll(long p0, int p1) {}
    native java.nio.ByteBuffer rsnAllocationGetByteBuffer(long p0, long p1, long[] p2, int p3, int p4, int p5);
    synchronized java.nio.ByteBuffer nAllocationGetByteBuffer(long p0, long[] p1, int p2, int p3, int p4) { return null; }
    native void rsnAllocationSetupBufferQueue(long p0, long p1, int p2);
    synchronized void nAllocationSetupBufferQueue(long p0, int p1) {}
    native void rsnAllocationShareBufferQueue(long p0, long p1, long p2);
    synchronized void nAllocationShareBufferQueue(long p0, long p1) {}
    native android.view.Surface rsnAllocationGetSurface(long p0, long p1);
    synchronized android.view.Surface nAllocationGetSurface(long p0) { return null; }
    native void rsnAllocationSetSurface(long p0, long p1, android.view.Surface p2);
    synchronized void nAllocationSetSurface(long p0, android.view.Surface p1) {}
    native void rsnAllocationIoSend(long p0, long p1);
    synchronized void nAllocationIoSend(long p0) {}
    native long rsnAllocationIoReceive(long p0, long p1);
    synchronized long nAllocationIoReceive(long p0) { return 0L; }
    native void rsnAllocationGenerateMipmaps(long p0, long p1);
    synchronized void nAllocationGenerateMipmaps(long p0) {}
    native void rsnAllocationCopyFromBitmap(long p0, long p1, long p2);
    synchronized void nAllocationCopyFromBitmap(long p0, android.graphics.Bitmap p1) {}
    native void rsnAllocationData1D(long p0, long p1, int p2, int p3, int p4, java.lang.Object p5, int p6, int p7, int p8, boolean p9);
    synchronized void nAllocationData1D(long p0, int p1, int p2, int p3, java.lang.Object p4, int p5, android.renderscript.Element.DataType p6, int p7, boolean p8) {}
    native void rsnAllocationElementData(long p0, long p1, int p2, int p3, int p4, int p5, int p6, byte[] p7, int p8);
    synchronized void nAllocationElementData(long p0, int p1, int p2, int p3, int p4, int p5, byte[] p6, int p7) {}
    native void rsnAllocationData2D(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8, int p9, int p10, int p11, int p12);
    synchronized void nAllocationData2D(long p0, int p1, int p2, int p3, int p4, int p5, int p6, long p7, int p8, int p9, int p10, int p11) {}
    native void rsnAllocationData2D(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.Object p8, int p9, int p10, int p11, boolean p12);
    synchronized void nAllocationData2D(long p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.Object p7, int p8, android.renderscript.Element.DataType p9, int p10, boolean p11) {}
    native void rsnAllocationData2D(long p0, long p1, int p2, int p3, int p4, int p5, android.graphics.Bitmap p6);
    synchronized void nAllocationData2D(long p0, int p1, int p2, int p3, int p4, android.graphics.Bitmap p5) {}
    native void rsnAllocationData3D(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, long p9, int p10, int p11, int p12, int p13);
    synchronized void nAllocationData3D(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, long p8, int p9, int p10, int p11, int p12) {}
    native void rsnAllocationData3D(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, java.lang.Object p9, int p10, int p11, int p12, boolean p13);
    synchronized void nAllocationData3D(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.Object p8, int p9, android.renderscript.Element.DataType p10, int p11, boolean p12) {}
    native void rsnAllocationRead(long p0, long p1, java.lang.Object p2, int p3, int p4, boolean p5);
    synchronized void nAllocationRead(long p0, java.lang.Object p1, android.renderscript.Element.DataType p2, int p3, boolean p4) {}
    native void rsnAllocationRead1D(long p0, long p1, int p2, int p3, int p4, java.lang.Object p5, int p6, int p7, int p8, boolean p9);
    synchronized void nAllocationRead1D(long p0, int p1, int p2, int p3, java.lang.Object p4, int p5, android.renderscript.Element.DataType p6, int p7, boolean p8) {}
    native void rsnAllocationElementRead(long p0, long p1, int p2, int p3, int p4, int p5, int p6, byte[] p7, int p8);
    synchronized void nAllocationElementRead(long p0, int p1, int p2, int p3, int p4, int p5, byte[] p6, int p7) {}
    native void rsnAllocationRead2D(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.Object p8, int p9, int p10, int p11, boolean p12);
    synchronized void nAllocationRead2D(long p0, int p1, int p2, int p3, int p4, int p5, int p6, java.lang.Object p7, int p8, android.renderscript.Element.DataType p9, int p10, boolean p11) {}
    native void rsnAllocationRead3D(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, java.lang.Object p9, int p10, int p11, int p12, boolean p13);
    synchronized void nAllocationRead3D(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, java.lang.Object p8, int p9, android.renderscript.Element.DataType p10, int p11, boolean p12) {}
    native long rsnAllocationGetType(long p0, long p1);
    synchronized long nAllocationGetType(long p0) { return 0L; }
    native void rsnAllocationResize1D(long p0, long p1, int p2);
    synchronized void nAllocationResize1D(long p0, int p1) {}
    native long rsnAllocationAdapterCreate(long p0, long p1, long p2);
    synchronized long nAllocationAdapterCreate(long p0, long p1) { return 0L; }
    native void rsnAllocationAdapterOffset(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10);
    synchronized void nAllocationAdapterOffset(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    native long rsnFileA3DCreateFromAssetStream(long p0, long p1);
    synchronized long nFileA3DCreateFromAssetStream(long p0) { return 0L; }
    native long rsnFileA3DCreateFromFile(long p0, java.lang.String p1);
    synchronized long nFileA3DCreateFromFile(java.lang.String p0) { return 0L; }
    native long rsnFileA3DCreateFromAsset(long p0, android.content.res.AssetManager p1, java.lang.String p2);
    synchronized long nFileA3DCreateFromAsset(android.content.res.AssetManager p0, java.lang.String p1) { return 0L; }
    native int rsnFileA3DGetNumIndexEntries(long p0, long p1);
    synchronized int nFileA3DGetNumIndexEntries(long p0) { return 0; }
    native void rsnFileA3DGetIndexEntries(long p0, long p1, int p2, int[] p3, java.lang.String[] p4);
    synchronized void nFileA3DGetIndexEntries(long p0, int p1, int[] p2, java.lang.String[] p3) {}
    native long rsnFileA3DGetEntryByIndex(long p0, long p1, int p2);
    synchronized long nFileA3DGetEntryByIndex(long p0, int p1) { return 0L; }
    native long rsnFontCreateFromFile(long p0, java.lang.String p1, float p2, int p3);
    synchronized long nFontCreateFromFile(java.lang.String p0, float p1, int p2) { return 0L; }
    native long rsnFontCreateFromAssetStream(long p0, java.lang.String p1, float p2, int p3, long p4);
    synchronized long nFontCreateFromAssetStream(java.lang.String p0, float p1, int p2, long p3) { return 0L; }
    native long rsnFontCreateFromAsset(long p0, android.content.res.AssetManager p1, java.lang.String p2, float p3, int p4);
    synchronized long nFontCreateFromAsset(android.content.res.AssetManager p0, java.lang.String p1, float p2, int p3) { return 0L; }
    native void rsnScriptBindAllocation(long p0, long p1, long p2, int p3);
    synchronized void nScriptBindAllocation(long p0, long p1, int p2) {}
    native void rsnScriptSetTimeZone(long p0, long p1, byte[] p2);
    synchronized void nScriptSetTimeZone(long p0, byte[] p1) {}
    native void rsnScriptInvoke(long p0, long p1, int p2);
    synchronized void nScriptInvoke(long p0, int p1) {}
    native void rsnScriptForEach(long p0, long p1, int p2, long[] p3, long p4, byte[] p5, int[] p6);
    synchronized void nScriptForEach(long p0, int p1, long[] p2, long p3, byte[] p4, int[] p5) {}
    native void rsnScriptReduce(long p0, long p1, int p2, long[] p3, long p4, int[] p5);
    synchronized void nScriptReduce(long p0, int p1, long[] p2, long p3, int[] p4) {}
    native void rsnScriptInvokeV(long p0, long p1, int p2, byte[] p3);
    synchronized void nScriptInvokeV(long p0, int p1, byte[] p2) {}
    native void rsnScriptSetVarI(long p0, long p1, int p2, int p3);
    synchronized void nScriptSetVarI(long p0, int p1, int p2) {}
    native int rsnScriptGetVarI(long p0, long p1, int p2);
    synchronized int nScriptGetVarI(long p0, int p1) { return 0; }
    native void rsnScriptSetVarJ(long p0, long p1, int p2, long p3);
    synchronized void nScriptSetVarJ(long p0, int p1, long p2) {}
    native long rsnScriptGetVarJ(long p0, long p1, int p2);
    synchronized long nScriptGetVarJ(long p0, int p1) { return 0L; }
    native void rsnScriptSetVarF(long p0, long p1, int p2, float p3);
    synchronized void nScriptSetVarF(long p0, int p1, float p2) {}
    native float rsnScriptGetVarF(long p0, long p1, int p2);
    synchronized float nScriptGetVarF(long p0, int p1) { return 0.0f; }
    native void rsnScriptSetVarD(long p0, long p1, int p2, double p3);
    synchronized void nScriptSetVarD(long p0, int p1, double p2) {}
    native double rsnScriptGetVarD(long p0, long p1, int p2);
    synchronized double nScriptGetVarD(long p0, int p1) { return 0.0; }
    native void rsnScriptSetVarV(long p0, long p1, int p2, byte[] p3);
    synchronized void nScriptSetVarV(long p0, int p1, byte[] p2) {}
    native void rsnScriptGetVarV(long p0, long p1, int p2, byte[] p3);
    synchronized void nScriptGetVarV(long p0, int p1, byte[] p2) {}
    native void rsnScriptSetVarVE(long p0, long p1, int p2, byte[] p3, long p4, int[] p5);
    synchronized void nScriptSetVarVE(long p0, int p1, byte[] p2, long p3, int[] p4) {}
    native void rsnScriptSetVarObj(long p0, long p1, int p2, long p3);
    synchronized void nScriptSetVarObj(long p0, int p1, long p2) {}
    native long rsnScriptCCreate(long p0, java.lang.String p1, java.lang.String p2, byte[] p3, int p4);
    @android.annotation.UnsupportedAppUsage
    synchronized long nScriptCCreate(java.lang.String p0, java.lang.String p1, byte[] p2, int p3) { return 0L; }
    native long rsnScriptIntrinsicCreate(long p0, int p1, long p2);
    synchronized long nScriptIntrinsicCreate(int p0, long p1) { return 0L; }
    native long rsnScriptKernelIDCreate(long p0, long p1, int p2, int p3);
    synchronized long nScriptKernelIDCreate(long p0, int p1, int p2) { return 0L; }
    native long rsnScriptInvokeIDCreate(long p0, long p1, int p2);
    synchronized long nScriptInvokeIDCreate(long p0, int p1) { return 0L; }
    native long rsnScriptFieldIDCreate(long p0, long p1, int p2);
    synchronized long nScriptFieldIDCreate(long p0, int p1) { return 0L; }
    native long rsnScriptGroupCreate(long p0, long[] p1, long[] p2, long[] p3, long[] p4, long[] p5);
    synchronized long nScriptGroupCreate(long[] p0, long[] p1, long[] p2, long[] p3, long[] p4) { return 0L; }
    native void rsnScriptGroupSetInput(long p0, long p1, long p2, long p3);
    synchronized void nScriptGroupSetInput(long p0, long p1, long p2) {}
    native void rsnScriptGroupSetOutput(long p0, long p1, long p2, long p3);
    synchronized void nScriptGroupSetOutput(long p0, long p1, long p2) {}
    native void rsnScriptGroupExecute(long p0, long p1);
    synchronized void nScriptGroupExecute(long p0) {}
    native long rsnSamplerCreate(long p0, int p1, int p2, int p3, int p4, int p5, float p6);
    synchronized long nSamplerCreate(int p0, int p1, int p2, int p3, int p4, float p5) { return 0L; }
    native long rsnProgramStoreCreate(long p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, int p7, int p8, int p9);
    synchronized long nProgramStoreCreate(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, int p6, int p7, int p8) { return 0L; }
    native long rsnProgramRasterCreate(long p0, boolean p1, int p2);
    synchronized long nProgramRasterCreate(boolean p0, int p1) { return 0L; }
    native void rsnProgramBindConstants(long p0, long p1, int p2, long p3);
    synchronized void nProgramBindConstants(long p0, int p1, long p2) {}
    native void rsnProgramBindTexture(long p0, long p1, int p2, long p3);
    synchronized void nProgramBindTexture(long p0, int p1, long p2) {}
    native void rsnProgramBindSampler(long p0, long p1, int p2, long p3);
    synchronized void nProgramBindSampler(long p0, int p1, long p2) {}
    native long rsnProgramFragmentCreate(long p0, java.lang.String p1, java.lang.String[] p2, long[] p3);
    synchronized long nProgramFragmentCreate(java.lang.String p0, java.lang.String[] p1, long[] p2) { return 0L; }
    native long rsnProgramVertexCreate(long p0, java.lang.String p1, java.lang.String[] p2, long[] p3);
    synchronized long nProgramVertexCreate(java.lang.String p0, java.lang.String[] p1, long[] p2) { return 0L; }
    native long rsnMeshCreate(long p0, long[] p1, long[] p2, int[] p3);
    synchronized long nMeshCreate(long[] p0, long[] p1, int[] p2) { return 0L; }
    native int rsnMeshGetVertexBufferCount(long p0, long p1);
    synchronized int nMeshGetVertexBufferCount(long p0) { return 0; }
    native int rsnMeshGetIndexCount(long p0, long p1);
    synchronized int nMeshGetIndexCount(long p0) { return 0; }
    native void rsnMeshGetVertices(long p0, long p1, long[] p2, int p3);
    synchronized void nMeshGetVertices(long p0, long[] p1, int p2) {}
    native void rsnMeshGetIndices(long p0, long p1, long[] p2, int[] p3, int p4);
    synchronized void nMeshGetIndices(long p0, long[] p1, int[] p2, int p3) {}
    native void rsnScriptIntrinsicBLAS_Single(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, float p11, long p12, long p13, float p14, long p15, int p16, int p17, int p18, int p19);
    synchronized void nScriptIntrinsicBLAS_Single(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, float p10, long p11, long p12, float p13, long p14, int p15, int p16, int p17, int p18) {}
    native void rsnScriptIntrinsicBLAS_Double(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, double p11, long p12, long p13, double p14, long p15, int p16, int p17, int p18, int p19);
    synchronized void nScriptIntrinsicBLAS_Double(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, double p10, long p11, long p12, double p13, long p14, int p15, int p16, int p17, int p18) {}
    native void rsnScriptIntrinsicBLAS_Complex(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, float p11, float p12, long p13, long p14, float p15, float p16, long p17, int p18, int p19, int p20, int p21);
    synchronized void nScriptIntrinsicBLAS_Complex(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, float p10, float p11, long p12, long p13, float p14, float p15, long p16, int p17, int p18, int p19, int p20) {}
    native void rsnScriptIntrinsicBLAS_Z(long p0, long p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, double p11, double p12, long p13, long p14, double p15, double p16, long p17, int p18, int p19, int p20, int p21);
    synchronized void nScriptIntrinsicBLAS_Z(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, double p10, double p11, long p12, long p13, double p14, double p15, long p16, int p17, int p18, int p19, int p20) {}
    native void rsnScriptIntrinsicBLAS_BNNM(long p0, long p1, int p2, int p3, int p4, long p5, int p6, long p7, int p8, long p9, int p10, int p11);
    synchronized void nScriptIntrinsicBLAS_BNNM(long p0, int p1, int p2, int p3, long p4, int p5, long p6, int p7, long p8, int p9, int p10) {}
    public void setMessageHandler(android.renderscript.RenderScript.RSMessageHandler p0) {}
    public android.renderscript.RenderScript.RSMessageHandler getMessageHandler() { return null; }
    public void sendMessage(int p0, int[] p1) {}
    public void setErrorHandler(android.renderscript.RenderScript.RSErrorHandler p0) {}
    public android.renderscript.RenderScript.RSErrorHandler getErrorHandler() { return null; }
    void validateObject(android.renderscript.BaseObj p0) {}
    @android.annotation.UnsupportedAppUsage
    void validate() {}
    public void setPriority(android.renderscript.RenderScript.Priority p0) {}
    RenderScript(android.content.Context p0) {}
    public final android.content.Context getApplicationContext() { return null; }
    static synchronized java.lang.String getCachePath() { return null; }
    private static android.renderscript.RenderScript internalCreate(android.content.Context p0, int p1, android.renderscript.RenderScript.ContextType p2, int p3) { return null; }
    public static android.renderscript.RenderScript create(android.content.Context p0) { return null; }
    public static android.renderscript.RenderScript create(android.content.Context p0, android.renderscript.RenderScript.ContextType p1) { return null; }
    public static android.renderscript.RenderScript create(android.content.Context p0, android.renderscript.RenderScript.ContextType p1, int p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.renderscript.RenderScript create(android.content.Context p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    private static android.renderscript.RenderScript create(android.content.Context p0, int p1, android.renderscript.RenderScript.ContextType p2, int p3) { return null; }
    public static void releaseAllContexts() {}
    public static android.renderscript.RenderScript createMultiContext(android.content.Context p0, android.renderscript.RenderScript.ContextType p1, int p2, int p3) { return null; }
    public void contextDump() {}
    public void finish() {}
    private void helpDestroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public void destroy() {}
    boolean isAlive() { return false; }
    long safeID(android.renderscript.BaseObj p0) { return 0L; }

    public static class RSMessageHandler implements java.lang.Runnable {
        protected int[] mData;
        protected int mID;
        protected int mLength;
        public RSMessageHandler() {}
        public void run() {}
    }

    public static class RSErrorHandler implements java.lang.Runnable {
        protected java.lang.String mErrorMessage;
        protected int mErrorNum;
        public RSErrorHandler() {}
        public void run() {}
    }

    public static enum Priority {
        LOW,
        NORMAL;
        int mID;
        private Priority() {}
    }

    static class MessageThread extends java.lang.Thread {
        android.renderscript.RenderScript mRS;
        boolean mRun;
        int[] mAuxData;
        static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
        static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
        static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
        static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
        static final int RS_MESSAGE_TO_CLIENT_USER = 4;
        static final int RS_MESSAGE_TO_CLIENT_NEW_BUFFER = 5;
        static final int RS_ERROR_FATAL_DEBUG = 2048;
        static final int RS_ERROR_FATAL_UNKNOWN = 4096;
        MessageThread(android.renderscript.RenderScript p0) { super(); }
        public void run() {}
    }

    public static enum ContextType {
        NORMAL,
        DEBUG,
        PROFILE;
        int mID;
        private ContextType() {}
    }
}
