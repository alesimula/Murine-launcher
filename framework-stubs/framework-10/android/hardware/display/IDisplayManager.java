package android.hardware.display;

public interface IDisplayManager extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException;
    public int[] getDisplayIds() throws android.os.RemoteException;
    public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException;
    public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException;
    public void startWifiDisplayScan() throws android.os.RemoteException;
    public void stopWifiDisplayScan() throws android.os.RemoteException;
    public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException;
    public void disconnectWifiDisplay() throws android.os.RemoteException;
    public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException;
    public void pauseWifiDisplay() throws android.os.RemoteException;
    public void resumeWifiDisplay() throws android.os.RemoteException;
    public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException;
    public void requestColorMode(int p0, int p1) throws android.os.RemoteException;
    public int createVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, android.media.projection.IMediaProjection p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, android.view.Surface p7, int p8, java.lang.String p9) throws android.os.RemoteException;
    public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException;
    public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException;
    public void setVirtualDisplayState(android.hardware.display.IVirtualDisplayCallback p0, boolean p1) throws android.os.RemoteException;
    public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException;
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException;
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException;
    public void setTemporaryBrightness(int p0) throws android.os.RemoteException;
    public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException;
    public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException;
    public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.display.IDisplayManager {
        private static final java.lang.String DESCRIPTOR = "android.hardware.display.IDisplayManager";
        static final int TRANSACTION_getDisplayInfo = 1;
        static final int TRANSACTION_getDisplayIds = 2;
        static final int TRANSACTION_isUidPresentOnDisplay = 3;
        static final int TRANSACTION_registerCallback = 4;
        static final int TRANSACTION_startWifiDisplayScan = 5;
        static final int TRANSACTION_stopWifiDisplayScan = 6;
        static final int TRANSACTION_connectWifiDisplay = 7;
        static final int TRANSACTION_disconnectWifiDisplay = 8;
        static final int TRANSACTION_renameWifiDisplay = 9;
        static final int TRANSACTION_forgetWifiDisplay = 10;
        static final int TRANSACTION_pauseWifiDisplay = 11;
        static final int TRANSACTION_resumeWifiDisplay = 12;
        static final int TRANSACTION_getWifiDisplayStatus = 13;
        static final int TRANSACTION_requestColorMode = 14;
        static final int TRANSACTION_createVirtualDisplay = 15;
        static final int TRANSACTION_resizeVirtualDisplay = 16;
        static final int TRANSACTION_setVirtualDisplaySurface = 17;
        static final int TRANSACTION_releaseVirtualDisplay = 18;
        static final int TRANSACTION_setVirtualDisplayState = 19;
        static final int TRANSACTION_getStableDisplaySize = 20;
        static final int TRANSACTION_getBrightnessEvents = 21;
        static final int TRANSACTION_getAmbientBrightnessStats = 22;
        static final int TRANSACTION_setBrightnessConfigurationForUser = 23;
        static final int TRANSACTION_getBrightnessConfigurationForUser = 24;
        static final int TRANSACTION_getDefaultBrightnessConfiguration = 25;
        static final int TRANSACTION_setTemporaryBrightness = 26;
        static final int TRANSACTION_setTemporaryAutoBrightnessAdjustment = 27;
        static final int TRANSACTION_getMinimumBrightnessCurve = 28;
        static final int TRANSACTION_getPreferredWideGamutColorSpaceId = 29;
        public Stub() { super(); }
        public static android.hardware.display.IDisplayManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.display.IDisplayManager p0) { return false; }
        public static android.hardware.display.IDisplayManager getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.display.IDisplayManager {
            private android.os.IBinder mRemote;
            public static android.hardware.display.IDisplayManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException { return null; }
            public int[] getDisplayIds() throws android.os.RemoteException { return null; }
            public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException { return false; }
            public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException {}
            public void startWifiDisplayScan() throws android.os.RemoteException {}
            public void stopWifiDisplayScan() throws android.os.RemoteException {}
            public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
            public void disconnectWifiDisplay() throws android.os.RemoteException {}
            public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
            public void pauseWifiDisplay() throws android.os.RemoteException {}
            public void resumeWifiDisplay() throws android.os.RemoteException {}
            public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException { return null; }
            public void requestColorMode(int p0, int p1) throws android.os.RemoteException {}
            public int createVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, android.media.projection.IMediaProjection p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, android.view.Surface p7, int p8, java.lang.String p9) throws android.os.RemoteException { return 0; }
            public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException {}
            public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException {}
            public void setVirtualDisplayState(android.hardware.display.IVirtualDisplayCallback p0, boolean p1) throws android.os.RemoteException {}
            public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException { return null; }
            public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException { return null; }
            public void setTemporaryBrightness(int p0) throws android.os.RemoteException {}
            public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException {}
            public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException { return null; }
            public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.hardware.display.IDisplayManager {
        public Default() {}
        public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException { return null; }
        public int[] getDisplayIds() throws android.os.RemoteException { return null; }
        public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException { return false; }
        public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException {}
        public void startWifiDisplayScan() throws android.os.RemoteException {}
        public void stopWifiDisplayScan() throws android.os.RemoteException {}
        public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
        public void disconnectWifiDisplay() throws android.os.RemoteException {}
        public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
        public void pauseWifiDisplay() throws android.os.RemoteException {}
        public void resumeWifiDisplay() throws android.os.RemoteException {}
        public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException { return null; }
        public void requestColorMode(int p0, int p1) throws android.os.RemoteException {}
        public int createVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, android.media.projection.IMediaProjection p1, java.lang.String p2, java.lang.String p3, int p4, int p5, int p6, android.view.Surface p7, int p8, java.lang.String p9) throws android.os.RemoteException { return 0; }
        public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException {}
        public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException {}
        public void setVirtualDisplayState(android.hardware.display.IVirtualDisplayCallback p0, boolean p1) throws android.os.RemoteException {}
        public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException { return null; }
        public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException { return null; }
        public void setTemporaryBrightness(int p0) throws android.os.RemoteException {}
        public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException {}
        public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException { return null; }
        public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
