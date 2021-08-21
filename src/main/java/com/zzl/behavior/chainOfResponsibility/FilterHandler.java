package com.zzl.behavior.chainOfResponsibility;

/**
 * 抽象接收者对象
 *
 * @author zzl
 * @since 2021/8/21 17:02
 */
public abstract class FilterHandler {

    protected String paramType;
    protected FilterHandler nextNode;

    public void setNextNode(FilterHandler nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * 处理请求参数方法
     *
     * @param paramType 处理的参数类型
     * @param param     请求传入的参数
     */
    public void filter(String paramType, Object param) {
        if (this.paramType.equals(paramType)) {
            checkParam(param);
        } else {
            if (this.nextNode != null){
                this.nextNode.filter(paramType, param);
            }else {
                System.out.println("错误！！！没有处理器能够处理此请求参数");
            }
        }
    }

    /**
     * 处理参数抽象方法
     *
     * @param param 请求参数
     */
    abstract void checkParam(Object param);
}
