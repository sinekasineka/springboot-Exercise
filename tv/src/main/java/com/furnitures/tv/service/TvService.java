package com.furnitures.tv.service;

import com.furnitures.tv.entity.Tv;
import com.furnitures.tv.repository.TvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TvService {
    @Autowired
    private TvRepository tvRepository;

    public String save(Tv tv) {
        tvRepository.saveAndFlush(tv);
        return "success";
    }

    public List<Tv> getAll() {
        return tvRepository.findAll();
    }

    public Optional<Tv> getById(Integer id) {
        return tvRepository.findById(id);


    }

    public String save(List<Tv> tv) {
        Tv TV;
        for (Tv a : tv) {
            TV = new Tv();
            TV.setId(a.getId());
            TV.setTvName(a.getTvName());
            TV.setTvBrand(a.getTvBrand());
            TV.setTvSize(a.getTvSize());
            TV.setTvPrice(a.getTvPrice());
            TV.setTvColour(a.getTvColour());
            tvRepository.saveAndFlush(TV);

        }

        return "success";


    }


}

