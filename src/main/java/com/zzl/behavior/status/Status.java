package com.zzl.behavior.status;

/**
 * 状态接口
 * @author zzl
 * @since 2021/9/21 9:02
 */
public interface Status {

    /**
     * context对象的状态行为
     * @param context context对象
     */
    void handler(Context context);
}
