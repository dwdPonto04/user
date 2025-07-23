package com.david.santos.user.infrastructure.repository;

import com.javanauta.aprendendospring.infrastructure.entity.NumberPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberPhoneRepository extends JpaRepository<NumberPhone, Long> {
}
