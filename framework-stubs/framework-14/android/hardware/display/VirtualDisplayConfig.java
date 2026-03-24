package android.hardware.display;

public final class VirtualDisplayConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.display.VirtualDisplayConfig> CREATOR = null;
    public java.lang.String getName() { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getDensityDpi() { return 0; }
    public int getFlags() { return 0; }
    public android.view.Surface getSurface() { return null; }
    public java.lang.String getUniqueId() { return null; }
    public int getDisplayIdToMirror() { return 0; }
    public boolean isWindowManagerMirroringEnabled() { return false; }
    public java.util.Set<java.lang.String> getDisplayCategories() { return null; }
    public float getRequestedRefreshRate() { return 0.0f; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(java.lang.String p0, int p1, int p2, int p3) {}
        public android.hardware.display.VirtualDisplayConfig.Builder setFlags(int p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setSurface(android.view.Surface p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setUniqueId(java.lang.String p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setDisplayIdToMirror(int p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setWindowManagerMirroringEnabled(boolean p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setDisplayCategories(java.util.Set<java.lang.String> p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder addDisplayCategory(java.lang.String p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setRequestedRefreshRate(float p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig build() { return null; }
    }
}
