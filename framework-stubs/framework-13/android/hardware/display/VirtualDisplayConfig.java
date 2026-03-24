package android.hardware.display;

public final class VirtualDisplayConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.display.VirtualDisplayConfig> CREATOR = null;
    VirtualDisplayConfig(java.lang.String p0, int p1, int p2, int p3, int p4, android.view.Surface p5, java.lang.String p6, int p7, boolean p8) {}
    public java.lang.String getName() { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getDensityDpi() { return 0; }
    public int getFlags() { return 0; }
    public android.view.Surface getSurface() { return null; }
    public java.lang.String getUniqueId() { return null; }
    public int getDisplayIdToMirror() { return 0; }
    public boolean isWindowManagerMirroring() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    VirtualDisplayConfig(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(java.lang.String p0, int p1, int p2, int p3) {}
        public android.hardware.display.VirtualDisplayConfig.Builder setName(java.lang.String p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setWidth(int p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setHeight(int p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setDensityDpi(int p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setFlags(int p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setSurface(android.view.Surface p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setUniqueId(java.lang.String p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setDisplayIdToMirror(int p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setWindowManagerMirroring(boolean p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig build() { return null; }
    }
}
