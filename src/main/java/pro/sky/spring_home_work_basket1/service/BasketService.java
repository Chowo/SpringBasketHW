package pro.sky.spring_home_work_basket1.service;

import java.util.List;

public interface BasketService {

    public void add(List<Integer> ids);

    public List<Integer> get();


}