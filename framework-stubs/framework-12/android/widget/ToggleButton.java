package android.widget;

public class ToggleButton extends android.widget.CompoundButton {
    private java.lang.CharSequence mTextOn;
    private java.lang.CharSequence mTextOff;
    private android.graphics.drawable.Drawable mIndicatorDrawable;
    private static final int NO_ALPHA = 255;
    private float mDisabledAlpha;
    public ToggleButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public ToggleButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ToggleButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ToggleButton(android.content.Context p0) { super((android.content.Context)null); }
    public void setChecked(boolean p0) {}
    private void syncTextState() {}
    public java.lang.CharSequence getTextOn() { return null; }
    public void setTextOn(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getTextOff() { return null; }
    public void setTextOff(java.lang.CharSequence p0) {}
    public float getDisabledAlpha() { return 0.0f; }
    protected void onFinishInflate() {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    private void updateReferenceToIndicatorDrawable(android.graphics.drawable.Drawable p0) {}
    protected void drawableStateChanged() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected java.lang.CharSequence getButtonStateDescription() { return null; }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ToggleButton> {
        private boolean mPropertiesMapped;
        private int mDisabledAlphaId;
        private int mTextOffId;
        private int mTextOnId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ToggleButton p0, android.view.inspector.PropertyReader p1) {}
    }
}
