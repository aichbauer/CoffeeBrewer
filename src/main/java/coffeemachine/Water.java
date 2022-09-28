package coffeemachine;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Water {
    @Setter(AccessLevel.PROTECTED)
    @Getter
    private int waterTemperature = 4;
}
