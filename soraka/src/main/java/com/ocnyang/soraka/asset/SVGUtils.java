package com.ocnyang.soraka.asset;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.graphics.drawable.VectorDrawableCompat;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/3/12 16:02.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class SVGUtils {

    /**
     * #View.setImageDrawable();
     * @param context
     * @param resId
     * @param colorId
     * @return
     */
    public static VectorDrawableCompat changeSVGcolor(Context context, @DrawableRes int resId, @ColorRes int colorId) {
        VectorDrawableCompat vectorDrawableCompat = VectorDrawableCompat.create
                (context.getResources(), resId, context.getTheme());
        //你需要改变的颜色
        vectorDrawableCompat.setTint(context.getResources().getColor(colorId));
        return vectorDrawableCompat;
    }
}
