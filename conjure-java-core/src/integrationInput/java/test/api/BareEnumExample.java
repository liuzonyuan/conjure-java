package test.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Locale;
import javax.annotation.Generated;

/** An enum that's just an enum. */
@Generated("com.palantir.conjure.java.types.EnumGenerator")
public enum BareEnumExample {
    ONE,

    TWO;

    /** Preferred, case-insensitive constructor for string-to-enum conversion. */
    @JsonCreator
    public static BareEnumExample fromString(String value) {
        return BareEnumExample.valueOf(value.toUpperCase(Locale.ROOT));
    }
}
