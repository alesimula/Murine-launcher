package android.os;

public final class DdmSyncState {
    public DdmSyncState() {}
    public static synchronized android.os.DdmSyncState.Stage getStage() { return null; }
    public static void reset() {}
    public static synchronized void next(android.os.DdmSyncState.Stage p0) {}

    public static enum Stage {
        Boot,
        Attach,
        Bind,
        Named,
        Debugger,
        Running;
        final java.lang.String mLabel = null;
        public int toInt() { return 0; }
    }
}
