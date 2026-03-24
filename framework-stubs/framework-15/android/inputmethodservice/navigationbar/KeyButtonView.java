package android.inputmethodservice.navigationbar;

public class KeyButtonView extends android.widget.ImageView implements android.inputmethodservice.navigationbar.ButtonInterface {
    public static final float QUICKSTEP_TOUCH_SLOP_RATIO = 3.0f;
    public KeyButtonView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public boolean isClickable() { return false; }
    public void setCode(int p0) {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected void onWindowVisibilityChanged(int p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setImageDrawable(android.graphics.drawable.Drawable p0) {}
    public void playSoundEffect(int p0) {}
    public void setDarkIntensity(float p0) {}
    public void setDelayTouchFeedback(boolean p0) {}
    public void draw(android.graphics.Canvas p0) {}
}
