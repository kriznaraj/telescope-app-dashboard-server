package com.telescope.app.controller;


import com.telescope.app.model.tpv.Tpv;
import com.telescope.app.model.tpv.TpvClassification;
import com.telescope.app.model.tpv.TpvGrowth;
import com.telescope.app.service.TpvService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tpv")
public class TpvController {

    private final TpvService tpvService;

    public TpvController(TpvService tpvService) {

        this.tpvService = tpvService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Tpv>> getTpv() {
        return ResponseEntity.ok(tpvService.getTpv());
    }

    @GetMapping(value = "/classification")
    public ResponseEntity<List<TpvClassification>> getTpvClassification() {
        return ResponseEntity.ok(tpvService.getTpvClassification());
    }

    @GetMapping(value = "/growth")
    public ResponseEntity<List<TpvGrowth>> getTpvGrowth() {
        return ResponseEntity.ok(tpvService.getTpvGrowth());
    }

}
