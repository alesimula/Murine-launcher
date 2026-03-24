package android.view;

public class InsetsSource implements android.os.Parcelable {
    static final int SIDE_NONE = 0;
    static final int SIDE_LEFT = 1;
    static final int SIDE_TOP = 2;
    static final int SIDE_RIGHT = 3;
    static final int SIDE_BOTTOM = 4;
    static final int SIDE_UNKNOWN = 5;
    public static final int ID_IME = Integer.valueOf(0);
    public static final int ID_IME_CAPTION_BAR = Integer.valueOf(0);
    public static final int FLAG_SUPPRESS_SCRIM = 1;
    public static final int FLAG_INSETS_ROUNDED_CORNER = 2;
    public static final int FLAG_FORCE_CONSUMING = 4;
    public static final int FLAG_ANIMATE_RESIZING = 8;
    public static final int FLAG_FORCE_CONSUMING_OPAQUE_CAPTION_BAR = 16;
    public static final int FLAG_INVALID = 32;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.InsetsSource> CREATOR = null;
    public InsetsSource(int p0, int p1) {}
    public InsetsSource(android.view.InsetsSource p0) {}
    public void set(android.view.InsetsSource p0) {}
    public android.view.InsetsSource setFrame(int p0, int p1, int p2, int p3) { return null; }
    public android.view.InsetsSource setFrame(android.graphics.Rect p0) { return null; }
    public android.view.InsetsSource setVisibleFrame(android.graphics.Rect p0) { return null; }
    public android.view.InsetsSource setAttachedInsets(android.graphics.Insets p0) { return null; }
    public android.view.InsetsSource setVisible(boolean p0) { return null; }
    public android.view.InsetsSource setFlags(int p0) { return null; }
    public android.view.InsetsSource setFlags(int p0, int p1) { return null; }
    public android.view.InsetsSource updateSideHint(android.graphics.Rect p0) { return null; }
    public android.view.InsetsSource setBoundingRects(android.graphics.Rect[] p0) { return null; }
    public int getId() { return 0; }
    public int getType() { return 0; }
    public android.graphics.Rect getFrame() { return null; }
    @android.annotation.Nullable
    public android.graphics.Rect getVisibleFrame() { return null; }
    public boolean isVisible() { return false; }
    public int getFlags() { return 0; }
    public boolean hasFlags(int p0) { return false; }
    @android.annotation.Nullable
    public android.graphics.Rect[] getBoundingRects() { return null; }
    @android.annotation.Nullable
    public android.graphics.Insets getAttachedInsets() { return null; }
    public android.graphics.Insets calculateInsets(android.graphics.Rect p0, android.graphics.Rect p1, boolean p2) { return null; }
    public android.graphics.Insets calculateVisibleInsets(android.graphics.Rect p0, android.graphics.Rect p1) { return null; }
    @android.annotation.NonNull
    public android.graphics.Rect[] calculateBoundingRects(android.graphics.Rect p0, boolean p1) { return null; }
    static int getInsetSide(android.graphics.Insets p0) { return 0; }
    static java.lang.String sideToString(int p0) { return null; }
    public static int createId(java.lang.Object p0, int p1, int p2) { return 0; }
    public static int getIndex(int p0) { return 0; }
    public static int getType(int p0) { return 0; }
    public static java.lang.String flagsToString(int p0) { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(java.lang.Object p0, boolean p1) { return false; }
    public int hashCode() { return 0; }
    public InsetsSource(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InternalInsetsSide {
    }
}
