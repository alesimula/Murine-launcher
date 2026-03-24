package android.media.tv.tuner;

@android.annotation.SystemApi
public class DemuxCapabilities {
    public int getDemuxCount() { return 0; }
    public int getRecordCount() { return 0; }
    public int getPlaybackCount() { return 0; }
    public int getTsFilterCount() { return 0; }
    public int getSectionFilterCount() { return 0; }
    public int getAudioFilterCount() { return 0; }
    public int getVideoFilterCount() { return 0; }
    public int getPesFilterCount() { return 0; }
    public int getPcrFilterCount() { return 0; }
    public long getSectionFilterLength() { return 0L; }
    public int getFilterCapabilities() { return 0; }
    @android.annotation.NonNull
    public int[] getFilterTypeCapabilityList() { return null; }
    @android.annotation.NonNull
    public int[] getLinkCapabilities() { return null; }
    public boolean isTimeFilterSupported() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FilterCapabilities {
    }
}
