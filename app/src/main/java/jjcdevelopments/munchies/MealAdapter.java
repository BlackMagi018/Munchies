package jjcdevelopments.munchies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jeremiah on 4/18/2017.
 */
public class MealAdapter extends BaseAdapter {

    private static ArrayList<Meal> Meals;
    private LayoutInflater Inflater;

    public MealAdapter(Context context, ArrayList<Meal> results) {
        Meals = results;
        Inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return Meals.size();
    }

    @Override
    public Object getItem(int position) {
        return Meals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = Inflater.inflate(R.layout.activity_mealentry, null);
            holder = new ViewHolder();
            holder.mName =(TextView) convertView.findViewById(R.id.mName);
            holder.mAddr = (TextView) convertView.findViewById(R.id.mAddr);
            holder.mAddr2 = (TextView) convertView.findViewById(R.id.mAddr2);
            holder.mDate = (TextView) convertView.findViewById(R.id.mDate);
            holder.mTime = (TextView) convertView.findViewById(R.id.mTime);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mName.setText(Meals.get(position).getName());
        holder.mAddr.setText(Meals.get(position).getAddr());
        holder.mAddr2.setText(Meals.get(position).getAddr2());
        holder.mDate.setText(Meals.get(position).getDay());
        holder.mTime.setText(Meals.get(position).getTime());
        return convertView;
    }

    static class ViewHolder {
        TextView mName;
        TextView mAddr;
        TextView mAddr2;
        TextView mDate;
        TextView mTime;
    }
}
