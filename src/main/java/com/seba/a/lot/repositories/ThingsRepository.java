package com.seba.a.lot.repositories;

import com.seba.a.lot.models.Thing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Table(name = "things")
@Repository
public interface ThingsRepository extends JpaRepository<Thing, Long> {
}


