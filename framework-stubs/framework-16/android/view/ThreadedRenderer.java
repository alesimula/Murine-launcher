package android.view;

public final class ThreadedRenderer extends android.graphics.HardwareRenderer {
    public static final java.lang.String PROFILE_PROPERTY = "debug.hwui.profile";
    public static final java.lang.String PROFILE_PROPERTY_VISUALIZE_BARS = "visual_bars";
    static final java.lang.String PROFILE_MAXFRAMES_PROPERTY = "debug.hwui.profile.maxframes";
    static final java.lang.String PRINT_CONFIG_PROPERTY = "debug.hwui.print_config";
    public static final java.lang.String DEBUG_DIRTY_REGIONS_PROPERTY = "debug.hwui.show_dirty_regions";
    public static final java.lang.String DEBUG_SHOW_LAYERS_UPDATES_PROPERTY = "debug.hwui.show_layers_updates";
    public static final java.lang.String DEBUG_OVERDRAW_PROPERTY = "debug.hwui.overdraw";
    public static final java.lang.String OVERDRAW_PROPERTY_SHOW = "show";
    public static final java.lang.String DEBUG_SHOW_NON_RECTANGULAR_CLIP_PROPERTY = "debug.hwui.show_non_rect_clip";
    public static final java.lang.String DEBUG_FPS_DIVISOR = "debug.hwui.fps_divisor";
    public static final java.lang.String DEBUG_FORCE_DARK = "debug.hwui.force_dark";
    public static int EGL_CONTEXT_PRIORITY_REALTIME_NV;
    public static int EGL_CONTEXT_PRIORITY_HIGH_IMG;
    public static int EGL_CONTEXT_PRIORITY_MEDIUM_IMG;
    public static int EGL_CONTEXT_PRIORITY_LOW_IMG;
    public static boolean sRendererEnabled;
    public static void enableForegroundTrimming() {}
    public static void initForSystemProcess() {}
    public static android.view.ThreadedRenderer create(android.content.Context p0, boolean p1, java.lang.String p2) { return null; }
    ThreadedRenderer(android.content.Context p0, boolean p1, java.lang.String p2) { super(); }
    public void destroy() {}
    boolean isEnabled() { return false; }
    void setEnabled(boolean p0) {}
    boolean isRequested() { return false; }
    void setRequested(boolean p0) {}
    boolean initialize(android.view.Surface p0) throws android.view.Surface.OutOfResourcesException { return false; }
    boolean initializeIfNeeded(int p0, int p1, android.view.View.AttachInfo p2, android.view.Surface p3, android.graphics.Rect p4) throws android.view.Surface.OutOfResourcesException { return false; }
    void updateSurface(android.view.Surface p0) throws android.view.Surface.OutOfResourcesException {}
    public void setSurface(android.view.Surface p0) {}
    void registerRtFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    void unregisterRtFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    void destroyHardwareResources(android.view.View p0) {}
    void setup(int p0, int p1, android.view.View.AttachInfo p2, android.graphics.Rect p3) {}
    public boolean rendererOwnsSurfaceControlOpacity() { return false; }
    public boolean setSurfaceControlOpaque(boolean p0) { return false; }
    public void setSurfaceControl(android.view.SurfaceControl p0, android.graphics.BLASTBufferQueue p1) {}
    public void notifyCallbackPending() {}
    public void notifyExpensiveFrame() {}
    void setLightCenter(android.view.View.AttachInfo p0) {}
    int getWidth() { return 0; }
    int getHeight() { return 0; }
    public static void handleDumpGfxInfo(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    void dumpGfxInfo(java.io.PrintWriter p0, java.io.FileDescriptor p1, java.lang.String[] p2) {}
    android.graphics.Picture captureRenderingCommands() { return null; }
    public boolean loadSystemProperties() { return false; }
    void invalidateRoot() {}
    void draw(android.view.View p0, android.view.View.AttachInfo p1, android.view.ThreadedRenderer.DrawCallbacks p2) {}
    @android.annotation.NonNull
    public android.graphics.RenderNode getRootNode() { return null; }

    static interface DrawCallbacks {
        public void onPreDraw(android.graphics.RecordingCanvas p0);
        public void onPostDraw(android.graphics.RecordingCanvas p0);
    }

    public static class SimpleRenderer extends android.graphics.HardwareRenderer {
        public SimpleRenderer(android.content.Context p0, java.lang.String p1, android.view.Surface p2) { super(); }
        public void setLightCenter(android.view.Display p0, int p1, int p2) {}
        public android.graphics.RenderNode getRootNode() { return null; }
        public void draw(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    }

    private static final class WebViewOverlayProvider implements android.graphics.HardwareRenderer.PrepareSurfaceControlForWebviewCallback, android.graphics.HardwareRenderer.ASurfaceTransactionCallback {
        public boolean setSurfaceControlOpaque(boolean p0) { return false; }
        public boolean shouldEnableOverlaySupport() { return false; }
        public void setSurfaceControl(android.view.SurfaceControl p0) {}
        public void setBLASTBufferQueue(android.graphics.BLASTBufferQueue p0) {}
        public void prepare() {}
        public boolean onMergeTransaction(long p0, long p1, long p2) { return false; }
    }
}
