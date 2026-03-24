package android.media;

public final class RouteListingPreference implements android.os.Parcelable {
    public static final java.lang.String ACTION_TRANSFER_MEDIA = "android.media.action.TRANSFER_MEDIA";
    public static final java.lang.String EXTRA_ROUTE_ID = "android.media.extra.ROUTE_ID";
    public static final android.os.Parcelable.Creator<android.media.RouteListingPreference> CREATOR = null;
    public java.util.List<android.media.RouteListingPreference.Item> getItems() { return null; }
    public boolean getUseSystemOrdering() { return false; }
    public android.content.ComponentName getLinkedItemComponentName() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Item implements android.os.Parcelable {
        public static final int SELECTION_BEHAVIOR_NONE = 0;
        public static final int SELECTION_BEHAVIOR_TRANSFER = 1;
        public static final int SELECTION_BEHAVIOR_GO_TO_APP = 2;
        public static final int FLAG_ONGOING_SESSION = 1;
        public static final int FLAG_ONGOING_SESSION_MANAGED = 2;
        public static final int FLAG_SUGGESTED = 4;
        public static final int SUBTEXT_NONE = 0;
        public static final int SUBTEXT_ERROR_UNKNOWN = 1;
        public static final int SUBTEXT_SUBSCRIPTION_REQUIRED = 2;
        public static final int SUBTEXT_DOWNLOADED_CONTENT_ROUTING_DISALLOWED = 3;
        public static final int SUBTEXT_AD_ROUTING_DISALLOWED = 4;
        public static final int SUBTEXT_DEVICE_LOW_POWER = 5;
        public static final int SUBTEXT_UNAUTHORIZED = 6;
        public static final int SUBTEXT_TRACK_UNSUPPORTED = 7;
        public static final int SUBTEXT_CUSTOM = 10000;
        public static final android.os.Parcelable.Creator<android.media.RouteListingPreference.Item> CREATOR = null;
        public java.lang.String getRouteId() { return null; }
        public int getSelectionBehavior() { return 0; }
        public int getFlags() { return 0; }
        public int getSubText() { return 0; }
        public java.lang.CharSequence getCustomSubtextMessage() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }

        public static final class Builder {
            public Builder(java.lang.String p0) {}
            public android.media.RouteListingPreference.Item.Builder setSelectionBehavior(int p0) { return null; }
            public android.media.RouteListingPreference.Item.Builder setFlags(int p0) { return null; }
            public android.media.RouteListingPreference.Item.Builder setSubText(int p0) { return null; }
            public android.media.RouteListingPreference.Item.Builder setCustomSubtextMessage(java.lang.CharSequence p0) { return null; }
            public android.media.RouteListingPreference.Item build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Flags {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SelectionBehavior {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SubText {
        }
    }

    public static final class Builder {
        public Builder() {}
        public android.media.RouteListingPreference.Builder setItems(java.util.List<android.media.RouteListingPreference.Item> p0) { return null; }
        public android.media.RouteListingPreference.Builder setUseSystemOrdering(boolean p0) { return null; }
        public android.media.RouteListingPreference.Builder setLinkedItemComponentName(android.content.ComponentName p0) { return null; }
        public android.media.RouteListingPreference build() { return null; }
    }
}
