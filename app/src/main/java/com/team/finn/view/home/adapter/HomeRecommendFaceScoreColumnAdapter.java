package com.team.finn.view.home.adapter;


import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.team.finn.R;
import com.team.finn.model.logic.home.bean.HomeFaceScoreColumn;
import com.team.finn.ui.refreshview.recyclerview.BaseRecyclerAdapter;
import com.team.finn.utils.CalculationUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 版本号：1.0
 * 备注消息：
 **/
public class HomeRecommendFaceScoreColumnAdapter extends BaseRecyclerAdapter<RecyclerView.ViewHolder> {
    private List<HomeFaceScoreColumn> mHomeFaceScoreColumn;
    private Context context;

    public HomeRecommendFaceScoreColumnAdapter(Context context) {
        this.context = context;
        this.mHomeFaceScoreColumn = new ArrayList<HomeFaceScoreColumn>();
    }

    public void getFaceScoreColumn(List<HomeFaceScoreColumn> mHomeFaceScoreColumn) {
          this.mHomeFaceScoreColumn.clear();
        this.mHomeFaceScoreColumn.addAll(mHomeFaceScoreColumn);
        notifyDataSetChanged();
    }
    public void getFaceScoreColumnLoadMore(List<HomeFaceScoreColumn> mHomeFaceScoreColumn) {
//          this.mHomeFaceScoreColumn.clear();
        this.mHomeFaceScoreColumn.addAll(mHomeFaceScoreColumn);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new FaceScoreColumnHolder(view);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        return new FaceScoreColumnHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_recommend_facescore, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, boolean isItem) {
        if (holder instanceof FaceScoreColumnHolder) {
            bindFaceScoreHolder((FaceScoreColumnHolder) holder, position);

        }
    }
    private void bindFaceScoreHolder(FaceScoreColumnHolder holder, int position) {
        holder.img_item_gridview.setImageURI(Uri.parse(mHomeFaceScoreColumn.get(position).getVertical_src()));
        holder.tv_column_item_nickname.setText(mHomeFaceScoreColumn.get(position).getNickname());
        holder.tv_online_num.setText(CalculationUtils.getOnLine(mHomeFaceScoreColumn.get(position).getOnline()));
        holder.tv_facescore_city.setText(mHomeFaceScoreColumn.get(position).getAnchor_city());
    }

    @Override
    public int getAdapterItemCount() {
        return mHomeFaceScoreColumn.size();
    }

    public class FaceScoreColumnHolder extends RecyclerView.ViewHolder {
        public SimpleDraweeView img_item_gridview;
        public TextView tv_column_item_nickname;
        public TextView tv_online_num;
        public TextView tv_facescore_city;

        public FaceScoreColumnHolder(View view) {
            super(view);
            img_item_gridview = (SimpleDraweeView) view.findViewById(R.id.img_item_gridview);
            tv_column_item_nickname = (TextView) view.findViewById(R.id.tv_column_item_nickname);
            tv_online_num = (TextView) view.findViewById(R.id.tv_online_num);
            tv_facescore_city = (TextView) view.findViewById(R.id.tv_facescore_city);
        }
    }
}