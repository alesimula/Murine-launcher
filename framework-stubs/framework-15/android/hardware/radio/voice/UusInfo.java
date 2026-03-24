package android.hardware.radio.voice;

public class UusInfo implements android.os.Parcelable {
    public int uusType;
    public int uusDcs;
    public java.lang.String uusData;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.UusInfo> CREATOR = null;
    public static final int UUS_DCS_USP = 0;
    public static final int UUS_DCS_OSIHLP = 1;
    public static final int UUS_DCS_X244 = 2;
    public static final int UUS_DCS_RMCF = 3;
    public static final int UUS_DCS_IA5C = 4;
    public static final int UUS_TYPE_TYPE1_IMPLICIT = 0;
    public static final int UUS_TYPE_TYPE1_REQUIRED = 1;
    public static final int UUS_TYPE_TYPE1_NOT_REQUIRED = 2;
    public static final int UUS_TYPE_TYPE2_REQUIRED = 3;
    public static final int UUS_TYPE_TYPE2_NOT_REQUIRED = 4;
    public static final int UUS_TYPE_TYPE3_REQUIRED = 5;
    public static final int UUS_TYPE_TYPE3_NOT_REQUIRED = 6;
    public UusInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
