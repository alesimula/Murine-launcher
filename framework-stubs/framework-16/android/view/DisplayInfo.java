package android.view;

public final class DisplayInfo implements android.os.Parcelable {
    public int layerStack;
    public int flags;
    public int type;
    public int displayId;
    public int displayGroupId;
    public android.view.DisplayAddress address;
    public android.hardware.display.DeviceProductInfo deviceProductInfo;
    public java.lang.String name;
    public java.lang.String uniqueId;
    public int appWidth;
    public int appHeight;
    public int smallestNominalAppWidth;
    public int smallestNominalAppHeight;
    public int largestNominalAppWidth;
    public int largestNominalAppHeight;
    public int logicalWidth;
    public int logicalHeight;
    @android.annotation.Nullable
    public android.view.DisplayCutout displayCutout;
    public int rotation;
    public int modeId;
    public float renderFrameRate;
    public boolean hasArrSupport;
    public android.view.FrameRateCategoryRate frameRateCategoryRate;
    public float[] supportedRefreshRates;
    public int defaultModeId;
    public int userPreferredModeId;
    public android.view.Display.Mode[] supportedModes;
    public android.view.Display.Mode[] appsSupportedModes;
    public int colorMode;
    public int[] supportedColorModes;
    public android.view.Display.HdrCapabilities hdrCapabilities;
    public int[] userDisabledHdrTypes;
    public boolean isForceSdr;
    public boolean minimalPostProcessingSupported;
    public int logicalDensityDpi;
    public float physicalXDpi;
    public float physicalYDpi;
    public long appVsyncOffsetNanos;
    public long presentationDeadlineNanos;
    public int state;
    public int committedState;
    public int ownerUid;
    public java.lang.String ownerPackageName;
    public float refreshRateOverride;
    public int removeMode;
    public float brightnessMinimum;
    public float brightnessMaximum;
    public float brightnessDefault;
    public float brightnessDim;
    @android.annotation.Nullable
    public android.view.RoundedCorners roundedCorners;
    public int installOrientation;
    @android.annotation.Nullable
    public android.view.DisplayShape displayShape;
    @android.annotation.Nullable
    public android.view.SurfaceControl.RefreshRateRange layoutLimitedRefreshRate;
    public float hdrSdrRatio;
    @android.annotation.NonNull
    public android.util.SparseArray<android.view.SurfaceControl.RefreshRateRange> thermalRefreshRateThrottling;
    @android.annotation.Nullable
    public java.lang.String thermalBrightnessThrottlingDataId;
    public boolean canHostTasks;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.DisplayInfo> CREATOR = null;
    public DisplayInfo() {}
    public DisplayInfo(android.view.DisplayInfo p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equals(android.view.DisplayInfo p0) { return false; }
    public boolean equals(android.view.DisplayInfo p0, boolean p1) { return false; }
    public int hashCode() { return 0; }
    public void copyFrom(android.view.DisplayInfo p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public float getRefreshRate() { return 0.0f; }
    public android.view.Display.Mode getMode() { return null; }
    public android.view.Display.Mode getDefaultMode() { return null; }
    @android.annotation.Nullable
    public android.view.Display.Mode findDefaultModeByRefreshRate(float p0) { return null; }
    public float[] getDefaultRefreshRates() { return null; }
    public float[] getDefaultRefreshRatesLegacy() { return null; }
    public void getAppMetrics(android.util.DisplayMetrics p0) {}
    public void getAppMetrics(android.util.DisplayMetrics p0, android.view.DisplayAdjustments p1) {}
    public void getAppMetrics(android.util.DisplayMetrics p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2) {}
    public void getLogicalMetrics(android.util.DisplayMetrics p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2) {}
    public void getMaxBoundsMetrics(android.util.DisplayMetrics p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2) {}
    public int getNaturalWidth() { return 0; }
    public int getNaturalHeight() { return 0; }
    public boolean isHdr() { return false; }
    public boolean isWideColorGamut() { return false; }
    public boolean hasAccess(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
}
