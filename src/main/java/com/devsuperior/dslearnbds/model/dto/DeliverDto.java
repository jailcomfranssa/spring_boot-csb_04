package com.devsuperior.dslearnbds.model.dto;

import com.devsuperior.dslearnbds.model.entity.Deliver;
import com.devsuperior.dslearnbds.model.enums.DeliverStatus;

import java.io.Serializable;
import java.time.Instant;

public class DeliverDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    public DeliverDto() {
    }

    public DeliverDto(DeliverStatus status, String feedback, Integer correctCount) {
        this.status = status;
        this.feedback = feedback;
        this.correctCount = correctCount;
    }

    public DeliverStatus getStatus() {
        return status;
    }

    public void setStatus(DeliverStatus status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(Integer correctCount) {
        this.correctCount = correctCount;
    }
}



































