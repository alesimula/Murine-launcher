package android.media.midi;

public final class MidiDeviceInfo implements android.os.Parcelable {
    public static final int TYPE_USB = 1;
    public static final int TYPE_VIRTUAL = 2;
    public static final int TYPE_BLUETOOTH = 3;
    public static final int PROTOCOL_UMP_USE_MIDI_CI = 0;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_64_BITS = 1;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_64_BITS_AND_JRTS = 2;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_128_BITS = 3;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_128_BITS_AND_JRTS = 4;
    public static final int PROTOCOL_UMP_MIDI_2_0 = 17;
    public static final int PROTOCOL_UMP_MIDI_2_0_AND_JRTS = 18;
    public static final int PROTOCOL_UNKNOWN = -1;
    public static final java.lang.String PROPERTY_NAME = "name";
    public static final java.lang.String PROPERTY_MANUFACTURER = "manufacturer";
    public static final java.lang.String PROPERTY_PRODUCT = "product";
    public static final java.lang.String PROPERTY_VERSION = "version";
    public static final java.lang.String PROPERTY_SERIAL_NUMBER = "serial_number";
    public static final java.lang.String PROPERTY_USB_DEVICE = "usb_device";
    public static final java.lang.String PROPERTY_BLUETOOTH_DEVICE = "bluetooth_device";
    public static final java.lang.String PROPERTY_ALSA_CARD = "alsa_card";
    public static final java.lang.String PROPERTY_ALSA_DEVICE = "alsa_device";
    public static final java.lang.String PROPERTY_SERVICE_INFO = "service_info";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.midi.MidiDeviceInfo> CREATOR = null;
    public MidiDeviceInfo(int p0, int p1, int p2, int p3, java.lang.String[] p4, java.lang.String[] p5, android.os.Bundle p6, boolean p7, int p8) {}
    public int getType() { return 0; }
    public int getId() { return 0; }
    public int getInputPortCount() { return 0; }
    public int getOutputPortCount() { return 0; }
    public android.media.midi.MidiDeviceInfo.PortInfo[] getPorts() { return null; }
    public android.os.Bundle getProperties() { return null; }
    public boolean isPrivate() { return false; }
    public int getDefaultProtocol() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class PortInfo {
        public static final int TYPE_INPUT = 1;
        public static final int TYPE_OUTPUT = 2;
        PortInfo(int p0, int p1, java.lang.String p2) {}
        public int getType() { return 0; }
        public int getPortNumber() { return 0; }
        public java.lang.String getName() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Protocol {
    }
}
