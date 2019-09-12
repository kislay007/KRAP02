package com.example.krap;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class CartRecyclerViewAdapter extends RecyclerView.Adapter<CartRecyclerViewAdapter.ViewHolder> {
    Context mContext;
    ArrayList<String>arrayList;

    @NonNull
    @Override
    public CartRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       LayoutInflater layoutInflater= LayoutInflater.from(mContext);
       View view=layoutInflater.inflate(R.layout.recycler_view_cart_item,viewGroup,false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.add_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("Order_Review_Activity");
                intent.putExtra("CartOptions", "RemoveSingleItem");
                intent.putExtra("no_of_product",cartProductArrayList.get(i).getNumber_of_product());
                intent.putExtra("Cart_ID", cartProductArrayList.get(i).getCart_ID());
                LocalBroadcastManager.getInstance(mContext).sendBroadcast(intent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Button add_Button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            add_Button=(Button)itemView.findViewById(R.id.add);

        }

    }
}
