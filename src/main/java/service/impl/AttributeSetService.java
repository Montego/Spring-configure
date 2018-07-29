package service.impl;

import entity.AttributeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AttributeSetRepository;
import service.IAttributeSetService;

@Service
public class AttributeSetService implements IAttributeSetService {
    @Autowired
    private AttributeSetRepository attributeSetRepository;

    public AttributeSet getAttributeSet(AttributeSet attributeSet) {
        return null;
    }

}
