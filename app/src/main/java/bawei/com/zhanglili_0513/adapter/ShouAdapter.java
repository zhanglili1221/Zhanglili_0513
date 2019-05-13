package bawei.com.zhanglili_0513.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.List;

import bawei.com.zhanglili_0513.R;
import bawei.com.zhanglili_0513.bean.UserBean;

/**
 * @author: 章黎黎
 * @Date: 2019/5/13  9:32
 * @description: $描述
 */
public class ShouAdapter extends BaseAdapter {
    private Context context;
    private List<UserBean.ItemsBean> list;
    private ViewHolder viewHolder;

    public ShouAdapter(Context context, List<UserBean.ItemsBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = View.inflate(context, R.layout.item_layout,null);
            viewHolder.name = convertView.findViewById(R.id.tv_name);
            viewHolder.prcie = convertView.findViewById(R.id.tv_prcie);
            viewHolder.img = convertView.findViewById(R.id.img);
             convertView.setTag(viewHolder);

        }
        viewHolder.name.setText(list.get(position).getTitle());
        viewHolder.prcie.setText(list.get(position).getType());

        return convertView;

    }
    class ViewHolder{
        ImageView img;
        TextView name;
        TextView prcie;

    }
}
