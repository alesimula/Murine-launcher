package android.media.session;

public class ParcelableListBinder<T extends android.os.Parcelable> extends android.os.Binder {
    public ParcelableListBinder(java.util.function.Consumer<java.util.List<T>> p0) { super(); }
    protected boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
    public static <T extends android.os.Parcelable> void send(android.os.IBinder p0, java.util.List<T> p1) throws android.os.RemoteException {}
}
