package com.android.internal.os;

class ZygoteArguments {
    int mUid;
    boolean mUidSpecified;
    int mGid;
    boolean mGidSpecified;
    int[] mGids;
    int mRuntimeFlags;
    int mMountExternal;
    int mTargetSdkVersion;
    boolean mTargetSdkVersionSpecified;
    java.lang.String mNiceName;
    boolean mCapabilitiesSpecified;
    long mPermittedCapabilities;
    long mEffectiveCapabilities;
    boolean mSeInfoSpecified;
    java.lang.String mSeInfo;
    boolean mUsapPoolEnabled;
    boolean mUsapPoolStatusSpecified;
    java.util.ArrayList<int[]> mRLimits;
    java.lang.String mInvokeWith;
    java.lang.String mPackageName;
    java.lang.String[] mRemainingArgs;
    boolean mAbiListQuery;
    java.lang.String mInstructionSet;
    java.lang.String mAppDataDir;
    java.lang.String mPreloadPackage;
    java.lang.String mPreloadApp;
    java.lang.String mPreloadPackageLibs;
    java.lang.String mPreloadPackageLibFileName;
    java.lang.String mPreloadPackageCacheKey;
    boolean mPreloadDefault;
    boolean mStartChildZygote;
    boolean mPidQuery;
    java.lang.String[] mApiBlacklistExemptions;
    int mHiddenApiAccessLogSampleRate;
    int mHiddenApiAccessStatslogSampleRate;
    ZygoteArguments(java.lang.String[] p0) throws java.lang.IllegalArgumentException {}
    private void parseArgs(java.lang.String[] p0) throws java.lang.IllegalArgumentException {}
}
