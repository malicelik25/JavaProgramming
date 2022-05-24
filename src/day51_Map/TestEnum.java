package day51_Map;

public class TestEnum {

    public static void main(String[] args) {

        Browser browser = Browser.SAFARI;

        switch (browser){
            case FIREFOX:
                System.out.println("Firefox is selected");

            case SAFARI:
                System.out.println("Safari is selected");

            case OPERA:
                System.out.println("Opera is selected");

            case EDGE:
                System.out.println("Edge is selected");

            default:
                System.out.println("Chrome is selected");
        }

        System.out.println("---------------------------------");

        Season season = Season.SUMMER;


    }

}
