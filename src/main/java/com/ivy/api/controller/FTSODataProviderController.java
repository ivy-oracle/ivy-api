package com.ivy.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivy.api.dto.FTSODataProviderDTO;
import com.ivy.api.service.FTSODataProviderService;

@RestController
@RequestMapping("ftso/data-provider")
public class FTSODataProviderController {

    private final FTSODataProviderService ftsoDataProviderService;

    public FTSODataProviderController(FTSODataProviderService ftsoDataProviderService) {
        this.ftsoDataProviderService = ftsoDataProviderService;
    }

    @GetMapping()
    ResponseEntity<List<FTSODataProviderDTO>> getDataProviders() {
        var providers = this.ftsoDataProviderService.getAllFTSODataProviders();
        return ResponseEntity.ok(providers);
    }
}
