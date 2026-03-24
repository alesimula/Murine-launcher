package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsStreamMediaProfile implements android.os.Parcelable {
    private static final java.lang.String TAG = "ImsStreamMediaProfile";
    public static final int DIRECTION_INVALID = -1;
    public static final int DIRECTION_INACTIVE = 0;
    public static final int DIRECTION_RECEIVE = 1;
    public static final int DIRECTION_SEND = 2;
    public static final int DIRECTION_SEND_RECEIVE = 3;
    public static final int AUDIO_QUALITY_NONE = 0;
    public static final int AUDIO_QUALITY_AMR = 1;
    public static final int AUDIO_QUALITY_AMR_WB = 2;
    public static final int AUDIO_QUALITY_QCELP13K = 3;
    public static final int AUDIO_QUALITY_EVRC = 4;
    public static final int AUDIO_QUALITY_EVRC_B = 5;
    public static final int AUDIO_QUALITY_EVRC_WB = 6;
    public static final int AUDIO_QUALITY_EVRC_NW = 7;
    public static final int AUDIO_QUALITY_GSM_EFR = 8;
    public static final int AUDIO_QUALITY_GSM_FR = 9;
    public static final int AUDIO_QUALITY_GSM_HR = 10;
    public static final int AUDIO_QUALITY_G711U = 11;
    public static final int AUDIO_QUALITY_G723 = 12;
    public static final int AUDIO_QUALITY_G711A = 13;
    public static final int AUDIO_QUALITY_G722 = 14;
    public static final int AUDIO_QUALITY_G711AB = 15;
    public static final int AUDIO_QUALITY_G729 = 16;
    public static final int AUDIO_QUALITY_EVS_NB = 17;
    public static final int AUDIO_QUALITY_EVS_WB = 18;
    public static final int AUDIO_QUALITY_EVS_SWB = 19;
    public static final int AUDIO_QUALITY_EVS_FB = 20;
    public static final int VIDEO_QUALITY_NONE = 0;
    public static final int VIDEO_QUALITY_QCIF = 1;
    public static final int VIDEO_QUALITY_QVGA_LANDSCAPE = 2;
    public static final int VIDEO_QUALITY_QVGA_PORTRAIT = 4;
    public static final int VIDEO_QUALITY_VGA_LANDSCAPE = 8;
    public static final int VIDEO_QUALITY_VGA_PORTRAIT = 16;
    public static final int RTT_MODE_DISABLED = 0;
    public static final int RTT_MODE_FULL = 1;
    public int mAudioQuality;
    public int mAudioDirection;
    public int mVideoQuality;
    public int mVideoDirection;
    public int mRttMode;
    public boolean mIsReceivingRttAudio;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsStreamMediaProfile> CREATOR = null;
    public ImsStreamMediaProfile(android.os.Parcel p0) {}
    public ImsStreamMediaProfile(int p0, int p1, int p2, int p3, int p4) {}
    public ImsStreamMediaProfile() {}
    public ImsStreamMediaProfile(int p0, int p1, int p2, int p3) {}
    public ImsStreamMediaProfile(int p0) {}
    public void copyFrom(android.telephony.ims.ImsStreamMediaProfile p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public boolean isRttCall() { return false; }
    public void setRttMode(int p0) {}
    public void setReceivingRttAudio(boolean p0) {}
    public int getAudioQuality() { return 0; }
    public int getAudioDirection() { return 0; }
    public int getVideoQuality() { return 0; }
    public int getVideoDirection() { return 0; }
    public int getRttMode() { return 0; }
    public boolean isReceivingRttAudio() { return false; }
}
