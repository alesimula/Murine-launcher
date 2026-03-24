package android.service.quickaccesswallet;

public final class WalletCard implements android.os.Parcelable {
    private final java.lang.String mCardId = null;
    private final android.graphics.drawable.Icon mCardImage = null;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.app.PendingIntent mPendingIntent = null;
    private final android.graphics.drawable.Icon mCardIcon = null;
    private final java.lang.CharSequence mCardLabel = null;
    public static final android.os.Parcelable.Creator<android.service.quickaccesswallet.WalletCard> CREATOR = null;
    private WalletCard(android.service.quickaccesswallet.WalletCard.Builder p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static android.service.quickaccesswallet.WalletCard readFromParcel(android.os.Parcel p0) { return null; }
    public java.lang.String getCardId() { return null; }
    public android.graphics.drawable.Icon getCardImage() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public android.graphics.drawable.Icon getCardIcon() { return null; }
    public java.lang.CharSequence getCardLabel() { return null; }

    public static final class Builder {
        private java.lang.String mCardId;
        private android.graphics.drawable.Icon mCardImage;
        private java.lang.CharSequence mContentDescription;
        private android.app.PendingIntent mPendingIntent;
        private android.graphics.drawable.Icon mCardIcon;
        private java.lang.CharSequence mCardLabel;
        public Builder(java.lang.String p0, android.graphics.drawable.Icon p1, java.lang.CharSequence p2, android.app.PendingIntent p3) {}
        public android.service.quickaccesswallet.WalletCard.Builder setCardIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.quickaccesswallet.WalletCard.Builder setCardLabel(java.lang.CharSequence p0) { return null; }
        public android.service.quickaccesswallet.WalletCard build() { return null; }
    }
}
