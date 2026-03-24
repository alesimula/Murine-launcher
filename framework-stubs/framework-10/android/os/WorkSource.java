package android.os;

public class WorkSource implements android.os.Parcelable {
    static final java.lang.String TAG = "WorkSource";
    static final boolean DEBUG = false;
    @android.annotation.UnsupportedAppUsage
    int mNum;
    @android.annotation.UnsupportedAppUsage
    int[] mUids;
    @android.annotation.UnsupportedAppUsage
    java.lang.String[] mNames;
    private java.util.ArrayList<android.os.WorkSource.WorkChain> mChains;
    static final android.os.WorkSource sTmpWorkSource = null;
    static android.os.WorkSource sNewbWork;
    static android.os.WorkSource sGoneWork;
    public static final android.os.Parcelable.Creator<android.os.WorkSource> CREATOR = null;
    public WorkSource() {}
    public WorkSource(android.os.WorkSource p0) {}
    public WorkSource(int p0) {}
    public WorkSource(int p0, java.lang.String p1) {}
    @android.annotation.UnsupportedAppUsage
    WorkSource(android.os.Parcel p0) {}
    public static boolean isChainedBatteryAttributionEnabled(android.content.Context p0) { return false; }
    public int size() { return 0; }
    public int get(int p0) { return 0; }
    public int getAttributionUid() { return 0; }
    public java.lang.String getName(int p0) { return null; }
    public void clearNames() {}
    public void clear() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean diff(android.os.WorkSource p0) { return false; }
    public void set(android.os.WorkSource p0) {}
    public void set(int p0) {}
    public void set(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public android.os.WorkSource[] setReturningDiffs(android.os.WorkSource p0) { return null; }
    public boolean add(android.os.WorkSource p0) { return false; }
    @java.lang.Deprecated
    public android.os.WorkSource addReturningNewbs(android.os.WorkSource p0) { return null; }
    public boolean add(int p0) { return false; }
    public boolean add(int p0, java.lang.String p1) { return false; }
    public boolean remove(android.os.WorkSource p0) { return false; }
    @android.annotation.SystemApi
    public android.os.WorkSource.WorkChain createWorkChain() { return null; }
    public boolean isEmpty() { return false; }
    public java.util.ArrayList<android.os.WorkSource.WorkChain> getWorkChains() { return null; }
    public void transferWorkChains(android.os.WorkSource p0) {}
    private boolean removeUids(android.os.WorkSource p0) { return false; }
    private boolean removeUidsAndNames(android.os.WorkSource p0) { return false; }
    private boolean updateLocked(android.os.WorkSource p0, boolean p1, boolean p2) { return false; }
    private static android.os.WorkSource addWork(android.os.WorkSource p0, int p1) { return null; }
    private boolean updateUidsLocked(android.os.WorkSource p0, boolean p1, boolean p2) { return false; }
    private int compare(android.os.WorkSource p0, int p1, int p2) { return 0; }
    private static android.os.WorkSource addWork(android.os.WorkSource p0, int p1, java.lang.String p2) { return null; }
    private boolean updateUidsAndNamesLocked(android.os.WorkSource p0, boolean p1, boolean p2) { return false; }
    private void insert(int p0, int p1) {}
    private void insert(int p0, int p1, java.lang.String p2) {}
    public static java.util.ArrayList<android.os.WorkSource.WorkChain>[] diffChains(android.os.WorkSource p0, android.os.WorkSource p1) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}

    @android.annotation.SystemApi
    public static final class WorkChain implements android.os.Parcelable {
        private int mSize;
        private int[] mUids;
        private java.lang.String[] mTags;
        public static final android.os.Parcelable.Creator<android.os.WorkSource.WorkChain> CREATOR = null;
        public WorkChain() {}
        public WorkChain(android.os.WorkSource.WorkChain p0) {}
        private WorkChain(android.os.Parcel p0) {}
        public android.os.WorkSource.WorkChain addNode(int p0, java.lang.String p1) { return null; }
        public int getAttributionUid() { return 0; }
        public java.lang.String getAttributionTag() { return null; }
        public int[] getUids() { return null; }
        public java.lang.String[] getTags() { return null; }
        public int getSize() { return 0; }
        private void resizeArrays() {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
