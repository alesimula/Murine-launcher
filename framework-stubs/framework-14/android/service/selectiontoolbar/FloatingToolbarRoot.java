package android.service.selectiontoolbar;

@android.annotation.SuppressLint("ViewConstructor")
public class FloatingToolbarRoot extends android.widget.LinearLayout {
    public FloatingToolbarRoot(android.content.Context p0, android.os.IBinder p1, android.service.selectiontoolbar.SelectionToolbarRenderService.TransferTouchListener p2) { super((android.content.Context)null); }
    public void setContentRect(android.graphics.Rect p0) {}
    @android.annotation.SuppressLint("ClickableViewAccessibility")
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
}
