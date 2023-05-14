package org.etiya.services.concretes;

import org.etiya.core.util.DateUtil;
import org.etiya.entities.concretes.Punishment;
import org.etiya.repositories.abstracts.PunishmentRepositoriy;
import org.etiya.services.abstracts.PunishmentService;

import java.util.Date;
import java.util.List;

public class PunishmentManager implements PunishmentService {
    public final PunishmentRepositoriy punishmentRepositoriy;

    public PunishmentManager(PunishmentRepositoriy punishmentRepositoriy) {
        this.punishmentRepositoriy = punishmentRepositoriy;
    }

    @Override
    public void add(Punishment entity) {
        punishmentRepositoriy.add(entity);
        System.out.println("Punishment Added");

    }

    @Override
    public void update(Punishment entity) {

    }

    @Override
    public List<Punishment> getAll() {
        return punishmentRepositoriy.getAll();
    }

    @Override
    public Punishment getById(int id) {
        return null;
    }

    @Override
    public Punishment getByName(String name) {
        return null;
    }

    @Override
    public boolean checkIfBorrowEndDatePassedTreeDay(Date endDate) {
        if(DateUtil.dayDifferenceBetweenTwoDays(endDate,new Date()) >= 3){
            return true;
        }
        return false;
    }
}
