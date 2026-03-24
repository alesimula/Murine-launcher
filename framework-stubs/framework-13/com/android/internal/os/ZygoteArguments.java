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
    java.lang.String mNiceName;
    long mPermittedCapabilities;
    long mEffectiveCapabilities;
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
    boolean mBootCompleted;
    java.lang.String[] mApiDenylistExemptions;
    int mHiddenApiAccessLogSampleRate;
    int mHiddenApiAccessStatslogSampleRate;
    boolean mIsTopApp;
    long[] mDisabledCompatChanges;
    java.lang.String[] mPkgDataInfoList;
    java.lang.String[] mAllowlistedDataInfoList;
    boolean mBindMountAppStorageDirs;
    boolean mBindMountAppDataDirs;
    public static com.android.internal.os.ZygoteArguments getInstance(com.android.internal.os.ZygoteCommandBuffer p0) throws java.lang.IllegalArgumentException, java.io.EOFException { return null; }
}
