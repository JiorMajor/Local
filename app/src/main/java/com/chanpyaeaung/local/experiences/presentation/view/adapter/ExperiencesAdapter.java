package com.chanpyaeaung.local.experiences.presentation.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chanpyaeaung.local.R;
import com.chanpyaeaung.local.experiences.presentation.model.ExperienceModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Chan Pyae Aung on 23/4/17.
 */

public class ExperiencesAdapter extends RecyclerView.Adapter {

    private ArrayList<ExperienceModel> experienceList;
    private Context context;

    public ExperiencesAdapter(ArrayList<ExperienceModel> experienceList) {
        this.experienceList = experienceList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cell_experience, parent, false);
        context = parent.getContext();
        return new ExperienceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ExperienceModel experience = experienceList.get(position);
        ExperienceViewHolder viewHolder = (ExperienceViewHolder) holder;

        viewHolder.tvTitle.setText(experience.getName());
        viewHolder.tvTagline.setText(experience.getTagline());
        viewHolder.tvPrice.setText(experience.getPriceDisplay());
        viewHolder.tvGuide.setVisibility(View.GONE);
        Picasso.with(context)
                .load(experience.getPhotoUrl())
                .into(viewHolder.ivPoster);

    }

    @Override
    public int getItemCount() {
        return experienceList.size();
    }


    public class ExperienceViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPoster;
        TextView tvTitle;
        TextView tvTagline;
        TextView tvPrice;
        TextView tvGuide;

        public ExperienceViewHolder(View itemView) {
            super(itemView);
            ivPoster = (ImageView) itemView.findViewById(R.id.ivPoster);
            tvTitle  = (TextView) itemView.findViewById(R.id.tvName);
            tvTagline = (TextView) itemView.findViewById(R.id.tvTag);
            tvPrice = (TextView) itemView.findViewById(R.id.tvPrice);
            tvGuide = (TextView) itemView.findViewById(R.id.tvGuide);
        }


    }

}
