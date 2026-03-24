package android.hardware.radio;

@android.annotation.SystemApi
public final class ProgramList implements java.lang.AutoCloseable {
    private final java.lang.Object mLock = null;
    private final java.util.Map<android.hardware.radio.ProgramSelector.Identifier, android.hardware.radio.RadioManager.ProgramInfo> mPrograms = null;
    private final java.util.List<android.hardware.radio.ProgramList.ListCallback> mListCallbacks = null;
    private final java.util.List<android.hardware.radio.ProgramList.OnCompleteListener> mOnCompleteListeners = null;
    private android.hardware.radio.ProgramList.OnCloseListener mOnCloseListener;
    private boolean mIsClosed;
    private boolean mIsComplete;
    ProgramList() {}
    public void registerListCallback(java.util.concurrent.Executor p0, android.hardware.radio.ProgramList.ListCallback p1) {}
    public void registerListCallback(android.hardware.radio.ProgramList.ListCallback p0) {}
    public void unregisterListCallback(android.hardware.radio.ProgramList.ListCallback p0) {}
    public void addOnCompleteListener(java.util.concurrent.Executor p0, android.hardware.radio.ProgramList.OnCompleteListener p1) {}
    public void addOnCompleteListener(android.hardware.radio.ProgramList.OnCompleteListener p0) {}
    public void removeOnCompleteListener(android.hardware.radio.ProgramList.OnCompleteListener p0) {}
    void setOnCloseListener(android.hardware.radio.ProgramList.OnCloseListener p0) {}
    public void close() {}
    void apply(android.hardware.radio.ProgramList.Chunk p0) {}
    private void putLocked(android.hardware.radio.RadioManager.ProgramInfo p0) {}
    private void removeLocked(android.hardware.radio.ProgramSelector.Identifier p0) {}
    public java.util.List<android.hardware.radio.RadioManager.ProgramInfo> toList() { return null; }
    public android.hardware.radio.RadioManager.ProgramInfo get(android.hardware.radio.ProgramSelector.Identifier p0) { return null; }

    public static final class Chunk implements android.os.Parcelable {
        private final boolean mPurge = false;
        private final boolean mComplete = false;
        private final java.util.Set<android.hardware.radio.RadioManager.ProgramInfo> mModified = null;
        private final java.util.Set<android.hardware.radio.ProgramSelector.Identifier> mRemoved = null;
        public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramList.Chunk> CREATOR = null;
        public Chunk(boolean p0, boolean p1, java.util.Set<android.hardware.radio.RadioManager.ProgramInfo> p2, java.util.Set<android.hardware.radio.ProgramSelector.Identifier> p3) {}
        private Chunk(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public boolean isPurge() { return false; }
        public boolean isComplete() { return false; }
        public java.util.Set<android.hardware.radio.RadioManager.ProgramInfo> getModified() { return null; }
        public java.util.Set<android.hardware.radio.ProgramSelector.Identifier> getRemoved() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static final class Filter implements android.os.Parcelable {
        private final java.util.Set<java.lang.Integer> mIdentifierTypes = null;
        private final java.util.Set<android.hardware.radio.ProgramSelector.Identifier> mIdentifiers = null;
        private final boolean mIncludeCategories = false;
        private final boolean mExcludeModifications = false;
        private final java.util.Map<java.lang.String, java.lang.String> mVendorFilter = null;
        public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramList.Filter> CREATOR = null;
        public Filter(java.util.Set<java.lang.Integer> p0, java.util.Set<android.hardware.radio.ProgramSelector.Identifier> p1, boolean p2, boolean p3) {}
        public Filter() {}
        public Filter(java.util.Map<java.lang.String, java.lang.String> p0) {}
        private Filter(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public java.util.Map<java.lang.String, java.lang.String> getVendorFilter() { return null; }
        public java.util.Set<java.lang.Integer> getIdentifierTypes() { return null; }
        public java.util.Set<android.hardware.radio.ProgramSelector.Identifier> getIdentifiers() { return null; }
        public boolean areCategoriesIncluded() { return false; }
        public boolean areModificationsExcluded() { return false; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static abstract class ListCallback {
        public ListCallback() {}
        public void onItemChanged(android.hardware.radio.ProgramSelector.Identifier p0) {}
        public void onItemRemoved(android.hardware.radio.ProgramSelector.Identifier p0) {}
    }

    static interface OnCloseListener {
        public void onClose();
    }

    public static interface OnCompleteListener {
        public void onComplete();
    }
}
