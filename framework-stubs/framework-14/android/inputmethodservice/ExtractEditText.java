package android.inputmethodservice;

public class ExtractEditText extends android.widget.EditText {
    public ExtractEditText(android.content.Context p0) { super((android.content.Context)null); }
    public ExtractEditText(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ExtractEditText(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ExtractEditText(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void setIME(android.inputmethodservice.InputMethodService p0) {}
    public void startInternalChanges() {}
    public void finishInternalChanges() {}
    public void setExtractedText(android.view.inputmethod.ExtractedText p0) {}
    protected void onSelectionChanged(int p0, int p1) {}
    public boolean performClick() { return false; }
    public boolean onTextContextMenuItem(int p0) { return false; }
    public boolean isInputMethodTarget() { return false; }
    public boolean hasVerticalScrollBar() { return false; }
    public boolean hasWindowFocus() { return false; }
    public boolean isFocused() { return false; }
    public boolean hasFocus() { return false; }
    protected void viewClicked(android.view.inputmethod.InputMethodManager p0) {}
    public boolean isInExtractedMode() { return false; }
    protected void deleteText_internal(int p0, int p1) {}
    protected void replaceText_internal(int p0, int p1, java.lang.CharSequence p2) {}
    protected void setSpan_internal(java.lang.Object p0, int p1, int p2, int p3) {}
    protected void setCursorPosition_internal(int p0, int p1) {}
}
