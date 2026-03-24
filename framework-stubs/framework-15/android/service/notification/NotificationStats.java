package android.service.notification;

@android.annotation.SystemApi
public final class NotificationStats implements android.os.Parcelable {
    public static final int DISMISSAL_NOT_DISMISSED = -1;
    public static final int DISMISSAL_OTHER = 0;
    public static final int DISMISSAL_PEEK = 1;
    public static final int DISMISSAL_AOD = 2;
    public static final int DISMISSAL_SHADE = 3;
    public static final int DISMISSAL_BUBBLE = 4;
    public static final int DISMISSAL_LOCKSCREEN = 5;
    public static final int DISMISS_SENTIMENT_UNKNOWN = -1000;
    public static final int DISMISS_SENTIMENT_NEGATIVE = 0;
    public static final int DISMISS_SENTIMENT_NEUTRAL = 1;
    public static final int DISMISS_SENTIMENT_POSITIVE = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.notification.NotificationStats> CREATOR = null;
    public NotificationStats() {}
    @android.annotation.SystemApi
    protected NotificationStats(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean hasSeen() { return false; }
    public void setSeen() {}
    public boolean hasExpanded() { return false; }
    public void setExpanded() {}
    public boolean hasDirectReplied() { return false; }
    public void setDirectReplied() {}
    @android.annotation.FlaggedApi("android.app.lifetime_extension_refactor")
    public boolean hasSmartReplied() { return false; }
    @android.annotation.SuppressLint("GetterSetterNames")
    @android.annotation.FlaggedApi("android.app.lifetime_extension_refactor")
    public void setSmartReplied() {}
    public boolean hasSnoozed() { return false; }
    public void setSnoozed() {}
    public boolean hasViewedSettings() { return false; }
    public void setViewedSettings() {}
    public boolean hasInteracted() { return false; }
    public int getDismissalSurface() { return 0; }
    public void setDismissalSurface(int p0) {}
    public void setDismissalSentiment(int p0) {}
    public int getDismissalSentiment() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DismissalSentiment {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DismissalSurface {
    }
}
