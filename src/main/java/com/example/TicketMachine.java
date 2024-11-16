package com.example;

public class TicketMachine {

    public String getDetails(Ticket ticket) {

        if (ticket instanceof AdultTicket(var price)) {
            return "Adult ticket has price " + price;
        }
        else if (ticket instanceof ChildTicket(var price)){
            return "Child ticket has price " + price;
        }
        return "Unknown ticket type";
    }

}
