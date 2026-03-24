package android.text.style;

public abstract class MetricAffectingSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateLayout {
    public MetricAffectingSpan() { super(); }
    public abstract void updateMeasureState(android.text.TextPaint p0);
    public android.text.style.MetricAffectingSpan getUnderlying() { return null; }

    static class Passthrough extends android.text.style.MetricAffectingSpan {
        Passthrough(android.text.style.MetricAffectingSpan p0) { super(); }
        public void updateDrawState(android.text.TextPaint p0) {}
        public void updateMeasureState(android.text.TextPaint p0) {}
        public android.text.style.MetricAffectingSpan getUnderlying() { return null; }
    }
}
