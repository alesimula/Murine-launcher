package android.telephony;

public interface TransportSelectorCallback {
    public void onCreated(android.telephony.DomainSelector p0);
    public void onWlanSelected(boolean p0);
    public android.telephony.WwanSelectorCallback onWwanSelected();
    public void onWwanSelected(java.util.function.Consumer<android.telephony.WwanSelectorCallback> p0);
    public void onSelectionTerminated(int p0);
}
