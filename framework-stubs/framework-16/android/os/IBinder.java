package android.os;

public interface IBinder {
    public static final int FIRST_CALL_TRANSACTION = 1;
    public static final int LAST_CALL_TRANSACTION = 16777215;
    public static final int PING_TRANSACTION = 1599098439;
    public static final int DUMP_TRANSACTION = 1598311760;
    public static final int SHELL_COMMAND_TRANSACTION = 1598246212;
    public static final int INTERFACE_TRANSACTION = 1598968902;
    public static final int TWEET_TRANSACTION = 1599362900;
    public static final int LIKE_TRANSACTION = 1598835019;
    public static final int SYSPROPS_TRANSACTION = 1599295570;
    public static final int FLAG_ONEWAY = 1;
    public static final int FLAG_CLEAR_BUF = 32;
    public static final int FLAG_COLLECT_NOTED_APP_OPS = 2;
    public static final int MAX_IPC_SIZE = 65536;
    public static int getSuggestedMaxIpcSizeBytes() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getInterfaceDescriptor() throws android.os.RemoteException;
    public boolean pingBinder();
    public boolean isBinderAlive();
    @android.annotation.Nullable
    public android.os.IInterface queryLocalInterface(java.lang.String p0);
    public void dump(java.io.FileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void dumpAsync(java.io.FileDescriptor p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void shellCommand(java.io.FileDescriptor p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.lang.String[] p3, android.os.ShellCallback p4, android.os.ResultReceiver p5) throws android.os.RemoteException;
    @android.annotation.Nullable
    default public android.os.IBinder getExtension() throws android.os.RemoteException { return null; }
    public boolean transact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException;
    public void linkToDeath(android.os.IBinder.DeathRecipient p0, int p1) throws android.os.RemoteException;
    public boolean unlinkToDeath(android.os.IBinder.DeathRecipient p0, int p1);
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    default public void addFrozenStateChangeCallback(java.util.concurrent.Executor p0, android.os.IBinder.FrozenStateChangeCallback p1) throws android.os.RemoteException {}
    default public void addFrozenStateChangeCallback(android.os.IBinder.FrozenStateChangeCallback p0) throws android.os.RemoteException {}
    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    default public boolean removeFrozenStateChangeCallback(android.os.IBinder.FrozenStateChangeCallback p0) { return false; }

    public static interface DeathRecipient {
        public void binderDied();
        default public void binderDied(android.os.IBinder p0) {}
    }

    @android.annotation.FlaggedApi("android.os.binder_frozen_state_change_callback")
    public static interface FrozenStateChangeCallback {
        public static final int STATE_FROZEN = 0;
        public static final int STATE_UNFROZEN = 1;
        public void onFrozenStateChanged(android.os.IBinder p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface State {
        }
    }
}
