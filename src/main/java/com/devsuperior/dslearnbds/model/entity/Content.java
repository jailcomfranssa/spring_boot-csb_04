package com.devsuperior.dslearnbds.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson{

    private static final long serialVersionUID=1L;

    private String textContent;
    private String videiUri;

    public Content(){}

    public Content(Long id, String title, Integer position, Section section, String textContent, String videiUri) {
        super(id, title, position, section);
        this.textContent = textContent;
        this.videiUri = videiUri;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getVideiUri() {
        return videiUri;
    }

    public void setVideiUri(String videiUri) {
        this.videiUri = videiUri;
    }
}
