package com.example.acwrmfryd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FossilExpendAdapter extends BaseExpandableListAdapter{
    private String[] fossilName;
    private String[][] fossildetail;
    private int[] fossilPic;
    LayoutInflater inflater;
    public FossilExpendAdapter(Context context, String[] fossilName,String[][] fossildetail,int[] fossilPic)
    {
        this.inflater = LayoutInflater.from(context);
        this.fossilName= fossilName;
        this.fossildetail= fossildetail;
        this.fossilPic=fossilPic;
    }


    @Override
    public int getGroupCount() {
        return fossilName.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return fossildetail[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return fossilName[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return fossildetail[groupPosition][childPosition];
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
        convertView = inflater.inflate(R.layout.group_fossil, null);
        TextView textView = convertView.findViewById(R.id.fossilgrouptext);
        textView.setText(getGroup(groupPosition).toString());
        ImageView imageView = convertView.findViewById(R.id.fossilgroupimage);
        imageView.setImageResource(fossilPic[groupPosition]);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.child_fossil, null);
        TextView textView = convertView.findViewById(R.id.fossildetail);
        textView.setText(getChild(groupPosition,childPosition).toString());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
