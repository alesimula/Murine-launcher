package android.system.virtualmachine;

public final class VirtualMachineConfig {
    public static final int CPU_TOPOLOGY_MATCH_HOST = 1;
    public static final int CPU_TOPOLOGY_ONE_CPU = 0;
    public static final int DEBUG_LEVEL_FULL = 1;
    public static final int DEBUG_LEVEL_NONE = 0;
    VirtualMachineConfig() {}
    @android.annotation.Nullable
    public java.lang.String getApkPath() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPayloadBinaryName() { return null; }
    public int getDebugLevel() { return 0; }
    public boolean isProtectedVm() { return false; }
    public long getMemoryBytes() { return 0L; }
    public int getCpuTopology() { return 0; }
    public boolean isEncryptedStorageEnabled() { return false; }
    public long getEncryptedStorageBytes() { return 0L; }
    public boolean isVmOutputCaptured() { return false; }
    public boolean isCompatibleWith(android.system.virtualmachine.VirtualMachineConfig p0) { return false; }

    public static final class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig build() { return null; }
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig.Builder setApkPath(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig.Builder setPayloadBinaryName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig.Builder setDebugLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig.Builder setProtectedVm(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig.Builder setMemoryBytes(long p0) { return null; }
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig.Builder setCpuTopology(int p0) { return null; }
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig.Builder setEncryptedStorageBytes(long p0) { return null; }
        @android.annotation.NonNull
        public android.system.virtualmachine.VirtualMachineConfig.Builder setVmOutputCaptured(boolean p0) { return null; }
    }
}
