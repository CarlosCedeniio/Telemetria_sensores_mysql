package com.example.easynotes.repository;

import com.example.easynotes.model.Sensor1;
import com.example.easynotes.model.Sensor3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Carlos Cedeño Zamora.
 */

@Repository
public interface SensorRepository3 extends JpaRepository<Sensor3, Long> {

}
