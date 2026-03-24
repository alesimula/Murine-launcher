package android.text.method;

public abstract class BaseKeyListener extends android.text.method.MetaKeyKeyListener implements android.text.method.KeyListener {
    static final java.lang.Object OLD_SEL_START = null;
    static android.graphics.Paint sCachedPaint;
    public BaseKeyListener() { super(); }
    public boolean backspace(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean forwardDelete(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    static int makeTextContentType(android.text.method.TextKeyListener.Capitalize p0, boolean p1) { return 0; }
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3) { return false; }
    public boolean onKeyOther(android.view.View p0, android.text.Editable p1, android.view.KeyEvent p2) { return false; }
}
