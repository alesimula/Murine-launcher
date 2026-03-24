package android.view;

public class InsetsFrameProvider implements android.os.Parcelable {
    public static final int SOURCE_DISPLAY = 0;
    public static final int SOURCE_CONTAINER_BOUNDS = 1;
    public static final int SOURCE_FRAME = 2;
    public static final int SOURCE_ARBITRARY_RECTANGLE = 3;
    public static final int SOURCE_ATTACHED_CONTAINER_BOUNDS = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.InsetsFrameProvider> CREATOR = null;
    public InsetsFrameProvider(java.lang.Object p0, int p1, int p2) {}
    public int getId() { return 0; }
    public int getIndex() { return 0; }
    public int getType() { return 0; }
    public android.view.InsetsFrameProvider setSource(int p0) { return null; }
    public int getSource() { return 0; }
    public android.view.InsetsFrameProvider setFlags(int p0) { return null; }
    public android.view.InsetsFrameProvider setFlags(int p0, int p1) { return null; }
    public int getFlags() { return 0; }
    public boolean hasFlags(int p0) { return false; }
    public android.view.InsetsFrameProvider setInsetsSize(android.graphics.Insets p0) { return null; }
    public android.graphics.Insets getInsetsSize() { return null; }
    public android.view.InsetsFrameProvider setArbitraryRectangle(android.graphics.Rect p0) { return null; }
    public android.graphics.Rect getArbitraryRectangle() { return null; }
    public android.view.InsetsFrameProvider setInsetsSizeOverrides(android.view.InsetsFrameProvider.InsetsSizeOverride[] p0) { return null; }
    public android.view.InsetsFrameProvider.InsetsSizeOverride[] getInsetsSizeOverrides() { return null; }
    public android.view.InsetsFrameProvider setMinimalInsetsSizeInDisplayCutoutSafe(android.graphics.Insets p0) { return null; }
    public android.graphics.Insets getMinimalInsetsSizeInDisplayCutoutSafe() { return null; }
    public android.view.InsetsFrameProvider setBoundingRects(android.graphics.Rect[] p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Rect[] getBoundingRects() { return null; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public InsetsFrameProvider(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean idEquals(android.view.InsetsFrameProvider p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class InsetsSizeOverride implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.InsetsFrameProvider.InsetsSizeOverride> CREATOR = null;
        protected InsetsSizeOverride(android.os.Parcel p0) {}
        public InsetsSizeOverride(int p0, android.graphics.Insets p1) {}
        public int getWindowType() { return 0; }
        public android.graphics.Insets getInsetsSize() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
    }
}
