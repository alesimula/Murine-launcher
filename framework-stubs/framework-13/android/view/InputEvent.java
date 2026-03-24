package android.view;

public abstract class InputEvent implements android.os.Parcelable {
    protected static final int PARCEL_TOKEN_MOTION_EVENT = 1;
    protected static final int PARCEL_TOKEN_KEY_EVENT = 2;
    protected int mSeq;
    protected boolean mRecycled;
    public static final android.os.Parcelable.Creator<android.view.InputEvent> CREATOR = null;
    InputEvent() {}
    public abstract int getDeviceId();
    public final android.view.InputDevice getDevice() { return null; }
    public abstract int getSource();
    public abstract void setSource(int p0);
    public boolean isFromSource(int p0) { return false; }
    public abstract int getDisplayId();
    public abstract void setDisplayId(int p0);
    public abstract android.view.InputEvent copy();
    public void recycle() {}
    public void recycleIfNeededAfterDispatch() {}
    protected void prepareForReuse() {}
    public abstract boolean isTainted();
    public abstract void setTainted(boolean p0);
    public abstract long getEventTime();
    public abstract long getEventTimeNano();
    public abstract void cancel();
    public int getSequenceNumber() { return 0; }
    public abstract int getId();
    public int describeContents() { return 0; }
}
