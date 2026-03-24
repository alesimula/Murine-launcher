package android.adservices.common;

public final class FrequencyCapFilters implements android.os.Parcelable {
    public static final int AD_EVENT_TYPE_CLICK = 3;
    public static final int AD_EVENT_TYPE_IMPRESSION = 1;
    public static final int AD_EVENT_TYPE_VIEW = 2;
    public static final int AD_EVENT_TYPE_WIN = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.FrequencyCapFilters> CREATOR = null;
    FrequencyCapFilters() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.common.KeyedFrequencyCap> getKeyedFrequencyCapsForClickEvents() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.common.KeyedFrequencyCap> getKeyedFrequencyCapsForImpressionEvents() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.common.KeyedFrequencyCap> getKeyedFrequencyCapsForViewEvents() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.adservices.common.KeyedFrequencyCap> getKeyedFrequencyCapsForWinEvents() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.adservices.common.FrequencyCapFilters build() { return null; }
        @android.annotation.NonNull
        public android.adservices.common.FrequencyCapFilters.Builder setKeyedFrequencyCapsForClickEvents(java.util.List<android.adservices.common.KeyedFrequencyCap> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.FrequencyCapFilters.Builder setKeyedFrequencyCapsForImpressionEvents(java.util.List<android.adservices.common.KeyedFrequencyCap> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.FrequencyCapFilters.Builder setKeyedFrequencyCapsForViewEvents(java.util.List<android.adservices.common.KeyedFrequencyCap> p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.FrequencyCapFilters.Builder setKeyedFrequencyCapsForWinEvents(java.util.List<android.adservices.common.KeyedFrequencyCap> p0) { return null; }
    }
}
