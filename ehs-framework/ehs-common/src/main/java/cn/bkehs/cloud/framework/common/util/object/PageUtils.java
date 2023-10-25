package cn.bkehs.cloud.framework.common.util.object;


import cn.bkehs.cloud.framework.common.pojo.PageParam;

/**
 * {@link PageParam} 工具类
 *
 * @author beckwell-xwh
 */
public class PageUtils {

    public static int getStart(PageParam pageParam) {
        return (pageParam.getPageNo() - 1) * pageParam.getPageSize();
    }

}
