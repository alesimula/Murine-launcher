package android.content;

public abstract class UndoOperation<DATA extends java.lang.Object> implements android.os.Parcelable {
    android.content.UndoOwner mOwner;
    @android.annotation.UnsupportedAppUsage
    public UndoOperation(android.content.UndoOwner p0) {}
    @android.annotation.UnsupportedAppUsage
    protected UndoOperation(android.os.Parcel p0, java.lang.ClassLoader p1) {}
    public android.content.UndoOwner getOwner() { return null; }
    public DATA getOwnerData() { return null; }
    public boolean matchOwner(android.content.UndoOwner p0) { return false; }
    public boolean hasData() { return false; }
    public boolean allowMerge() { return false; }
    public abstract void commit();
    public abstract void undo();
    public abstract void redo();
    public int describeContents() { return 0; }
}
