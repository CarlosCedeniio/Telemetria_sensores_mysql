package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Sensor1;
import com.example.easynotes.model.Sensor2;
import com.example.easynotes.model.Sensor3;
import com.example.easynotes.repository.SensorRepository1;
import com.example.easynotes.repository.SensorRepository2;
import com.example.easynotes.repository.SensorRepository3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


@RestController
//@RequestMapping("/incoming")
public class SensorController {


    @Autowired
    SensorRepository1 sensorRepository1;
    @Autowired
    SensorRepository2 sensorRepository2;
    @Autowired
    SensorRepository3 sensorRepository3;

    //Metodos para el sensor 1
    @GetMapping("/sensor1/all")
    public List<Sensor1> getAllData1() {
        return sensorRepository1.findAll();
    }

    @GetMapping("/sensor1/{id}")
    public Sensor1 getSensorByID1(@PathVariable(value = "id") Long sensorID) {
        return sensorRepository1.findById(sensorID)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "id", sensorID));
    }

    @PostMapping("/sensor1")
    public Sensor1 createSensorData1(@Valid @RequestBody Sensor1 sensor1) {
        Sensor1 actual = sensorRepository1.save(sensor1);
        return actual;
    }

    @GetMapping("/sensor1/deleteAll")
    public String deleteAll1() {
        sensorRepository1.deleteAll();
        return "OK!";
    }

    @DeleteMapping("/sensor1/{id}")
    public ResponseEntity<?> deleteNote1(@PathVariable(value = "id") Long sensorID) {
        Sensor1 sensor = sensorRepository1.findById(sensorID)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "id", sensorID));

        sensorRepository1.delete(sensor);

        return ResponseEntity.ok().build();
    }

    //Metodos para el sensor2
    @GetMapping("/sensor2/all")
    public List<Sensor2> getAllData2() {
        return sensorRepository2.findAll();
    }

    @GetMapping("/sensor2/{id}")
    public Sensor2 getSensorByID2(@PathVariable(value = "id") Long sensorID) {
        return sensorRepository2.findById(sensorID)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "id", sensorID));
    }

    @PostMapping("/sensor2")
    public Sensor2 createSensorData(@Valid @RequestBody Sensor2 sensor2) {
        Sensor2 actual = sensorRepository2.save(sensor2);
        return actual;
    }

    @GetMapping("/sensor2/deleteAll")
    public String deleteAll2() {
        sensorRepository2.deleteAll();
        return "OK!";
    }

    @DeleteMapping("/sensor2/{id}")
    public ResponseEntity<?> deleteNote2(@PathVariable(value = "id") Long sensorID) {
        Sensor2 sensor = sensorRepository2.findById(sensorID)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "id", sensorID));

        sensorRepository2.delete(sensor);

        return ResponseEntity.ok().build();
    }

    //Metodos para el sensor3

    @GetMapping("/sensor3/all")
    public List<Sensor3> getAllData3() {
        return sensorRepository3.findAll();
    }

    @GetMapping("/sensor3/{id}")
    public Sensor3 getSensorByID3(@PathVariable(value = "id") Long sensorID) {
        return sensorRepository3.findById(sensorID)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "id", sensorID));
    }

    @PostMapping("/sensor3")
    public Sensor3 createSensorData(@Valid @RequestBody Sensor3 sensor3) {
        Sensor3 actual = sensorRepository3.save(sensor3);
        return actual;
    }

    @GetMapping("/sensor3/deleteAll")
    public String deleteAll3() {
        sensorRepository3.deleteAll();
        return "OK!";
    }

    @DeleteMapping("/sensor3/{id}")
    public ResponseEntity<?> deleteNote3(@PathVariable(value = "id") Long sensorID) {
        Sensor3 sensor = sensorRepository3.findById(sensorID)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "id", sensorID));

        sensorRepository3.delete(sensor);

        return ResponseEntity.ok().build();
    }

}





//    public void setNotification(String bateria) {
//        try {
//
//            URL url = new URL("https://fcm.googleapis.com/fcm/send");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setDoOutput(true);
//            conn.setRequestMethod("POST");
//
//            conn.setRequestProperty("Content-Type", "application/json");
//            conn.setRequestProperty("Authorization", "key=AIzaSyCjogHet9iSGwjNRpJ5qh9AcT6LP8Ulgfg");
//            String option="/topics/all";
//            String input = "{\n" +
//                    " \"to\" : \"/topics/all\",\n" +
//                    " \"collapse_key\" : \"type_a\",\n" +
//                    " \"notification\" : {\n" +
//                    "     \"body\" : \"Batería actual: "+bateria+"\",\n" +
//                    "     \"title\": \"Alerta de bateria\"\n" +
//                    " }\n" +
//                    "}";
//
//            OutputStream os = conn.getOutputStream();
//            os.write(input.getBytes());
//            os.flush();
//
////            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
////                throw new RuntimeException("Failed : HTTP error code : "
////                        + conn.getResponseCode());
////            }
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(
//                    (conn.getInputStream())));
//
//            String output;
//            System.out.println("Output from Server .... \n");
//            while ((output = br.readLine()) != null) {
//                System.out.println(output);
//            }
//
//            conn.disconnect();
//
//        } catch (MalformedURLException e) {
//
//            e.printStackTrace();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//
//    }
//
//}


