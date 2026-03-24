package android.text.method;

public interface MovementMethod {
    public void initialize(android.widget.TextView p0, android.text.Spannable p1);
    public boolean onKeyDown(android.widget.TextView p0, android.text.Spannable p1, int p2, android.view.KeyEvent p3);
    public boolean onKeyUp(android.widget.TextView p0, android.text.Spannable p1, int p2, android.view.KeyEvent p3);
    public boolean onKeyOther(android.widget.TextView p0, android.text.Spannable p1, android.view.KeyEvent p2);
    public void onTakeFocus(android.widget.TextView p0, android.text.Spannable p1, int p2);
    public boolean onTrackballEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2);
    public boolean onTouchEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2);
    public boolean onGenericMotionEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2);
    public boolean canSelectArbitrarily();
}
