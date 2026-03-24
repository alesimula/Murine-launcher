package android.telephony.ims.stub;

@android.annotation.SystemApi
public class ImsUtImplBase {
    private static final java.lang.String TAG = "ImsUtImplBase";
    public static final int CALL_BARRING_ALL_INCOMING = 1;
    public static final int CALL_BARRING_ALL_OUTGOING = 2;
    public static final int CALL_BARRING_OUTGOING_INTL = 3;
    public static final int CALL_BARRING_OUTGOING_INTL_EXCL_HOME = 4;
    public static final int CALL_BLOCKING_INCOMING_WHEN_ROAMING = 5;
    public static final int CALL_BARRING_ANONYMOUS_INCOMING = 6;
    public static final int CALL_BARRING_ALL = 7;
    public static final int CALL_BARRING_OUTGOING_ALL_SERVICES = 8;
    public static final int CALL_BARRING_INCOMING_ALL_SERVICES = 9;
    public static final int CALL_BARRING_SPECIFIC_INCOMING_CALLS = 10;
    public static final int INVALID_RESULT = -1;
    private final com.android.ims.internal.IImsUt.Stub mServiceImpl = null;
    public ImsUtImplBase() {}
    public void close() {}
    public int queryCallBarring(int p0) { return 0; }
    public int queryCallBarringForServiceClass(int p0, int p1) { return 0; }
    public int queryCallForward(int p0, java.lang.String p1) { return 0; }
    public int queryCallWaiting() { return 0; }
    public int queryCLIR() { return 0; }
    public int queryCLIP() { return 0; }
    public int queryCOLR() { return 0; }
    public int queryCOLP() { return 0; }
    public int queryClir() { return 0; }
    public int queryClip() { return 0; }
    public int queryColr() { return 0; }
    public int queryColp() { return 0; }
    public int transact(android.os.Bundle p0) { return 0; }
    public int updateCallBarring(int p0, int p1, java.lang.String[] p2) { return 0; }
    public int updateCallBarringForServiceClass(int p0, int p1, java.lang.String[] p2, int p3) { return 0; }
    public int updateCallBarringWithPassword(int p0, int p1, java.lang.String[] p2, int p3, java.lang.String p4) { return 0; }
    public int updateCallForward(int p0, int p1, java.lang.String p2, int p3, int p4) { return 0; }
    public int updateCallWaiting(boolean p0, int p1) { return 0; }
    public int updateCLIR(int p0) { return 0; }
    public int updateCLIP(boolean p0) { return 0; }
    public int updateCOLR(int p0) { return 0; }
    public int updateCOLP(boolean p0) { return 0; }
    public int updateClir(int p0) { return 0; }
    public int updateClip(boolean p0) { return 0; }
    public int updateColr(int p0) { return 0; }
    public int updateColp(boolean p0) { return 0; }
    public void setListener(android.telephony.ims.ImsUtListener p0) {}
    public com.android.ims.internal.IImsUt getInterface() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallBarringMode {
    }
}
