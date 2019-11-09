package com.example.easynotes.repository;

import com.example.easynotes.model.Sensor2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Carlos Cedeño Zamora.
 */

@Repository
public interface SensorRepository2 extends JpaRepository<Sensor2, Long> {

}
