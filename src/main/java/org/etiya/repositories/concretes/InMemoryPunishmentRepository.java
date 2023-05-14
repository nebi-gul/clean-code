package org.etiya.repositories.concretes;

import org.etiya.entities.concretes.Punishment;
import org.etiya.repositories.abstracts.PunishmentRepositoriy;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPunishmentRepository implements PunishmentRepositoriy {
    List<Punishment> punishments = new ArrayList<>();
    @Override
    public void add(Punishment entity) {
        punishments.add(entity);

    }

    @Override
    public void update(Punishment entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Punishment getById(int id) {
        return null;
    }

    @Override
    public List<Punishment> getAll() {
        return punishments;
    }
}
