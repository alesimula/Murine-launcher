package android.hardware.radio.voice;

public class CdmaInformationRecord implements android.os.Parcelable {
    @java.lang.Deprecated
    public int name;
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaDisplayInfoRecord[] display;
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaNumberInfoRecord[] number;
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaSignalInfoRecord[] signal;
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaRedirectingNumberInfoRecord[] redir;
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaLineControlInfoRecord[] lineCtrl;
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaT53ClirInfoRecord[] clir;
    @java.lang.Deprecated
    public android.hardware.radio.voice.CdmaT53AudioControlInfoRecord[] audioCtrl;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CdmaInformationRecord> CREATOR = null;
    @java.lang.Deprecated
    public static final int CDMA_MAX_NUMBER_OF_INFO_RECS = 10;
    @java.lang.Deprecated
    public static final int NAME_DISPLAY = 0;
    @java.lang.Deprecated
    public static final int NAME_CALLED_PARTY_NUMBER = 1;
    @java.lang.Deprecated
    public static final int NAME_CALLING_PARTY_NUMBER = 2;
    @java.lang.Deprecated
    public static final int NAME_CONNECTED_NUMBER = 3;
    @java.lang.Deprecated
    public static final int NAME_SIGNAL = 4;
    @java.lang.Deprecated
    public static final int NAME_REDIRECTING_NUMBER = 5;
    @java.lang.Deprecated
    public static final int NAME_LINE_CONTROL = 6;
    @java.lang.Deprecated
    public static final int NAME_EXTENDED_DISPLAY = 7;
    @java.lang.Deprecated
    public static final int NAME_T53_CLIR = 8;
    @java.lang.Deprecated
    public static final int NAME_T53_RELEASE = 9;
    @java.lang.Deprecated
    public static final int NAME_T53_AUDIO_CONTROL = 10;
    public CdmaInformationRecord() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
