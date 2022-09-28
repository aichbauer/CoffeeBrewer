package coffeemachine;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class CoffeeBean {
    @Setter(AccessLevel.PROTECTED)
    @Getter
    private boolean grinded = false;
}
