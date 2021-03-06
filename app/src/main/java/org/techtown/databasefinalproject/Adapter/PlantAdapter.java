package org.techtown.databasefinalproject.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.techtown.databasefinalproject.Model.Plant;
import org.techtown.databasefinalproject.R;
import org.techtown.databasefinalproject.SecondaryDescriptionActivity;

import java.util.ArrayList;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.ViewHolder> {
    private ArrayList<Plant> data = null;

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView location;

        ViewHolder(View item) {
            super(item);

            imageView = item.findViewById(R.id.item_imageView_image);
            name = item.findViewById(R.id.item_textView_name);
            location = item.findViewById(R.id.item_textView_location);

            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                        Plant plant = data.get(pos);
                        //아이템을 얻는 부분.

                        Intent intent = new Intent(v.getContext(), SecondaryDescriptionActivity.class);
                        intent.putExtra("object", plant);
                        v.getContext().startActivity(intent);
                    }
                }
            });
        }
    }

    public PlantAdapter(ArrayList<Plant> list) {
        data = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item, viewGroup, false);
        PlantAdapter.ViewHolder vh = new PlantAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.name.setText(data.get(i).getName());
        viewHolder.location.setText(data.get(i).getSpecies());
        setImage(viewHolder.imageView, data.get(i).getSpecies());
    }

    private void setImage(ImageView imageView, String species) {
        switch(species){
            case "관속식물류":
                imageView.setImageResource(R.drawable.fern);
                break;
            case "균류":
                imageView.setImageResource(R.drawable.mush);
                break;
            case "돌말류":
            case "유글레나조류":
            case "윤조류":
            case "녹조류":
                imageView.setImageResource(R.drawable.green);
                break;
            default:
                imageView.setImageResource(R.drawable.plant);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
