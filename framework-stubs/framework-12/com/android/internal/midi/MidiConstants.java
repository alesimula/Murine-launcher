package com.android.internal.midi;

public final class MidiConstants {
    public static final byte STATUS_COMMAND_MASK = -16;
    public static final byte STATUS_CHANNEL_MASK = 15;
    public static final byte STATUS_NOTE_OFF = -128;
    public static final byte STATUS_NOTE_ON = -112;
    public static final byte STATUS_POLYPHONIC_AFTERTOUCH = -96;
    public static final byte STATUS_CONTROL_CHANGE = -80;
    public static final byte STATUS_PROGRAM_CHANGE = -64;
    public static final byte STATUS_CHANNEL_PRESSURE = -48;
    public static final byte STATUS_PITCH_BEND = -32;
    public static final byte STATUS_SYSTEM_EXCLUSIVE = -16;
    public static final byte STATUS_MIDI_TIME_CODE = -15;
    public static final byte STATUS_SONG_POSITION = -14;
    public static final byte STATUS_SONG_SELECT = -13;
    public static final byte STATUS_TUNE_REQUEST = -10;
    public static final byte STATUS_END_SYSEX = -9;
    public static final byte STATUS_TIMING_CLOCK = -8;
    public static final byte STATUS_START = -6;
    public static final byte STATUS_CONTINUE = -5;
    public static final byte STATUS_STOP = -4;
    public static final byte STATUS_ACTIVE_SENSING = -2;
    public static final byte STATUS_RESET = -1;
    public static final int[] CHANNEL_BYTE_LENGTHS = null;
    public static final int[] SYSTEM_BYTE_LENGTHS = null;
    public MidiConstants() {}
    public static int getBytesPerMessage(byte p0) { return 0; }
    public static boolean isAllActiveSensing(byte[] p0, int p1, int p2) { return false; }
    public static boolean allowRunningStatus(byte p0) { return false; }
    public static boolean cancelsRunningStatus(byte p0) { return false; }
}
