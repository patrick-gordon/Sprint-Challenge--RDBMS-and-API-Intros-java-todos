package com.lambdaschool.todos.model;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "todo")
public class todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    @Column(nullable = false)
    private String description;

    private int datestarted;

    private boolean completed;

    @OneToMany
    @JoinColumn(name = "userid",
                nullable = false)
    private long userid;

    public todo() {
    }

    public todo(int datestarted, boolean completed) {
        this.datestarted = datestarted;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDatestarted() {
        return datestarted;
    }

    public void setDatestarted(int datestarted) {
        this.datestarted = datestarted;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }
}
