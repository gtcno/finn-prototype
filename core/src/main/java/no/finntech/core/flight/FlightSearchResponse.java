package no.finntech.core.flight;

import java.util.Date;
import java.util.UUID;

public final class FlightSearchResponse {
    private UUID searchId;
    private String deeplinkURL;
    private Date departureDate;
    private Date arrivalDate;
    private String from;
    private String to;
    private Double price;

    public FlightSearchResponse(UUID searchId, String deeplinkURL, Date departureDate, Date arrivalDate, String from, String to, Double price) {
        this.searchId = searchId;
        this.deeplinkURL = deeplinkURL;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public UUID getSearchId() {
        return searchId;
    }

    public String getDeeplinkURL() {
        return deeplinkURL;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightSearchResponse{" +
                "searchId=" + searchId +
                ", deeplinkURL='" + deeplinkURL + '\'' +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                '}';
    }
}

