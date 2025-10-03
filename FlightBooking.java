// Author: Sowndharyaa (s4090884)
	
// Contribution: FlightBooking class-Booking flight

import java.util.List;

public class FlightBooking {
    
    private PaymentGateway paymentGateway;
    private EmailService emailService;

    public FlightBooking(PaymentGateway paymentGateway, EmailService emailService) {
        this.paymentGateway = paymentGateway;
        this.emailService = emailService;
    }

    // Book flight
    public String bookFlight(Flight selectedFlight, Customer customer, BookingOptions options) {

        boolean isLocked = lockPrice(selectedFlight);
        boolean isReserved = reserveFlight(selectedFlight);

        if (!isReserved) {
            return "Flight no longer available.";
        }

        boolean paymentSuccess = paymentGateway.processPayment(customer.getPaymentInfo());

        if (paymentSuccess) {
            sendConfirmationEmail(customer, selectedFlight);
            return "Booking confirmed.";
        } else {
            return "Payment failed. Please try again.";
        }
    }

    private boolean lockPrice(Flight flight) {
        //Lock for 30 minutes - therefore it cannot be changed or modified for 30 minutes
        System.out.println("Price locked for 30 minutes for flight: " + flight.getFlightID());
        return true;
    }

    private boolean reserveFlight(Flight flight) {
        // Reserve seat 
        System.out.println("Seat reserved on flight: " + flight.getFlightID());
        return true;
    }

    private void sendConfirmationEmail(Customer customer, Flight flight) {
        emailService.sendEmail(customer.getEmail(), "Booking Confirmed for " + flight.getFlightID());
    }
}
