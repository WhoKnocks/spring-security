package be.axxes.demo.model;

import org.immutables.value.Value;

@Value.Immutable
public interface SimpleDto {

    @Value.Parameter
    String getValue();
}
