package pro.sky.spring_home_work_basket1.service;

import org.springframework.stereotype.Service;
import pro.sky.spring_home_work_basket1.model.Basket;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Integer> ids) {
        basket.add(ids);

    }

    @Override
    public List<Integer> get() {
        return basket.getBasketList();
    }
}

