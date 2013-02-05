package no.finntech.core.flight;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public final class FlightSearchRequest implements Serializable {
    private UUID searchId;
    private Date departureDate;
    private Date returnDate;
    private String from;
    private String to;

    public FlightSearchRequest(UUID searchId, Date departureDate, Date returnDate, String from, String to) {
        this.searchId = searchId;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.from = from;
        this.to = to;
    }

    public Date getDepartureDate() {
        return gdepartureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public UUID getSearchId() {
        return searchId;
    }

    @Override
    public String toString() {
        return "FlightSearchRequest{" +
                "searchId=" + searchId +
                ", departureDate=" + departureDate +
                ", returnDate=" + returnDate +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}

