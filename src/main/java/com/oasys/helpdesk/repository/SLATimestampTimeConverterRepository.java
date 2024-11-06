package com.oasys.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oasys.helpdesk.entity.SLATimestampTimeConverterEntity;

@Repository
public interface SLATimestampTimeConverterRepository extends JpaRepository<SLATimestampTimeConverterEntity, Long> {

}