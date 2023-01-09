package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price; // 값이 0이 될 수도 있기 때문에 Int가 아닌 Integer
    private Integer quantity;


}
