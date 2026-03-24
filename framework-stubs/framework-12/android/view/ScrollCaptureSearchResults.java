package android.view;

public final class ScrollCaptureSearchResults {
    private final java.util.concurrent.Executor mExecutor = null;
    private final java.util.List<android.view.ScrollCaptureTarget> mTargets = null;
    private final android.os.CancellationSignal mCancel = null;
    private java.lang.Runnable mOnCompleteListener;
    private int mCompleted;
    private boolean mComplete;
    private static final int AFTER = 1;
    private static final int BEFORE = -1;
    private static final int EQUAL = 0;
    static final java.util.Comparator<android.view.ScrollCaptureTarget> PRIORITY_ORDER = null;
    public ScrollCaptureSearchResults(java.util.concurrent.Executor p0) {}
    public void addTarget(android.view.ScrollCaptureTarget p0) {}
    public boolean isComplete() { return false; }
    public void setOnCompleteListener(java.lang.Runnable p0) {}
    public boolean isEmpty() { return false; }
    public void finish() {}
    private void signalComplete() {}
    public java.util.List<android.view.ScrollCaptureTarget> getTargets() { return null; }
    public android.view.ScrollCaptureTarget getTopResult() { return null; }
    private static int area(android.graphics.Rect p0) { return 0; }
    private static boolean nullOrEmpty(android.graphics.Rect p0) { return false; }
    private static boolean hasIncludeHint(android.view.View p0) { return false; }
    private static boolean isDescendant(android.view.View p0, android.view.View p1) { return false; }
    void dump(android.util.IndentingPrintWriter p0) {}

    private class SearchRequest implements java.util.function.Consumer<android.graphics.Rect> {
        private android.view.ScrollCaptureTarget mTarget;
        SearchRequest(android.view.ScrollCaptureSearchResults p0, android.view.ScrollCaptureTarget p1) {}
        public void accept(android.graphics.Rect p0) {}
        private void consume(android.graphics.Rect p0) {}
    }
}
