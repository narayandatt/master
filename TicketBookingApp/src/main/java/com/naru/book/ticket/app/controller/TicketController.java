package com.naru.book.ticket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naru.book.ticket.app.entities.Ticket;
import com.naru.book.ticket.app.service.TicketService;

@RestController
@RequestMapping("api/ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;

	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}
	
	@GetMapping(value="/get/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketService.getTicketById(ticketId);
		
	}
	@GetMapping(value="/get/alltickets")
	public Iterable<Ticket> getAllTicket(){
		return ticketService.getAllTickets();
	}
	
	@DeleteMapping(value="/delete/{ticketId}")
	public void getAllTicket(@PathVariable("ticketId") Integer ticketId){
		 ticketService.deleteTickets(ticketId);
	}
	
	@PutMapping(value="/update/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail") String newEmail) {
		return ticketService.updateTicket(ticketId,newEmail);
	}
	
}
