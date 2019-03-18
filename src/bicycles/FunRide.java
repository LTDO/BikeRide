package bicycles;

import bicycles.models.BicycleType;

import java.util.ArrayList;

public class FunRide {

    int maxNum;

    private ArrayList<Bicycle> list = new ArrayList<Bicycle>(maxNum);

    public FunRide(int maxNum) {
        this.maxNum = maxNum;

    }

    public String accept(Bicycle bicycle) {
      //  list.add(bicycle);
//        System.out.println(list.size() < maxNum);
        if (list.size() < maxNum) {
            list.add(bicycle);
            return "Accepted";
        } else {
            return "Rejected";
        }
    }


    public int getCountForType(BicycleType bicycleType) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bicycles() == bicycleType) {
                maxNum++;
            }
        }
        return maxNum;

    }

        public int getEntertedCount(){

             return  list.size();
        }
    }



