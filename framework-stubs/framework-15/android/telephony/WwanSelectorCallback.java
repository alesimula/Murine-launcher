package android.telephony;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.use_oem_domain_selection_service")
public interface WwanSelectorCallback {
    public void onRequestEmergencyNetworkScan(java.util.List<java.lang.Integer> p0, int p1, boolean p2, android.os.CancellationSignal p3, java.util.function.Consumer<android.telephony.EmergencyRegistrationResult> p4);
    public void onDomainSelected(int p0, boolean p1);
}
