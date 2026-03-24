package android.service.notification;

@android.annotation.SuppressLint({"ParcelNotFinal", "ParcelCreator"})
public class NotificationRankingUpdate implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.notification.NotificationRankingUpdate> CREATOR = null;
    public NotificationRankingUpdate(android.service.notification.NotificationListenerService.Ranking[] p0) {}
    public NotificationRankingUpdate(android.os.Parcel p0) {}
    public final boolean isFdNotNullAndClosed() { return false; }
    public android.service.notification.NotificationListenerService.RankingMap getRankingMap() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
