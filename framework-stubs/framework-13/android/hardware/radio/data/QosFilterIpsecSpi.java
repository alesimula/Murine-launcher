package android.hardware.radio.data;

public final class QosFilterIpsecSpi implements android.os.Parcelable {
    public static final int noinit = 0;
    public static final int value = 1;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.QosFilterIpsecSpi> CREATOR = null;
    public QosFilterIpsecSpi() {}
    public int getTag() { return 0; }
    public static android.hardware.radio.data.QosFilterIpsecSpi noinit(boolean p0) { return null; }
    public boolean getNoinit() { return false; }
    public void setNoinit(boolean p0) {}
    public static android.hardware.radio.data.QosFilterIpsecSpi value(int p0) { return null; }
    public int getValue() { return 0; }
    public void setValue(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static @interface Tag {
        public static final int noinit = 0;
        public static final int value = 1;
    }
}
