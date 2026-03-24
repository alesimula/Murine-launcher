package android.compat;

public class Compatibility {
    public Compatibility() {}
    public void setCallbacks(android.compat.Compatibility.Callbacks p0) {}
    public boolean isChangeEnabled(long p0) { return false; }

    public static class Callbacks {
        public Callbacks() {}
    }

    public static class ChangeConfig {
        public ChangeConfig(java.util.Set p0, java.util.Set p1) {}
        public java.util.Set forceEnabledSet() { return null; }
        public java.util.Set forceDisabledSet() { return null; }
        public boolean isForceEnabled(long p0) { return false; }
        public boolean isForceDisabled(long p0) { return false; }
        public long[] forceEnabledChangesArray() { return null; }
        public long[] forceDisabledChangesArray() { return null; }
    }
}
