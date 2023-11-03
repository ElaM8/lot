package com.seba.a.lot;

import com.seba.a.lot.models.Thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController - @RespopnseBody semantics

@CrossOrigin(origins = "http://localhost:5173")
@Controller
public class ThingsController {

    @Autowired
    private ThingsService thingsService;

    @ExceptionHandler
    public ResponseEntity<String> handleExceptions(Exception exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

// CREATE NOT WORKING
    @PostMapping("/thing")
    public ResponseEntity<Thing> createThing(@RequestBody Thing thing) {
        Thing newThing = thingsService.addThing(thing);
        return ResponseEntity.status(HttpStatus.CREATED).body(newThing);
    }

    // READ METHODS

    // GET ALL
    @GetMapping("/things")
    public ResponseEntity<List<Thing>> getThings() {
        return ResponseEntity.status(HttpStatus.OK).body(thingsService.getAllThings());
    }

    // GET BY ID
    @GetMapping("/thing/{id}")
    public ResponseEntity<Thing> getThingById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(thingsService.getThingById(id));
    }

    // GET USERS /things/users

    // UPDATE
    @PutMapping("/thing/{id}")
    public ResponseEntity<Thing> updateThing(@RequestBody Thing thing, @PathVariable long id) {
       Thing updatedThing = thingsService.updateThing(thing, id);
        return ResponseEntity.status(HttpStatus.OK).body(updatedThing);
    }

//    @GetMapping("/thing/{id}")
//    public ResponseEntity<String> thing() {
//        return ResponseEntity.status(HttpStatus.OK).body("thing for id");
//    }

}

