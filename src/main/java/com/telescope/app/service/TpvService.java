package com.telescope.app.service;

import com.telescope.app.model.tpv.Tpv;
import com.telescope.app.model.tpv.TpvClassification;
import com.telescope.app.model.tpv.TpvGrowth;
import com.telescope.app.repository.tpv.TpvClassificationRepository;
import com.telescope.app.repository.tpv.TpvGrowthRepository;
import com.telescope.app.repository.tpv.TpvRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TpvService {

    private final TpvRepository tpvRepository;
    private final TpvGrowthRepository tpvGrowthRepository;
    private final TpvClassificationRepository tpvClassificationRepository;

    public TpvService(TpvRepository tpvRepository,
                      TpvGrowthRepository tpvGrowthRepository,
                      TpvClassificationRepository tpvClassificationRepository) {
        this.tpvRepository = tpvRepository;
        this.tpvGrowthRepository = tpvGrowthRepository;
        this.tpvClassificationRepository = tpvClassificationRepository;
    }

    public List<Tpv> getTpv() {
        return tpvRepository.findAll();
    }

    public List<TpvClassification> getTpvClassification() {
        return tpvClassificationRepository.findAll();
    }

    public List<TpvGrowth> getTpvGrowth() {
        return tpvGrowthRepository.findAll();
    }
}
