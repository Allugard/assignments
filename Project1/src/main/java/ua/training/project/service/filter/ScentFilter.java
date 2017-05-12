package main.java.ua.training.project.service.filter;

import main.java.ua.training.project.model.entity.coffee.Coffee;
import main.java.ua.training.project.model.entity.packaging.Packaging;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Verner on 10.05.2017.
 */
public class ScentFilter extends Filter {

    public ScentFilter(double leftLimit, double rightLimit) {
        super(leftLimit, rightLimit);
    }

    @Override
    protected void execute(List<Packaging> packagings) {
        Iterator<Packaging> iterator = packagings.iterator();
        while (iterator.hasNext()){
            Packaging buf = iterator.next();
            if(((Coffee) buf.getProduct()).getKindOfCoffee().getScent()<leftLimit ||
                    ((Coffee) buf.getProduct()).getKindOfCoffee().getScent()>rightLimit){
                iterator.remove();
            }
        }
    }
}
