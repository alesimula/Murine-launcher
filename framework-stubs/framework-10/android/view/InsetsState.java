package android.view;

public class InsetsState implements android.os.Parcelable {
    static final int FIRST_TYPE = 0;
    public static final int TYPE_TOP_BAR = 0;
    public static final int TYPE_SIDE_BAR_1 = 1;
    public static final int TYPE_SIDE_BAR_2 = 2;
    public static final int TYPE_SIDE_BAR_3 = 3;
    public static final int TYPE_TOP_GESTURES = 4;
    public static final int TYPE_BOTTOM_GESTURES = 5;
    public static final int TYPE_LEFT_GESTURES = 6;
    public static final int TYPE_RIGHT_GESTURES = 7;
    public static final int TYPE_TOP_TAPPABLE_ELEMENT = 8;
    public static final int TYPE_BOTTOM_TAPPABLE_ELEMENT = 9;
    public static final int TYPE_IME = 10;
    static final int LAST_TYPE = 10;
    public static final int TYPE_NAVIGATION_BAR = 1;
    public static final int TYPE_SHELF = 1;
    static final int INSET_SIDE_LEFT = 0;
    static final int INSET_SIDE_TOP = 1;
    static final int INSET_SIDE_RIGHT = 2;
    static final int INSET_SIDE_BOTTOM = 3;
    static final int INSET_SIDE_UNKNWON = 4;
    private final android.util.ArrayMap<java.lang.Integer, android.view.InsetsSource> mSources = null;
    private final android.graphics.Rect mDisplayFrame = null;
    public static final android.os.Parcelable.Creator<android.view.InsetsState> CREATOR = null;
    public InsetsState() {}
    public InsetsState(android.view.InsetsState p0) {}
    public InsetsState(android.view.InsetsState p0, boolean p1) {}
    public android.view.WindowInsets calculateInsets(android.graphics.Rect p0, boolean p1, boolean p2, android.view.DisplayCutout p3, android.graphics.Rect p4, android.graphics.Rect p5, int p6, android.util.SparseIntArray p7) { return null; }
    private void processSource(android.view.InsetsSource p0, android.graphics.Rect p1, boolean p2, android.graphics.Insets[] p3, android.util.SparseIntArray p4, boolean[] p5) {}
    private void processSourceAsPublicType(android.view.InsetsSource p0, android.graphics.Insets[] p1, android.util.SparseIntArray p2, boolean[] p3, android.graphics.Insets p4, int p5) {}
    private int getInsetSide(android.graphics.Insets p0) { return 0; }
    public android.view.InsetsSource getSource(int p0) { return null; }
    public void setDisplayFrame(android.graphics.Rect p0) {}
    public android.graphics.Rect getDisplayFrame() { return null; }
    public void removeSource(int p0) {}
    public void set(android.view.InsetsState p0) {}
    public void set(android.view.InsetsState p0, boolean p1) {}
    public void addSource(android.view.InsetsSource p0) {}
    public int getSourcesCount() { return 0; }
    public android.view.InsetsSource sourceAt(int p0) { return null; }
    public static android.util.ArraySet<java.lang.Integer> toInternalType(int p0) { return null; }
    static int toPublicType(int p0) { return 0; }
    public static boolean getDefaultVisibility(int p0) { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public static java.lang.String typeToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public InsetsState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InternalInsetType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InsetSide {
    }
}
