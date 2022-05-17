public class StorageFacilityProgram {

    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "hoops");
        facility.add("a14", "loops");
        facility.add("a14", "coops");

        facility.add("f156", "box");
        facility.add("f156", "boxes");

        facility.add("g63", "seven");
        facility.add("g63", "three point fourteen");

        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));

    }
}