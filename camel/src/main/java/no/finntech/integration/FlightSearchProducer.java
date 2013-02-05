package no.finntech.integration;

import no.finntech.core.flight.FlightSearchRequest;
import no.finntech.core.flight.FlightSearchResponse;

public interface FlightSearchProducer {
    /**
     * Should this producer handle this message. Things that may have an impact on this decision
     * <ul>
     * <li>Is the chosen destination on the O&D-list of the supplier?</li>
     * <li>Are there any business rules that prevent us from performing this search? E.g. are we allowed to
     * sell OSL-NYC from Expedia?</li>
     * </ul>
     *
     * @param message The message containing information about the requested search
     * @return true if producer should handle this message
     */
    Boolean isApplicable(FlightSearchRequest message);

    /**
     * Create a response from this message
     *
     * @param request the request
     * @return the response
     */
    FlightSearchResponse sendSearchRequest(FlightSearchRequest request);

}
