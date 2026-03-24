package android.service.controls.templates;

public final class RangeTemplate extends android.service.controls.templates.ControlTemplate {
    private static final int TYPE = 2;
    private static final java.lang.String KEY_MIN_VALUE = "key_min_value";
    private static final java.lang.String KEY_MAX_VALUE = "key_max_value";
    private static final java.lang.String KEY_CURRENT_VALUE = "key_current_value";
    private static final java.lang.String KEY_STEP_VALUE = "key_step_value";
    private static final java.lang.String KEY_FORMAT_STRING = "key_format_string";
    private final float mMinValue = 0.0f;
    private final float mMaxValue = 0.0f;
    private final float mCurrentValue = 0.0f;
    private final float mStepValue = 0.0f;
    private final java.lang.CharSequence mFormatString = null;
    public RangeTemplate(java.lang.String p0, float p1, float p2, float p3, float p4, java.lang.CharSequence p5) { super((android.os.Bundle)null); }
    RangeTemplate(android.os.Bundle p0) { super((android.os.Bundle)null); }
    public float getMinValue() { return 0.0f; }
    public float getMaxValue() { return 0.0f; }
    public float getCurrentValue() { return 0.0f; }
    public float getStepValue() { return 0.0f; }
    public java.lang.CharSequence getFormatString() { return null; }
    public int getTemplateType() { return 0; }
    android.os.Bundle getDataBundle() { return null; }
    private void validate() {}
}
