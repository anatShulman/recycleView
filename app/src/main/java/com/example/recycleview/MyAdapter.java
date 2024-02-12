package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<CardItem> cardItemList;
    private List<CardItem> cardItemListFull;
    private Context context;

    public MyAdapter(List<CardItem> cardItemList, Context context) {
        this.cardItemList = cardItemList;
        this.cardItemListFull = new ArrayList<>(cardItemList);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardItem cardItem = cardItemList.get(position);
        holder.imageView.setImageResource(cardItem.getImageResource());
        holder.titleTextView.setText(cardItem.getTitle());
        holder.descriptionTextView.setText(cardItem.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = LayoutInflater.from(context);
                View toastLayout = inflater.inflate(R.layout.toast_layout, null);

                TextView textViewToast = toastLayout.findViewById(R.id.textViewToast);
                textViewToast.setText(cardItem.getTitle() + ": " + cardItem.getDescription());

                Toast toast = new Toast(context);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(toastLayout);
                toast.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cardItemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView titleTextView;
        public TextView descriptionTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleTextView = itemView.findViewById(R.id.textView);
            descriptionTextView = itemView.findViewById(R.id.textView2);
        }
    }

};
