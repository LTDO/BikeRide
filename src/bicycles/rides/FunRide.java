package bicycles.rides;

import bicycles.models.Bicycle;
import bicycles.models.BicycleType;

import java.util.ArrayList;

public class FunRide {

    int maxNum;

    private ArrayList<Bicycle> list = new ArrayList<>(maxNum);

     public FunRide(int maxNum) {
        this.maxNum = maxNum;

    }
    public String accept(Bicycle bicycle) {
        if (list.size() < maxNum) {
            list.add(bicycle);
            return "Accepted";
        } else {
            return "Rejected";
        }
    }
    public int getCountForType(BicycleType bicycleType) {
            if (list.contains(bicycleType)) {
                maxNum++;
            }return maxNum;
    }
        public int getEnteredCount(){return list.size();}
    }



