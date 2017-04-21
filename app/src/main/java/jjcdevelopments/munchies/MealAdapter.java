package jjcdevelopments.munchies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jeremiah on 4/18/2017.
 */
public class MealAdapter extends BaseAdapter {

    /** List of Meals */
    private static ArrayList<Meal> Meals;
    /** Layout Inflater */
    private LayoutInflater Inflater;

    /**
     * Creates adapter to enter Meals into the listview
     * @param context - application state
     * @param results - ArrayList passed from MapsActivity
     */
    public MealAdapter(Context context, ArrayList<Meal> results) {
        Meals = results;
        Inflater = LayoutInflater.from(context);
    }

    /**
     * Returns the number of element in Meals
     * @return Meals size
     */
    @Override
    public int getCount() {
        return Meals.size();
    }

    /**
     * Return Entry in Meals
     * @param position - position in ListView
     * @return Meal at position in Meals
     */
    @Override
    public Object getItem(int position) {
        return Meals.get(position);
    }

    /**
     * Returns Itemid
     * @param position - Position in ListView
     * @return position - Item number
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * Creates the item to put into the ListView
     * @param position - element's position in Entries
     * @param convertView - View object
     * @param parent - ViewGroup object
     * @return View - ListView item changed to the layout of mealentry
     */
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

    /**
     * Class to hold the layout element data
     */
    static class ViewHolder {
        TextView mName;
        TextView mAddr;
        TextView mAddr2;
        TextView mDate;
        TextView mTime;
    }
}
