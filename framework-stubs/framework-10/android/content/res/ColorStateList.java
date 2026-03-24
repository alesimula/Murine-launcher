package android.content.res;

public class ColorStateList extends android.content.res.ComplexColor implements android.os.Parcelable {
    private static final java.lang.String TAG = "ColorStateList";
    private static final int DEFAULT_COLOR = -65536;
    private static final int[][] EMPTY = null;
    private static final android.util.SparseArray<java.lang.ref.WeakReference<android.content.res.ColorStateList>> sCache = null;
    @android.annotation.UnsupportedAppUsage
    private android.content.res.ColorStateList.ColorStateListFactory mFactory;
    private int[][] mThemeAttrs;
    private int mChangingConfigurations;
    @android.annotation.UnsupportedAppUsage
    private int[][] mStateSpecs;
    @android.annotation.UnsupportedAppUsage
    private int[] mColors;
    @android.annotation.UnsupportedAppUsage
    private int mDefaultColor;
    private boolean mIsOpaque;
    public static final android.os.Parcelable.Creator<android.content.res.ColorStateList> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    private ColorStateList() { super(); }
    public ColorStateList(int[][] p0, int[] p1) { super(); }
    public static android.content.res.ColorStateList valueOf(int p0) { return null; }
    private ColorStateList(android.content.res.ColorStateList p0) { super(); }
    @java.lang.Deprecated
    public static android.content.res.ColorStateList createFromXml(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.content.res.ColorStateList createFromXml(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.content.res.Resources.Theme p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    static android.content.res.ColorStateList createFromXmlInner(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public android.content.res.ColorStateList withAlpha(int p0) { return null; }
    private void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    @android.annotation.UnsupportedAppUsage
    public boolean canApplyTheme() { return false; }
    private void applyTheme(android.content.res.Resources.Theme p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.content.res.ColorStateList obtainForTheme(android.content.res.Resources.Theme p0) { return null; }
    public int getChangingConfigurations() { return 0; }
    private int modulateColorAlpha(int p0, float p1) { return 0; }
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public boolean isOpaque() { return false; }
    public int getColorForState(int[] p0, int p1) { return 0; }
    public int getDefaultColor() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int[][] getStates() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int[] getColors() { return null; }
    public boolean hasState(int p0) { return false; }
    public java.lang.String toString() { return null; }
    @android.annotation.UnsupportedAppUsage
    private void onColorsChanged() {}
    public android.content.res.ConstantState<android.content.res.ComplexColor> getConstantState() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    private static class ColorStateListFactory extends android.content.res.ConstantState<android.content.res.ComplexColor> {
        private final android.content.res.ColorStateList mSrc = null;
        @android.annotation.UnsupportedAppUsage
        public ColorStateListFactory(android.content.res.ColorStateList p0) { super(); }
        public int getChangingConfigurations() { return 0; }
        public android.content.res.ColorStateList newInstance() { return null; }
        public android.content.res.ColorStateList newInstance(android.content.res.Resources p0, android.content.res.Resources.Theme p1) { return null; }
    }
}
