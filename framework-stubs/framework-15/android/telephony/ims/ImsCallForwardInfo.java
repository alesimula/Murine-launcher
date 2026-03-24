package android.telephony.ims;

@android.annotation.SystemApi
public final class ImsCallForwardInfo implements android.os.Parcelable {
    public static final int CDIV_CF_REASON_UNCONDITIONAL = 0;
    public static final int CDIV_CF_REASON_BUSY = 1;
    public static final int CDIV_CF_REASON_NO_REPLY = 2;
    public static final int CDIV_CF_REASON_NOT_REACHABLE = 3;
    public static final int CDIV_CF_REASON_ALL = 4;
    public static final int CDIV_CF_REASON_ALL_CONDITIONAL = 5;
    public static final int CDIV_CF_REASON_NOT_LOGGED_IN = 6;
    public static final int STATUS_NOT_ACTIVE = 0;
    public static final int STATUS_ACTIVE = 1;
    public static final int TYPE_OF_ADDRESS_UNKNOWN = 129;
    public static final int TYPE_OF_ADDRESS_INTERNATIONAL = 145;
    public int mCondition;
    public int mStatus;
    public int mToA;
    public int mServiceClass;
    public java.lang.String mNumber;
    public int mTimeSeconds;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsCallForwardInfo> CREATOR = null;
    public ImsCallForwardInfo() {}
    public ImsCallForwardInfo(int p0, int p1, int p2, int p3, java.lang.String p4, int p5) {}
    public ImsCallForwardInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int getCondition() { return 0; }
    public int getStatus() { return 0; }
    public int getToA() { return 0; }
    public int getServiceClass() { return 0; }
    public java.lang.String getNumber() { return null; }
    public int getTimeSeconds() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallForwardReasons {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallForwardStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TypeOfAddress {
    }
}
