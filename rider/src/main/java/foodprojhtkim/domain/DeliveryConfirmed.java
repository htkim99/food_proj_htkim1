package foodprojhtkim.domain;

import foodprojhtkim.domain.*;
import foodprojhtkim.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryConfirmed extends AbstractEvent {

    private Long id;
    private String orderno;
    private String storecode;
    private String address;
    private String status;

    public DeliveryConfirmed(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryConfirmed() {
        super();
    }
}
