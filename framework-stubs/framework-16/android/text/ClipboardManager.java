package android.text;

@java.lang.Deprecated
public abstract class ClipboardManager {
    public ClipboardManager() {}
    public abstract java.lang.CharSequence getText();
    public abstract void setText(java.lang.CharSequence p0);
    public abstract boolean hasText();
}
