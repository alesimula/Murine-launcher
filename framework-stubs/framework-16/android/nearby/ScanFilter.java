package android.nearby;

public abstract class ScanFilter {
    ScanFilter() {}
    public int getMaxPathLoss() { return 0; }
    public int getType() { return 0; }
}
