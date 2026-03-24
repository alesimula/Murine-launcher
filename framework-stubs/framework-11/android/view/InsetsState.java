package android.view;

public class InsetsState implements android.os.Parcelable {
    public static final android.view.InsetsState EMPTY = null;
    public static final int ITYPE_INVALID = -1;
    static final int FIRST_TYPE = 0;
    public static final int ITYPE_STATUS_BAR = 0;
    public static final int ITYPE_NAVIGATION_BAR = 1;
    public static final int ITYPE_CAPTION_BAR = 2;
    public static final int ITYPE_TOP_GESTURES = 3;
    public static final int ITYPE_BOTTOM_GESTURES = 4;
    public static final int ITYPE_LEFT_GESTURES = 5;
    public static final int ITYPE_RIGHT_GESTURES = 6;
    public static final int ITYPE_TOP_MANDATORY_GESTURES = 7;
    public static final int ITYPE_BOTTOM_MANDATORY_GESTURES = 8;
    public static final int ITYPE_LEFT_MANDATORY_GESTURES = 9;
    public static final int ITYPE_RIGHT_MANDATORY_GESTURES = 10;
    public static final int ITYPE_TOP_TAPPABLE_ELEMENT = 11;
    public static final int ITYPE_BOTTOM_TAPPABLE_ELEMENT = 12;
    public static final int ITYPE_LEFT_DISPLAY_CUTOUT = 13;
    public static final int ITYPE_TOP_DISPLAY_CUTOUT = 14;
    public static final int ITYPE_RIGHT_DISPLAY_CUTOUT = 15;
    public static final int ITYPE_BOTTOM_DISPLAY_CUTOUT = 16;
    public static final int ITYPE_IME = 17;
    public static final int ITYPE_CLIMATE_BAR = 18;
    public static final int ITYPE_EXTRA_NAVIGATION_BAR = 19;
    static final int LAST_TYPE = 19;
    public static final int SIZE = 20;
    public static final int ITYPE_SHELF = 1;
    static final int ISIDE_LEFT = 0;
    static final int ISIDE_TOP = 1;
    static final int ISIDE_RIGHT = 2;
    static final int ISIDE_BOTTOM = 3;
    static final int ISIDE_FLOATING = 4;
    static final int ISIDE_UNKNOWN = 5;
    private android.view.InsetsSource[] mSources;
    private final android.graphics.Rect mDisplayFrame = null;
    public static final android.os.Parcelable.Creator<android.view.InsetsState> CREATOR = null;
    public InsetsState() {}
    public InsetsState(android.view.InsetsState p0) {}
    public InsetsState(android.view.InsetsState p0, boolean p1) {}
    public android.view.WindowInsets calculateInsets(android.graphics.Rect p0, android.view.InsetsState p1, boolean p2, boolean p3, android.view.DisplayCutout p4, int p5, int p6, int p7, android.util.SparseIntArray p8) { return null; }
    public android.graphics.Rect calculateVisibleInsets(android.graphics.Rect p0, int p1) { return null; }
    public int calculateUncontrollableInsetsFromFrame(android.graphics.Rect p0) { return 0; }
    private boolean canControlSide(android.graphics.Rect p0, int p1) { return false; }
    private void processSource(android.view.InsetsSource p0, android.graphics.Rect p1, boolean p2, android.graphics.Insets[] p3, android.util.SparseIntArray p4, boolean[] p5) {}
    private void processSourceAsPublicType(android.view.InsetsSource p0, android.graphics.Insets[] p1, android.util.SparseIntArray p2, boolean[] p3, android.graphics.Insets p4, int p5) {}
    private int getInsetSide(android.graphics.Insets p0) { return 0; }
    public android.view.InsetsSource getSource(int p0) { return null; }
    public android.view.InsetsSource peekSource(int p0) { return null; }
    public boolean hasSources() { return false; }
    public boolean getSourceOrDefaultVisibility(int p0) { return false; }
    public void setDisplayFrame(android.graphics.Rect p0) {}
    public android.graphics.Rect getDisplayFrame() { return null; }
    public void removeSource(int p0) {}
    public void setSourceVisible(int p0, boolean p1) {}
    public void set(android.view.InsetsState p0) {}
    public void set(android.view.InsetsState p0, boolean p1) {}
    public void addSource(android.view.InsetsSource p0) {}
    public static android.util.ArraySet<java.lang.Integer> toInternalType(int p0) { return null; }
    public static int toPublicType(int p0) { return 0; }
    public static boolean getDefaultVisibility(int p0) { return false; }
    public static boolean containsType(int[] p0, int p1) { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public static java.lang.String typeToString(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(java.lang.Object p0, boolean p1, boolean p2) { return false; }
    public int hashCode() { return 0; }
    public InsetsState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InternalInsetsSide {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InternalInsetsType {
    }
}
