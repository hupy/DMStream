package com.team.finn.presenter.video.interfaces;


import android.content.Context;

import com.team.finn.base.BaseModel;
import com.team.finn.base.BasePresenter;
import com.team.finn.base.BaseView;
import com.team.finn.model.logic.video.bean.VideoOtherColumnList;

import java.util.List;

import rx.Observable;

/**
 *  作者：finn
 *  版本号：1.0
 *  备注消息：
 **/
public interface VideoOtherTwoColumnContract {
      interface View extends BaseView {
            void getViewVideoOtherColumnListLoadMore(List<VideoOtherColumnList> mVideoOtherColumnList);
            void getViewOtherTwoColumn(List<VideoOtherColumnList> mVideoReClassify);
      }
      interface Model extends BaseModel {
            Observable<List<VideoOtherColumnList>> getModelVideoOtherTwoColumn(Context context, String  cid1, String cid2, int offset, int limit, String action );
      }
      abstract class Presenter extends BasePresenter<View,Model> {
//  http://apiv2.douyucdn.cn/video/Videoroomlist/getRecVideoList?cid1=1&cid2=5&offset=0&limit=20&action=hot&client_sys=android
            public  abstract void getPresenterVideoOtherTwoColumn(String  cid1,String cid2,int offset,int limit,String action );
            //          刷新数据
            public abstract void getPresenterLiveOtherColumnList(String  cid1,String cid2,int offset,int limit,String action  );
            //          加载更多
            public abstract  void  getPresenterLiveOtherColumnListLoadMore(String  cid1,String cid2,int offset,int limit,String action );
      }

}
