package org.etiya.services.abstracts;

import org.etiya.core.services.GenericServices;
import org.etiya.entities.concretes.Punishment;

import java.util.Date;

public interface PunishmentService extends GenericServices<Punishment> {
    boolean checkIfBorrowEndDatePassedTreeDay(Date endDate);
}
