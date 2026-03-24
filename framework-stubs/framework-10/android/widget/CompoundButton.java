package android.widget;

public abstract class CompoundButton extends android.widget.Button implements android.widget.Checkable {
    private static final java.lang.String LOG_TAG = null;
    private boolean mChecked;
    @android.annotation.UnsupportedAppUsage
    private boolean mBroadcasting;
    @android.annotation.UnsupportedAppUsage
    private android.graphics.drawable.Drawable mButtonDrawable;
    private android.content.res.ColorStateList mButtonTintList;
    private android.graphics.BlendMode mButtonBlendMode;
    private boolean mHasButtonTint;
    private boolean mHasButtonBlendMode;
    @android.annotation.UnsupportedAppUsage
    private android.widget.CompoundButton.OnCheckedChangeListener mOnCheckedChangeListener;
    private android.widget.CompoundButton.OnCheckedChangeListener mOnCheckedChangeWidgetListener;
    private boolean mCheckedFromResource;
    private static final int[] CHECKED_STATE_SET = null;
    public CompoundButton(android.content.Context p0) { super((android.content.Context)null); }
    public CompoundButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public CompoundButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public CompoundButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void toggle() {}
    public boolean performClick() { return false; }
    @android.view.ViewDebug.ExportedProperty
    public boolean isChecked() { return false; }
    public void setChecked(boolean p0) {}
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener p0) {}
    void setOnCheckedChangeWidgetListener(android.widget.CompoundButton.OnCheckedChangeListener p0) {}
    public void setButtonDrawable(int p0) {}
    public void setButtonDrawable(android.graphics.drawable.Drawable p0) {}
    public void onResolveDrawables(int p0) {}
    public android.graphics.drawable.Drawable getButtonDrawable() { return null; }
    public void setButtonTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getButtonTintList() { return null; }
    public void setButtonTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setButtonTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getButtonTintMode() { return null; }
    public android.graphics.BlendMode getButtonTintBlendMode() { return null; }
    private void applyButtonTint() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public int getCompoundPaddingLeft() { return 0; }
    public int getCompoundPaddingRight() { return 0; }
    public int getHorizontalOffsetForDrawables() { return 0; }
    protected void onDraw(android.graphics.Canvas p0) {}
    protected int[] onCreateDrawableState(int p0) { return null; }
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    public void autofill(android.view.autofill.AutofillValue p0) {}
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }

    static class SavedState extends android.view.View.BaseSavedState {
        boolean checked;
        public static final android.os.Parcelable.Creator<android.widget.CompoundButton.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public static interface OnCheckedChangeListener {
        public void onCheckedChanged(android.widget.CompoundButton p0, boolean p1);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.CompoundButton> {
        private boolean mPropertiesMapped;
        private int mButtonId;
        private int mButtonBlendModeId;
        private int mButtonTintId;
        private int mButtonTintModeId;
        private int mCheckedId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.CompoundButton p0, android.view.inspector.PropertyReader p1) {}
    }
}
