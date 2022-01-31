package Service;

import java.util.List;
import Model.Car;


public class CarServiceImpl implements CarService {

    @Override
    public List<Car> subCarList(List<Car> list, int quantity) {
        if (quantity >= 5) {
            return list;
        } else {
            return list.subList(0, quantity);
        }
    }
}


