package jangsubee.dddshop.infra;

import jangsubee.dddshop.order.domain.Money;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MoneyConverter implements AttributeConverter<Money, Long> {

    @Override
    public Long convertToDatabaseColumn(Money attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getValue();
    }

    @Override
    public Money convertToEntityAttribute(Long dbData) {
        if (dbData == null) {
            return null;
        }
        return new Money(dbData);
    }
}
