package android.compat;

public class Compatibility {
    public Compatibility() {}
    public void setBehaviorChangeDelegate(android.compat.Compatibility.BehaviorChangeDelegate p0) {}
    public boolean isChangeEnabled(long p0) { return false; }

    public static interface BehaviorChangeDelegate {
    }

    public static class ChangeConfig {
        public ChangeConfig(java.util.Set p0, java.util.Set p1) {}
        public java.util.Set getEnabledSet() { return null; }
        public java.util.Set getDisabledSet() { return null; }
        public boolean isForceEnabled(long p0) { return false; }
        public boolean isForceDisabled(long p0) { return false; }
        public long[] getEnabledChangesArray() { return null; }
        public long[] getDisabledChangesArray() { return null; }
    }
}
