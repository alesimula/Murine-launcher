package android.telephony;

public class TelephonyLocalConnection {
    public TelephonyLocalConnection() {}
    public static java.lang.String getCallComposerServerUrlForHandle(int p0, java.util.UUID p1) { return null; }
    public static void setInstance(android.telephony.TelephonyLocalConnection.ConnectionImpl p0) {}

    public static interface ConnectionImpl {
        public java.lang.String getCallComposerServerUrlForHandle(int p0, java.util.UUID p1);
    }
}
