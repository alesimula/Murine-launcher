package com.android.internal.telephony;

public class CarrierKeyDownloadManager extends android.os.Handler {
    public int mKeyAvailability;
    public final android.app.DownloadManager mDownloadManager = null;
    public java.lang.String mMccMncForDownload;
    public int mCarrierId;
    public long mDownloadId;
    public CarrierKeyDownloadManager(com.android.internal.telephony.Phone p0) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public long getExpirationDate() { return 0L; }
    public void resetRenewalAlarm() {}
    public java.lang.String getSimOperator() { return null; }
    public int getSimCarrierId() { return 0; }
    public boolean isValidDownload(java.lang.String p0, long p1, int p2) { return false; }
    public void parseJsonAndPersistKey(java.lang.String p0, java.lang.String p1, int p2) {}
    public boolean isKeyEnabled(int p0) { return false; }
    public static boolean isKeyEnabled(int p0, int p1) { return false; }
    public boolean areCarrierKeysAbsentOrExpiring() { return false; }
    public static android.util.Pair<java.security.PublicKey, java.lang.Long> getKeyInformation(byte[] p0) throws java.lang.Exception { return null; }
    public void savePublicKey(java.security.PublicKey p0, int p1, java.lang.String p2, long p3, java.lang.String p4, java.lang.String p5, int p6) {}
    public static java.lang.String cleanCertString(java.lang.String p0) { return null; }
}
