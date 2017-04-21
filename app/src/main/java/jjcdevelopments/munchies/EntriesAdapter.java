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
 * Created by Jeremiah on 3/16/2017.
 */

public class EntriesAdapter extends BaseAdapter {

    /** List of Entries */
    private static ArrayList<Entries> Entries;
    /** Layout Inflater */
    private LayoutInflater Inflater;

    /**
     * Creates adapter to enter Entries into the listview
     * @param context - application state
     * @param results - ArrayList passed from MapsActivity
     */
    public EntriesAdapter(Context context, ArrayList<Entries> results) {
        Entries = results;
        Inflater = LayoutInflater.from(context);
    }

    /**
     * Returns the number of element in Entries
     * @return Entries size
     */
    public int getCount() {
        return Entries.size();
    }

    /**
     * Return Entry in Entries
     * @param position - position in ListView
     * @return Entry at position in Entries
     */
    public Object getItem(int position) {
        return Entries.get(position);
    }

    /**
     * Returns Itemid
     * @param position - Position in ListView
     * @return position - Item number
     */
    public long getItemId(int position) {
        return position;
    }

    /**
     * Creates the item to put into the ListView
     * @param position - element's position in Entries
     * @param convertView - View object
     * @param parent - ViewGroup object
     * @return View - ListView item changed to the layout of mapentry
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = Inflater.inflate(R.layout.activity_mapentry, null);
            holder = new ViewHolder();
            holder.marker =(ImageView) convertView.findViewById(R.id.marker);
            holder.bname = (TextView) convertView.findViewById(R.id.bname);
            holder.baddr = (TextView) convertView.findViewById(R.id.baddress);
            holder.bcuis = (TextView) convertView.findViewById(R.id.bcuisine);
            holder.bprice = (TextView) convertView.findViewById(R.id.bprice);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.marker.setImageResource(R.drawable.marker);
        holder.bname.setText(Entries.get(position).getName());
        holder.baddr.setText(Entries.get(position).getAddr());
        holder.bcuis.setText(Entries.get(position).getType());
        holder.bprice.setText(Entries.get(position).getPrice());

        return convertView;
    }

    /**
     * Class to hold the layout element data
     */
    static class ViewHolder {
        ImageView marker;
        TextView bname;
        TextView baddr;
        TextView bcuis;
        TextView bprice;
    }
}
