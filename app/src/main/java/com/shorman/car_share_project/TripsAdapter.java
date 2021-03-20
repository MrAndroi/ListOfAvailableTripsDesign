package com.shorman.car_share_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class TripsAdapter extends RecyclerView.Adapter<TripsAdapter.ViewHolder> {

    private Trip[] localDataSet;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView driverName;
        private final TextView carColor;
        private final TextView tripTime;
        private final TextView carType;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            driverName = (TextView) view.findViewById(R.id.tvTripDriver);
            carColor = (TextView) view.findViewById(R.id.tvCarColor);
            tripTime = (TextView) view.findViewById(R.id.tvTripTime);
            carType = (TextView) view.findViewById(R.id.tvCarType);
        }

    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public TripsAdapter(Trip[] dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.trip_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Trip tripItem = localDataSet[position];
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.driverName.setText(tripItem.getDriverName());
        viewHolder.carColor.setText(tripItem.getCarColor());
        viewHolder.carType.setText(tripItem.getCarType());
        viewHolder.tripTime.setText(tripItem.getTripTime());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}

