package android.view;

public final class ScrollCaptureSearchResults {
    static final java.util.Comparator<android.view.ScrollCaptureTarget> PRIORITY_ORDER = null;
    public ScrollCaptureSearchResults(java.util.concurrent.Executor p0) {}
    public void addTarget(android.view.ScrollCaptureTarget p0) {}
    public boolean isComplete() { return false; }
    public void setOnCompleteListener(java.lang.Runnable p0) {}
    public boolean isEmpty() { return false; }
    public void finish() {}
    public java.util.List<android.view.ScrollCaptureTarget> getTargets() { return null; }
    @android.annotation.Nullable
    public android.view.ScrollCaptureTarget getTopResult() { return null; }
    void dump(android.util.IndentingPrintWriter p0) {}

    private class SearchRequest implements java.util.function.Consumer<android.graphics.Rect> {
        SearchRequest(android.view.ScrollCaptureSearchResults p0, android.view.ScrollCaptureTarget p1) {}
        public void accept(android.graphics.Rect p0) {}
    }
}
