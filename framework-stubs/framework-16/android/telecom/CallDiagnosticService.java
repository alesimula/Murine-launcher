package android.telecom;

@android.annotation.SystemApi
public abstract class CallDiagnosticService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.CallDiagnosticService";
    public CallDiagnosticService() { super(); }
    @android.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SuppressLint("OnNameExpected")
    @android.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() { return null; }
    @android.annotation.NonNull
    public abstract android.telecom.CallDiagnostics onInitializeCallDiagnostics(android.telecom.Call.Details p0);
    public abstract void onRemoveCallDiagnostics(android.telecom.CallDiagnostics p0);
    public abstract void onCallAudioStateChanged(android.telecom.CallAudioState p0);
    public abstract void onBluetoothCallQualityReportReceived(android.telecom.BluetoothCallQualityReport p0);

    private final class CallDiagnosticServiceBinder extends com.android.internal.telecom.ICallDiagnosticService.Stub {
        public void setAdapter(com.android.internal.telecom.ICallDiagnosticServiceAdapter p0) throws android.os.RemoteException {}
        public void initializeDiagnosticCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
        public void updateCall(android.telecom.ParcelableCall p0) throws android.os.RemoteException {}
        public void removeDiagnosticCall(java.lang.String p0) throws android.os.RemoteException {}
        public void updateCallAudioState(android.telecom.CallAudioState p0) throws android.os.RemoteException {}
        public void receiveDeviceToDeviceMessage(java.lang.String p0, int p1, int p2) {}
        public void receiveBluetoothCallQualityReport(android.telecom.BluetoothCallQualityReport p0) throws android.os.RemoteException {}
        public void notifyCallDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1) throws android.os.RemoteException {}
        public void callQualityChanged(java.lang.String p0, android.telephony.CallQuality p1) throws android.os.RemoteException {}
    }
}
