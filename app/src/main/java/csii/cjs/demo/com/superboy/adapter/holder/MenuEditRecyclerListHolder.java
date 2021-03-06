package csii.cjs.demo.com.superboy.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import csii.cjs.demo.com.superboy.R;

/**
 * 描述:编辑页面的列表Holder
 * <p>
 * 作者:陈俊森
 * 创建时间:2017年11月03日 17:41
 * 邮箱:chenjunsen@outlook.com
 *
 * @version 1.0
 */
public class MenuEditRecyclerListHolder extends RecyclerView.ViewHolder {
    public TextView tv_group_name;
    public RecyclerView recyclerView;

    public MenuEditRecyclerListHolder(View itemView) {
        super(itemView);
        tv_group_name= (TextView) itemView.findViewById(R.id.title);
        recyclerView= (RecyclerView) itemView.findViewById(R.id.recycler);
    }
}
