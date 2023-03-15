package br.com.etecia.recyclerviewfilmes;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //criar classe viewHolder

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView idTituloFilmes;
        ImageView idImagemFilmes;
        CardView idCardFilmes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTituloFilmes = itemView.findViewById(R.id.idTituloFilmes);
            idImagemFilmes = itemView.findViewById(R.id.idImagemFilmes);
            idCardFilmes = idImagemFilmes.findViewById(R.id.idCardFilmes);
        }
    }

}
