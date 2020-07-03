package com.example.acwrmfryd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BugExpendAdapter extends BaseExpandableListAdapter{
    private String[] bugName;
    private String[][] bugdetail;
    private int[] bugPic;
    LayoutInflater inflater;
    public BugExpendAdapter(Context context, String[] bugName,String[][] bugdetail,int[] bugPic)
    {
        this.inflater = LayoutInflater.from(context);
        this.bugName= bugName;
        this.bugdetail= bugdetail;
        this.bugPic=bugPic;
    }


    @Override
    public int getGroupCount() {
        return bugName.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return bugdetail[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return bugName[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return bugdetail[groupPosition][childPosition];
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
        convertView = inflater.inflate(R.layout.group_bug, null);
        TextView textView = convertView.findViewById(R.id.buggrouptext);
        textView.setText(getGroup(groupPosition).toString());
        ImageView imageView = convertView.findViewById(R.id.buggroupimage);
        imageView.setImageResource(bugPic[groupPosition]);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.child_bug, null);
        TextView textView = convertView.findViewById(R.id.bugdetail);
        textView.setText(getChild(groupPosition,childPosition).toString());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
