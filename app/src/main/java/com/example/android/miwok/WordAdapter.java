package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



/*
* {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Word} objects.
* */

public class WordAdapter extends ArrayAdapter<Word> {
    //Holds the background color Resource Id to be applied on list of Words.
    private static int mListItemColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int listItemColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mListItemColor = listItemColor;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        //Find the TextView in the list_item.xml by Id text_view_1
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.text_view_1);

        //Get the miwok translation from current Word object
        //Set the text on the miwok TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //Find the TextView in the list_item.xml by ID text_view_2
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_view_2);

        //Get the default translation from current Word object
        //Set the text on the default TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //Find the ImageView in list_item.xml by Id Image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        //Check if there is a valid Image Resource id associated with the word object.
        if (currentWord.hasImage()) {
            //Set the image for each word
            imageView.setImageResource(currentWord.getImageResourceId());
            //Set the visibility to be true
            imageView.setVisibility(View.VISIBLE);
        } else {
            //Set the visibility to be gone.
            imageView.setVisibility(View.GONE);
        }
        //Find the Vertical LinearLayout container that contains TextViews*/
        View verticalListView = listItemView.findViewById(R.id.list_item_vertical);
        //Set the listItemColor as background color on verticalListView*/
        verticalListView.setBackgroundColor(ContextCompat.getColor(getContext(), mListItemColor));

        //returns the whole list_item layout(Containing two TextViews)
        return listItemView;
    }
}
