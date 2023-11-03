package com.seba.a.lot.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Date;
// ROW IN THE TABLE
// OBJECT CREATED FROM A ROW

@Entity
@Table(name = "things")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Thing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long thing_id;

    private String thing_name;

    private Date checked_out;

    private Date checked_in;

//    private Long checked_out_user_id;

    public long getThing_id() {
        return thing_id;
    }

    public void setThing_id(long thing_id) {
        this.thing_id = thing_id;
    }

    public String getThing_name() {
        return thing_name;
    }

    public void setThing_name(String thing_name) {
        this.thing_name = thing_name;
    }

    public Date getChecked_out() {
        return checked_out;
    }

    public void setChecked_out(Date checked_out) {
        this.checked_out = checked_out;
    }

    public Date getChecked_in() {
        return checked_in;
    }

    public void setChecked_in(Date checked_in) {
        this.checked_in = checked_in;
    }

//    public long getChecked_out_user_id() {
//        return checked_out_user_id;
//    }

//    public void setChecked_out_user_id(long checked_out_user_id) {
//        this.checked_out_user_id = checked_out_user_id;
//    }

    public void setThing(String thing) {
    } // see ThingsRepositoryCustom!!

    @Override
    public String toString() {
        return "Thing{" +
                "id=" + thing_id +
                ", thing name='" + thing_name + '\'' +
//                ", user='" + checked_out_user_id + '\'' +
                '}';
    }
}