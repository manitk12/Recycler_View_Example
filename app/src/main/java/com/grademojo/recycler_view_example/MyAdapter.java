package com.grademojo.recycler_view_example;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private List<Simple_pojo> values;


    public class ViewHolder extends RecyclerView.ViewHolder{


        public TextView txtHeader;
        public TextView textFooter;
        public TextView textBody;

        public View layout;



        public ViewHolder(View itemView) {

            super(itemView);

            layout = itemView;
            txtHeader = (TextView) itemView.findViewById(R.id.firstLine);
            textFooter = (TextView) itemView.findViewById(R.id.secondLine);
            textBody = (TextView) itemView.findViewById(R.id.ThirdLine);


        }
    }





    public MyAdapter(List<Simple_pojo > mydataset){

        values = mydataset;
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.row_layout,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }


    public void onBindViewHolder(ViewHolder holder, final int position) {

        final String name = values.get(position).getValues();

        final String Header = values.get(position).getHeader();

        final String Body = values.get(position).getBody();

//        holder.txtHeader.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                remove(position);
//            }
//        });

        holder.textFooter.setText("Footer :"+name);

        holder.txtHeader.setText("Header :"+Header);

        holder.textBody.setText("relative :"+Body);

    }


    public int getItemCount() {

        return values.size();
    }





//    public void remove(int position){
//
//        values.remove(position);
//        notifyItemRemoved(position);
//
//    }
}
