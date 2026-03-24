package android.hardware.display;

public interface IDisplayManager extends android.os.IInterface {
    public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException;
    public int[] getDisplayIds(boolean p0) throws android.os.RemoteException;
    public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException;
    public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException;
    public void registerCallbackWithEventMask(android.hardware.display.IDisplayManagerCallback p0, long p1) throws android.os.RemoteException;
    public void startWifiDisplayScan() throws android.os.RemoteException;
    public void stopWifiDisplayScan() throws android.os.RemoteException;
    public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException;
    public void disconnectWifiDisplay() throws android.os.RemoteException;
    public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException;
    public void pauseWifiDisplay() throws android.os.RemoteException;
    public void resumeWifiDisplay() throws android.os.RemoteException;
    public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException;
    public void setUserDisabledHdrTypes(int[] p0) throws android.os.RemoteException;
    public void setAreUserDisabledHdrTypesAllowed(boolean p0) throws android.os.RemoteException;
    public boolean areUserDisabledHdrTypesAllowed() throws android.os.RemoteException;
    public int[] getUserDisabledHdrTypes() throws android.os.RemoteException;
    public void requestColorMode(int p0, int p1) throws android.os.RemoteException;
    public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.media.projection.IMediaProjection p2, java.lang.String p3) throws android.os.RemoteException;
    public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException;
    public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException;
    public void setVirtualDisplayState(android.hardware.display.IVirtualDisplayCallback p0, boolean p1) throws android.os.RemoteException;
    public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException;
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException;
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException;
    public boolean isMinimalPostProcessingRequested(int p0) throws android.os.RemoteException;
    public void setTemporaryBrightness(int p0, float p1) throws android.os.RemoteException;
    public void setBrightness(int p0, float p1) throws android.os.RemoteException;
    public float getBrightness(int p0) throws android.os.RemoteException;
    public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException;
    public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException;
    public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) throws android.os.RemoteException;
    public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException;
    public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1) throws android.os.RemoteException;
    public android.view.Display.Mode getUserPreferredDisplayMode(int p0) throws android.os.RemoteException;
    public android.view.Display.Mode getSystemPreferredDisplayMode(int p0) throws android.os.RemoteException;
    public void setShouldAlwaysRespectAppRequestedMode(boolean p0) throws android.os.RemoteException;
    public boolean shouldAlwaysRespectAppRequestedMode() throws android.os.RemoteException;
    public void setRefreshRateSwitchingType(int p0) throws android.os.RemoteException;
    public int getRefreshRateSwitchingType() throws android.os.RemoteException;
    public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.display.IDisplayManager {
        public Default() {}
        public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException { return null; }
        public int[] getDisplayIds(boolean p0) throws android.os.RemoteException { return null; }
        public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException { return false; }
        public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException {}
        public void registerCallbackWithEventMask(android.hardware.display.IDisplayManagerCallback p0, long p1) throws android.os.RemoteException {}
        public void startWifiDisplayScan() throws android.os.RemoteException {}
        public void stopWifiDisplayScan() throws android.os.RemoteException {}
        public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
        public void disconnectWifiDisplay() throws android.os.RemoteException {}
        public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
        public void pauseWifiDisplay() throws android.os.RemoteException {}
        public void resumeWifiDisplay() throws android.os.RemoteException {}
        public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException { return null; }
        public void setUserDisabledHdrTypes(int[] p0) throws android.os.RemoteException {}
        public void setAreUserDisabledHdrTypesAllowed(boolean p0) throws android.os.RemoteException {}
        public boolean areUserDisabledHdrTypesAllowed() throws android.os.RemoteException { return false; }
        public int[] getUserDisabledHdrTypes() throws android.os.RemoteException { return null; }
        public void requestColorMode(int p0, int p1) throws android.os.RemoteException {}
        public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.media.projection.IMediaProjection p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException {}
        public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException {}
        public void setVirtualDisplayState(android.hardware.display.IVirtualDisplayCallback p0, boolean p1) throws android.os.RemoteException {}
        public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException { return null; }
        public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException { return null; }
        public boolean isMinimalPostProcessingRequested(int p0) throws android.os.RemoteException { return false; }
        public void setTemporaryBrightness(int p0, float p1) throws android.os.RemoteException {}
        public void setBrightness(int p0, float p1) throws android.os.RemoteException {}
        public float getBrightness(int p0) throws android.os.RemoteException { return 0.0f; }
        public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException {}
        public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException { return null; }
        public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) throws android.os.RemoteException { return null; }
        public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException { return 0; }
        public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1) throws android.os.RemoteException {}
        public android.view.Display.Mode getUserPreferredDisplayMode(int p0) throws android.os.RemoteException { return null; }
        public android.view.Display.Mode getSystemPreferredDisplayMode(int p0) throws android.os.RemoteException { return null; }
        public void setShouldAlwaysRespectAppRequestedMode(boolean p0) throws android.os.RemoteException {}
        public boolean shouldAlwaysRespectAppRequestedMode() throws android.os.RemoteException { return false; }
        public void setRefreshRateSwitchingType(int p0) throws android.os.RemoteException {}
        public int getRefreshRateSwitchingType() throws android.os.RemoteException { return 0; }
        public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.display.IDisplayManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.display.IDisplayManager";
        static final int TRANSACTION_getDisplayInfo = 1;
        static final int TRANSACTION_getDisplayIds = 2;
        static final int TRANSACTION_isUidPresentOnDisplay = 3;
        static final int TRANSACTION_registerCallback = 4;
        static final int TRANSACTION_registerCallbackWithEventMask = 5;
        static final int TRANSACTION_startWifiDisplayScan = 6;
        static final int TRANSACTION_stopWifiDisplayScan = 7;
        static final int TRANSACTION_connectWifiDisplay = 8;
        static final int TRANSACTION_disconnectWifiDisplay = 9;
        static final int TRANSACTION_renameWifiDisplay = 10;
        static final int TRANSACTION_forgetWifiDisplay = 11;
        static final int TRANSACTION_pauseWifiDisplay = 12;
        static final int TRANSACTION_resumeWifiDisplay = 13;
        static final int TRANSACTION_getWifiDisplayStatus = 14;
        static final int TRANSACTION_setUserDisabledHdrTypes = 15;
        static final int TRANSACTION_setAreUserDisabledHdrTypesAllowed = 16;
        static final int TRANSACTION_areUserDisabledHdrTypesAllowed = 17;
        static final int TRANSACTION_getUserDisabledHdrTypes = 18;
        static final int TRANSACTION_requestColorMode = 19;
        static final int TRANSACTION_createVirtualDisplay = 20;
        static final int TRANSACTION_resizeVirtualDisplay = 21;
        static final int TRANSACTION_setVirtualDisplaySurface = 22;
        static final int TRANSACTION_releaseVirtualDisplay = 23;
        static final int TRANSACTION_setVirtualDisplayState = 24;
        static final int TRANSACTION_getStableDisplaySize = 25;
        static final int TRANSACTION_getBrightnessEvents = 26;
        static final int TRANSACTION_getAmbientBrightnessStats = 27;
        static final int TRANSACTION_setBrightnessConfigurationForUser = 28;
        static final int TRANSACTION_setBrightnessConfigurationForDisplay = 29;
        static final int TRANSACTION_getBrightnessConfigurationForDisplay = 30;
        static final int TRANSACTION_getBrightnessConfigurationForUser = 31;
        static final int TRANSACTION_getDefaultBrightnessConfiguration = 32;
        static final int TRANSACTION_isMinimalPostProcessingRequested = 33;
        static final int TRANSACTION_setTemporaryBrightness = 34;
        static final int TRANSACTION_setBrightness = 35;
        static final int TRANSACTION_getBrightness = 36;
        static final int TRANSACTION_setTemporaryAutoBrightnessAdjustment = 37;
        static final int TRANSACTION_getMinimumBrightnessCurve = 38;
        static final int TRANSACTION_getBrightnessInfo = 39;
        static final int TRANSACTION_getPreferredWideGamutColorSpaceId = 40;
        static final int TRANSACTION_setUserPreferredDisplayMode = 41;
        static final int TRANSACTION_getUserPreferredDisplayMode = 42;
        static final int TRANSACTION_getSystemPreferredDisplayMode = 43;
        static final int TRANSACTION_setShouldAlwaysRespectAppRequestedMode = 44;
        static final int TRANSACTION_shouldAlwaysRespectAppRequestedMode = 45;
        static final int TRANSACTION_setRefreshRateSwitchingType = 46;
        static final int TRANSACTION_getRefreshRateSwitchingType = 47;
        static final int TRANSACTION_getDisplayDecorationSupport = 48;
        public Stub() { super(); }
        public static android.hardware.display.IDisplayManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.display.IDisplayManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.DisplayInfo getDisplayInfo(int p0) throws android.os.RemoteException { return null; }
            public int[] getDisplayIds(boolean p0) throws android.os.RemoteException { return null; }
            public boolean isUidPresentOnDisplay(int p0, int p1) throws android.os.RemoteException { return false; }
            public void registerCallback(android.hardware.display.IDisplayManagerCallback p0) throws android.os.RemoteException {}
            public void registerCallbackWithEventMask(android.hardware.display.IDisplayManagerCallback p0, long p1) throws android.os.RemoteException {}
            public void startWifiDisplayScan() throws android.os.RemoteException {}
            public void stopWifiDisplayScan() throws android.os.RemoteException {}
            public void connectWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
            public void disconnectWifiDisplay() throws android.os.RemoteException {}
            public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void forgetWifiDisplay(java.lang.String p0) throws android.os.RemoteException {}
            public void pauseWifiDisplay() throws android.os.RemoteException {}
            public void resumeWifiDisplay() throws android.os.RemoteException {}
            public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() throws android.os.RemoteException { return null; }
            public void setUserDisabledHdrTypes(int[] p0) throws android.os.RemoteException {}
            public void setAreUserDisabledHdrTypesAllowed(boolean p0) throws android.os.RemoteException {}
            public boolean areUserDisabledHdrTypesAllowed() throws android.os.RemoteException { return false; }
            public int[] getUserDisabledHdrTypes() throws android.os.RemoteException { return null; }
            public void requestColorMode(int p0, int p1) throws android.os.RemoteException {}
            public int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.media.projection.IMediaProjection p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) throws android.os.RemoteException {}
            public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0) throws android.os.RemoteException {}
            public void setVirtualDisplayState(android.hardware.display.IVirtualDisplayCallback p0, boolean p1) throws android.os.RemoteException {}
            public android.graphics.Point getStableDisplaySize() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getBrightnessEvents(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAmbientBrightnessStats() throws android.os.RemoteException { return null; }
            public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() throws android.os.RemoteException { return null; }
            public boolean isMinimalPostProcessingRequested(int p0) throws android.os.RemoteException { return false; }
            public void setTemporaryBrightness(int p0, float p1) throws android.os.RemoteException {}
            public void setBrightness(int p0, float p1) throws android.os.RemoteException {}
            public float getBrightness(int p0) throws android.os.RemoteException { return 0.0f; }
            public void setTemporaryAutoBrightnessAdjustment(float p0) throws android.os.RemoteException {}
            public android.hardware.display.Curve getMinimumBrightnessCurve() throws android.os.RemoteException { return null; }
            public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) throws android.os.RemoteException { return null; }
            public int getPreferredWideGamutColorSpaceId() throws android.os.RemoteException { return 0; }
            public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1) throws android.os.RemoteException {}
            public android.view.Display.Mode getUserPreferredDisplayMode(int p0) throws android.os.RemoteException { return null; }
            public android.view.Display.Mode getSystemPreferredDisplayMode(int p0) throws android.os.RemoteException { return null; }
            public void setShouldAlwaysRespectAppRequestedMode(boolean p0) throws android.os.RemoteException {}
            public boolean shouldAlwaysRespectAppRequestedMode() throws android.os.RemoteException { return false; }
            public void setRefreshRateSwitchingType(int p0) throws android.os.RemoteException {}
            public int getRefreshRateSwitchingType() throws android.os.RemoteException { return 0; }
            public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
