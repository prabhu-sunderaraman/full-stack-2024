package com.indium.springbootjpaapp.lab03.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "summary")
public class Summary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int duration;

    @Column
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "id=" + id +
                ", duration=" + duration +
                ", count=" + count +
                '}';
    }
}
