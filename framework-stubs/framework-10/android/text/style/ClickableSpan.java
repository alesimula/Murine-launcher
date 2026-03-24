package android.text.style;

public abstract class ClickableSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    private static int sIdCounter;
    private int mId;
    public ClickableSpan() { super(); }
    public abstract void onClick(android.view.View p0);
    public void updateDrawState(android.text.TextPaint p0) {}
    public int getId() { return 0; }
}
