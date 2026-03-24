package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public interface ScanCallback {
    public void onLocked();
    public void onScanStopped();
    public void onProgress(int p0);
    public void onFrequenciesReported(int[] p0);
    public void onSymbolRatesReported(int[] p0);
    public void onPlpIdsReported(int[] p0);
    public void onGroupIdsReported(int[] p0);
    public void onInputStreamIdsReported(int[] p0);
    public void onDvbsStandardReported(int p0);
    public void onDvbtStandardReported(int p0);
    public void onAnalogSifStandardReported(int p0);
    public void onAtsc3PlpInfosReported(android.media.tv.tuner.frontend.Atsc3PlpInfo[] p0);
    public void onHierarchyReported(int p0);
    public void onSignalTypeReported(int p0);
}
