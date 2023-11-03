package com.seba.a.lot.repositories;

import com.seba.a.lot.models.Thing;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ThingsRepositoryCustom {
    private final JdbcTemplate jdbcTemplate;

    public ThingsRepositoryCustom(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Thing> findAllThings() {
        String sql = "SELECT * FROM things";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Thing thing = new Thing();
            thing.setThing_id(rs.getLong("thing_id"));
            thing.setThing_name(rs.getString("thing_name"));
            return thing;
        });
    }
}
