package android.telephony;

@android.annotation.SystemApi
public abstract class CellBroadcastService extends android.app.Service {
    public static final java.lang.String CELL_BROADCAST_SERVICE_INTERFACE = "android.telephony.CellBroadcastService";
    public CellBroadcastService() { super(); }
    public abstract void onGsmCellBroadcastSms(int p0, byte[] p1);
    public abstract void onCdmaCellBroadcastSms(int p0, byte[] p1, int p2);
    public abstract void onCdmaScpMessage(int p0, java.util.List<android.telephony.cdma.CdmaSmsCbProgramData> p1, java.lang.String p2, java.util.function.Consumer<android.os.Bundle> p3);
    public abstract java.lang.CharSequence getCellBroadcastAreaInfo(int p0);
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }

    public class ICellBroadcastServiceWrapper extends android.telephony.ICellBroadcastService.Stub {
        public ICellBroadcastServiceWrapper(android.telephony.CellBroadcastService p0) { super(); }
        public void handleGsmCellBroadcastSms(int p0, byte[] p1) {}
        public void handleCdmaCellBroadcastSms(int p0, byte[] p1, int p2) {}
        public void handleCdmaScpMessage(int p0, java.util.List<android.telephony.cdma.CdmaSmsCbProgramData> p1, java.lang.String p2, android.os.RemoteCallback p3) {}
        public java.lang.CharSequence getCellBroadcastAreaInfo(int p0) { return null; }
        protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
        public void dump(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    }
}
