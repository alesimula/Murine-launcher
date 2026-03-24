package android.text.style;

public abstract class CharacterStyle {
    public CharacterStyle() {}
    public abstract void updateDrawState(android.text.TextPaint p0);
    public static android.text.style.CharacterStyle wrap(android.text.style.CharacterStyle p0) { return null; }
    public android.text.style.CharacterStyle getUnderlying() { return null; }

    private static class Passthrough extends android.text.style.CharacterStyle {
        private android.text.style.CharacterStyle mStyle;
        public Passthrough(android.text.style.CharacterStyle p0) { super(); }
        public void updateDrawState(android.text.TextPaint p0) {}
        public android.text.style.CharacterStyle getUnderlying() { return null; }
    }
}
