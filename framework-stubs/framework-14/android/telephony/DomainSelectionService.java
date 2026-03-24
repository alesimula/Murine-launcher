package android.telephony;

public class DomainSelectionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.DomainSelectionService";
    public static final int SELECTOR_TYPE_CALLING = 1;
    public static final int SELECTOR_TYPE_SMS = 2;
    public static final int SELECTOR_TYPE_UT = 3;
    public static final int SCAN_TYPE_NO_PREFERENCE = 0;
    public static final int SCAN_TYPE_LIMITED_SERVICE = 1;
    public static final int SCAN_TYPE_FULL_SERVICE = 2;
    public DomainSelectionService() { super(); }
    public void onDomainSelection(android.telephony.DomainSelectionService.SelectionAttributes p0, android.telephony.TransportSelectorCallback p1) {}
    public void onServiceStateUpdated(int p0, int p1, android.telephony.ServiceState p2) {}
    public void onBarringInfoUpdated(int p0, int p1, android.telephony.BarringInfo p2) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SuppressLint("OnNameExpected")
    public java.util.concurrent.Executor getExecutor() { return null; }
    public java.util.concurrent.Executor getCachedExecutor() { return null; }
    public static java.lang.String getDomainName(int p0) { return null; }

    private final class DomainSelectorWrapper {
        DomainSelectorWrapper(android.telephony.DomainSelectionService p0, android.telephony.DomainSelector p1, java.util.concurrent.Executor p2) {}
        public com.android.internal.telephony.IDomainSelector getCallbackBinder() { return null; }

        private class IDomainSelectorAdapter extends com.android.internal.telephony.IDomainSelector.Stub {
            IDomainSelectorAdapter(android.telephony.DomainSelectionService.DomainSelectorWrapper p0, android.telephony.DomainSelector p1, java.util.concurrent.Executor p2) { super(); }
            public void cancelSelection() {}
            public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0) {}
            public void finishSelection() {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyScanType {
    }

    public static final class SelectionAttributes implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.telephony.DomainSelectionService.SelectionAttributes> CREATOR = null;
        public SelectionAttributes(android.telephony.DomainSelectionService.SelectionAttributes p0) {}
        public int getSlotId() { return 0; }
        public int getSubId() { return 0; }
        public java.lang.String getCallId() { return null; }
        public java.lang.String getNumber() { return null; }
        public int getSelectorType() { return 0; }
        public boolean isVideoCall() { return false; }
        public boolean isEmergency() { return false; }
        public boolean isExitedFromAirplaneMode() { return false; }
        public android.telephony.ims.ImsReasonInfo getPsDisconnectCause() { return null; }
        public int getCsDisconnectCause() { return 0; }
        public android.telephony.EmergencyRegResult getEmergencyRegResult() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(int p0, int p1, int p2) {}
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setCallId(java.lang.String p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setNumber(java.lang.String p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setVideoCall(boolean p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setEmergency(boolean p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setExitedFromAirplaneMode(boolean p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setPsDisconnectCause(android.telephony.ims.ImsReasonInfo p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setCsDisconnectCause(int p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setEmergencyRegResult(android.telephony.EmergencyRegResult p0) { return null; }
            public android.telephony.DomainSelectionService.SelectionAttributes build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SelectorType {
    }

    private final class TransportSelectorCallbackWrapper implements android.telephony.TransportSelectorCallback {
        TransportSelectorCallbackWrapper(android.telephony.DomainSelectionService p0, com.android.internal.telephony.ITransportSelectorCallback p1, java.util.concurrent.Executor p2) {}
        public void onCreated(android.telephony.DomainSelector p0) {}
        public void onWlanSelected(boolean p0) {}
        public android.telephony.WwanSelectorCallback onWwanSelected() { return null; }
        public void onWwanSelected(java.util.function.Consumer<android.telephony.WwanSelectorCallback> p0) {}
        public void onSelectionTerminated(int p0) {}

        private class ITransportSelectorResultCallbackAdapter extends com.android.internal.telephony.ITransportSelectorResultCallback.Stub {
            ITransportSelectorResultCallbackAdapter(java.util.function.Consumer<android.telephony.WwanSelectorCallback> p0, java.util.concurrent.Executor p1) { super(); }
            public void onCompleted(com.android.internal.telephony.IWwanSelectorCallback p0) {}
        }
    }

    private final class WwanSelectorCallbackWrapper implements android.telephony.WwanSelectorCallback, android.os.CancellationSignal.OnCancelListener {
        WwanSelectorCallbackWrapper(android.telephony.DomainSelectionService p0, com.android.internal.telephony.IWwanSelectorCallback p1, java.util.concurrent.Executor p2) {}
        public void onCancel() {}
        public void onRequestEmergencyNetworkScan(java.util.List<java.lang.Integer> p0, int p1, android.os.CancellationSignal p2, java.util.function.Consumer<android.telephony.EmergencyRegResult> p3) {}
        public void onDomainSelected(int p0, boolean p1) {}

        private class IWwanSelectorResultCallbackAdapter extends com.android.internal.telephony.IWwanSelectorResultCallback.Stub {
            IWwanSelectorResultCallbackAdapter(java.util.function.Consumer<android.telephony.EmergencyRegResult> p0, java.util.concurrent.Executor p1) { super(); }
            public void onComplete(android.telephony.EmergencyRegResult p0) {}
        }
    }
}
