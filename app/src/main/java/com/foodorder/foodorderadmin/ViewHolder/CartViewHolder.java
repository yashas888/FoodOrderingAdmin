package com.foodorder.foodorderadmin.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.foodorder.foodorderadmin.R;


public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
    public TextView txtProductName,txtProductPrice,txtProductQuantity,txtProductDiscount;
    public ImageView cartProductImg;
    public Button edit,remove;


    public CartViewHolder(@NonNull View itemView) {
        super(itemView);

        txtProductName=itemView.findViewById(R.id.cart_product_name);
        txtProductPrice=itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity=itemView.findViewById(R.id.cart_product_quantity);
        cartProductImg=itemView.findViewById(R.id.cart_product_Image);
        txtProductDiscount=itemView.findViewById(R.id.cart_product_discount_price);
        edit=itemView.findViewById(R.id.edit);
        remove=itemView.findViewById(R.id.remove);
    }


    @Override
    public void onClick(View v) {

    }
}
