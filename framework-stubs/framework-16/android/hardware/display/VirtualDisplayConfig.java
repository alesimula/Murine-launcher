package android.hardware.display;

public final class VirtualDisplayConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.display.VirtualDisplayConfig> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getDensityDpi() { return 0; }
    public int getFlags() { return 0; }
    @android.annotation.Nullable
    public android.view.Surface getSurface() { return null; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.virtual_display_insets")
    @android.annotation.Nullable
    public android.view.DisplayCutout getDisplayCutout() { return null; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
    public float getDefaultBrightness() { return 0.0f; }
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
    public float getDimBrightness() { return 0.0f; }
    @android.annotation.Nullable
    public android.hardware.display.IBrightnessListener getBrightnessListener() { return null; }
    @android.annotation.Nullable
    public java.lang.String getUniqueId() { return null; }
    public int getDisplayIdToMirror() { return 0; }
    public boolean isWindowManagerMirroringEnabled() { return false; }
    @android.annotation.SystemApi
    public boolean isHomeSupported() { return false; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.window.flags.vdm_force_app_universal_resizable_api")
    public boolean isIgnoreActivitySizeRestrictions() { return false; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDisplayCategories() { return null; }
    public float getRequestedRefreshRate() { return 0.0f; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
    public static interface BrightnessListener {
        public void onBrightnessChanged(float p0);
    }

    private static class BrightnessListenerDelegate extends android.hardware.display.IBrightnessListener.Stub {
        BrightnessListenerDelegate(java.util.concurrent.Executor p0, android.hardware.display.VirtualDisplayConfig.BrightnessListener p1) { super(); }
        public void onBrightnessChanged(float p0) {}
    }

    public static final class Builder {
        public Builder(java.lang.String p0, int p1, int p2, int p3) {}
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setSurface(android.view.Surface p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setUniqueId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setDisplayIdToMirror(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setWindowManagerMirroringEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setDisplayCategories(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder addDisplayCategory(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setRequestedRefreshRate(float p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setHomeSupported(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.virtual_display_insets")
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setDisplayCutout(android.view.DisplayCutout p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.FlaggedApi("com.android.window.flags.vdm_force_app_universal_resizable_api")
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setIgnoreActivitySizeRestrictions(boolean p0) { return null; }
        @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setDefaultBrightness(float p0) { return null; }
        @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setDimBrightness(float p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.device_aware_display_power")
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig.Builder setBrightnessListener(java.util.concurrent.Executor p0, android.hardware.display.VirtualDisplayConfig.BrightnessListener p1) { return null; }
        @android.annotation.NonNull
        public android.hardware.display.VirtualDisplayConfig build() { return null; }
    }
}
