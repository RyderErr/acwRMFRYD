package com.example.acwrmfryd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PeopleExpendAdapter extends BaseExpandableListAdapter{
    private String[] peopleName;
    private String[][] peopledetail;
    private int[] peoplePic;
    LayoutInflater inflater;
    public PeopleExpendAdapter(Context context, String[] Name, String[][] peopledetail, int[] peoplePic)
    {
        this.inflater = LayoutInflater.from(context);
        this.peopleName= Name;
        this.peopledetail= peopledetail;
        this.peoplePic=peoplePic;
    }


    @Override
    public int getGroupCount() {
        return peopleName.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return peopledetail[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return peopleName[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return peopledetail[groupPosition][childPosition];
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
        convertView = inflater.inflate(R.layout.group_people, null);
        TextView textView = convertView.findViewById(R.id.peoplegrouptext);
        textView.setText(getGroup(groupPosition).toString());
        ImageView imageView = convertView.findViewById(R.id.peoplegroupimage);
        imageView.setImageResource(peoplePic[groupPosition]);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.child_people, null);
        TextView textView = convertView.findViewById(R.id.peopledetail);
        textView.setText(getChild(groupPosition,childPosition).toString());
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
