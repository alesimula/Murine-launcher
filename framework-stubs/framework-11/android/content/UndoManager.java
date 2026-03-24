package android.content;

public class UndoManager {
    private final android.util.ArrayMap<java.lang.String, android.content.UndoOwner> mOwners = null;
    private final java.util.ArrayList<android.content.UndoManager.UndoState> mUndos = null;
    private final java.util.ArrayList<android.content.UndoManager.UndoState> mRedos = null;
    private int mUpdateCount;
    private int mHistorySize;
    private android.content.UndoManager.UndoState mWorking;
    private int mCommitId;
    private boolean mInUndo;
    private boolean mMerged;
    private int mStateSeq;
    private int mNextSavedIdx;
    private android.content.UndoOwner[] mStateOwners;
    public static final int MERGE_MODE_NONE = 0;
    public static final int MERGE_MODE_UNIQUE = 1;
    public static final int MERGE_MODE_ANY = 2;
    public UndoManager() {}
    public android.content.UndoOwner getOwner(java.lang.String p0, java.lang.Object p1) { return null; }
    void removeOwner(android.content.UndoOwner p0) {}
    public void saveInstanceState(android.os.Parcel p0) {}
    void saveOwner(android.content.UndoOwner p0, android.os.Parcel p1) {}
    public void restoreInstanceState(android.os.Parcel p0, java.lang.ClassLoader p1) {}
    android.content.UndoOwner restoreOwner(android.os.Parcel p0) { return null; }
    public void setHistorySize(int p0) {}
    public int getHistorySize() { return 0; }
    public int undo(android.content.UndoOwner[] p0, int p1) { return 0; }
    public int redo(android.content.UndoOwner[] p0, int p1) { return 0; }
    public boolean isInUndo() { return false; }
    public int forgetUndos(android.content.UndoOwner[] p0, int p1) { return 0; }
    public int forgetRedos(android.content.UndoOwner[] p0, int p1) { return 0; }
    public int countUndos(android.content.UndoOwner[] p0) { return 0; }
    public int countRedos(android.content.UndoOwner[] p0) { return 0; }
    public java.lang.CharSequence getUndoLabel(android.content.UndoOwner[] p0) { return null; }
    public java.lang.CharSequence getRedoLabel(android.content.UndoOwner[] p0) { return null; }
    public void beginUpdate(java.lang.CharSequence p0) {}
    private void createWorkingState() {}
    public boolean isInUpdate() { return false; }
    public void setUndoLabel(java.lang.CharSequence p0) {}
    public void suggestUndoLabel(java.lang.CharSequence p0) {}
    public int getUpdateNestingLevel() { return 0; }
    public boolean hasOperation(android.content.UndoOwner p0) { return false; }
    public android.content.UndoOperation<?> getLastOperation(int p0) { return null; }
    public android.content.UndoOperation<?> getLastOperation(android.content.UndoOwner p0, int p1) { return null; }
    public <T extends android.content.UndoOperation> T getLastOperation(java.lang.Class<T> p0, android.content.UndoOwner p1, int p2) { return null; }
    public void addOperation(android.content.UndoOperation<?> p0, int p1) {}
    public void endUpdate() {}
    private void pushWorkingState() {}
    public int commitState(android.content.UndoOwner p0) { return 0; }
    public boolean uncommitState(int p0, android.content.UndoOwner p1) { return false; }
    android.content.UndoManager.UndoState getTopUndo(android.content.UndoOwner[] p0) { return null; }
    android.content.UndoManager.UndoState getTopRedo(android.content.UndoOwner[] p0) { return null; }
    boolean matchOwners(android.content.UndoManager.UndoState p0, android.content.UndoOwner[] p1) { return false; }
    int findPrevState(java.util.ArrayList<android.content.UndoManager.UndoState> p0, android.content.UndoOwner[] p1, int p2) { return 0; }
    int findNextState(java.util.ArrayList<android.content.UndoManager.UndoState> p0, android.content.UndoOwner[] p1, int p2) { return 0; }

    static final class UndoState {
        private final android.content.UndoManager mManager = null;
        private final int mCommitId = 0;
        private final java.util.ArrayList<android.content.UndoOperation<?>> mOperations = null;
        private java.util.ArrayList<android.content.UndoOperation<?>> mRecent;
        private java.lang.CharSequence mLabel;
        private boolean mCanMerge;
        private boolean mExecuted;
        UndoState(android.content.UndoManager p0, int p1) {}
        UndoState(android.content.UndoManager p0, android.os.Parcel p1, java.lang.ClassLoader p2) {}
        void writeToParcel(android.os.Parcel p0) {}
        int getCommitId() { return 0; }
        void setLabel(java.lang.CharSequence p0) {}
        void updateLabel(java.lang.CharSequence p0) {}
        java.lang.CharSequence getLabel() { return null; }
        boolean setCanMerge(boolean p0) { return false; }
        void makeExecuted() {}
        boolean canMerge() { return false; }
        int countOperations() { return 0; }
        boolean hasOperation(android.content.UndoOwner p0) { return false; }
        boolean hasMultipleOwners() { return false; }
        void addOperation(android.content.UndoOperation<?> p0) {}
        <T extends android.content.UndoOperation> T getLastOperation(java.lang.Class<T> p0, android.content.UndoOwner p1) { return null; }
        boolean matchOwner(android.content.UndoOwner p0) { return false; }
        boolean hasData() { return false; }
        void commit() {}
        void undo() {}
        void redo() {}
        void destroy() {}
    }
}
