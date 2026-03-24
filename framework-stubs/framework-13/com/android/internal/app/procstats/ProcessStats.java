package com.android.internal.app.procstats;

public class ProcessStats {

    static final class AssociationDumpContainer {
        final com.android.internal.app.procstats.AssociationState mState = null;
        java.util.ArrayList<android.util.Pair<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceDumpContainer>> mSources;
        long mTotalTime;
        long mActiveTime;
        AssociationDumpContainer(com.android.internal.app.procstats.ProcessStats p0, com.android.internal.app.procstats.AssociationState p1) {}
    }

    public final class PackageState {
        public final com.android.internal.app.procstats.ProcessStats mProcessStats = null;
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessState> mProcesses = null;
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ServiceState> mServices = null;
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.AssociationState> mAssociations = null;
        public final java.lang.String mPackageName = null;
        public final int mUid = 0;
        public final long mVersionCode = 0L;
        public PackageState(com.android.internal.app.procstats.ProcessStats p0, java.lang.String p1, int p2, long p3) {}
        public com.android.internal.app.procstats.AssociationState getAssociationStateLocked(com.android.internal.app.procstats.ProcessState p0, java.lang.String p1) { return null; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, long p2, int p3) {}
    }

    public final class ProcessDataCollection {
        final int[] screenStates = null;
        final int[] memStates = null;
        final int[] procStates = null;
        public long totalTime;
        public long numPss;
        public long minPss;
        public long avgPss;
        public long maxPss;
        public long minUss;
        public long avgUss;
        public long maxUss;
        public long minRss;
        public long avgRss;
        public long maxRss;
        public ProcessDataCollection(int[] p0, int[] p1, int[] p2) {}
        void print(java.io.PrintWriter p0, long p1, boolean p2) {}
    }

    public final class ProcessStateHolder {
        public final long appVersion = 0L;
        public com.android.internal.app.procstats.ProcessState state;
        public com.android.internal.app.procstats.ProcessStats.PackageState pkg;
        public ProcessStateHolder(long p0) {}
    }

    public class TotalMemoryUseCollection {
        final int[] screenStates = null;
        final int[] memStates = null;
        public long totalTime;
        public long[] processStatePss;
        public double[] processStateWeight;
        public long[] processStateTime;
        public int[] processStateSamples;
        public long[] sysMemUsage;
        public double sysMemCachedWeight;
        public double sysMemFreeWeight;
        public double sysMemZRamWeight;
        public double sysMemKernelWeight;
        public double sysMemNativeWeight;
        public int sysMemSamples;
        public boolean hasSwappedOutPss;
        public TotalMemoryUseCollection(int[] p0, int[] p1) {}
    }
}
