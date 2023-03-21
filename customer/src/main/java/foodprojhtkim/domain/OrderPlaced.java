package foodprojhtkim.domain;

import foodprojhtkim.domain.*;
import foodprojhtkim.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String orderno;
    private String storecode;
    private List<String> menu;
    private String address;
    private String riderid;
    private String status;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
