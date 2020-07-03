package com.example.acwrmfryd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class FishExpendAdapter extends BaseExpandableListAdapter{
    private String[] fishName;
    private String[][] fishdetail;
    private int[] fishPic;
    LayoutInflater inflater;
    public FishExpendAdapter(Context context, String[] fishName, String[][] fishdetail, int[] fishPic)
    {
        this.inflater = LayoutInflater.from(context);
        this.fishName= fishName;
        this.fishdetail= fishdetail;
        this.fishPic=fishPic;
    }


    @Override
    public int getGroupCount() {
        return fishName.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return fishdetail[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return fishName[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return fishdetail[groupPosition][childPosition];
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
        convertView = inflater.inflate(R.layout.group_fish, null);
        TextView textView = convertView.findViewById(R.id.fishgrouptext);
        textView.setText(getGroup(groupPosition).toString());
        ImageView imageView = convertView.findViewById(R.id.fishgroupimage);
        imageView.setImageResource(fishPic[groupPosition]);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.child_fish, null);
        TextView textView = convertView.findViewById(R.id.fishdetail);
        textView.setText(getChild(groupPosition,childPosition).toString());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
