package foodprojhtkim.domain;

import foodprojhtkim.domain.*;
import foodprojhtkim.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String orderno;
    private String storecode;
    private Object menu;
    private String address;
    private String riderid;
    private String status;
}
