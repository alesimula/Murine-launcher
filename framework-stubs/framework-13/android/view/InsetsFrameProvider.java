package android.view;

public class InsetsFrameProvider implements android.os.Parcelable {
    public static final int SOURCE_DISPLAY = 0;
    public static final int SOURCE_CONTAINER_BOUNDS = 1;
    public static final int SOURCE_FRAME = 2;
    public int type;
    public int source;
    public android.graphics.Insets insetsSize;
    public android.view.InsetsFrameProvider.InsetsSizeOverride[] insetsSizeOverrides;
    public static final android.os.Parcelable.Creator<android.view.InsetsFrameProvider> CREATOR = null;
    public InsetsFrameProvider(int p0) {}
    public InsetsFrameProvider(int p0, android.graphics.Insets p1) {}
    public InsetsFrameProvider(int p0, int p1, android.graphics.Insets p2, android.view.InsetsFrameProvider.InsetsSizeOverride[] p3) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public InsetsFrameProvider(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static void calculateInsetsFrame(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, int p4, android.graphics.Insets p5, int p6) {}

    public static class InsetsSizeOverride implements android.os.Parcelable {
        public final int windowType = 0;
        public android.graphics.Insets insetsSize;
        public static final android.os.Parcelable.Creator<android.view.InsetsFrameProvider.InsetsSizeOverride> CREATOR = null;
        protected InsetsSizeOverride(android.os.Parcel p0) {}
        public InsetsSizeOverride(int p0, android.graphics.Insets p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
    }
}
