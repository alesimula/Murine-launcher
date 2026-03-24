package android.service.quickaccesswallet;

public final class WalletServiceEvent implements android.os.Parcelable {
    public static final int TYPE_NFC_PAYMENT_STARTED = 1;
    public static final int TYPE_WALLET_CARDS_UPDATED = 2;
    private final int mEventType = 0;
    public static final android.os.Parcelable.Creator<android.service.quickaccesswallet.WalletServiceEvent> CREATOR = null;
    public WalletServiceEvent(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getEventType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}
