package com.android.internal.telephony.euicc;

public class EuiccOperation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.euicc.EuiccOperation> CREATOR = null;
    static final int ACTION_GET_METADATA_DEACTIVATE_SIM = 1;
    static final int ACTION_DOWNLOAD_DEACTIVATE_SIM = 2;
    static final int ACTION_DOWNLOAD_NO_PRIVILEGES = 3;
    static final int ACTION_GET_DEFAULT_LIST_DEACTIVATE_SIM = 4;
    static final int ACTION_SWITCH_DEACTIVATE_SIM = 5;
    static final int ACTION_SWITCH_NO_PRIVILEGES = 6;
    static final int ACTION_DOWNLOAD_RESOLVABLE_ERRORS = 7;
    @java.lang.Deprecated
    static final int ACTION_DOWNLOAD_CONFIRMATION_CODE = 8;
    static final int ACTION_DOWNLOAD_NO_PRIVILEGES_OR_DEACTIVATE_SIM_CHECK_METADATA = 9;
    public final int mAction = 0;
    static com.android.internal.telephony.euicc.EuiccOperation forGetMetadataDeactivateSim(long p0, android.telephony.euicc.DownloadableSubscription p1, java.lang.String p2) { return null; }
    static com.android.internal.telephony.euicc.EuiccOperation forDownloadDeactivateSim(long p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3) { return null; }
    static com.android.internal.telephony.euicc.EuiccOperation forDownloadNoPrivileges(long p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3) { return null; }
    static com.android.internal.telephony.euicc.EuiccOperation forDownloadNoPrivilegesOrDeactivateSimCheckMetadata(long p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3) { return null; }
    @java.lang.Deprecated
    public static com.android.internal.telephony.euicc.EuiccOperation forDownloadConfirmationCode(long p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3) { return null; }
    static com.android.internal.telephony.euicc.EuiccOperation forDownloadResolvableErrors(long p0, android.telephony.euicc.DownloadableSubscription p1, boolean p2, java.lang.String p3, int p4) { return null; }
    static com.android.internal.telephony.euicc.EuiccOperation forGetDefaultListDeactivateSim(long p0, java.lang.String p1) { return null; }
    static com.android.internal.telephony.euicc.EuiccOperation forSwitchDeactivateSim(long p0, int p1, java.lang.String p2) { return null; }
    static com.android.internal.telephony.euicc.EuiccOperation forSwitchNoPrivileges(long p0, int p1, java.lang.String p2) { return null; }
    EuiccOperation(int p0, long p1, android.telephony.euicc.DownloadableSubscription p2, int p3, boolean p4, java.lang.String p5, int p6) {}
    EuiccOperation(int p0, long p1, android.telephony.euicc.DownloadableSubscription p2, int p3, boolean p4, java.lang.String p5) {}
    EuiccOperation(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void continueOperation(int p0, android.os.Bundle p1, android.app.PendingIntent p2) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Action {
    }
}
