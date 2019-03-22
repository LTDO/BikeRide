package bicycles;

import bicycles.models.Bicycle;
import bicycles.models.BicycleType;

import java.util.ArrayList;

public class FunRide {

    int maxNum;

    private ArrayList<Bicycle> list = new ArrayList<>(maxNum);

     FunRide(int maxNum) {
        this.maxNum = maxNum;

    }
    String accept(Bicycle bicycle) {
        if (list.size() < maxNum) {
            list.add(bicycle);
            return "Accepted";
        } else {
            return "Rejected";
        }
    }
    int getCountForType(BicycleType bicycleType) {
            if (list.contains(bicycleType)) {
                maxNum++;
            }return maxNum;
    }
        int getEnteredCount(){return list.size();}
    }



