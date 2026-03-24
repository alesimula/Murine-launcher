package android.text.method;

public interface KeyListener {
    public int getInputType();
    public boolean onKeyDown(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3);
    public boolean onKeyUp(android.view.View p0, android.text.Editable p1, int p2, android.view.KeyEvent p3);
    public boolean onKeyOther(android.view.View p0, android.text.Editable p1, android.view.KeyEvent p2);
    public void clearMetaKeyState(android.view.View p0, android.text.Editable p1, int p2);
}
