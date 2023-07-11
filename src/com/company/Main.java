package com.company;

import com.creational_patterns.fatorymethod.logistics.Logistics;
import com.creational_patterns.fatorymethod.logistics.ShipLogistics;
import com.creational_patterns.fatorymethod.logistics.TruckLogistics;
import com.creational_patterns.fatorymethod.referee.BasketballReferee;
import com.creational_patterns.fatorymethod.referee.Referee;
import com.creational_patterns.fatorymethod.referee.TableTennisReferee;

public class Main {

    public static void main(String[] args) {
        Logistics a = new TruckLogistics();
        a.planDelivery();
        Logistics b = new ShipLogistics();
        b.planDelivery();

        Referee c = new BasketballReferee();
        c.show();
        Referee d = new TableTennisReferee();
        d.show();
    }
}
