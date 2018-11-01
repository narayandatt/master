package com.naru.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naru.book.ticket.app.dao.TicketDao;
import com.naru.book.ticket.app.entities.Ticket;

@Service
public class TicketService {

	
	@Autowired
	private TicketDao ticketDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketDao.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		
		return ticketDao.findById(ticketId).get();
		 
	}

	public Iterable<Ticket> getAllTickets() {
		return ticketDao.findAll();
	}

	public void deleteTickets(Integer id) {
		 ticketDao.deleteById(id);;
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticket=ticketDao.findById(ticketId).get();
		ticket.setEmail(newEmail);
		ticketDao.save(ticket);
		return ticket;
	}

}
