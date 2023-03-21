package foodprojhtkim.domain;

import foodprojhtkim.StoreApplication;
import foodprojhtkim.domain.CookFinished;
import foodprojhtkim.domain.CookStarted;
import foodprojhtkim.domain.Rejected;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cooking_table")
@Data
public class Cooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderno;

    @ElementCollection
    private List<String> menu;

    private String riderid;

    private String status;

    @PostPersist
    public void onPostPersist() {
        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();

        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();

        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();
    }

    public static CookingRepository repository() {
        CookingRepository cookingRepository = StoreApplication.applicationContext.getBean(
            CookingRepository.class
        );
        return cookingRepository;
    }

    public void accept() {
        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();
    }

    public void reject() {}

    public void start() {}

    public void finish() {}

    public static void loadOrderInfo(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        DeliveryConfirmed deliveryConfirmed = new DeliveryConfirmed(cooking);
        deliveryConfirmed.publishAfterCommit();
        FoodPicked foodPicked = new FoodPicked(cooking);
        foodPicked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);

            DeliveryConfirmed deliveryConfirmed = new DeliveryConfirmed(cooking);
            deliveryConfirmed.publishAfterCommit();
            FoodPicked foodPicked = new FoodPicked(cooking);
            foodPicked.publishAfterCommit();

         });
        */

    }

    public static void loadOrderInfo(OrderCancelled orderCancelled) {
        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        DeliveryConfirmed deliveryConfirmed = new DeliveryConfirmed(cooking);
        deliveryConfirmed.publishAfterCommit();
        FoodPicked foodPicked = new FoodPicked(cooking);
        foodPicked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);

            DeliveryConfirmed deliveryConfirmed = new DeliveryConfirmed(cooking);
            deliveryConfirmed.publishAfterCommit();
            FoodPicked foodPicked = new FoodPicked(cooking);
            foodPicked.publishAfterCommit();

         });
        */

    }

    public static void loadOrderInfo(FoodPicked foodPicked) {
        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        DeliveryConfirmed deliveryConfirmed = new DeliveryConfirmed(cooking);
        deliveryConfirmed.publishAfterCommit();
        FoodPicked foodPicked = new FoodPicked(cooking);
        foodPicked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(foodPicked.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);

            DeliveryConfirmed deliveryConfirmed = new DeliveryConfirmed(cooking);
            deliveryConfirmed.publishAfterCommit();
            FoodPicked foodPicked = new FoodPicked(cooking);
            foodPicked.publishAfterCommit();

         });
        */

    }

    public static void loadOrderInfo(DeliveryConfirmed deliveryConfirmed) {
        /** Example 1:  new item 
        Cooking cooking = new Cooking();
        repository().save(cooking);

        DeliveryConfirmed deliveryConfirmed = new DeliveryConfirmed(cooking);
        deliveryConfirmed.publishAfterCommit();
        FoodPicked foodPicked = new FoodPicked(cooking);
        foodPicked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryConfirmed.get???()).ifPresent(cooking->{
            
            cooking // do something
            repository().save(cooking);

            DeliveryConfirmed deliveryConfirmed = new DeliveryConfirmed(cooking);
            deliveryConfirmed.publishAfterCommit();
            FoodPicked foodPicked = new FoodPicked(cooking);
            foodPicked.publishAfterCommit();

         });
        */

    }
}
