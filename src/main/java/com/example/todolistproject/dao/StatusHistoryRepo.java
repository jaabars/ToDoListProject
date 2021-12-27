package com.example.todolistproject.dao;

import com.example.todolistproject.model.entity.StatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface StatusHistoryRepo  extends JpaRepository<StatusHistory,Long> {

    StatusHistory findByTaskIdAndEndDateIsNull(Long taskId);
}
