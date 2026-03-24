package android.ddm;

public class DdmHandleViewDebug extends android.ddm.DdmHandle {
    private static final int CHUNK_VULW = Integer.valueOf(0);
    private static final int CHUNK_VURT = Integer.valueOf(0);
    private static final int VURT_DUMP_HIERARCHY = 1;
    private static final int VURT_CAPTURE_LAYERS = 2;
    private static final int VURT_DUMP_THEME = 3;
    private static final int CHUNK_VUOP = Integer.valueOf(0);
    private static final int VUOP_CAPTURE_VIEW = 1;
    private static final int VUOP_DUMP_DISPLAYLIST = 2;
    private static final int VUOP_PROFILE_VIEW = 3;
    private static final int VUOP_INVOKE_VIEW_METHOD = 4;
    private static final int VUOP_SET_LAYOUT_PARAMETER = 5;
    private static final int ERR_INVALID_OP = -1;
    private static final int ERR_INVALID_PARAM = -2;
    private static final int ERR_EXCEPTION = -3;
    private static final java.lang.String TAG = "DdmViewDebug";
    private static final android.ddm.DdmHandleViewDebug sInstance = null;
    private DdmHandleViewDebug() { super(); }
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk listWindows() { return null; }
    private android.view.View getRootView(java.nio.ByteBuffer p0) { return null; }
    private android.view.View getTargetView(android.view.View p0, java.nio.ByteBuffer p1) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk dumpHierarchy(android.view.View p0, java.nio.ByteBuffer p1) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk captureLayers(android.view.View p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk dumpTheme(android.view.View p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk captureView(android.view.View p0, android.view.View p1) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk dumpDisplayLists(android.view.View p0, android.view.View p1) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk invokeViewMethod(android.view.View p0, android.view.View p1, java.nio.ByteBuffer p2) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk setLayoutParameter(android.view.View p0, android.view.View p1, java.nio.ByteBuffer p2) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk profileView(android.view.View p0, android.view.View p1) { return null; }
}
