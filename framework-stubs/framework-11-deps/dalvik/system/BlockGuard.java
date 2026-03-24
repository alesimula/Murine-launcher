package dalvik.system;

public class BlockGuard {
    public BlockGuard() {}
    public dalvik.system.BlockGuard.VmPolicy getVmPolicy() { return null; }
    public dalvik.system.BlockGuard.Policy getThreadPolicy() { return null; }
    public dalvik.system.BlockGuard.Policy LAX_POLICY = null;
    public void setThreadPolicy(dalvik.system.BlockGuard.Policy p0) {}
    public void setVmPolicy(dalvik.system.BlockGuard.VmPolicy p0) {}
    public dalvik.system.BlockGuard.VmPolicy LAX_VM_POLICY = null;

    public static interface VmPolicy {
    }

    public static interface Policy {
    }
}
