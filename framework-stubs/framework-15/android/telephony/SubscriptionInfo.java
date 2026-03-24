package android.telephony;

public class SubscriptionInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.SubscriptionInfo> CREATOR = null;
    @java.lang.Deprecated
    public SubscriptionInfo(int p0, java.lang.String p1, int p2, java.lang.CharSequence p3, java.lang.CharSequence p4, int p5, int p6, java.lang.String p7, int p8, android.graphics.Bitmap p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, android.telephony.UiccAccessRule[] p14, java.lang.String p15) {}
    @java.lang.Deprecated
    public SubscriptionInfo(int p0, java.lang.String p1, int p2, java.lang.CharSequence p3, java.lang.CharSequence p4, int p5, int p6, java.lang.String p7, int p8, android.graphics.Bitmap p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, android.telephony.UiccAccessRule[] p14, java.lang.String p15, boolean p16, java.lang.String p17, int p18, int p19) {}
    @java.lang.Deprecated
    public SubscriptionInfo(int p0, java.lang.String p1, int p2, java.lang.CharSequence p3, java.lang.CharSequence p4, int p5, int p6, java.lang.String p7, int p8, android.graphics.Bitmap p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, android.telephony.UiccAccessRule[] p14, java.lang.String p15, int p16, boolean p17, java.lang.String p18, boolean p19, int p20, int p21, int p22, java.lang.String p23, android.telephony.UiccAccessRule[] p24, boolean p25) {}
    @java.lang.Deprecated
    public SubscriptionInfo(int p0, java.lang.String p1, int p2, java.lang.CharSequence p3, java.lang.CharSequence p4, int p5, int p6, java.lang.String p7, int p8, android.graphics.Bitmap p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, android.telephony.UiccAccessRule[] p14, java.lang.String p15, int p16, boolean p17, java.lang.String p18, boolean p19, int p20, int p21, int p22, java.lang.String p23, android.telephony.UiccAccessRule[] p24, boolean p25, int p26) {}
    @java.lang.Deprecated
    public SubscriptionInfo(int p0, java.lang.String p1, int p2, java.lang.CharSequence p3, java.lang.CharSequence p4, int p5, int p6, java.lang.String p7, int p8, android.graphics.Bitmap p9, java.lang.String p10, java.lang.String p11, java.lang.String p12, boolean p13, android.telephony.UiccAccessRule[] p14, java.lang.String p15, int p16, boolean p17, java.lang.String p18, boolean p19, int p20, int p21, int p22, java.lang.String p23, android.telephony.UiccAccessRule[] p24, boolean p25, int p26, int p27) {}
    public int getSubscriptionId() { return 0; }
    public java.lang.String getIccId() { return null; }
    public int getSimSlotIndex() { return 0; }
    public int getCarrierId() { return 0; }
    public java.lang.CharSequence getDisplayName() { return null; }
    public java.lang.CharSequence getCarrierName() { return null; }
    public int getDisplayNameSource() { return 0; }
    public android.graphics.Bitmap createIconBitmap(android.content.Context p0) { return null; }
    public int getIconTint() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getNumber() { return null; }
    public int getDataRoaming() { return 0; }
    @java.lang.Deprecated
    public int getMcc() { return 0; }
    @java.lang.Deprecated
    public int getMnc() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getMccString() { return null; }
    @android.annotation.Nullable
    public java.lang.String getMncString() { return null; }
    public java.lang.String getCountryIso() { return null; }
    public boolean isEmbedded() { return false; }
    public boolean isOpportunistic() { return false; }
    public boolean isActive() { return false; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getGroupUuid() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getEhplmns() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getHplmns() { return null; }
    @android.annotation.NonNull
    public java.lang.String getGroupOwner() { return null; }
    @android.annotation.SystemApi
    public int getProfileClass() { return 0; }
    public int getSubscriptionType() { return 0; }
    @java.lang.Deprecated
    public boolean canManageSubscription(android.content.Context p0) { return false; }
    @java.lang.Deprecated
    public boolean canManageSubscription(android.content.Context p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public java.util.List<android.telephony.UiccAccessRule> getAccessRules() { return null; }
    @android.annotation.NonNull
    public java.lang.String getCardString() { return null; }
    public int getCardId() { return 0; }
    public int getPortIndex() { return 0; }
    @android.annotation.SystemApi
    public boolean isGroupDisabled() { return false; }
    @android.annotation.SystemApi
    public boolean areUiccApplicationsEnabled() { return false; }
    public int getUsageSetting() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.oem_enabled_satellite_flag")
    public boolean isOnlyNonTerrestrialNetwork() { return false; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.data_only_cellular_service")
    public java.util.Set<java.lang.Integer> getServiceCapabilities() { return null; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.support_psim_to_esim_conversion")
    public int getTransferStatus() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public static java.lang.String getPrintableId(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static class Builder {
        public Builder() {}
        public Builder(android.telephony.SubscriptionInfo p0) {}
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setIccId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setSimSlotIndex(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setDisplayName(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setCarrierName(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setDisplayNameSource(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setIconTint(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setNumber(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setDataRoaming(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setIcon(android.graphics.Bitmap p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setMcc(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setMnc(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setEhplmns(java.lang.String[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setHplmns(java.lang.String[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setCountryIso(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setEmbedded(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setNativeAccessRules(android.telephony.UiccAccessRule[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setCardString(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setCardId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setOpportunistic(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setGroupUuid(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setGroupDisabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setCarrierId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setProfileClass(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setGroupOwner(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setCarrierConfigAccessRules(android.telephony.UiccAccessRule[] p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setUiccApplicationsEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setPortIndex(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setUsageSetting(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setOnlyNonTerrestrialNetwork(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.data_only_cellular_service")
        public android.telephony.SubscriptionInfo.Builder setServiceCapabilities(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.support_psim_to_esim_conversion")
        @android.annotation.NonNull
        public android.telephony.SubscriptionInfo.Builder setTransferStatus(int p0) { return null; }
        public android.telephony.SubscriptionInfo build() { return null; }
    }
}
