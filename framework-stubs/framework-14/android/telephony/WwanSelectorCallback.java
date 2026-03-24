package android.telephony;

public interface WwanSelectorCallback {
    public void onRequestEmergencyNetworkScan(java.util.List<java.lang.Integer> p0, int p1, android.os.CancellationSignal p2, java.util.function.Consumer<android.telephony.EmergencyRegResult> p3);
    public void onDomainSelected(int p0, boolean p1);
}
