package service;

import org.springframework.stereotype.Service;

@Service
public interface IAttributeSetService {
    void addAttributeSet();
    void changeAttributeSet();
    void deleteAttributeSet();
}
