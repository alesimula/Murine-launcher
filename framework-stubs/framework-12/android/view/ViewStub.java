package android.view;

@android.widget.RemoteViews.RemoteView
public final class ViewStub extends android.view.View {
    private int mInflatedId;
    private int mLayoutResource;
    private java.lang.ref.WeakReference<android.view.View> mInflatedViewRef;
    private android.view.LayoutInflater mInflater;
    private android.view.ViewStub.OnInflateListener mInflateListener;
    public ViewStub(android.content.Context p0) { super((android.content.Context)null); }
    public ViewStub(android.content.Context p0, int p1) { super((android.content.Context)null); }
    public ViewStub(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ViewStub(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ViewStub(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public int getInflatedId() { return 0; }
    @android.view.RemotableViewMethod(asyncImpl="setInflatedIdAsync")
    public void setInflatedId(int p0) {}
    public java.lang.Runnable setInflatedIdAsync(int p0) { return null; }
    public int getLayoutResource() { return 0; }
    @android.view.RemotableViewMethod(asyncImpl="setLayoutResourceAsync")
    public void setLayoutResource(int p0) {}
    public java.lang.Runnable setLayoutResourceAsync(int p0) { return null; }
    public void setLayoutInflater(android.view.LayoutInflater p0) {}
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    protected void onMeasure(int p0, int p1) {}
    public void draw(android.graphics.Canvas p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setVisibilityAsync")
    public void setVisibility(int p0) {}
    public java.lang.Runnable setVisibilityAsync(int p0) { return null; }
    private android.view.View inflateViewNoAdd(android.view.ViewGroup p0) { return null; }
    private void replaceSelfWithView(android.view.View p0, android.view.ViewGroup p1) {}
    public android.view.View inflate() { return null; }
    public void setOnInflateListener(android.view.ViewStub.OnInflateListener p0) {}

    public static interface OnInflateListener {
        public void onInflate(android.view.ViewStub p0, android.view.View p1);
    }

    public class ViewReplaceRunnable implements java.lang.Runnable {
        public final android.view.View view = null;
        ViewReplaceRunnable(android.view.ViewStub p0, android.view.View p1) {}
        public void run() {}
    }
}
