package android.telephony;

public final class CdmaEriInformation implements android.os.Parcelable {
    public static final int ERI_ON = 0;
    public static final int ERI_OFF = 1;
    public static final int ERI_FLASH = 2;
    public static final int ERI_ICON_MODE_NORMAL = 0;
    public static final int ERI_ICON_MODE_FLASH = 1;
    private int mIconIndex;
    private int mIconMode;
    public static final android.os.Parcelable.Creator<android.telephony.CdmaEriInformation> CREATOR = null;
    public CdmaEriInformation(int p0, int p1) {}
    public int getEriIconIndex() { return 0; }
    public void setEriIconIndex(int p0) {}
    public int getEriIconMode() { return 0; }
    public void setEriIconMode(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    private CdmaEriInformation(android.os.Parcel p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EriIconIndex {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EriIconMode {
    }
}
