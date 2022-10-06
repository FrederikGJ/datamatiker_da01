package Task02;

import java.util.ArrayList;

public class Main
{
    public static Rooms room01 = new Rooms(2,1,3);
    public static Rooms room02 = new Rooms(1,3,2);
    public static Rooms room03 = new Rooms(1,1,1);

    public static ArrayList<Rooms> arrRooms = new ArrayList<>()
    {{

        add(room01);
        add(room02);
        add(room03);


    }};

    public static void main(String[] args)
    {
        Building build01 = new Building(arrRooms,3,4,true);



    }

    public static int countLampsInBuilding(Building building)
    {
        int totalLamps = 0;

        for (Rooms arrRooms: building.getRooms())
        {
            totalLamps += arrRooms.getNumberOfLamps();
        }


        return totalLamps;
    }


    public static boolean isNormal(Building building)
    {
        if(building.getNumberOfFloors() > building.getRooms().size())
        {
            return true;
        }

        System.out.println("this is an odd building ");
        return  false;
    }

}

