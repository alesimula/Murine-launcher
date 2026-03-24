package android.widget;

public class EditText extends android.widget.TextView {
    public EditText(android.content.Context p0) { super((android.content.Context)null); }
    public EditText(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public EditText(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public EditText(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public boolean getFreezesText() { return false; }
    protected boolean getDefaultEditable() { return false; }
    protected android.text.method.MovementMethod getDefaultMovementMethod() { return null; }
    public android.text.Editable getText() { return null; }
    public void setText(java.lang.CharSequence p0, android.widget.TextView.BufferType p1) {}
    public void setSelection(int p0, int p1) {}
    public void setSelection(int p0) {}
    public void selectAll() {}
    public void extendSelection(int p0) {}
    public void setEllipsize(android.text.TextUtils.TruncateAt p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected boolean supportsAutoSizeText() { return false; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onTextContextMenuItem(int p0) { return false; }
    public void setStyleShortcutsEnabled(boolean p0) {}
    public boolean isStyleShortcutEnabled() { return false; }
}
