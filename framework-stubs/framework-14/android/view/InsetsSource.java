package android.view;

public class InsetsSource implements android.os.Parcelable {
    public static final int ID_IME = Integer.valueOf(0);
    public static final int FLAG_SUPPRESS_SCRIM = 1;
    public static final android.os.Parcelable.Creator<android.view.InsetsSource> CREATOR = null;
    public InsetsSource(int p0, int p1) {}
    public InsetsSource(android.view.InsetsSource p0) {}
    public void set(android.view.InsetsSource p0) {}
    public android.view.InsetsSource setFrame(int p0, int p1, int p2, int p3) { return null; }
    public android.view.InsetsSource setFrame(android.graphics.Rect p0) { return null; }
    public android.view.InsetsSource setVisibleFrame(android.graphics.Rect p0) { return null; }
    public android.view.InsetsSource setVisible(boolean p0) { return null; }
    public android.view.InsetsSource setFlags(int p0) { return null; }
    public int getId() { return 0; }
    public int getType() { return 0; }
    public android.graphics.Rect getFrame() { return null; }
    public android.graphics.Rect getVisibleFrame() { return null; }
    public boolean isVisible() { return false; }
    public int getFlags() { return 0; }
    boolean isUserControllable() { return false; }
    public boolean insetsRoundedCornerFrame() { return false; }
    public android.view.InsetsSource setInsetsRoundedCornerFrame(boolean p0) { return null; }
    public android.graphics.Insets calculateInsets(android.graphics.Rect p0, boolean p1) { return null; }
    public android.graphics.Insets calculateVisibleInsets(android.graphics.Rect p0) { return null; }
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
}
