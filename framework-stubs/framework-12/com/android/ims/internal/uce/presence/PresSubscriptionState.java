package com.android.ims.internal.uce.presence;

public class PresSubscriptionState implements android.os.Parcelable {
    public static final int UCE_PRES_SUBSCRIPTION_STATE_ACTIVE = 0;
    public static final int UCE_PRES_SUBSCRIPTION_STATE_PENDING = 1;
    public static final int UCE_PRES_SUBSCRIPTION_STATE_TERMINATED = 2;
    public static final int UCE_PRES_SUBSCRIPTION_STATE_UNKNOWN = 3;
    private int mPresSubscriptionState;
    public static final android.os.Parcelable.Creator<com.android.ims.internal.uce.presence.PresSubscriptionState> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PresSubscriptionState(android.os.Parcel p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public PresSubscriptionState() {}
    public int getPresSubscriptionStateValue() { return 0; }
    public void setPresSubscriptionState(int p0) {}
}
