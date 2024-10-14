package com.example.khatabook.bill.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.khatabook.R;

public class BillAdapter extends RecyclerView.Adapter<BillAdapter.Viewholder> {

Context context;

public BillAdapter(Context context) {
    this.context = context;
}

@NonNull
@Override
public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_bill, parent, false);
    return new Viewholder(view);
}

@Override
public void onBindViewHolder(@NonNull Viewholder holder, int position) {

}

@Override
public int getItemCount() {
    return 10;
}

public class Viewholder extends RecyclerView.ViewHolder {
    private ImageView imgBill;
    private TextView name;
    private TextView type;
    private TextView amount;
    private TextView payment_status;
    public Viewholder(@NonNull View itemView) {
        super(itemView);
        imgBill = itemView.findViewById(R.id.img_bill);
        name = itemView.findViewById(R.id.name);
        type = itemView.findViewById(R.id.type);
        amount = itemView.findViewById(R.id.amount);
        payment_status = itemView.findViewById(R.id.payment_status);

    }
}
}
