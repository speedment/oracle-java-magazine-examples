package com.company.sakila.db0.sakila.film_actor.generated;

import com.company.sakila.db0.sakila.actor.Actor;
import com.company.sakila.db0.sakila.film.Film;
import com.company.sakila.db0.sakila.film_actor.FilmActor;
import com.speedment.runtime.core.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.db0.sakila.film_actor.FilmActor}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmActorImpl implements FilmActor {
    
    private int actorId;
    private int filmId;
    private Timestamp lastUpdate;
    
    protected GeneratedFilmActorImpl() {
        
    }
    
    @Override
    public int getActorId() {
        return actorId;
    }
    
    @Override
    public int getFilmId() {
        return filmId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public FilmActor setActorId(int actorId) {
        this.actorId = actorId;
        return this;
    }
    
    @Override
    public FilmActor setFilmId(int filmId) {
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public FilmActor setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Actor findActorId(Manager<Actor> foreignManager) {
        return foreignManager.stream().filter(Actor.ACTOR_ID.equal(getActorId())).findAny().orElse(null);
    }
    
    @Override
    public Film findFilmId(Manager<Film> foreignManager) {
        return foreignManager.stream().filter(Film.FILM_ID.equal(getFilmId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("actorId = "    + Objects.toString(getActorId()));
        sj.add("filmId = "     + Objects.toString(getFilmId()));
        sj.add("lastUpdate = " + Objects.toString(getLastUpdate()));
        return "FilmActorImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof FilmActor)) { return false; }
        final FilmActor thatFilmActor = (FilmActor)that;
        if (this.getActorId() != thatFilmActor.getActorId()) {return false; }
        if (this.getFilmId() != thatFilmActor.getFilmId()) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatFilmActor.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getActorId());
        hash = 31 * hash + Integer.hashCode(getFilmId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}