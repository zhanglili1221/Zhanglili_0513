package bawei.com.zhanglili_0513.net;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author: 章黎黎
 * @Date: 2019/5/13  8:58
 * @description: $描述
 */
public class OkHttpUtill {

   private static OkHttpUtill okHttpUtill=null;

    public OkHttpUtill() {
    }

    public static OkHttpUtill getIntance(){
        if(okHttpUtill==null){
            synchronized (OkHttpUtill.class){
                if(okHttpUtill == null){
                    okHttpUtill = new OkHttpUtill();
                }
            }
        }
        return okHttpUtill;
    }

    public static void doGet(String url, Callback callback){

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .build();
        Request request = new Request.Builder()
                .url(url)
                .build();

        Call call = okHttpClient.newCall(request);
        call.enqueue(callback);

    }
}
