package android.telephony;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.use_oem_domain_selection_service")
public abstract class DomainSelectionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.telephony.DomainSelectionService";
    public static final int SELECTOR_TYPE_CALLING = 1;
    public static final int SELECTOR_TYPE_SMS = 2;
    public static final int SCAN_TYPE_NO_PREFERENCE = 0;
    public static final int SCAN_TYPE_LIMITED_SERVICE = 1;
    public static final int SCAN_TYPE_FULL_SERVICE = 2;
    public DomainSelectionService() { super(); }
    public abstract void onDomainSelection(android.telephony.DomainSelectionService.SelectionAttributes p0, android.telephony.TransportSelectorCallback p1);
    public void onServiceStateUpdated(int p0, int p1, android.telephony.ServiceState p2) {}
    public void onBarringInfoUpdated(int p0, int p1, android.telephony.BarringInfo p2) {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.SuppressLint("OnNameExpected")
    @android.annotation.NonNull
    public java.util.concurrent.Executor getCreateExecutor() { return null; }
    @android.annotation.NonNull
    public final java.util.concurrent.Executor getCachedExecutor() { return null; }
    @android.annotation.NonNull
    public static java.lang.String getDomainName(int p0) { return null; }

    private final class DomainSelectorWrapper {
        DomainSelectorWrapper(android.telephony.DomainSelectionService p0, android.telephony.DomainSelector p1, java.util.concurrent.Executor p2) {}
        @android.annotation.NonNull
        public com.android.internal.telephony.IDomainSelector getCallbackBinder() { return null; }

        private class IDomainSelectorAdapter extends com.android.internal.telephony.IDomainSelector.Stub {
            IDomainSelectorAdapter(android.telephony.DomainSelectionService.DomainSelectorWrapper p0, android.telephony.DomainSelector p1, java.util.concurrent.Executor p2) { super(); }
            public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0) {}
            public void finishSelection() {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyScanType {
    }

    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.use_oem_domain_selection_service")
    public static final class SelectionAttributes implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.telephony.DomainSelectionService.SelectionAttributes> CREATOR = null;
        public SelectionAttributes(android.telephony.DomainSelectionService.SelectionAttributes p0) {}
        public int getSlotIndex() { return 0; }
        public int getSubscriptionId() { return 0; }
        @android.annotation.Nullable
        public java.lang.String getCallId() { return null; }
        @android.annotation.Nullable
        public android.net.Uri getAddress() { return null; }
        public int getSelectorType() { return 0; }
        public boolean isVideoCall() { return false; }
        public boolean isEmergency() { return false; }
        public boolean isTestEmergencyNumber() { return false; }
        public boolean isExitedFromAirplaneMode() { return false; }
        @android.annotation.Nullable
        public android.telephony.ims.ImsReasonInfo getPsDisconnectCause() { return null; }
        public int getCsDisconnectCause() { return 0; }
        @android.annotation.Nullable
        public android.telephony.EmergencyRegistrationResult getEmergencyRegistrationResult() { return null; }
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.use_oem_domain_selection_service")
        public static final class Builder {
            public Builder(int p0, int p1, int p2) {}
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setCallId(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setAddress(android.net.Uri p0) { return null; }
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setVideoCall(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setEmergency(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setTestEmergencyNumber(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setExitedFromAirplaneMode(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setPsDisconnectCause(android.telephony.ims.ImsReasonInfo p0) { return null; }
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setCsDisconnectCause(int p0) { return null; }
            @android.annotation.NonNull
            public android.telephony.DomainSelectionService.SelectionAttributes.Builder setEmergencyRegistrationResult(android.telephony.EmergencyRegistrationResult p0) { return null; }
            @android.annotation.NonNull
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
        public void onRequestEmergencyNetworkScan(java.util.List<java.lang.Integer> p0, int p1, boolean p2, android.os.CancellationSignal p3, java.util.function.Consumer<android.telephony.EmergencyRegistrationResult> p4) {}
        public void onDomainSelected(int p0, boolean p1) {}

        private class IWwanSelectorResultCallbackAdapter extends com.android.internal.telephony.IWwanSelectorResultCallback.Stub {
            IWwanSelectorResultCallbackAdapter(java.util.function.Consumer<android.telephony.EmergencyRegistrationResult> p0, java.util.concurrent.Executor p1) { super(); }
            public void onComplete(android.telephony.EmergencyRegistrationResult p0) {}
        }
    }
}
