package android.content.pm;

public class ConfigurationInfo implements android.os.Parcelable {
    public int reqTouchScreen;
    public int reqKeyboardType;
    public int reqNavigation;
    public static final int INPUT_FEATURE_HARD_KEYBOARD = 1;
    public static final int INPUT_FEATURE_FIVE_WAY_NAV = 2;
    public int reqInputFeatures;
    public static final int GL_ES_VERSION_UNDEFINED = 0;
    public int reqGlEsVersion;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.pm.ConfigurationInfo> CREATOR = null;
    public ConfigurationInfo() {}
    public ConfigurationInfo(android.content.pm.ConfigurationInfo p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getGlEsVersion() { return null; }
}
