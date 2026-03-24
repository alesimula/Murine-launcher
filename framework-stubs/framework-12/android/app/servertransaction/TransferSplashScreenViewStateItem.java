package android.app.servertransaction;

public class TransferSplashScreenViewStateItem extends android.app.servertransaction.ActivityTransactionItem {
    private android.window.SplashScreenView.SplashScreenViewParcelable mSplashScreenViewParcelable;
    private int mRequest;
    public static final int ATTACH_TO = 0;
    public static final int HANDOVER_TO = 1;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.TransferSplashScreenViewStateItem> CREATOR = null;
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private TransferSplashScreenViewStateItem() { super(); }
    private TransferSplashScreenViewStateItem(android.os.Parcel p0) { super(); }
    public static android.app.servertransaction.TransferSplashScreenViewStateItem obtain(int p0, android.window.SplashScreenView.SplashScreenViewParcelable p1) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransferRequest {
    }
}
