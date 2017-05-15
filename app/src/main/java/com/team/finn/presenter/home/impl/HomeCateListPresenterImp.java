package com.team.finn.presenter.home.impl;

import com.team.finn.model.logic.home.HomeCate;
import com.team.finn.model.logic.home.HomeCateList;
import com.team.finn.net.callback.RxSubscriber;
import com.team.finn.net.exception.ResponeThrowable;
import com.team.finn.presenter.home.interfaces.HomeCateContract;
import com.team.finn.presenter.home.interfaces.HomeCateListContract;
import com.team.finn.utils.L;

import java.util.List;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public class HomeCateListPresenterImp extends HomeCateListContract.Presenter {

    @Override
    public void getHomeCateList() {
             addSubscribe(mModel.getHomeCateList(mContext).subscribe(new RxSubscriber<List<HomeCateList>>() {
                 @Override
                 public void onSuccess(List<HomeCateList> homeCateListList) {
                    mView.getOtherList(homeCateListList);
                 }
                 @Override
                 protected void onError(ResponeThrowable ex) {
                     L.i(ex.message+""+ex.code+"");
                 }
             }));
    }
}