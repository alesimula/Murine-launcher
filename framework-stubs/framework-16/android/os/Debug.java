package android.os;

public final class Debug {
    @java.lang.Deprecated
    public static final int TRACE_COUNT_ALLOCS = 1;
    public static final int SHOW_FULL_DETAIL = 1;
    public static final int SHOW_CLASSLOADER = 2;
    public static final int SHOW_INITIALIZED = 4;
    public static final int MEMINFO_TOTAL = 0;
    public static final int MEMINFO_FREE = 1;
    public static final int MEMINFO_BUFFERS = 2;
    public static final int MEMINFO_CACHED = 3;
    public static final int MEMINFO_SHMEM = 4;
    public static final int MEMINFO_SLAB = 5;
    public static final int MEMINFO_SLAB_RECLAIMABLE = 6;
    public static final int MEMINFO_SLAB_UNRECLAIMABLE = 7;
    public static final int MEMINFO_SWAP_TOTAL = 8;
    public static final int MEMINFO_SWAP_FREE = 9;
    public static final int MEMINFO_ZRAM_TOTAL = 10;
    public static final int MEMINFO_MAPPED = 11;
    public static final int MEMINFO_VM_ALLOC_USED = 12;
    public static final int MEMINFO_PAGE_TABLES = 13;
    public static final int MEMINFO_KERNEL_STACK = 14;
    public static final int MEMINFO_KRECLAIMABLE = 15;
    public static final int MEMINFO_ACTIVE = 16;
    public static final int MEMINFO_INACTIVE = 17;
    public static final int MEMINFO_UNEVICTABLE = 18;
    public static final int MEMINFO_AVAILABLE = 19;
    public static final int MEMINFO_ACTIVE_ANON = 20;
    public static final int MEMINFO_INACTIVE_ANON = 21;
    public static final int MEMINFO_ACTIVE_FILE = 22;
    public static final int MEMINFO_INACTIVE_FILE = 23;
    public static final int MEMINFO_CMA_TOTAL = 24;
    public static final int MEMINFO_CMA_FREE = 25;
    public static final int MEMINFO_SWAP_CACHED = 26;
    public static final int MEMINFO_COUNT = 27;
    public static void suspendAllAndSendVmStart() {}
    public static void waitForDebugger() {}
    public static boolean waitingForDebugger() { return false; }
    public static boolean isDebuggerConnected() { return false; }
    public static java.lang.String[] getVmFeatureList() { return null; }
    public static java.lang.String[] getFeatureList() { return null; }
    @java.lang.Deprecated
    public static void changeDebugPort(int p0) {}
    public static void startNativeTracing() {}
    public static void stopNativeTracing() {}
    public static void enableEmulatorTraceOutput() {}
    public static void startMethodTracing() {}
    public static void startMethodTracing(java.lang.String p0) {}
    public static void startMethodTracing(java.lang.String p0, int p1) {}
    public static void startMethodTracing(java.lang.String p0, int p1, int p2) {}
    public static void startMethodTracingSampling(java.lang.String p0, int p1, int p2) {}
    public static void startMethodTracing(java.lang.String p0, java.io.FileDescriptor p1, int p2, int p3, boolean p4) {}
    public static void startMethodTracingDdms(int p0, int p1, boolean p2, int p3) {}
    public static int getMethodTracingMode() { return 0; }
    public static void stopMethodTracing() {}
    public static long threadCpuTimeNanos() { return 0L; }
    @java.lang.Deprecated
    public static void startAllocCounting() {}
    @java.lang.Deprecated
    public static void stopAllocCounting() {}
    @java.lang.Deprecated
    public static int getGlobalAllocCount() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalAllocCount() {}
    @java.lang.Deprecated
    public static int getGlobalAllocSize() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalAllocSize() {}
    @java.lang.Deprecated
    public static int getGlobalFreedCount() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalFreedCount() {}
    @java.lang.Deprecated
    public static int getGlobalFreedSize() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalFreedSize() {}
    @java.lang.Deprecated
    public static int getGlobalGcInvocationCount() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalGcInvocationCount() {}
    @java.lang.Deprecated
    public static int getGlobalClassInitCount() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalClassInitCount() {}
    @java.lang.Deprecated
    public static int getGlobalClassInitTime() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalClassInitTime() {}
    @java.lang.Deprecated
    public static int getGlobalExternalAllocCount() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalExternalAllocSize() {}
    @java.lang.Deprecated
    public static void resetGlobalExternalAllocCount() {}
    @java.lang.Deprecated
    public static int getGlobalExternalAllocSize() { return 0; }
    @java.lang.Deprecated
    public static int getGlobalExternalFreedCount() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalExternalFreedCount() {}
    @java.lang.Deprecated
    public static int getGlobalExternalFreedSize() { return 0; }
    @java.lang.Deprecated
    public static void resetGlobalExternalFreedSize() {}
    @java.lang.Deprecated
    public static int getThreadAllocCount() { return 0; }
    @java.lang.Deprecated
    public static void resetThreadAllocCount() {}
    @java.lang.Deprecated
    public static int getThreadAllocSize() { return 0; }
    @java.lang.Deprecated
    public static void resetThreadAllocSize() {}
    @java.lang.Deprecated
    public static int getThreadExternalAllocCount() { return 0; }
    @java.lang.Deprecated
    public static void resetThreadExternalAllocCount() {}
    @java.lang.Deprecated
    public static int getThreadExternalAllocSize() { return 0; }
    @java.lang.Deprecated
    public static void resetThreadExternalAllocSize() {}
    @java.lang.Deprecated
    public static int getThreadGcInvocationCount() { return 0; }
    @java.lang.Deprecated
    public static void resetThreadGcInvocationCount() {}
    @java.lang.Deprecated
    public static void resetAllCounts() {}
    public static java.lang.String getRuntimeStat(java.lang.String p0) { return null; }
    public static java.util.Map<java.lang.String, java.lang.String> getRuntimeStats() { return null; }
    public static native long getNativeHeapSize();
    public static native long getNativeHeapAllocatedSize();
    public static native long getNativeHeapFreeSize();
    public static native void getMemoryInfo(android.os.Debug.MemoryInfo p0);
    public static native boolean getMemoryInfo(int p0, android.os.Debug.MemoryInfo p1);
    public static native long getPss();
    public static native long getPss(int p0, long[] p1, long[] p2);
    @android.annotation.FlaggedApi("android.os.remove_app_profiler_pss_collection")
    public static native long getRss();
    @android.annotation.FlaggedApi("android.os.remove_app_profiler_pss_collection")
    public static native long getRss(int p0, long[] p1);
    public static native void getMemInfo(long[] p0);
    @java.lang.Deprecated
    public static int setAllocationLimit(int p0) { return 0; }
    @java.lang.Deprecated
    public static int setGlobalAllocationLimit(int p0) { return 0; }
    public static void printLoadedClasses(int p0) {}
    public static int getLoadedClassCount() { return 0; }
    public static void dumpHprofData(java.lang.String p0) throws java.io.IOException {}
    public static void dumpHprofData(java.lang.String p0, java.io.FileDescriptor p1) throws java.io.IOException {}
    public static void dumpHprofData(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public static void dumpHprofData(java.lang.String p0, java.io.FileDescriptor p1, java.lang.String p2) throws java.io.IOException {}
    public static void dumpHprofDataDdms() {}
    public static native void dumpNativeHeap(java.io.FileDescriptor p0);
    public static native void dumpNativeMallocInfo(java.io.FileDescriptor p0);
    @android.annotation.FlaggedApi("android.os.count_class_instances_api")
    public static long getInstanceCount(java.lang.Class p0) { return 0L; }
    @android.annotation.FlaggedApi("android.os.count_class_instances_api")
    @android.annotation.NonNull
    public static long[] getInstanceCounts(java.util.List<java.lang.Class> p0) { return null; }
    @android.annotation.FlaggedApi("android.os.count_class_instances_api")
    public static long getInstanceCount(java.lang.Class p0, boolean p1) { return 0L; }
    @android.annotation.FlaggedApi("android.os.count_class_instances_api")
    @android.annotation.NonNull
    public static long[] getInstanceCounts(java.util.List<java.lang.Class> p0, boolean p1) { return null; }
    public static native int getBinderSentTransactions();
    public static native int getBinderReceivedTransactions();
    public static final native int getBinderLocalObjectCount();
    public static final native int getBinderProxyObjectCount();
    public static final native int getBinderDeathObjectCount();
    public static final void dumpReferenceTables() {}
    public static void setFieldsOn(java.lang.Class<?> p0) {}
    public static void setFieldsOn(java.lang.Class<?> p0, boolean p1) {}
    public static boolean dumpService(java.lang.String p0, java.io.FileDescriptor p1, java.lang.String[] p2) { return false; }
    public static native boolean dumpJavaBacktraceToFileTimeout(int p0, java.lang.String p1, int p2);
    public static native boolean dumpNativeBacktraceToFileTimeout(int p0, java.lang.String p1, int p2);
    public static native java.lang.String getUnreachableMemory(int p0, boolean p1);
    public static java.lang.String getCallers(int p0) { return null; }
    public static java.lang.String getCallers(int p0, int p1) { return null; }
    public static java.lang.String getCallers(int p0, java.lang.String p1) { return null; }
    public static java.lang.String getCaller() { return null; }
    public static void attachJvmtiAgent(java.lang.String p0, java.lang.String p1, java.lang.ClassLoader p2) throws java.io.IOException {}
    public static native long getZramFreeKb();
    public static native long getDmabufTotalExportedKb();
    public static native long getDmabufHeapTotalExportedKb();
    public static native long getIonHeapsSizeKb();
    public static native long getDmabufHeapPoolsSizeKb();
    public static native long getIonPoolsSizeKb();
    public static native long getGpuPrivateMemoryKb();
    public static native long getDmabufMappedSizeKb();
    public static native long getGpuTotalUsageKb();
    public static native boolean isVmapStack();
    public static native boolean logAllocatorStats();
    public static native long getKernelCmaUsageKb();

    @java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface DebugProperty {
    }

    @java.lang.Deprecated
    public static class InstructionCount {
        public InstructionCount() {}
        public boolean resetAndStart() { return false; }
        public boolean collect() { return false; }
        public int globalTotal() { return 0; }
        public int globalMethodInvocations() { return 0; }
    }

    public static class MemoryInfo implements android.os.Parcelable {
        public int dalvikPss;
        public int dalvikSwappablePss;
        public int dalvikRss;
        public int dalvikPrivateDirty;
        public int dalvikSharedDirty;
        public int dalvikPrivateClean;
        public int dalvikSharedClean;
        public int dalvikSwappedOut;
        public int dalvikSwappedOutPss;
        public int nativePss;
        public int nativeSwappablePss;
        public int nativeRss;
        public int nativePrivateDirty;
        public int nativeSharedDirty;
        public int nativePrivateClean;
        public int nativeSharedClean;
        public int nativeSwappedOut;
        public int nativeSwappedOutPss;
        public int otherPss;
        public int otherSwappablePss;
        public int otherRss;
        public int otherPrivateDirty;
        public int otherSharedDirty;
        public int otherPrivateClean;
        public int otherSharedClean;
        public int otherSwappedOut;
        public int otherSwappedOutPss;
        public boolean hasSwappedOutPss;
        public static final int HEAP_UNKNOWN = 0;
        public static final int HEAP_DALVIK = 1;
        public static final int HEAP_NATIVE = 2;
        public static final int OTHER_DALVIK_OTHER = 0;
        public static final int OTHER_STACK = 1;
        public static final int OTHER_CURSOR = 2;
        public static final int OTHER_ASHMEM = 3;
        public static final int OTHER_GL_DEV = 4;
        public static final int OTHER_UNKNOWN_DEV = 5;
        public static final int OTHER_SO = 6;
        public static final int OTHER_JAR = 7;
        public static final int OTHER_APK = 8;
        public static final int OTHER_TTF = 9;
        public static final int OTHER_DEX = 10;
        public static final int OTHER_OAT = 11;
        public static final int OTHER_ART = 12;
        public static final int OTHER_UNKNOWN_MAP = 13;
        public static final int OTHER_GRAPHICS = 14;
        public static final int OTHER_GL = 15;
        public static final int OTHER_OTHER_MEMTRACK = 16;
        public static final int NUM_OTHER_STATS = 17;
        public static final int OTHER_DALVIK_NORMAL = 17;
        public static final int OTHER_DALVIK_LARGE = 18;
        public static final int OTHER_DALVIK_ZYGOTE = 19;
        public static final int OTHER_DALVIK_NON_MOVING = 20;
        public static final int OTHER_DVK_STAT_DALVIK_START = 0;
        public static final int OTHER_DVK_STAT_DALVIK_END = 3;
        public static final int OTHER_DALVIK_OTHER_LINEARALLOC = 21;
        public static final int OTHER_DALVIK_OTHER_ACCOUNTING = 22;
        public static final int OTHER_DALVIK_OTHER_ZYGOTE_CODE_CACHE = 23;
        public static final int OTHER_DALVIK_OTHER_APP_CODE_CACHE = 24;
        public static final int OTHER_DALVIK_OTHER_COMPILER_METADATA = 25;
        public static final int OTHER_DALVIK_OTHER_INDIRECT_REFERENCE_TABLE = 26;
        public static final int OTHER_DVK_STAT_DALVIK_OTHER_START = 4;
        public static final int OTHER_DVK_STAT_DALVIK_OTHER_END = 9;
        public static final int OTHER_DEX_BOOT_VDEX = 27;
        public static final int OTHER_DEX_APP_DEX = 28;
        public static final int OTHER_DEX_APP_VDEX = 29;
        public static final int OTHER_DVK_STAT_DEX_START = 10;
        public static final int OTHER_DVK_STAT_DEX_END = 12;
        public static final int OTHER_ART_APP = 30;
        public static final int OTHER_ART_BOOT = 31;
        public static final int OTHER_DVK_STAT_ART_START = 13;
        public static final int OTHER_DVK_STAT_ART_END = 14;
        public static final int NUM_DVK_STATS = 15;
        public static final int NUM_CATEGORIES = 9;
        public static final int OFFSET_PSS = 0;
        public static final int OFFSET_SWAPPABLE_PSS = 1;
        public static final int OFFSET_RSS = 2;
        public static final int OFFSET_PRIVATE_DIRTY = 3;
        public static final int OFFSET_SHARED_DIRTY = 4;
        public static final int OFFSET_PRIVATE_CLEAN = 5;
        public static final int OFFSET_SHARED_CLEAN = 6;
        public static final int OFFSET_SWAPPED_OUT = 7;
        public static final int OFFSET_SWAPPED_OUT_PSS = 8;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.os.Debug.MemoryInfo> CREATOR = null;
        public MemoryInfo() {}
        public void set(android.os.Debug.MemoryInfo p0) {}
        public int getTotalPss() { return 0; }
        public int getTotalUss() { return 0; }
        public int getTotalSwappablePss() { return 0; }
        public int getTotalRss() { return 0; }
        public int getTotalPrivateDirty() { return 0; }
        public int getTotalSharedDirty() { return 0; }
        public int getTotalPrivateClean() { return 0; }
        public int getTotalSharedClean() { return 0; }
        public int getTotalSwappedOut() { return 0; }
        public int getTotalSwappedOutPss() { return 0; }
        public int getOtherPss(int p0) { return 0; }
        public int getOtherSwappablePss(int p0) { return 0; }
        public int getOtherRss(int p0) { return 0; }
        public int getOtherPrivateDirty(int p0) { return 0; }
        public int getOtherSharedDirty(int p0) { return 0; }
        public int getOtherPrivateClean(int p0) { return 0; }
        public int getOtherPrivate(int p0) { return 0; }
        public int getOtherSharedClean(int p0) { return 0; }
        public int getOtherSwappedOut(int p0) { return 0; }
        public int getOtherSwappedOutPss(int p0) { return 0; }
        public static java.lang.String getOtherLabel(int p0) { return null; }
        public java.lang.String getMemoryStat(java.lang.String p0) { return null; }
        public java.util.Map<java.lang.String, java.lang.String> getMemoryStats() { return null; }
        public int getSummaryJavaHeap() { return 0; }
        public int getSummaryNativeHeap() { return 0; }
        public int getSummaryCode() { return 0; }
        public int getSummaryStack() { return 0; }
        public int getSummaryGraphics() { return 0; }
        public int getSummaryPrivateOther() { return 0; }
        public int getSummarySystem() { return 0; }
        public int getSummaryJavaHeapRss() { return 0; }
        public int getSummaryNativeHeapRss() { return 0; }
        public int getSummaryCodeRss() { return 0; }
        public int getSummaryStackRss() { return 0; }
        public int getSummaryGraphicsRss() { return 0; }
        public int getSummaryUnknownRss() { return 0; }
        public int getSummaryTotalPss() { return 0; }
        public int getSummaryTotalSwap() { return 0; }
        public int getSummaryTotalSwapPss() { return 0; }
        public boolean hasSwappedOutPss() { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
    }
}
