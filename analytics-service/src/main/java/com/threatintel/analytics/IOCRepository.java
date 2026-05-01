package com.threatintel.analytics;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IOCRepository extends JpaRepository<IOCEntity, Long> {
}