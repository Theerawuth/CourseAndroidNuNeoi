package com.example.theerawuth_p.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;

import com.example.theerawuth_p.liveat500px.R;
import com.example.theerawuth_p.liveat500px.dao.PhotoItemCollectionDao;
import com.example.theerawuth_p.liveat500px.dao.PhotoItemDao;
import com.example.theerawuth_p.liveat500px.view.PhotoListItem;

/**
 * Created by theerawuth_p on 7/18/17.
 */

public class PhotoListAdapter extends BaseAdapter {

    PhotoItemCollectionDao dao;

    int lastPosition = -1;

    @Override
    public int getCount() {
        if(dao == null)
            return 1;
        if(dao.getData() == null)
            return 1;
        return dao.getData().size() + 1;
    }

    @Override
    public Object getItem(int position) {
        return dao.getData().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
//
//    @Override
//    public int getViewTypeCount() {
//        return 2;
//    }
//
//    @Override
//    public int getItemViewType(int position) {
//        return position % 2 == 0 ? 0 : 1;
//    }


    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position == getCount() - 1 ? 1 : 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        if (getItemViewType(position) == 0) {
//            PhotoListItem item;
//            if (convertView != null) {
//                item = (PhotoListItem) convertView;
//            } else {
//                item  = new PhotoListItem(parent.getContext());
//            }
//            return item;
//        } else {
//            TextView item;
//            if (convertView != null) {
//                item = (TextView) convertView;
//            } else {
//                item  = new TextView(parent.getContext());
//            }
//            item.setText("Position " + position);
//            return item;
//        }
        if(position == getCount() - 1) {
            ProgressBar item;
            if(convertView != null) {
                item = (ProgressBar) convertView;
            } else {
                item = new ProgressBar(parent.getContext());
            }
            return item;
        }
        PhotoListItem item;
        if (convertView != null) {
            item = (PhotoListItem) convertView;
        } else {
            item  = new PhotoListItem(parent.getContext());
        }

        PhotoItemDao dao = (PhotoItemDao) getItem(position);
        item.setNameText(dao.getCaption());
        item.setDescriptionText(dao.getUsername() + "\n" + dao.getCamera());
        item.setImageUrl(dao.getImageUrl());

        if(position > lastPosition) {
            Animation anim  = AnimationUtils.loadAnimation(parent.getContext(),R.anim.up_from_bottom);
            item.startAnimation(anim);
            lastPosition = position;
        }

        return item;
    }


    public PhotoItemCollectionDao getDao() {
        return dao;
    }

    public void setDao(PhotoItemCollectionDao dao) {
        this.dao = dao;
    }

    public void increaseLastPosition(int amount) {
        lastPosition += amount;
    }
}
