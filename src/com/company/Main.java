package com.company;

import com.fatorymethod.logistics.Logistics;
import com.fatorymethod.logistics.ShipLogistics;
import com.fatorymethod.logistics.TruckLogistics;
import com.fatorymethod.referee.BasketballReferee;
import com.fatorymethod.referee.Referee;
import com.fatorymethod.referee.TableTennisReferee;

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
