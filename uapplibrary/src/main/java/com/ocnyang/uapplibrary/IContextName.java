package com.ocnyang.uapplibrary;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/1/25 18:25.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public interface IContextName {
    /**
     * 在最终的Fragment中返回：getContext().getClass().getSimpleName() + "-" + this.getClass().getSimpleName();
     * @return Fragment 的名称
     */
    public String getPageName();
}
