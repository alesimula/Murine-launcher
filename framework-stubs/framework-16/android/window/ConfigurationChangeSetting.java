package android.window;

public abstract class ConfigurationChangeSetting implements android.os.Parcelable {
    public static final int SETTING_TYPE_UNKNOWN = -1;
    public static final int SETTING_TYPE_DISPLAY_DENSITY = 0;
    public static final int SETTING_TYPE_FONT_SCALE = 1;
    public static final android.os.Parcelable.Creator<android.window.ConfigurationChangeSetting> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void apply(int p0) {}

    public static interface ConfigurationChangeSettingInternal {
        @android.annotation.NonNull
        public android.window.ConfigurationChangeSetting createImplFromParcel(int p0, android.os.Parcel p1);
    }

    public static class CreatorImpl implements android.os.Parcelable.Creator<android.window.ConfigurationChangeSetting> {
        public CreatorImpl(boolean p0) {}
        public android.window.ConfigurationChangeSetting createFromParcel(android.os.Parcel p0) { return null; }
        public android.window.ConfigurationChangeSetting[] newArray(int p0) { return null; }
    }

    public static class DensitySetting extends android.window.ConfigurationChangeSetting {
        protected final int mDisplayId = 0;
        protected final int mDensity = 0;
        public static final android.os.Parcelable.Creator<android.window.ConfigurationChangeSetting.DensitySetting> CREATOR = null;
        public DensitySetting(int p0, int p1) { super(); }
        protected DensitySetting(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static class FontScaleSetting extends android.window.ConfigurationChangeSetting {
        protected final float mFontScaleFactor = 0.0f;
        public static final android.os.Parcelable.Creator<android.window.ConfigurationChangeSetting.FontScaleSetting> CREATOR = null;
        public FontScaleSetting(float p0) { super(); }
        protected FontScaleSetting(android.os.Parcel p0) { super(); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SettingType {
    }
}
