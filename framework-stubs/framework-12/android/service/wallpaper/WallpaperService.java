package android.service.wallpaper;

public abstract class WallpaperService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.wallpaper.WallpaperService";
    public static final java.lang.String SERVICE_META_DATA = "android.service.wallpaper";
    static final java.lang.String TAG = "WallpaperService";
    static final boolean DEBUG = false;
    static final float MIN_PAGE_ALLOWED_MARGIN = 0.05000000074505806f;
    private static final int MIN_BITMAP_SCREENSHOT_WIDTH = 64;
    private static final long DEFAULT_UPDATE_SCREENSHOT_DURATION = 60000L;
    private static final android.graphics.RectF LOCAL_COLOR_BOUNDS = null;
    private static final int DO_ATTACH = 10;
    private static final int DO_DETACH = 20;
    private static final int DO_SET_DESIRED_SIZE = 30;
    private static final int DO_SET_DISPLAY_PADDING = 40;
    private static final int DO_IN_AMBIENT_MODE = 50;
    private static final int MSG_UPDATE_SURFACE = 10000;
    private static final int MSG_VISIBILITY_CHANGED = 10010;
    private static final int MSG_WALLPAPER_OFFSETS = 10020;
    private static final int MSG_WALLPAPER_COMMAND = 10025;
    private static final int MSG_WINDOW_RESIZED = 10030;
    private static final int MSG_WINDOW_MOVED = 10035;
    private static final int MSG_TOUCH_EVENT = 10040;
    private static final int MSG_REQUEST_WALLPAPER_COLORS = 10050;
    private static final int MSG_ZOOM = 10100;
    private static final int MSG_SCALE_PREVIEW = 10110;
    private static final java.util.List<java.lang.Float> PROHIBITED_STEPS = null;
    private static final int NOTIFY_COLORS_RATE_LIMIT_MS = 1000;
    private static final boolean ENABLE_WALLPAPER_DIMMING = Boolean.valueOf(false);
    private final java.util.ArrayList<android.service.wallpaper.WallpaperService.Engine> mActiveEngines = null;
    public WallpaperService() { super(); }
    private boolean isValid(android.graphics.RectF p0) { return false; }
    private boolean inRectFRange(float p0) { return false; }
    public void onCreate() {}
    public void onDestroy() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract android.service.wallpaper.WallpaperService.Engine onCreateEngine();
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public class Engine {
        android.service.wallpaper.WallpaperService.IWallpaperEngineWrapper mIWallpaperEngine;
        final android.util.ArraySet<android.graphics.RectF> mLocalColorAreas = null;
        final android.util.ArraySet<android.graphics.RectF> mLocalColorsToAdd = null;
        android.service.wallpaper.EngineWindowPage[] mWindowPages;
        android.graphics.Bitmap mLastScreenshot;
        int mLastWindowPage;
        float mLastPageOffset;
        com.android.internal.os.HandlerCaller mCaller;
        android.service.wallpaper.IWallpaperConnection mConnection;
        android.os.IBinder mWindowToken;
        boolean mInitializing;
        boolean mVisible;
        boolean mReportedVisible;
        boolean mDestroyed;
        boolean mCreated;
        boolean mSurfaceCreated;
        boolean mIsCreating;
        boolean mDrawingAllowed;
        boolean mOffsetsChanged;
        boolean mFixedSizeAllowed;
        boolean mShouldDim;
        int mWidth;
        int mHeight;
        int mFormat;
        int mType;
        int mCurWidth;
        int mCurHeight;
        float mZoom;
        int mWindowFlags;
        int mWindowPrivateFlags;
        int mCurWindowFlags;
        int mCurWindowPrivateFlags;
        android.graphics.Rect mPreviewSurfacePosition;
        final android.window.ClientWindowFrames mWinFrames = null;
        final android.graphics.Rect mDispatchedContentInsets = null;
        final android.graphics.Rect mDispatchedStableInsets = null;
        final android.graphics.Rect mFinalSystemInsets = null;
        final android.graphics.Rect mFinalStableInsets = null;
        android.view.DisplayCutout mDispatchedDisplayCutout;
        final android.view.InsetsState mInsetsState = null;
        final android.view.InsetsSourceControl[] mTempControls = null;
        final android.util.MergedConfiguration mMergedConfiguration = null;
        private final android.graphics.Point mSurfaceSize = null;
        private final android.graphics.Point mLastSurfaceSize = null;
        private final android.graphics.Matrix mTmpMatrix = null;
        private final float[] mTmpValues = null;
        final android.view.WindowManager.LayoutParams mLayout = null;
        android.view.IWindowSession mSession;
        final java.lang.Object mLock = null;
        boolean mOffsetMessageEnqueued;
        float mPendingXOffset;
        float mPendingYOffset;
        float mPendingXOffsetStep;
        float mPendingYOffsetStep;
        boolean mPendingSync;
        android.view.MotionEvent mPendingMove;
        boolean mIsInAmbientMode;
        private long mLastColorInvalidation;
        private final java.lang.Runnable mNotifyColorsChanged = null;
        private final java.util.function.Supplier<java.lang.Long> mClockFunction = null;
        private final android.os.Handler mHandler = null;
        private android.view.Display mDisplay;
        private android.content.Context mDisplayContext;
        private int mDisplayState;
        private float mWallpaperDimAmount;
        android.view.SurfaceControl mSurfaceControl;
        android.view.SurfaceControl mBbqSurfaceControl;
        android.graphics.BLASTBufferQueue mBlastBufferQueue;
        final com.android.internal.view.BaseSurfaceHolder mSurfaceHolder = null;
        android.service.wallpaper.WallpaperService.Engine.WallpaperInputEventReceiver mInputEventReceiver;
        final com.android.internal.view.BaseIWindow mWindow = null;
        private final android.hardware.display.DisplayManager.DisplayListener mDisplayListener = null;
        public Engine(android.service.wallpaper.WallpaperService p0) {}
        public Engine(java.util.function.Supplier<java.lang.Long> p0, android.os.Handler p1) {}
        public android.view.SurfaceHolder getSurfaceHolder() { return null; }
        public int getDesiredMinimumWidth() { return 0; }
        public int getDesiredMinimumHeight() { return 0; }
        public boolean isVisible() { return false; }
        public boolean supportsLocalColorExtraction() { return false; }
        public boolean isPreview() { return false; }
        @android.annotation.SystemApi
        public boolean isInAmbientMode() { return false; }
        public boolean shouldZoomOutWallpaper() { return false; }
        public void setTouchEventsEnabled(boolean p0) {}
        public void setOffsetNotificationsEnabled(boolean p0) {}
        public void setFixedSizeAllowed(boolean p0) {}
        public float getZoom() { return 0.0f; }
        public void onCreate(android.view.SurfaceHolder p0) {}
        public void onDestroy() {}
        public void onVisibilityChanged(boolean p0) {}
        public void onApplyWindowInsets(android.view.WindowInsets p0) {}
        public void onTouchEvent(android.view.MotionEvent p0) {}
        public void onOffsetsChanged(float p0, float p1, float p2, float p3, int p4, int p5) {}
        public android.os.Bundle onCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) { return null; }
        @android.annotation.SystemApi
        public void onAmbientModeChanged(boolean p0, long p1) {}
        public void onDesiredSizeChanged(int p0, int p1) {}
        public void onSurfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
        public void onSurfaceRedrawNeeded(android.view.SurfaceHolder p0) {}
        public void onSurfaceCreated(android.view.SurfaceHolder p0) {}
        public void onSurfaceDestroyed(android.view.SurfaceHolder p0) {}
        public void onZoomChanged(float p0) {}
        public void notifyColorsChanged() {}
        public android.app.WallpaperColors onComputeColors() { return null; }
        public void notifyLocalColorsChanged(java.util.List<android.graphics.RectF> p0, java.util.List<android.app.WallpaperColors> p1) throws java.lang.RuntimeException {}
        private void setPrimaryWallpaperColors(android.app.WallpaperColors p0) {}
        private void updateSurfaceDimming() {}
        public void setCreated(boolean p0) {}
        protected void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
        public void setZoom(float p0) {}
        private void dispatchPointer(android.view.MotionEvent p0) {}
        void updateSurface(boolean p0, boolean p1, boolean p2) {}
        private void scalePreview(android.graphics.Rect p0) {}
        private void reposition() {}
        void attach(android.service.wallpaper.WallpaperService.IWallpaperEngineWrapper p0) {}
        public android.content.Context getDisplayContext() { return null; }
        public void doAmbientModeChanged(boolean p0, long p1) {}
        void doDesiredSizeChanged(int p0, int p1) {}
        void doDisplayPaddingChanged(android.graphics.Rect p0) {}
        void doVisibilityChanged(boolean p0) {}
        void reportVisibility() {}
        void doOffsetsChanged(boolean p0) {}
        private void processLocalColors(float p0, float p1) {}
        private void initWindowPages(android.service.wallpaper.EngineWindowPage[] p0, float p1) {}
        void updatePage(android.service.wallpaper.EngineWindowPage p0, int p1, int p2, float p3) {}
        private void updatePageColors(android.service.wallpaper.EngineWindowPage p0, int p1, int p2, float p3) {}
        private android.graphics.RectF generateSubRect(android.graphics.RectF p0, int p1, int p2) { return null; }
        private void resetWindowPages() {}
        private int getRectFPage(android.graphics.RectF p0, float p1) { return 0; }
        public void addLocalColorsAreas(java.util.List<android.graphics.RectF> p0) {}
        public void removeLocalColorsAreas(java.util.List<android.graphics.RectF> p0) {}
        private java.util.List<android.app.WallpaperColors> getLocalWallpaperColors(java.util.List<android.graphics.RectF> p0) { return null; }
        private android.graphics.Rect fixRect(android.graphics.Bitmap p0, android.graphics.Rect p1) { return null; }
        private boolean validStep(float p0) { return false; }
        void doCommand(android.service.wallpaper.WallpaperService.WallpaperCommand p0) {}
        void reportSurfaceDestroyed() {}
        void detach() {}
        private android.view.Surface getOrCreateBLASTSurface(int p0, int p1, int p2) { return null; }

        final class WallpaperInputEventReceiver extends android.view.InputEventReceiver {
            public WallpaperInputEventReceiver(android.service.wallpaper.WallpaperService.Engine p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
            public void onInputEvent(android.view.InputEvent p0) {}
        }
    }

    class IWallpaperEngineWrapper extends android.service.wallpaper.IWallpaperEngine.Stub implements com.android.internal.os.HandlerCaller.Callback {
        private final com.android.internal.os.HandlerCaller mCaller = null;
        final android.service.wallpaper.IWallpaperConnection mConnection = null;
        final android.os.IBinder mWindowToken = null;
        final int mWindowType = 0;
        final boolean mIsPreview = false;
        boolean mShownReported;
        int mReqWidth;
        int mReqHeight;
        final android.graphics.Rect mDisplayPadding = null;
        final int mDisplayId = 0;
        final android.hardware.display.DisplayManager mDisplayManager = null;
        final android.view.Display mDisplay = null;
        final android.app.WallpaperManager mWallpaperManager = null;
        private final java.util.concurrent.atomic.AtomicBoolean mDetached = null;
        android.service.wallpaper.WallpaperService.Engine mEngine;
        IWallpaperEngineWrapper(android.service.wallpaper.WallpaperService p0, android.service.wallpaper.WallpaperService p1, android.service.wallpaper.IWallpaperConnection p2, android.os.IBinder p3, int p4, boolean p5, int p6, int p7, android.graphics.Rect p8, int p9) { super(); }
        public void setDesiredSize(int p0, int p1) {}
        public void setDisplayPadding(android.graphics.Rect p0) {}
        public void setVisibility(boolean p0) {}
        public void setInAmbientMode(boolean p0, long p1) throws android.os.RemoteException {}
        public void dispatchPointer(android.view.MotionEvent p0) {}
        public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4) {}
        public void setZoomOut(float p0) {}
        public void reportShown() {}
        public void requestWallpaperColors() {}
        public void addLocalColorsAreas(java.util.List<android.graphics.RectF> p0) {}
        public void removeLocalColorsAreas(java.util.List<android.graphics.RectF> p0) {}
        public void destroy() {}
        public void detach() {}
        public void scalePreview(android.graphics.Rect p0) {}
        public android.view.SurfaceControl mirrorSurfaceControl() { return null; }
        private void doDetachEngine() {}
        public void executeMessage(android.os.Message p0) {}
    }

    class IWallpaperServiceWrapper extends android.service.wallpaper.IWallpaperService.Stub {
        private final android.service.wallpaper.WallpaperService mTarget = null;
        private android.service.wallpaper.WallpaperService.IWallpaperEngineWrapper mEngineWrapper;
        public IWallpaperServiceWrapper(android.service.wallpaper.WallpaperService p0, android.service.wallpaper.WallpaperService p1) { super(); }
        public void attach(android.service.wallpaper.IWallpaperConnection p0, android.os.IBinder p1, int p2, boolean p3, int p4, int p5, android.graphics.Rect p6, int p7) {}
        public void detach() {}
    }

    static final class WallpaperCommand {
        java.lang.String action;
        int x;
        int y;
        int z;
        android.os.Bundle extras;
        boolean sync;
        WallpaperCommand() {}
    }
}
