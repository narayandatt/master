package com.naru.book.ticket.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naru.book.ticket.app.entities.Ticket;
import com.naru.book.ticket.app.service.TicketService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private TicketService ticketService;
	
	@Autowired
	private DataSource datasource;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		ctx.getBean("ticketService", TicketService.class);

		
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestination("Mumbai");
		ticket.setSource("Pune");
		ticket.setName("KK");
		ticket.setEmail("kk@yahoo.com");

		ticketService.createTicket(ticket);		
		
		System.out.println(datasource);
	}

}
