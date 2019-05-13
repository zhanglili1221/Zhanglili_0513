package bawei.com.zhanglili_0513.presenter;

import java.nio.file.Path;

import bawei.com.zhanglili_0513.model.Imodel;
import bawei.com.zhanglili_0513.model.ModelIml;
import bawei.com.zhanglili_0513.view.Iview;

/**
 * @author: 章黎黎
 * @Date: 2019/5/13  9:03
 * @description: $描述
 */
public class PresenterIml implements Ipresenter {

    private Imodel imodel;
    private Iview iview;

    public PresenterIml( Iview iview) {
       imodel = new ModelIml();
        this.iview = iview;
    }

    @Override
    public void attach(Iview iview) {
        this.iview = iview;
    }

    @Override
    public void success(String url, Imodel.Listener listener) {

    }

    @Override
    public void Destroy() {
        if(imodel ==null){
            imodel = imodel;
        }
        if(iview == null){
            iview = iview;
        }
    }


}
