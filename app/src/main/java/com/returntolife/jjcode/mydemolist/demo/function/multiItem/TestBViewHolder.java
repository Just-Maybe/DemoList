package com.returntolife.jjcode.mydemolist.demo.function.multiItem;

import android.widget.TextView;

import com.returntolife.jjcode.mydemolist.R;

import static com.returntolife.jjcode.mydemolist.demo.function.multiItem.HolderTypeConstants.HOLDER_TYPE_B;

/**
 * Created by HeJiaJun on 2019/6/5.
 * Email:
 * des:
 */
public class TestBViewHolder implements ItemViewDelegate<HolderData> {

    private TextView tvHolder;

    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_testbviewholder;
    }

    @Override
    public boolean isForViewType(HolderData item, int position) {
        return item.getType()==HOLDER_TYPE_B;
    }

    @Override
    public void convert(ViewHolder holder, HolderData holderData, int position) {
        tvHolder=holder.getView(R.id.tv_holder);
    }

}
