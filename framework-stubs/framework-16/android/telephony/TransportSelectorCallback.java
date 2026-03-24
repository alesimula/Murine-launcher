package android.telephony;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.telephony.flags.use_oem_domain_selection_service")
public interface TransportSelectorCallback {
    public void onCreated(android.telephony.DomainSelector p0);
    public void onWlanSelected(boolean p0);
    public void onWwanSelected(java.util.function.Consumer<android.telephony.WwanSelectorCallback> p0);
    public void onSelectionTerminated(int p0);
}
