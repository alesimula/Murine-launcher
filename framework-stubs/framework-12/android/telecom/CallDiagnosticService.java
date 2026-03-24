package android.telecom;

@android.annotation.SystemApi
public abstract class CallDiagnosticService extends android.app.Service {
    private android.telecom.CallDiagnostics.Listener mDiagnosticCallListener;
    public static final java.lang.String SERVICE_INTERFACE = "android.telecom.CallDiagnosticService";
    private final java.util.Map<java.lang.String, android.telecom.Call.Details> mCallByTelecomCallId = null;
    private final java.util.Map<java.lang.String, android.telecom.CallDiagnostics> mDiagnosticCallByTelecomCallId = null;
    private final java.lang.Object mLock = null;
    private com.android.internal.telecom.ICallDiagnosticServiceAdapter mAdapter;
    public CallDiagnosticService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SuppressLint("OnNameExpected")
    public java.util.concurrent.Executor getExecutor() { return null; }
    public abstract android.telecom.CallDiagnostics onInitializeCallDiagnostics(android.telecom.Call.Details p0);
    public abstract void onRemoveCallDiagnostics(android.telecom.CallDiagnostics p0);
    public abstract void onCallAudioStateChanged(android.telecom.CallAudioState p0);
    public abstract void onBluetoothCallQualityReportReceived(android.telecom.BluetoothCallQualityReport p0);
    private void handleSetAdapter(com.android.internal.telecom.ICallDiagnosticServiceAdapter p0) {}
    private void handleCallAdded(android.telecom.ParcelableCall p0) {}
    private void handleCallUpdated(android.telecom.ParcelableCall p0) {}
    private void handleCallRemoved(java.lang.String p0) {}
    private void handleReceivedD2DMessage(java.lang.String p0, int p1, int p2) {}
    private void handleCallDisconnected(java.lang.String p0, android.telecom.DisconnectCause p1) {}
    private void handleBluetoothCallQualityReport(android.telecom.BluetoothCallQualityReport p0) {}
    private void handleCallQualityChanged(java.lang.String p0, android.telephony.CallQuality p1) {}
    private void handleSendDeviceToDeviceMessage(android.telecom.CallDiagnostics p0, int p1, int p2) {}
    private void handleDisplayDiagnosticMessage(android.telecom.CallDiagnostics p0, int p1, java.lang.CharSequence p2) {}
    private void handleClearDiagnosticMessage(android.telecom.CallDiagnostics p0, int p1) {}

    private final class CallDiagnosticServiceBinder extends com.android.internal.telecom.ICallDiagnosticService.Stub {
        private CallDiagnosticServiceBinder(android.telecom.CallDiagnosticService p0) { super(); }
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
