package com.devsuperior.dslearnbds.repository;

import com.devsuperior.dslearnbds.model.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<Reply,Long> {
}
