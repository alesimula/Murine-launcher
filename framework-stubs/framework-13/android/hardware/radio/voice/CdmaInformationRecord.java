package android.hardware.radio.voice;

public class CdmaInformationRecord implements android.os.Parcelable {
    public int name;
    public android.hardware.radio.voice.CdmaDisplayInfoRecord[] display;
    public android.hardware.radio.voice.CdmaNumberInfoRecord[] number;
    public android.hardware.radio.voice.CdmaSignalInfoRecord[] signal;
    public android.hardware.radio.voice.CdmaRedirectingNumberInfoRecord[] redir;
    public android.hardware.radio.voice.CdmaLineControlInfoRecord[] lineCtrl;
    public android.hardware.radio.voice.CdmaT53ClirInfoRecord[] clir;
    public android.hardware.radio.voice.CdmaT53AudioControlInfoRecord[] audioCtrl;
    public static final android.os.Parcelable.Creator<android.hardware.radio.voice.CdmaInformationRecord> CREATOR = null;
    public static final int CDMA_MAX_NUMBER_OF_INFO_RECS = 10;
    public static final int NAME_DISPLAY = 0;
    public static final int NAME_CALLED_PARTY_NUMBER = 1;
    public static final int NAME_CALLING_PARTY_NUMBER = 2;
    public static final int NAME_CONNECTED_NUMBER = 3;
    public static final int NAME_SIGNAL = 4;
    public static final int NAME_REDIRECTING_NUMBER = 5;
    public static final int NAME_LINE_CONTROL = 6;
    public static final int NAME_EXTENDED_DISPLAY = 7;
    public static final int NAME_T53_CLIR = 8;
    public static final int NAME_T53_RELEASE = 9;
    public static final int NAME_T53_AUDIO_CONTROL = 10;
    public CdmaInformationRecord() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
