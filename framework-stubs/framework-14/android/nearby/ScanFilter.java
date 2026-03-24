package android.nearby;

public abstract class ScanFilter {
    ScanFilter() {}
    public int getType() { return 0; }
    public int getMaxPathLoss() { return 0; }
}
