package android.text.method;

public class BaseMovementMethod implements android.text.method.MovementMethod {
    public BaseMovementMethod() {}
    public boolean canSelectArbitrarily() { return false; }
    public void initialize(android.widget.TextView p0, android.text.Spannable p1) {}
    public boolean onKeyDown(android.widget.TextView p0, android.text.Spannable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean onKeyOther(android.widget.TextView p0, android.text.Spannable p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(android.widget.TextView p0, android.text.Spannable p1, int p2, android.view.KeyEvent p3) { return false; }
    public void onTakeFocus(android.widget.TextView p0, android.text.Spannable p1, int p2) {}
    public boolean onTouchEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2) { return false; }
    public boolean onTrackballEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2) { return false; }
    public boolean onGenericMotionEvent(android.widget.TextView p0, android.text.Spannable p1, android.view.MotionEvent p2) { return false; }
    protected int getMovementMetaState(android.text.Spannable p0, android.view.KeyEvent p1) { return 0; }
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
    private int getTopLine(android.widget.TextView p0) { return 0; }
    private int getBottomLine(android.widget.TextView p0) { return 0; }
    private int getInnerWidth(android.widget.TextView p0) { return 0; }
    private int getInnerHeight(android.widget.TextView p0) { return 0; }
    private int getCharacterWidth(android.widget.TextView p0) { return 0; }
    private int getScrollBoundsLeft(android.widget.TextView p0) { return 0; }
    private int getScrollBoundsRight(android.widget.TextView p0) { return 0; }
    protected boolean scrollLeft(android.widget.TextView p0, android.text.Spannable p1, int p2) { return false; }
    protected boolean scrollRight(android.widget.TextView p0, android.text.Spannable p1, int p2) { return false; }
    protected boolean scrollUp(android.widget.TextView p0, android.text.Spannable p1, int p2) { return false; }
    protected boolean scrollDown(android.widget.TextView p0, android.text.Spannable p1, int p2) { return false; }
    protected boolean scrollPageUp(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean scrollPageDown(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean scrollTop(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean scrollBottom(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean scrollLineStart(android.widget.TextView p0, android.text.Spannable p1) { return false; }
    protected boolean scrollLineEnd(android.widget.TextView p0, android.text.Spannable p1) { return false; }
}
