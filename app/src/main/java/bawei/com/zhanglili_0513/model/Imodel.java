package bawei.com.zhanglili_0513.model;

/**
 * @author: 章黎黎
 * @Date: 2019/5/13  8:59
 * @description: $描述
 */
public interface Imodel {
    void requestData(String url,Listener listener);

    interface Listener{
        void setData(String info);
    }
}
