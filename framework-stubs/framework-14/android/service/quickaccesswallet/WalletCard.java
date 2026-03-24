package android.service.quickaccesswallet;

public final class WalletCard implements android.os.Parcelable {
    public static final int CARD_TYPE_UNKNOWN = 0;
    public static final int CARD_TYPE_PAYMENT = 1;
    public static final int CARD_TYPE_NON_PAYMENT = 2;
    public static final android.os.Parcelable.Creator<android.service.quickaccesswallet.WalletCard> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getCardId() { return null; }
    public int getCardType() { return 0; }
    public android.graphics.drawable.Icon getCardImage() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public android.graphics.drawable.Icon getCardIcon() { return null; }
    public java.lang.CharSequence getCardLabel() { return null; }
    public android.graphics.drawable.Icon getNonPaymentCardSecondaryImage() { return null; }
    public java.util.List<android.location.Location> getCardLocations() { return null; }
    public void removeCardLocations() {}

    public static final class Builder {
        public Builder(java.lang.String p0, int p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3, android.app.PendingIntent p4) {}
        public Builder(java.lang.String p0, android.graphics.drawable.Icon p1, java.lang.CharSequence p2, android.app.PendingIntent p3) {}
        public android.service.quickaccesswallet.WalletCard.Builder setCardIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.quickaccesswallet.WalletCard.Builder setCardLabel(java.lang.CharSequence p0) { return null; }
        public android.service.quickaccesswallet.WalletCard.Builder setNonPaymentCardSecondaryImage(android.graphics.drawable.Icon p0) { return null; }
        public android.service.quickaccesswallet.WalletCard.Builder setCardLocations(java.util.List<android.location.Location> p0) { return null; }
        public android.service.quickaccesswallet.WalletCard build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CardType {
    }
}
