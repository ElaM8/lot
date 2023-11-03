package com.seba.a.lot;

import com.seba.a.lot.models.Thing;
import com.seba.a.lot.repositories.ThingsRepository;
import com.seba.a.lot.repositories.ThingsRepositoryCustom;
import com.seba.a.lot.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThingsService {
    private static final Logger logger = LoggerFactory.getLogger(ThingsService.class);
    @Autowired
    ThingsRepository thingsRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ThingsRepositoryCustom thingsRepositoryCustom;

    public Thing addThing(Thing thing) {
        Thing newThing = thingsRepository.save(thing);
        System.out.println("new thing " + newThing);
        return newThing;
    }

        public List<Thing> getAllThings() {
            return thingsRepositoryCustom.findAllThings();
        }

    public Thing getThingById(long id) {
            return thingsRepository.findById(id).orElseThrow(() -> new NotFoundException("id not found"));
    }

    //UPDATE

    @Modifying
    public Thing updateThing(Thing thing, long id) {

        if (!thingsRepository.existsById(id))  {
            throw new NotFoundException("Thing to update id not found");
        }

        return thingsRepository.save(thing);

        // TODO: update the thing with a user when checked out (separate out the updated Thing variable, and then setter checkedOutUserId and update checked in/out Date.
    }
}




//    public List<Thing> getAllThings() {
//        logger.info("hello from getAllThings method");
//        logger.info(thingsRepository.findAll().toString());
//        return thingsRepository
//                .findAll()
//                .stream()
//                .collect(Collectors.toList());
//    }