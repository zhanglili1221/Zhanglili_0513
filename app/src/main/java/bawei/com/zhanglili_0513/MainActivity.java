package bawei.com.zhanglili_0513;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import bawei.com.zhanglili_0513.adapter.ShouAdapter;
import bawei.com.zhanglili_0513.bean.UserBean;
import bawei.com.zhanglili_0513.view.Iview;

public class MainActivity extends AppCompatActivity implements Iview {

    private List<UserBean.ItemsBean> list = new ArrayList<>();
   private String url="https://code.aliyun.com/598254259/FristProject/raw/master/bw_list.txt";
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        ShouAdapter shouAdapter = new ShouAdapter(MainActivity.this,list);
        lv.setAdapter(shouAdapter);
    }



    @Override
    public void sueeess(Iview iview) {


    }


}
