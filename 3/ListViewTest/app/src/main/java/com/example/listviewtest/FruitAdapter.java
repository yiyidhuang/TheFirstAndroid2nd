package com.example.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId,
                        List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get current item's Fruit instance
        Fruit fruit = getItem(position);
        //View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
            // Store the ViewHolder into View
            view.setTag(viewHolder);
        } else {
            view = convertView;
            //Get viewHolder
            viewHolder = (ViewHolder) view.getTag();
        }
        //ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        //TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        //fruitImage.setImageResource(fruit.getImageId());
        //fruitName.setText(fruit.getName());

        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());

        return view;
    }

    class ViewHolder {
        ImageView fruitImage;

        TextView fruitName;
    }
}
