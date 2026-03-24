package android.hardware.radio;

@android.annotation.SystemApi
public final class Announcement implements android.os.Parcelable {
    public static final int TYPE_EMERGENCY = 1;
    public static final int TYPE_WARNING = 2;
    public static final int TYPE_TRAFFIC = 3;
    public static final int TYPE_WEATHER = 4;
    public static final int TYPE_NEWS = 5;
    public static final int TYPE_EVENT = 6;
    public static final int TYPE_SPORT = 7;
    public static final int TYPE_MISC = 8;
    public static final android.os.Parcelable.Creator<android.hardware.radio.Announcement> CREATOR = null;
    public Announcement(android.hardware.radio.ProgramSelector p0, int p1, java.util.Map<java.lang.String, java.lang.String> p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public android.hardware.radio.ProgramSelector getSelector() { return null; }
    public int getType() { return 0; }
    public java.util.Map<java.lang.String, java.lang.String> getVendorInfo() { return null; }

    public static interface OnListUpdatedListener {
        public void onListUpdated(java.util.Collection<android.hardware.radio.Announcement> p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
