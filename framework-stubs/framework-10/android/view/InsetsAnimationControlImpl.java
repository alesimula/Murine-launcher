package android.view;

public class InsetsAnimationControlImpl implements android.view.WindowInsetsAnimationController {
    private final android.graphics.Rect mTmpFrame = null;
    private final android.view.WindowInsetsAnimationControlListener mListener = null;
    private final android.util.SparseArray<android.view.InsetsSourceConsumer> mConsumers = null;
    private final android.util.SparseIntArray mTypeSideMap = null;
    private final android.util.SparseSetArray<android.view.InsetsSourceConsumer> mSideSourceMap = null;
    private final android.graphics.Insets mHiddenInsets = null;
    private final android.graphics.Insets mShownInsets = null;
    private final android.graphics.Matrix mTmpMatrix = null;
    private final android.view.InsetsState mInitialInsetsState = null;
    private final int mTypes = 0;
    private final java.util.function.Supplier<android.view.SyncRtSurfaceTransactionApplier> mTransactionApplierSupplier = null;
    private final android.view.InsetsController mController = null;
    private final android.view.WindowInsetsAnimationListener.InsetsAnimation mAnimation = null;
    private final android.graphics.Rect mFrame = null;
    private android.graphics.Insets mCurrentInsets;
    private android.graphics.Insets mPendingInsets;
    private boolean mFinished;
    private boolean mCancelled;
    private int mFinishedShownTypes;
    public InsetsAnimationControlImpl(android.util.SparseArray<android.view.InsetsSourceConsumer> p0, android.graphics.Rect p1, android.view.InsetsState p2, android.view.WindowInsetsAnimationControlListener p3, int p4, java.util.function.Supplier<android.view.SyncRtSurfaceTransactionApplier> p5, android.view.InsetsController p6) {}
    public android.graphics.Insets getHiddenStateInsets() { return null; }
    public android.graphics.Insets getShownStateInsets() { return null; }
    public android.graphics.Insets getCurrentInsets() { return null; }
    public int getTypes() { return 0; }
    public void changeInsets(android.graphics.Insets p0) {}
    public boolean applyChangeInsets(android.view.InsetsState p0) { return false; }
    public void finish(int p0) {}
    public void onCancelled() {}
    android.view.WindowInsetsAnimationListener.InsetsAnimation getAnimation() { return null; }
    private android.graphics.Insets calculateInsets(android.view.InsetsState p0, android.graphics.Rect p1, android.util.SparseArray<android.view.InsetsSourceConsumer> p2, boolean p3, android.util.SparseIntArray p4) { return null; }
    private android.graphics.Insets getInsetsFromState(android.view.InsetsState p0, android.graphics.Rect p1, android.util.SparseIntArray p2) { return null; }
    private android.graphics.Insets sanitize(android.graphics.Insets p0) { return null; }
    private void updateLeashesForSide(int p0, int p1, int p2, java.util.ArrayList<android.view.SyncRtSurfaceTransactionApplier.SurfaceParams> p3, android.view.InsetsState p4) {}
    private void addTranslationToMatrix(int p0, int p1, android.graphics.Matrix p2, android.graphics.Rect p3) {}
    private static void buildTypeSourcesMap(android.util.SparseIntArray p0, android.util.SparseSetArray<android.view.InsetsSourceConsumer> p1, android.util.SparseArray<android.view.InsetsSourceConsumer> p2) {}
}
