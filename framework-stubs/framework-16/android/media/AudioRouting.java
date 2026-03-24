package android.media;

public interface AudioRouting {
    public boolean setPreferredDevice(android.media.AudioDeviceInfo p0);
    public android.media.AudioDeviceInfo getPreferredDevice();
    public android.media.AudioDeviceInfo getRoutedDevice();
    @android.annotation.FlaggedApi("android.media.audio.routed_device_ids")
    @android.annotation.NonNull
    default public java.util.List<android.media.AudioDeviceInfo> getRoutedDevices() { return null; }
    public void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0, android.os.Handler p1);
    public void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0);

    public static interface OnRoutingChangedListener {
        public void onRoutingChanged(android.media.AudioRouting p0);
    }
}
