package com.devsuperior.dslearnbds.service.impl;

import com.devsuperior.dslearnbds.model.dto.DeliverDto;
import com.devsuperior.dslearnbds.model.entity.Deliver;
import com.devsuperior.dslearnbds.repository.DeliverRepository;
import com.devsuperior.dslearnbds.service.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverServiceImpl implements DeliverService {

    private final DeliverRepository deliverRepository;

    @Autowired
    public DeliverServiceImpl(DeliverRepository deliverRepository) {
        this.deliverRepository = deliverRepository;
    }


    @Transactional
    @Override
    public void saveRevision(Long id, DeliverDto deliverDto) {
        Deliver deliver = deliverRepository.getOne(id);
        deliver.setStatus(deliverDto.getStatus());
        deliver.setFeedback(deliverDto.getFeedback());
        deliver.setCorrectCount(deliverDto.getCorrectCount());
        deliverRepository.save(deliver);

    }
}




































