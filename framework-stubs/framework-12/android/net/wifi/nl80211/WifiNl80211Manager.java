package android.net.wifi.nl80211;

@android.annotation.SystemApi
public class WifiNl80211Manager {
    private static final java.lang.String TAG = "WifiNl80211Manager";
    private boolean mVerboseLoggingEnabled;
    private static final int SEND_MGMT_FRAME_TIMEOUT_MS = 1000;
    private static final java.lang.String TIMEOUT_ALARM_TAG = "WifiNl80211Manager Send Management Frame Timeout";
    public static final int SCAN_TYPE_SINGLE_SCAN = 0;
    public static final int SCAN_TYPE_PNO_SCAN = 1;
    public static final java.lang.String SCANNING_PARAM_ENABLE_6GHZ_RNR = "android.net.wifi.nl80211.SCANNING_PARAM_ENABLE_6GHZ_RNR";
    private android.app.AlarmManager mAlarmManager;
    private android.os.Handler mEventHandler;
    private android.net.wifi.nl80211.IWificond mWificond;
    private android.net.wifi.nl80211.WifiNl80211Manager.WificondEventHandler mWificondEventHandler;
    private java.util.HashMap<java.lang.String, android.net.wifi.nl80211.IClientInterface> mClientInterfaces;
    private java.util.HashMap<java.lang.String, android.net.wifi.nl80211.IApInterface> mApInterfaces;
    private java.util.HashMap<java.lang.String, android.net.wifi.nl80211.IWifiScannerImpl> mWificondScanners;
    private java.util.HashMap<java.lang.String, android.net.wifi.nl80211.IScanEvent> mScanEventHandlers;
    private java.util.HashMap<java.lang.String, android.net.wifi.nl80211.IPnoScanEvent> mPnoScanEventHandlers;
    private java.util.HashMap<java.lang.String, android.net.wifi.nl80211.IApInterfaceEventCallback> mApInterfaceListeners;
    private java.lang.Runnable mDeathEventHandler;
    private java.util.concurrent.atomic.AtomicBoolean mSendMgmtFrameInProgress;
    public static final int SEND_MGMT_FRAME_ERROR_UNKNOWN = 1;
    public static final int SEND_MGMT_FRAME_ERROR_MCS_UNSUPPORTED = 2;
    public static final int SEND_MGMT_FRAME_ERROR_NO_ACK = 3;
    public static final int SEND_MGMT_FRAME_ERROR_TIMEOUT = 4;
    public static final int SEND_MGMT_FRAME_ERROR_ALREADY_STARTED = 5;
    public WifiNl80211Manager(android.content.Context p0) {}
    public WifiNl80211Manager(android.content.Context p0, android.net.wifi.nl80211.IWificond p1) {}
    public android.net.wifi.nl80211.WifiNl80211Manager.WificondEventHandler getWificondEventHandler() { return null; }
    public void binderDied() {}
    public void enableVerboseLogging(boolean p0) {}
    public void setOnServiceDeadCallback(java.lang.Runnable p0) {}
    private boolean retrieveWificondAndRegisterForDeath() { return false; }
    public boolean setupInterfaceForClientMode(java.lang.String p0, java.util.concurrent.Executor p1, android.net.wifi.nl80211.WifiNl80211Manager.ScanEventCallback p2, android.net.wifi.nl80211.WifiNl80211Manager.ScanEventCallback p3) { return false; }
    public boolean tearDownClientInterface(java.lang.String p0) { return false; }
    public boolean setupInterfaceForSoftApMode(java.lang.String p0) { return false; }
    public boolean tearDownSoftApInterface(java.lang.String p0) { return false; }
    public boolean tearDownInterfaces() { return false; }
    private android.net.wifi.nl80211.IClientInterface getClientInterface(java.lang.String p0) { return null; }
    public android.net.wifi.nl80211.WifiNl80211Manager.SignalPollResult signalPoll(java.lang.String p0) { return null; }
    public android.net.wifi.nl80211.WifiNl80211Manager.TxPacketCounters getTxPacketCounters(java.lang.String p0) { return null; }
    private android.net.wifi.nl80211.IWifiScannerImpl getScannerImpl(java.lang.String p0) { return null; }
    public java.util.List<android.net.wifi.nl80211.NativeScanResult> getScanResults(java.lang.String p0, int p1) { return null; }
    private static int getScanType(int p0) { return 0; }
    @java.lang.Deprecated
    public boolean startScan(java.lang.String p0, int p1, java.util.Set<java.lang.Integer> p2, java.util.List<byte[]> p3) { return false; }
    public boolean startScan(java.lang.String p0, int p1, java.util.Set<java.lang.Integer> p2, java.util.List<byte[]> p3, android.os.Bundle p4) { return false; }
    public boolean startPnoScan(java.lang.String p0, android.net.wifi.nl80211.PnoSettings p1, java.util.concurrent.Executor p2, android.net.wifi.nl80211.WifiNl80211Manager.PnoScanRequestCallback p3) { return false; }
    public boolean stopPnoScan(java.lang.String p0) { return false; }
    public void abortScan(java.lang.String p0) {}
    public int[] getChannelsMhzForBand(int p0) { return null; }
    private android.net.wifi.nl80211.IApInterface getApInterface(java.lang.String p0) { return null; }
    public android.net.wifi.nl80211.DeviceWiphyCapabilities getDeviceWiphyCapabilities(java.lang.String p0) { return null; }
    public boolean registerCountryCodeChangedListener(java.util.concurrent.Executor p0, android.net.wifi.nl80211.WifiNl80211Manager.CountryCodeChangedListener p1) { return false; }
    public void unregisterCountryCodeChangedListener(android.net.wifi.nl80211.WifiNl80211Manager.CountryCodeChangedListener p0) {}
    @java.lang.Deprecated
    public boolean registerApCallback(java.lang.String p0, java.util.concurrent.Executor p1, android.net.wifi.nl80211.WifiNl80211Manager.SoftApCallback p2) { return false; }
    public void sendMgmtFrame(java.lang.String p0, byte[] p1, int p2, java.util.concurrent.Executor p3, android.net.wifi.nl80211.WifiNl80211Manager.SendMgmtFrameCallback p4) {}
    private void clearState() {}
    public static android.net.wifi.nl80211.WifiNl80211Manager.OemSecurityType parseOemSecurityTypeElement(int p0, int p1, byte[] p2) { return null; }

    private class ApInterfaceEventCallback extends android.net.wifi.nl80211.IApInterfaceEventCallback.Stub {
        private java.util.concurrent.Executor mExecutor;
        private android.net.wifi.nl80211.WifiNl80211Manager.SoftApCallback mSoftApListener;
        ApInterfaceEventCallback(android.net.wifi.nl80211.WifiNl80211Manager p0, java.util.concurrent.Executor p1, android.net.wifi.nl80211.WifiNl80211Manager.SoftApCallback p2) { super(); }
        public void onConnectedClientsChanged(android.net.wifi.nl80211.NativeWifiClient p0, boolean p1) {}
        public void onSoftApChannelSwitched(int p0, int p1) {}
        private int toFrameworkBandwidth(int p0) { return 0; }
    }

    public static interface CountryCodeChangedListener {
        public void onCountryCodeChanged(java.lang.String p0);
    }

    public static class OemSecurityType {
        public final int protocol = 0;
        public final java.util.List<java.lang.Integer> keyManagement = null;
        public final java.util.List<java.lang.Integer> pairwiseCipher = null;
        public final int groupCipher = 0;
        public OemSecurityType(int p0, java.util.List<java.lang.Integer> p1, java.util.List<java.lang.Integer> p2, int p3) {}
    }

    private class PnoScanEventHandler extends android.net.wifi.nl80211.IPnoScanEvent.Stub {
        private java.util.concurrent.Executor mExecutor;
        private android.net.wifi.nl80211.WifiNl80211Manager.ScanEventCallback mCallback;
        PnoScanEventHandler(android.net.wifi.nl80211.WifiNl80211Manager p0, java.util.concurrent.Executor p1, android.net.wifi.nl80211.WifiNl80211Manager.ScanEventCallback p2) { super(); }
        public void OnPnoNetworkFound() {}
        public void OnPnoScanFailed() {}
    }

    public static interface PnoScanRequestCallback {
        public void onPnoRequestSucceeded();
        public void onPnoRequestFailed();
    }

    public static interface ScanEventCallback {
        public void onScanResultReady();
        public void onScanFailed();
    }

    private class ScanEventHandler extends android.net.wifi.nl80211.IScanEvent.Stub {
        private java.util.concurrent.Executor mExecutor;
        private android.net.wifi.nl80211.WifiNl80211Manager.ScanEventCallback mCallback;
        ScanEventHandler(android.net.wifi.nl80211.WifiNl80211Manager p0, java.util.concurrent.Executor p1, android.net.wifi.nl80211.WifiNl80211Manager.ScanEventCallback p2) { super(); }
        public void OnScanResultReady() {}
        public void OnScanFailed() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanResultType {
    }

    public static interface SendMgmtFrameCallback {
        public void onAck(int p0);
        public void onFailure(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SendMgmtFrameError {
    }

    private class SendMgmtFrameEvent extends android.net.wifi.nl80211.ISendMgmtFrameEvent.Stub {
        private java.util.concurrent.Executor mExecutor;
        private android.net.wifi.nl80211.WifiNl80211Manager.SendMgmtFrameCallback mCallback;
        private android.app.AlarmManager.OnAlarmListener mTimeoutCallback;
        private boolean mWasCalled;
        private void runIfFirstCall(java.lang.Runnable p0) {}
        SendMgmtFrameEvent(android.net.wifi.nl80211.WifiNl80211Manager p0, java.util.concurrent.Executor p1, android.net.wifi.nl80211.WifiNl80211Manager.SendMgmtFrameCallback p2) { super(); }
        public void OnAck(int p0) {}
        public void OnFailure(int p0) {}
    }

    public static class SignalPollResult {
        public final int currentRssiDbm = 0;
        public final int txBitrateMbps = 0;
        public final int rxBitrateMbps = 0;
        public final int associationFrequencyMHz = 0;
        public SignalPollResult(int p0, int p1, int p2, int p3) {}
    }

    @java.lang.Deprecated
    public static interface SoftApCallback {
        public void onFailure();
        public void onConnectedClientsChanged(android.net.wifi.nl80211.NativeWifiClient p0, boolean p1);
        public void onSoftApChannelSwitched(int p0, int p1);
    }

    public static class TxPacketCounters {
        public final int txPacketSucceeded = 0;
        public final int txPacketFailed = 0;
        public TxPacketCounters(int p0, int p1) {}
    }

    public class WificondEventHandler extends android.net.wifi.nl80211.IWificondEventCallback.Stub {
        private java.util.Map<android.net.wifi.nl80211.WifiNl80211Manager.CountryCodeChangedListener, java.util.concurrent.Executor> mCountryCodeChangedListenerHolder;
        public WificondEventHandler(android.net.wifi.nl80211.WifiNl80211Manager p0) { super(); }
        public void registerCountryCodeChangedListener(java.util.concurrent.Executor p0, android.net.wifi.nl80211.WifiNl80211Manager.CountryCodeChangedListener p1) {}
        public void unregisterCountryCodeChangedListener(android.net.wifi.nl80211.WifiNl80211Manager.CountryCodeChangedListener p0) {}
        public void OnRegDomainChanged(java.lang.String p0) {}
    }
}
