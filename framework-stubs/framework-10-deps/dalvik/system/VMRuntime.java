package dalvik.system;

public class VMRuntime {
    public VMRuntime() {}
    public dalvik.system.VMRuntime getRuntime() { return null; }
    public java.lang.Object newUnpaddedArray(java.lang.Class p0, int p1) { return null; }
    public float getTargetHeapUtilization() { return 0.0f; }
    public float setTargetHeapUtilization(float p0) { return 0.0f; }
    public void preloadDexCaches() {}
    public java.lang.String getCurrentInstructionSet() { return null; }
    public void registerAppInfo(java.lang.String p0, java.lang.String[] p1) {}
    public void setHiddenApiExemptions(java.lang.String[] p0) {}
    public void setHiddenApiAccessLogSamplingRate(int p0) {}
    public void setHiddenApiUsageLogger(dalvik.system.VMRuntime.HiddenApiUsageLogger p0) {}
    public java.lang.String vmInstructionSet() { return null; }
    public boolean is64BitInstructionSet(java.lang.String p0) { return false; }
    public void setTargetSdkVersion(int p0) {}
    public void requestConcurrentGC() {}
    public java.lang.String getInstructionSet(java.lang.String p0) { return null; }
    public java.lang.String vmLibrary() { return null; }
    public boolean is64Bit() { return false; }
    public int getTargetSdkVersion() { return 0; }
    public void setNonSdkApiUsageConsumer(java.util.function.Consumer p0) {}
    public void setDedupeHiddenApiWarnings(boolean p0) {}
    public void registerNativeAllocation(int p0) {}
    public void registerNativeFree(int p0) {}
    public boolean is64BitAbi(java.lang.String p0) { return false; }
    public boolean isCheckJniEnabled() { return false; }
    public boolean isNativeDebuggable() { return false; }
    public java.lang.Object newNonMovableArray(java.lang.Class p0, int p1) { return null; }
    public long addressOf(java.lang.Object p0) { return 0L; }
    public void updateProcessState(int p0) {}
    public void registerSensitiveThread() {}
    public void setProcessPackageName(java.lang.String p0) {}
    public void setProcessDataDirectory(java.lang.String p0) {}
    public void clearGrowthLimit() {}
    public void clampGrowthLimit() {}
    public void notifyStartupCompleted() {}

    public static interface HiddenApiUsageLogger {
    }
}
