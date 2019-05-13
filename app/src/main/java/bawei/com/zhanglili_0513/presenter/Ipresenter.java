package bawei.com.zhanglili_0513.presenter;

import bawei.com.zhanglili_0513.model.Imodel;
import bawei.com.zhanglili_0513.view.Iview;

/**
 * @author: 章黎黎
 * @Date: 2019/5/13  9:02
 * @description: $描述
 */
public interface Ipresenter {
    void attach(Iview iview);
    void success(String url, Imodel.Listener listener);
    void Destroy();
}
