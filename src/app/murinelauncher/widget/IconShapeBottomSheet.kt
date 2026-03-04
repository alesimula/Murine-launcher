package app.murinelauncher.widget

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PixelFormat
import android.graphics.RectF
import android.graphics.drawable.AdaptiveIconDrawable
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.ColorUtils
import androidx.core.graphics.PathParser
import androidx.preference.PreferenceViewHolder
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.graphics.ThemeManager
import com.android.launcher3.shapes.ShapesProvider
import com.android.settingslib.widget.SelectorWithWidgetPreference
import com.android.settingslib.widget.SettingsBasePreferenceFragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.shape.MaterialShapeDrawable

class IconShapeBottomSheet : BottomSheetDialogFragment() {

    fun interface OnShapeSelectedListener {
        fun onShapeSelected(shapeKey: String)
    }

    private var listener: OnShapeSelectedListener? = null

    fun setOnShapeSelectedListener(listener: OnShapeSelectedListener) {
        this.listener = listener
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.icon_shape_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.setOnShowListener {
            val bottomSheet = dialog?.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet) ?: return@setOnShowListener
            val background = bottomSheet.background as? MaterialShapeDrawable ?: return@setOnShowListener
            val isDarkTheme = (bottomSheet.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
            val tintColor = adjustDialogColor(background.resolvedTintColor, isDarkTheme)
            background.tintList = ColorStateList(arrayOf(intArrayOf()), intArrayOf(tintColor))
        }
        if (savedInstanceState == null) {
            childFragmentManager.beginTransaction()
                .replace(R.id.prefs_container, ShapePreferenceFragment())
                .commit()
        }
    }

    /**
     * Makes very dark (e.g. AMOLED) dialog background colors ligher to increase visibility.
     * Makes very light (e.g. pure white) dialog background colors darker to increase visibility.
     */
    private fun adjustDialogColor(color: Int, isDarkTheme: Boolean): Int {
        val hsl = FloatArray(3)
        ColorUtils.colorToHSL(color, hsl)
        val currentLightness = hsl[2]
        // Max lightness increase/decrease
        val maxShift = 0.05f
        // Higher power = "steeper" curve (more imperceptible in the middle)
        val power = 20.0
        if (isDarkTheme) {
            val factor = Math.pow((1.0f - currentLightness).toDouble(), power).toFloat()
            hsl[2] = Math.min(1.0f, currentLightness + (maxShift * factor))
        } else {
            val factor = Math.pow(currentLightness.toDouble(), power).toFloat()
            hsl[2] = Math.max(0.0f, currentLightness - (maxShift * factor))
        }
        return ColorUtils.HSLToColor(hsl)
    }

    class ShapePreferenceFragment : SettingsBasePreferenceFragment(), SelectorWithWidgetPreference.OnClickListener {

        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            val ctx = requireContext()
            val screen = preferenceManager.createPreferenceScreen(ctx)
            val currentShape = ThemeManager.Companion.PREF_ICON_SHAPE.get(ctx)
            // Shape options
            for (shape in ShapesProvider.IconShape.entries)
                screen.addPreference(createShapePref(ctx, shape, currentShape))
            preferenceScreen = screen
        }

        private fun createShapePref(
            ctx: Context, shape: ShapesProvider.IconShape, currentShape: ShapesProvider.IconShape
        ): IconShapeSelectorPreference {
            val pref = IconShapeSelectorPreference(ctx)
            pref.key = "$PREF_PREFIX${shape.name}"
            pref.title = ctx.getString(shape.title)
            pref.isChecked = currentShape == shape
            pref.shapePreview = getShapePreviewDrawable(ctx, shape)
            pref.setOnClickListener(this)
            return pref
        }

        override fun onRadioButtonClicked(emitter: SelectorWithWidgetPreference) {
            // Uncheck all, check selected
            for (i in 0 until preferenceScreen.preferenceCount)
                (preferenceScreen.getPreference(i) as? SelectorWithWidgetPreference)?.isChecked = false
            emitter.isChecked = true

            val shapeKey = emitter.key.removePrefix(PREF_PREFIX)
            val prefs = LauncherPrefs.Companion.INSTANCE.get(requireContext())
            prefs.put(ThemeManager.Companion.PREF_ICON_SHAPE.to(ShapesProvider.IconShape.valueOf(shapeKey)))

            (parentFragment as? IconShapeBottomSheet)?.let {
                it.listener?.onShapeSelected(shapeKey)
                it.dismiss()
            }
        }
    }

    class IconShapeSelectorPreference(context: Context) : SelectorWithWidgetPreference(context) {
        var shapePreview: Drawable? = null
            set(value) {
                field = value
                icon = value
            }

        init {
            isIconSpaceReserved = true
        }

        override fun onBindViewHolder(holder: PreferenceViewHolder) {
            super.onBindViewHolder(holder)
            // Move icon_frame from default position (between radio and text) to the right
            val iconFrame = holder.findViewById(com.android.settingslib.widget.theme.R.id.icon_frame)
                ?: holder.findViewById(android.R.id.icon_frame)
            if (iconFrame != null) {
                val parent = iconFrame.parent as? ViewGroup
                if (parent != null) {
                    val idx = parent.indexOfChild(iconFrame)
                    val textIdx = parent.childCount - 2 // before extra_widget_container
                    if (idx >= 0 && idx < textIdx) {
                        parent.removeView(iconFrame)
                        parent.addView(iconFrame, textIdx)
                    }
                }
            }
        }
    }

    class ShapePreviewDrawable(pathString: String, private val color: Int) : Drawable() {
        private val srcPath: Path = PathParser.createPathFromPathData(pathString)
        private val drawPath: Path = Path()
        private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            style = Paint.Style.FILL
        }

        override fun draw(canvas: Canvas) {
            val b = bounds
            drawPath.reset()
            val matrix = Matrix()
            matrix.setScale(b.width() / 100f, b.height() / 100f)
            matrix.postTranslate(b.left.toFloat(), b.top.toFloat())
            srcPath.transform(matrix, drawPath)
            paint.color = color
            canvas.drawPath(drawPath, paint)
        }

        override fun setAlpha(alpha: Int) { paint.alpha = alpha }
        override fun setColorFilter(colorFilter: ColorFilter?) { paint.colorFilter = colorFilter }
        @Deprecated("Deprecated in Java")
        override fun getOpacity() = PixelFormat.TRANSLUCENT

        override fun getIntrinsicWidth() = 100
        override fun getIntrinsicHeight() = 100
    }

    private class SystemShapePreviewDrawable(private val color: Int) : Drawable() {
        private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            style = Paint.Style.FILL
            this.color = this@SystemShapePreviewDrawable.color
        }

        override fun draw(canvas: Canvas) {
            val b = bounds
            val icon = AdaptiveIconDrawable(
                ColorDrawable(Color.TRANSPARENT), ColorDrawable(Color.TRANSPARENT)
            )
            icon.setBounds(0, 0, b.width(), b.height())
            val mask = icon.iconMask
            val drawPath = Path()
            val matrix = Matrix()
            val pathBounds = RectF()
            mask.computeBounds(pathBounds, true)
            matrix.setScale(
                b.width() / pathBounds.width(),
                b.height() / pathBounds.height()
            )
            matrix.postTranslate(
                b.left - pathBounds.left * (b.width() / pathBounds.width()),
                b.top - pathBounds.top * (b.height() / pathBounds.height())
            )
            mask.transform(matrix, drawPath)
            canvas.drawPath(drawPath, paint)
        }

        override fun setAlpha(alpha: Int) { paint.alpha = alpha }
        override fun setColorFilter(colorFilter: ColorFilter?) { paint.colorFilter = colorFilter }
        @Deprecated("Deprecated in Java")
        override fun getOpacity() = PixelFormat.TRANSLUCENT

        override fun getIntrinsicWidth() = 100
        override fun getIntrinsicHeight() = 100
    }

    companion object {
        const val TAG = "IconShapeBottomSheet"
        const val PREF_PREFIX = "pref_ic_shape_"

        fun getShapePreviewDrawable(context: Context, shape: ShapesProvider.IconShape): Drawable {
            val color = ContextCompat.getColor(context, com.android.settingslib.widget.theme.R.color.settingslib_materialColorOnSurfaceVariant)
            if (shape.pathString.isNotBlank()) try {
                return ShapePreviewDrawable(shape.pathString, color)
            } catch (_: Exception) {}
            return SystemShapePreviewDrawable(color)
        }
    }
}