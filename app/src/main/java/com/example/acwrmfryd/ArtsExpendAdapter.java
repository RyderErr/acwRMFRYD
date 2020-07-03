package com.example.acwrmfryd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArtsExpendAdapter extends BaseExpandableListAdapter{
    private String[] artsName;
    private String[][] artsdetail;
    private int[] artsPic;
    LayoutInflater inflater;
    public ArtsExpendAdapter(Context context, String[] Name,String[][] artsdetail,int[] artsPic)
    {
        this.inflater = LayoutInflater.from(context);
        this.artsName= Name;
        this.artsdetail= artsdetail;
        this.artsPic=artsPic;
    }


    @Override
    public int getGroupCount() {
        return artsName.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return artsdetail[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return artsName[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return artsdetail[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.group_arts, null);
        TextView textView = convertView.findViewById(R.id.artsgrouptext);
        textView.setText(getGroup(groupPosition).toString());
        ImageView imageView = convertView.findViewById(R.id.artsgroupimage);
        imageView.setImageResource(artsPic[groupPosition]);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.child_arts, null);
        TextView textView = convertView.findViewById(R.id.artsdetail);
        textView.setText(getChild(groupPosition,childPosition).toString());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
