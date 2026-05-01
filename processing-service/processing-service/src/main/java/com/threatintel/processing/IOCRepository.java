package com.threatintel.processing;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IOCRepository extends JpaRepository<IOCEntity, Long> {
}