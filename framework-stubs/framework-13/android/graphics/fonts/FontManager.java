package android.graphics.fonts;

@android.annotation.SystemApi
public class FontManager {
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_ERROR_FAILED_TO_WRITE_FONT_FILE = -1;
    public static final int RESULT_ERROR_VERIFICATION_FAILURE = -2;
    public static final int RESULT_ERROR_INVALID_FONT_FILE = -3;
    public static final int RESULT_ERROR_INVALID_FONT_NAME = -4;
    public static final int RESULT_ERROR_DOWNGRADING = -5;
    public static final int RESULT_ERROR_FAILED_UPDATE_CONFIG = -6;
    public static final int RESULT_ERROR_FONT_UPDATER_DISABLED = -7;
    public static final int RESULT_ERROR_VERSION_MISMATCH = -8;
    public static final int RESULT_ERROR_FONT_NOT_FOUND = -9;
    public static final int RESULT_ERROR_FAILED_TO_OPEN_FONT_FILE = -10001;
    public static final int RESULT_ERROR_FAILED_TO_OPEN_SIGNATURE_FILE = -10002;
    public static final int RESULT_ERROR_INVALID_SHELL_ARGUMENT = -10003;
    public static final int RESULT_ERROR_INVALID_SIGNATURE_FILE = -10004;
    public static final int RESULT_ERROR_SIGNATURE_TOO_LARGE = -10005;
    public static final int RESULT_ERROR_FAILED_TO_OPEN_XML_FILE = -10006;
    public static final int RESULT_ERROR_INVALID_XML = -10007;
    @android.annotation.RequiresPermission("android.permission.UPDATE_FONTS")
    public android.text.FontConfig getFontConfig() { return null; }
    @android.annotation.RequiresPermission("android.permission.UPDATE_FONTS")
    public int updateFontFamily(android.graphics.fonts.FontFamilyUpdateRequest p0, int p1) { return 0; }
    public static android.graphics.fonts.FontManager create(com.android.internal.graphics.fonts.IFontManager p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
