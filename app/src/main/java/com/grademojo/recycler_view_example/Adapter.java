package com.grademojo.recycler_view_example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<Pojo_practice> values;


    public class ViewHolder extends RecyclerView.ViewHolder{


        public TextView txtFirst;
        public TextView textSecond;


        public View layout;



        public ViewHolder(View itemView) {

            super(itemView);

            layout = itemView;
            txtFirst = (TextView) itemView.findViewById(R.id.text_first);
            textSecond = (TextView) itemView.findViewById(R.id.Text_second);



            txtFirst.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    remove(getAdapterPosition());
                }
            });
        }
    }





    public Adapter(List<Pojo_practice > mydataset){

        values = mydataset;
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.aa,parent,false);

        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder(view);

        return viewHolder;
    }


    public void onBindViewHolder(ViewHolder holder, final int position) {

        final String name = values.get(position).getValues();

        final String name2 = values.get(position).getValues2();





        holder.txtFirst.setText("name :"+name);

        holder.textSecond.setText("name2 :"+name2);



    }


    public int getItemCount() {

        return values.size();
    }





    public void remove(int position){

        values.remove(position);
        notifyItemRemoved(position);

    }
}
