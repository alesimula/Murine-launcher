package android.media;

public class ExifInterface {
    private static final java.lang.String TAG = "ExifInterface";
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String TAG_ARTIST = "Artist";
    public static final java.lang.String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final java.lang.String TAG_COMPRESSION = "Compression";
    public static final java.lang.String TAG_COPYRIGHT = "Copyright";
    public static final java.lang.String TAG_DATETIME = "DateTime";
    public static final java.lang.String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";
    public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final java.lang.String TAG_MAKE = "Make";
    public static final java.lang.String TAG_MODEL = "Model";
    public static final java.lang.String TAG_ORIENTATION = "Orientation";
    public static final java.lang.String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final java.lang.String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final java.lang.String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    public static final java.lang.String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final java.lang.String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final java.lang.String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final java.lang.String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final java.lang.String TAG_SOFTWARE = "Software";
    public static final java.lang.String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final java.lang.String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final java.lang.String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final java.lang.String TAG_WHITE_POINT = "WhitePoint";
    public static final java.lang.String TAG_X_RESOLUTION = "XResolution";
    public static final java.lang.String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final java.lang.String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final java.lang.String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final java.lang.String TAG_Y_RESOLUTION = "YResolution";
    public static final java.lang.String TAG_APERTURE_VALUE = "ApertureValue";
    public static final java.lang.String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
    public static final java.lang.String TAG_CFA_PATTERN = "CFAPattern";
    public static final java.lang.String TAG_COLOR_SPACE = "ColorSpace";
    public static final java.lang.String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final java.lang.String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final java.lang.String TAG_CONTRAST = "Contrast";
    public static final java.lang.String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final java.lang.String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final java.lang.String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final java.lang.String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final java.lang.String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final java.lang.String TAG_EXIF_VERSION = "ExifVersion";
    public static final java.lang.String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final java.lang.String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final java.lang.String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final java.lang.String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final java.lang.String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final java.lang.String TAG_F_NUMBER = "FNumber";
    @java.lang.Deprecated
    public static final java.lang.String TAG_APERTURE = "FNumber";
    public static final java.lang.String TAG_FILE_SOURCE = "FileSource";
    public static final java.lang.String TAG_FLASH = "Flash";
    public static final java.lang.String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final java.lang.String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";
    public static final java.lang.String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final java.lang.String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final java.lang.String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final java.lang.String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final java.lang.String TAG_GAIN_CONTROL = "GainControl";
    public static final java.lang.String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    @java.lang.Deprecated
    public static final java.lang.String TAG_ISO = "ISOSpeedRatings";
    public static final java.lang.String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final java.lang.String TAG_LIGHT_SOURCE = "LightSource";
    public static final java.lang.String TAG_MAKER_NOTE = "MakerNote";
    public static final java.lang.String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final java.lang.String TAG_METERING_MODE = "MeteringMode";
    public static final java.lang.String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final java.lang.String TAG_OECF = "OECF";
    public static final java.lang.String TAG_OFFSET_TIME = "OffsetTime";
    public static final java.lang.String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final java.lang.String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final java.lang.String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final java.lang.String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final java.lang.String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final java.lang.String TAG_SATURATION = "Saturation";
    public static final java.lang.String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final java.lang.String TAG_SCENE_TYPE = "SceneType";
    public static final java.lang.String TAG_SENSING_METHOD = "SensingMethod";
    public static final java.lang.String TAG_SHARPNESS = "Sharpness";
    public static final java.lang.String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final java.lang.String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final java.lang.String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final java.lang.String TAG_SUBFILE_TYPE = "SubfileType";
    public static final java.lang.String TAG_SUBSEC_TIME = "SubSecTime";
    public static final java.lang.String TAG_SUBSEC_TIME_DIG = "SubSecTimeDigitized";
    public static final java.lang.String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final java.lang.String TAG_SUBSEC_TIME_ORIG = "SubSecTimeOriginal";
    public static final java.lang.String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    public static final java.lang.String TAG_SUBJECT_AREA = "SubjectArea";
    public static final java.lang.String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final java.lang.String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final java.lang.String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final java.lang.String TAG_USER_COMMENT = "UserComment";
    public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final java.lang.String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final java.lang.String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final java.lang.String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final java.lang.String TAG_GPS_DOP = "GPSDOP";
    public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final java.lang.String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final java.lang.String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final java.lang.String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final java.lang.String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final java.lang.String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final java.lang.String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final java.lang.String TAG_GPS_SPEED = "GPSSpeed";
    public static final java.lang.String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final java.lang.String TAG_GPS_STATUS = "GPSStatus";
    public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final java.lang.String TAG_GPS_TRACK = "GPSTrack";
    public static final java.lang.String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final java.lang.String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final java.lang.String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    public static final java.lang.String TAG_DNG_VERSION = "DNGVersion";
    public static final java.lang.String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final java.lang.String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final java.lang.String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    public static final java.lang.String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final java.lang.String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final java.lang.String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final java.lang.String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final java.lang.String TAG_RW2_ISO = "ISO";
    public static final java.lang.String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final java.lang.String TAG_XMP = "Xmp";
    private static final java.lang.String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    private static final java.lang.String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    private static final java.lang.String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    private static final java.lang.String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    private static final java.lang.String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final java.lang.String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    private static final java.lang.String TAG_HAS_THUMBNAIL = "HasThumbnail";
    private static final java.lang.String TAG_THUMBNAIL_OFFSET = "ThumbnailOffset";
    private static final java.lang.String TAG_THUMBNAIL_LENGTH = "ThumbnailLength";
    private static final java.lang.String TAG_THUMBNAIL_DATA = "ThumbnailData";
    private static final int MAX_THUMBNAIL_SIZE = 512;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int WHITEBALANCE_AUTO = 0;
    public static final int WHITEBALANCE_MANUAL = 1;
    private static final int SIGNATURE_CHECK_SIZE = 5000;
    private static final byte[] JPEG_SIGNATURE = null;
    private static final java.lang.String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final int RAF_INFO_SIZE = 160;
    private static final int RAF_JPEG_LENGTH_VALUE_SIZE = 4;
    private static final byte[] HEIF_TYPE_FTYP = null;
    private static final byte[] HEIF_BRAND_MIF1 = null;
    private static final byte[] HEIF_BRAND_HEIC = null;
    private static final short ORF_SIGNATURE_1 = 20306;
    private static final short ORF_SIGNATURE_2 = 21330;
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = null;
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = null;
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final short RW2_SIGNATURE = 85;
    private static final java.lang.String PEF_SIGNATURE = "PENTAX";
    private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static java.text.SimpleDateFormat sFormatter;
    private static java.text.SimpleDateFormat sFormatterTz;
    private static final short BYTE_ALIGN_II = 18761;
    private static final short BYTE_ALIGN_MM = 19789;
    private static final byte START_CODE = 42;
    private static final int IFD_OFFSET = 8;
    private static final int IFD_FORMAT_BYTE = 1;
    private static final int IFD_FORMAT_STRING = 2;
    private static final int IFD_FORMAT_USHORT = 3;
    private static final int IFD_FORMAT_ULONG = 4;
    private static final int IFD_FORMAT_URATIONAL = 5;
    private static final int IFD_FORMAT_SBYTE = 6;
    private static final int IFD_FORMAT_UNDEFINED = 7;
    private static final int IFD_FORMAT_SSHORT = 8;
    private static final int IFD_FORMAT_SLONG = 9;
    private static final int IFD_FORMAT_SRATIONAL = 10;
    private static final int IFD_FORMAT_SINGLE = 11;
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    private static final java.lang.String[] IFD_FORMAT_NAMES = null;
    private static final int[] IFD_FORMAT_BYTES_PER_FORMAT = null;
    private static final byte[] EXIF_ASCII_PREFIX = null;
    private static final int DATA_UNCOMPRESSED = 1;
    private static final int DATA_HUFFMAN_COMPRESSED = 2;
    private static final int DATA_JPEG = 6;
    private static final int DATA_JPEG_COMPRESSED = 7;
    private static final int DATA_DEFLATE_ZIP = 8;
    private static final int DATA_PACK_BITS_COMPRESSED = 32773;
    private static final int DATA_LOSSY_JPEG = 34892;
    private static final int[] BITS_PER_SAMPLE_RGB = null;
    private static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = null;
    private static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = null;
    private static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    private static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    private static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    private static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    private static final int REDUCED_RESOLUTION_IMAGE = 1;
    private static final android.media.ExifInterface.ExifTag[] IFD_TIFF_TAGS = null;
    private static final android.media.ExifInterface.ExifTag[] IFD_EXIF_TAGS = null;
    private static final android.media.ExifInterface.ExifTag[] IFD_GPS_TAGS = null;
    private static final android.media.ExifInterface.ExifTag[] IFD_INTEROPERABILITY_TAGS = null;
    private static final android.media.ExifInterface.ExifTag[] IFD_THUMBNAIL_TAGS = null;
    private static final android.media.ExifInterface.ExifTag TAG_RAF_IMAGE_SIZE = null;
    private static final android.media.ExifInterface.ExifTag[] ORF_MAKER_NOTE_TAGS = null;
    private static final android.media.ExifInterface.ExifTag[] ORF_CAMERA_SETTINGS_TAGS = null;
    private static final android.media.ExifInterface.ExifTag[] ORF_IMAGE_PROCESSING_TAGS = null;
    private static final android.media.ExifInterface.ExifTag[] PEF_TAGS = null;
    private static final int IFD_TYPE_PRIMARY = 0;
    private static final int IFD_TYPE_EXIF = 1;
    private static final int IFD_TYPE_GPS = 2;
    private static final int IFD_TYPE_INTEROPERABILITY = 3;
    private static final int IFD_TYPE_THUMBNAIL = 4;
    private static final int IFD_TYPE_PREVIEW = 5;
    private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
    private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
    private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
    private static final int IFD_TYPE_PEF = 9;
    private static final android.media.ExifInterface.ExifTag[][] EXIF_TAGS = null;
    private static final android.media.ExifInterface.ExifTag[] EXIF_POINTER_TAGS = null;
    private static final android.media.ExifInterface.ExifTag JPEG_INTERCHANGE_FORMAT_TAG = null;
    private static final android.media.ExifInterface.ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = null;
    private static final java.util.HashMap[] sExifTagMapsForReading = null;
    private static final java.util.HashMap[] sExifTagMapsForWriting = null;
    private static final java.util.HashSet<java.lang.String> sTagSetForCompatibility = null;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> sExifPointerTagMap = null;
    private static final java.nio.charset.Charset ASCII = null;
    private static final byte[] IDENTIFIER_EXIF_APP1 = null;
    private static final byte[] IDENTIFIER_XMP_APP1 = null;
    private static final byte MARKER = -1;
    private static final byte MARKER_SOI = -40;
    private static final byte MARKER_SOF0 = -64;
    private static final byte MARKER_SOF1 = -63;
    private static final byte MARKER_SOF2 = -62;
    private static final byte MARKER_SOF3 = -61;
    private static final byte MARKER_SOF5 = -59;
    private static final byte MARKER_SOF6 = -58;
    private static final byte MARKER_SOF7 = -57;
    private static final byte MARKER_SOF9 = -55;
    private static final byte MARKER_SOF10 = -54;
    private static final byte MARKER_SOF11 = -53;
    private static final byte MARKER_SOF13 = -51;
    private static final byte MARKER_SOF14 = -50;
    private static final byte MARKER_SOF15 = -49;
    private static final byte MARKER_SOS = -38;
    private static final byte MARKER_APP1 = -31;
    private static final byte MARKER_COM = -2;
    private static final byte MARKER_EOI = -39;
    private static final int IMAGE_TYPE_UNKNOWN = 0;
    private static final int IMAGE_TYPE_ARW = 1;
    private static final int IMAGE_TYPE_CR2 = 2;
    private static final int IMAGE_TYPE_DNG = 3;
    private static final int IMAGE_TYPE_JPEG = 4;
    private static final int IMAGE_TYPE_NEF = 5;
    private static final int IMAGE_TYPE_NRW = 6;
    private static final int IMAGE_TYPE_ORF = 7;
    private static final int IMAGE_TYPE_PEF = 8;
    private static final int IMAGE_TYPE_RAF = 9;
    private static final int IMAGE_TYPE_RW2 = 10;
    private static final int IMAGE_TYPE_SRW = 11;
    private static final int IMAGE_TYPE_HEIF = 12;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.String mFilename;
    private java.io.FileDescriptor mSeekableFileDescriptor;
    private android.content.res.AssetManager.AssetInputStream mAssetInputStream;
    private boolean mIsInputStream;
    private int mMimeType;
    @android.annotation.UnsupportedAppUsage
    private final java.util.HashMap[] mAttributes = null;
    private java.util.Set<java.lang.Integer> mHandledIfdOffsets;
    private java.nio.ByteOrder mExifByteOrder;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private boolean mHasThumbnail;
    private int mThumbnailOffset;
    private int mThumbnailLength;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mExifOffset;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailOffset;
    private int mOrfThumbnailLength;
    private int mRw2JpgFromRawOffset;
    private boolean mIsSupportedFile;
    private boolean mModified;
    private static final java.util.regex.Pattern sNonZeroTimePattern = null;
    private static final java.util.regex.Pattern sGpsTimestampPattern = null;
    public ExifInterface(java.io.File p0) throws java.io.IOException {}
    public ExifInterface(java.lang.String p0) throws java.io.IOException {}
    public ExifInterface(java.io.FileDescriptor p0) throws java.io.IOException {}
    public ExifInterface(java.io.InputStream p0) throws java.io.IOException {}
    private android.media.ExifInterface.ExifAttribute getExifAttribute(java.lang.String p0) { return null; }
    public java.lang.String getAttribute(java.lang.String p0) { return null; }
    public int getAttributeInt(java.lang.String p0, int p1) { return 0; }
    public double getAttributeDouble(java.lang.String p0, double p1) { return 0.0; }
    public void setAttribute(java.lang.String p0, java.lang.String p1) {}
    private boolean updateAttribute(java.lang.String p0, android.media.ExifInterface.ExifAttribute p1) { return false; }
    private void removeAttribute(java.lang.String p0) {}
    private void loadAttributes(java.io.InputStream p0) throws java.io.IOException {}
    private static boolean isSeekableFD(java.io.FileDescriptor p0) throws java.io.IOException { return false; }
    private void printAttributes() {}
    public void saveAttributes() throws java.io.IOException {}
    public boolean hasThumbnail() { return false; }
    public boolean hasAttribute(java.lang.String p0) { return false; }
    public byte[] getThumbnail() { return null; }
    public byte[] getThumbnailBytes() { return null; }
    public android.graphics.Bitmap getThumbnailBitmap() { return null; }
    public boolean isThumbnailCompressed() { return false; }
    public long[] getThumbnailRange() { return null; }
    public long[] getAttributeRange(java.lang.String p0) { return null; }
    public byte[] getAttributeBytes(java.lang.String p0) { return null; }
    public boolean getLatLong(float[] p0) { return false; }
    public double getAltitude(double p0) { return 0.0; }
    @android.annotation.UnsupportedAppUsage
    public long getDateTime() { return 0L; }
    public long getDateTimeDigitized() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getDateTimeOriginal() { return 0L; }
    private static long parseDateTime(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getGpsDateTime() { return 0L; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static float convertRationalLatLonToFloat(java.lang.String p0, java.lang.String p1) { return 0.0f; }
    private void initForFilename(java.lang.String p0) throws java.io.IOException {}
    private int getMimeType(java.io.BufferedInputStream p0) throws java.io.IOException { return 0; }
    private static boolean isJpegFormat(byte[] p0) throws java.io.IOException { return false; }
    private boolean isRafFormat(byte[] p0) throws java.io.IOException { return false; }
    private boolean isHeifFormat(byte[] p0) throws java.io.IOException { return false; }
    private boolean isOrfFormat(byte[] p0) throws java.io.IOException { return false; }
    private boolean isRw2Format(byte[] p0) throws java.io.IOException { return false; }
    private void getJpegAttributes(android.media.ExifInterface.ByteOrderedDataInputStream p0, int p1, int p2) throws java.io.IOException {}
    private void getRawAttributes(android.media.ExifInterface.ByteOrderedDataInputStream p0) throws java.io.IOException {}
    private void getRafAttributes(android.media.ExifInterface.ByteOrderedDataInputStream p0) throws java.io.IOException {}
    private void getHeifAttributes(android.media.ExifInterface.ByteOrderedDataInputStream p0) throws java.io.IOException {}
    private void getOrfAttributes(android.media.ExifInterface.ByteOrderedDataInputStream p0) throws java.io.IOException {}
    private void getRw2Attributes(android.media.ExifInterface.ByteOrderedDataInputStream p0) throws java.io.IOException {}
    private void saveJpegAttributes(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException {}
    private void readExifSegment(byte[] p0, int p1) throws java.io.IOException {}
    private void addDefaultValuesForCompatibility() {}
    private java.nio.ByteOrder readByteOrder(android.media.ExifInterface.ByteOrderedDataInputStream p0) throws java.io.IOException { return null; }
    private void parseTiffHeaders(android.media.ExifInterface.ByteOrderedDataInputStream p0, int p1) throws java.io.IOException {}
    private void readImageFileDirectory(android.media.ExifInterface.ByteOrderedDataInputStream p0, int p1) throws java.io.IOException {}
    private void retrieveJpegImageSize(android.media.ExifInterface.ByteOrderedDataInputStream p0, int p1) throws java.io.IOException {}
    private void setThumbnailData(android.media.ExifInterface.ByteOrderedDataInputStream p0) throws java.io.IOException {}
    private void handleThumbnailFromJfif(android.media.ExifInterface.ByteOrderedDataInputStream p0, java.util.HashMap p1) throws java.io.IOException {}
    private void handleThumbnailFromStrips(android.media.ExifInterface.ByteOrderedDataInputStream p0, java.util.HashMap p1) throws java.io.IOException {}
    private boolean isSupportedDataType(java.util.HashMap p0) throws java.io.IOException { return false; }
    private boolean isThumbnail(java.util.HashMap p0) throws java.io.IOException { return false; }
    private void validateImages(java.io.InputStream p0) throws java.io.IOException {}
    private void updateImageSizeValues(android.media.ExifInterface.ByteOrderedDataInputStream p0, int p1) throws java.io.IOException {}
    private int writeExifSegment(android.media.ExifInterface.ByteOrderedDataOutputStream p0, int p1) throws java.io.IOException { return 0; }
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String p0) { return null; }
    private void swapBasedOnImageSize(int p0, int p1) throws java.io.IOException {}
    private boolean containsMatch(byte[] p0, byte[] p1) { return false; }
    private static long[] convertToLongArray(java.lang.Object p0) { return null; }

    private static class Rational {
        public final long numerator = 0L;
        public final long denominator = 0L;
        private Rational(long p0, long p1) {}
        public java.lang.String toString() { return null; }
        public double calculate() { return 0.0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IfdType {
    }

    private static class ExifTag {
        public final int number = 0;
        public final java.lang.String name = null;
        public final int primaryFormat = 0;
        public final int secondaryFormat = 0;
        private ExifTag(java.lang.String p0, int p1, int p2) {}
        private ExifTag(java.lang.String p0, int p1, int p2, int p3) {}
    }

    private static class ExifAttribute {
        public final int format = 0;
        public final int numberOfComponents = 0;
        public final long bytesOffset = 0L;
        public final byte[] bytes = null;
        public static final long BYTES_OFFSET_UNKNOWN = -1L;
        private ExifAttribute(int p0, int p1, byte[] p2) {}
        private ExifAttribute(int p0, int p1, long p2, byte[] p3) {}
        public static android.media.ExifInterface.ExifAttribute createUShort(int[] p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createUShort(int p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createULong(long[] p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createULong(long p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createSLong(int[] p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createSLong(int p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createByte(java.lang.String p0) { return null; }
        public static android.media.ExifInterface.ExifAttribute createString(java.lang.String p0) { return null; }
        public static android.media.ExifInterface.ExifAttribute createURational(android.media.ExifInterface.Rational[] p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createURational(android.media.ExifInterface.Rational p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createSRational(android.media.ExifInterface.Rational[] p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createSRational(android.media.ExifInterface.Rational p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createDouble(double[] p0, java.nio.ByteOrder p1) { return null; }
        public static android.media.ExifInterface.ExifAttribute createDouble(double p0, java.nio.ByteOrder p1) { return null; }
        public java.lang.String toString() { return null; }
        private java.lang.Object getValue(java.nio.ByteOrder p0) { return null; }
        public double getDoubleValue(java.nio.ByteOrder p0) { return 0.0; }
        public int getIntValue(java.nio.ByteOrder p0) { return 0; }
        public java.lang.String getStringValue(java.nio.ByteOrder p0) { return null; }
        public int size() { return 0; }
    }

    private static class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
        private final java.io.OutputStream mOutputStream = null;
        private java.nio.ByteOrder mByteOrder;
        public ByteOrderedDataOutputStream(java.io.OutputStream p0, java.nio.ByteOrder p1) { super((java.io.OutputStream)null); }
        public void setByteOrder(java.nio.ByteOrder p0) {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void writeByte(int p0) throws java.io.IOException {}
        public void writeShort(short p0) throws java.io.IOException {}
        public void writeInt(int p0) throws java.io.IOException {}
        public void writeUnsignedShort(int p0) throws java.io.IOException {}
        public void writeUnsignedInt(long p0) throws java.io.IOException {}
    }

    private static class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
        private static final java.nio.ByteOrder LITTLE_ENDIAN = null;
        private static final java.nio.ByteOrder BIG_ENDIAN = null;
        private java.io.DataInputStream mDataInputStream;
        private java.io.InputStream mInputStream;
        private java.nio.ByteOrder mByteOrder;
        private final int mLength = 0;
        private int mPosition;
        public ByteOrderedDataInputStream(java.io.InputStream p0) throws java.io.IOException { super(); }
        public ByteOrderedDataInputStream(byte[] p0) throws java.io.IOException { super(); }
        public void setByteOrder(java.nio.ByteOrder p0) {}
        public void seek(long p0) throws java.io.IOException {}
        public int peek() { return 0; }
        public int available() throws java.io.IOException { return 0; }
        public int read() throws java.io.IOException { return 0; }
        public int readUnsignedByte() throws java.io.IOException { return 0; }
        public java.lang.String readLine() throws java.io.IOException { return null; }
        public boolean readBoolean() throws java.io.IOException { return false; }
        public char readChar() throws java.io.IOException { return 0; }
        public java.lang.String readUTF() throws java.io.IOException { return null; }
        public void readFully(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void readFully(byte[] p0) throws java.io.IOException {}
        public byte readByte() throws java.io.IOException { return 0; }
        public short readShort() throws java.io.IOException { return 0; }
        public int readInt() throws java.io.IOException { return 0; }
        public int skipBytes(int p0) throws java.io.IOException { return 0; }
        public int readUnsignedShort() throws java.io.IOException { return 0; }
        public long readUnsignedInt() throws java.io.IOException { return 0L; }
        public long readLong() throws java.io.IOException { return 0L; }
        public float readFloat() throws java.io.IOException { return 0.0f; }
        public double readDouble() throws java.io.IOException { return 0.0; }
        public int getLength() { return 0; }
    }
}
