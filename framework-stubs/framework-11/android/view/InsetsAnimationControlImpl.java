package android.view;

public class InsetsAnimationControlImpl implements android.view.WindowInsetsAnimationController, android.view.InsetsAnimationControlRunner {
    private static final java.lang.String TAG = "InsetsAnimationCtrlImpl";
    private final android.graphics.Rect mTmpFrame = null;
    private final android.view.WindowInsetsAnimationControlListener mListener = null;
    private final android.util.SparseArray<android.view.InsetsSourceControl> mControls = null;
    private final android.util.SparseIntArray mTypeSideMap = null;
    private final android.util.SparseSetArray<android.view.InsetsSourceControl> mSideSourceMap = null;
    private final android.graphics.Insets mHiddenInsets = null;
    private final android.graphics.Insets mShownInsets = null;
    private final android.graphics.Matrix mTmpMatrix = null;
    private final android.view.InsetsState mInitialInsetsState = null;
    private final int mAnimationType = 0;
    private final int mTypes = 0;
    private final android.view.InsetsAnimationControlCallbacks mController = null;
    private final android.view.WindowInsetsAnimation mAnimation = null;
    private final boolean mHasZeroInsetsIme = false;
    private android.graphics.Insets mCurrentInsets;
    private android.graphics.Insets mPendingInsets;
    private float mPendingFraction;
    private boolean mFinished;
    private boolean mCancelled;
    private boolean mShownOnFinish;
    private float mCurrentAlpha;
    private float mPendingAlpha;
    public boolean mReadyDispatched;
    private java.lang.Boolean mPerceptible;
    public InsetsAnimationControlImpl(android.util.SparseArray<android.view.InsetsSourceControl> p0, android.graphics.Rect p1, android.view.InsetsState p2, android.view.WindowInsetsAnimationControlListener p3, int p4, android.view.InsetsAnimationControlCallbacks p5, long p6, android.view.animation.Interpolator p7, int p8) {}
    private boolean calculatePerceptible(android.graphics.Insets p0, float p1) { return false; }
    public boolean hasZeroInsetsIme() { return false; }
    public android.graphics.Insets getHiddenStateInsets() { return null; }
    public android.graphics.Insets getShownStateInsets() { return null; }
    public android.graphics.Insets getCurrentInsets() { return null; }
    public float getCurrentAlpha() { return 0.0f; }
    public int getTypes() { return 0; }
    public int getAnimationType() { return 0; }
    public void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2) {}
    private void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2, boolean p3) {}
    public boolean applyChangeInsets(android.view.InsetsState p0) { return false; }
    private void releaseLeashes() {}
    public void finish(boolean p0) {}
    public float getCurrentFraction() { return 0.0f; }
    public void cancel() {}
    public boolean isFinished() { return false; }
    public boolean isCancelled() { return false; }
    public android.view.WindowInsetsAnimation getAnimation() { return null; }
    android.view.WindowInsetsAnimationControlListener getListener() { return null; }
    android.util.SparseArray<android.view.InsetsSourceControl> getControls() { return null; }
    private android.graphics.Insets calculateInsets(android.view.InsetsState p0, android.graphics.Rect p1, android.util.SparseArray<android.view.InsetsSourceControl> p2, boolean p3, android.util.SparseIntArray p4) { return null; }
    private android.graphics.Insets getInsetsFromState(android.view.InsetsState p0, android.graphics.Rect p1, android.util.SparseIntArray p2) { return null; }
    private android.graphics.Insets sanitize(android.graphics.Insets p0) { return null; }
    private static float sanitize(float p0) { return 0.0f; }
    private void updateLeashesForSide(int p0, int p1, int p2, int p3, java.util.ArrayList<android.view.SyncRtSurfaceTransactionApplier.SurfaceParams> p4, android.view.InsetsState p5, java.lang.Float p6) {}
    private void addTranslationToMatrix(int p0, int p1, android.graphics.Matrix p2, android.graphics.Rect p3) {}
    private static void buildTypeSourcesMap(android.util.SparseIntArray p0, android.util.SparseSetArray<android.view.InsetsSourceControl> p1, android.util.SparseArray<android.view.InsetsSourceControl> p2) {}
}
