package android.service.selectiontoolbar;

public final class RemoteSelectionToolbar {
    public RemoteSelectionToolbar(int p0, android.content.Context p1, long p2, android.view.selectiontoolbar.ShowInfo p3, android.service.selectiontoolbar.SelectionToolbarRenderService.RemoteCallbackWrapper p4, android.service.selectiontoolbar.SelectionToolbarRenderService.TransferTouchListener p5, android.service.selectiontoolbar.SelectionToolbarRenderService.OnPasteActionCallback p6) {}
    public void show(android.view.selectiontoolbar.ShowInfo p0) {}
    public void dismiss(long p0) {}
    public void hide(long p0) {}
    public boolean isShowing() { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    private static final class LogAccelerateInterpolator implements android.view.animation.Interpolator {
        public float getInterpolation(float p0) { return 0.0f; }
    }

    private static final class OverflowPanel extends android.widget.ListView {
        OverflowPanel(android.service.selectiontoolbar.RemoteSelectionToolbar p0) { super((android.content.Context)null); }
        protected void onMeasure(int p0, int p1) {}
        public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
        protected boolean awakenScrollBars() { return false; }
    }

    private static final class OverflowPanelViewHelper {
        OverflowPanelViewHelper(android.content.Context p0, int p1) {}
        public android.view.View getView(android.view.selectiontoolbar.ToolbarMenuItem p0, int p1, android.view.View p2) { return null; }
        public int calculateWidth(android.view.selectiontoolbar.ToolbarMenuItem p0) { return 0; }
    }
}
