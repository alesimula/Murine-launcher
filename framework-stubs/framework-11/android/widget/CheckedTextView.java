package android.widget;

public class CheckedTextView extends android.widget.TextView implements android.widget.Checkable {
    private boolean mChecked;
    private int mCheckMarkResource;
    private android.graphics.drawable.Drawable mCheckMarkDrawable;
    private android.content.res.ColorStateList mCheckMarkTintList;
    private android.graphics.BlendMode mCheckMarkBlendMode;
    private boolean mHasCheckMarkTint;
    private boolean mHasCheckMarkTintMode;
    private int mBasePadding;
    private int mCheckMarkWidth;
    private int mCheckMarkGravity;
    private boolean mNeedRequestlayout;
    private static final int[] CHECKED_STATE_SET = null;
    public CheckedTextView(android.content.Context p0) { super((android.content.Context)null); }
    public CheckedTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public CheckedTextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public CheckedTextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void toggle() {}
    @android.view.ViewDebug.ExportedProperty
    public boolean isChecked() { return false; }
    public void setChecked(boolean p0) {}
    public void setCheckMarkDrawable(int p0) {}
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable p0) {}
    private void setCheckMarkDrawableInternal(android.graphics.drawable.Drawable p0, int p1) {}
    public void setCheckMarkTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getCheckMarkTintList() { return null; }
    public void setCheckMarkTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setCheckMarkTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getCheckMarkTintMode() { return null; }
    public android.graphics.BlendMode getCheckMarkTintBlendMode() { return null; }
    private void applyCheckMarkTint() {}
    @android.view.RemotableViewMethod
    public void setVisibility(int p0) {}
    public void jumpDrawablesToCurrentState() {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public android.graphics.drawable.Drawable getCheckMarkDrawable() { return null; }
    protected void internalSetPadding(int p0, int p1, int p2, int p3) {}
    public void onRtlPropertiesChanged(int p0) {}
    private void updatePadding() {}
    private void setBasePadding(boolean p0) {}
    private boolean isCheckMarkAtStart() { return false; }
    protected void onDraw(android.graphics.Canvas p0) {}
    protected int[] onCreateDrawableState(int p0) { return null; }
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    static class SavedState extends android.view.View.BaseSavedState {
        boolean checked;
        public static final android.os.Parcelable.Creator<android.widget.CheckedTextView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        private SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.CheckedTextView> {
        private boolean mPropertiesMapped;
        private int mCheckMarkId;
        private int mCheckMarkTintId;
        private int mCheckMarkTintBlendModeId;
        private int mCheckMarkTintModeId;
        private int mCheckedId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.CheckedTextView p0, android.view.inspector.PropertyReader p1) {}
    }
}
