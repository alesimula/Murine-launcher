package app.murinelauncher.graphics

import android.R
import android.content.Context
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
import androidx.core.content.ContextCompat
import androidx.core.graphics.PathParser
import com.android.launcher3.shapes.ShapesProvider

object IconShapeDrawables {

    fun getShapePreviewDrawable(context: Context, shape: ShapesProvider.IconShape, sizeDp: Int = 0): Drawable {
        val color = ContextCompat.getColor(context, R.color.white)
        val sizePx = if (sizeDp > 0) (sizeDp * context.resources.displayMetrics.density + 0.5f).toInt() else 0
        if (shape.pathString.isNotBlank()) try {
            return ShapePreviewDrawable(shape.pathString, color, sizePx)
        } catch (_: Exception) {}
        return SystemShapePreviewDrawable(color, sizePx)
    }

    class ShapePreviewDrawable(pathString: String, private val color: Int, private val intrinsicSizePx: Int = 0) : Drawable() {
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

        override fun getIntrinsicWidth() = if (intrinsicSizePx > 0) intrinsicSizePx else 100
        override fun getIntrinsicHeight() = if (intrinsicSizePx > 0) intrinsicSizePx else 100
    }

    private class SystemShapePreviewDrawable(private val color: Int, private val intrinsicSizePx: Int = 0) : Drawable() {
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

        override fun getIntrinsicWidth() = if (intrinsicSizePx > 0) intrinsicSizePx else 100
        override fun getIntrinsicHeight() = if (intrinsicSizePx > 0) intrinsicSizePx else 100
    }
}
