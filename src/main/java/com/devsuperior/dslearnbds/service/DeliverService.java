package com.devsuperior.dslearnbds.service;

import com.devsuperior.dslearnbds.model.dto.DeliverDto;

public interface DeliverService {

    public void saveRevision(Long id, DeliverDto deliverDto);
}
