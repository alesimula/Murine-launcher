package android.app;

@android.annotation.SystemApi
public final class Vr2dDisplayProperties implements android.os.Parcelable {
    public static final int FLAG_VIRTUAL_DISPLAY_ENABLED = 1;
    public static final android.os.Parcelable.Creator<android.app.Vr2dDisplayProperties> CREATOR = null;
    public Vr2dDisplayProperties(int p0, int p1, int p2) {}
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getDpi() { return 0; }
    public int getAddedFlags() { return 0; }
    public int getRemovedFlags() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.app.Vr2dDisplayProperties.Builder setDimensions(int p0, int p1, int p2) { return null; }
        public android.app.Vr2dDisplayProperties.Builder setEnabled(boolean p0) { return null; }
        public android.app.Vr2dDisplayProperties.Builder addFlags(int p0) { return null; }
        public android.app.Vr2dDisplayProperties.Builder removeFlags(int p0) { return null; }
        public android.app.Vr2dDisplayProperties build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Vr2dDisplayFlag {
    }
}
