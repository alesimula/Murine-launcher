package android.content.pm;

public class LabeledIntent extends android.content.Intent {
    private java.lang.String mSourcePackage;
    private int mLabelRes;
    private java.lang.CharSequence mNonLocalizedLabel;
    private int mIcon;
    public static final android.os.Parcelable.Creator<android.content.pm.LabeledIntent> CREATOR = null;
    public LabeledIntent(android.content.Intent p0, java.lang.String p1, int p2, int p3) { super(); }
    public LabeledIntent(android.content.Intent p0, java.lang.String p1, java.lang.CharSequence p2, int p3) { super(); }
    public LabeledIntent(java.lang.String p0, int p1, int p2) { super(); }
    public LabeledIntent(java.lang.String p0, java.lang.CharSequence p1, int p2) { super(); }
    public java.lang.String getSourcePackage() { return null; }
    public int getLabelResource() { return 0; }
    public java.lang.CharSequence getNonLocalizedLabel() { return null; }
    public int getIconResource() { return 0; }
    public java.lang.CharSequence loadLabel(android.content.pm.PackageManager p0) { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.pm.PackageManager p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected LabeledIntent(android.os.Parcel p0) { super(); }
    public void readFromParcel(android.os.Parcel p0) {}
}
