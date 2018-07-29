package service;

import entity.AttributeSet;
import org.springframework.stereotype.Service;

public interface IAttributeSetService {
    AttributeSet addAttributeSet(AttributeSet attributeSet);
    AttributeSet changeAttributeSet(AttributeSet attributeSet);
    void deleteAttributeSet(AttributeSet attributeSet);
}
