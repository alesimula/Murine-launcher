package android.text.method;

public class ArrowKeyMovementMethod extends android.text.method.BaseMovementMethod implements android.text.method.MovementMethod {
    public ArrowKeyMovementMethod() { super(); }
    protected boolean handleMovementKey(android.widget.TextView p0, android.text.Spannable p1, int p2, int p3, android.view.KeyEvent p4) { return false; }
    protected boolean left(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean right(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean up(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean down(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean pageUp(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean pageDown(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean top(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean bottom(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean lineStart(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean lineEnd(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean leftWord(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean rightWord(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean home(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean end(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    public boolean previousParagraph(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    public boolean nextParagraph(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    public boolean onTouchEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2) { return false; }
    public boolean canSelectArbitrarily() { return false; }
    public void initialize(android.widget.TextView p0, android.text.Spannable p1) {}
    public void onTakeFocus(android.widget.TextView p0, android.text.Spannable p1, int p2) {}
    public static android.text.method.MovementMethod getInstance() { return null; }
}
