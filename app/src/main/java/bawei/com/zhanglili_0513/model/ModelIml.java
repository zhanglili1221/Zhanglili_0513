package bawei.com.zhanglili_0513.model;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import bawei.com.zhanglili_0513.bean.UserBean;
import bawei.com.zhanglili_0513.net.OkHttpUtill;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * @author: 章黎黎
 * @Date: 2019/5/13  9:01
 * @description: $描述
 */
public class ModelIml implements Imodel {

    private String url="https://code.aliyun.com/598254259/FristProject/raw/master/bw_list.txt";
    @Override
    public void requestData(String url, Listener listener) {
          OkHttpUtill.doGet(url, new Callback() {
              @Override
              public void onFailure(Call call, IOException e) {

              }

              @Override
              public void onResponse(Call call, Response response) throws IOException {
                  String string = response.body().string();
                  Gson gson = new Gson();
                  UserBean userBean = gson.fromJson(string, UserBean.class);
                  List<UserBean.ItemsBean> items = userBean.getItems();

              }
          });
    }
}
