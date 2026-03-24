package android.hardware;

@android.annotation.FlaggedApi("android.hardware.flags.overlayproperties_class_api")
public final class OverlayProperties implements android.os.Parcelable {
    @android.annotation.FlaggedApi("android.hardware.flags.overlayproperties_class_api")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.OverlayProperties> CREATOR = null;
    public static android.hardware.OverlayProperties getDefault() { return null; }
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    @android.annotation.SuppressLint("ArrayReturn")
    @android.annotation.NonNull
    public android.hardware.LutProperties[] getLutProperties() { return null; }
    @android.annotation.FlaggedApi("android.hardware.flags.overlayproperties_class_api")
    public boolean isCombinationSupported(int p0, int p1) { return false; }
    @android.annotation.FlaggedApi("android.hardware.flags.overlayproperties_class_api")
    public boolean isMixedColorSpacesSupported() { return false; }
    @android.annotation.FlaggedApi("android.hardware.flags.overlayproperties_class_api")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("android.hardware.flags.overlayproperties_class_api")
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
