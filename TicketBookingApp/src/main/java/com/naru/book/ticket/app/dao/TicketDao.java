package com.naru.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.naru.book.ticket.app.entities.Ticket;
@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
