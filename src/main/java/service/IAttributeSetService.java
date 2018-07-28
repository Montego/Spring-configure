package service;

import entity.AttributeSet;
import org.springframework.stereotype.Service;

@Service
public interface IAttributeSetService {
    AttributeSet addAttributeSet(AttributeSet attributeSet);
    AttributeSet changeAttributeSet(AttributeSet attributeSet);
    void deleteAttributeSet(AttributeSet attributeSet);
}
