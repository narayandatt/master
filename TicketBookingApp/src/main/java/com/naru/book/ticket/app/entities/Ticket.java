package com.naru.book.ticket.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;
	
	@Column(name="passenger_name",nullable=false)
	private String name;
	
	@Column(name="source_station")
	private String source;
	
	@Column(name="dest_station")
	private String destination;
	
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="email")
	private String email;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
