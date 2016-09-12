package link.otomato.gradlecuke;

public class CukeBucket {
    private int cukes=0;

    public void put(int cukes) {
        this.cukes += cukes;
    }

    public void take(int cukes) {
        this.cukes -= cukes;
    }

    public String getState() {
        if (cukes == 0 ){
            return "empty";
        }
        else if (cukes < 200)
        {
            return "not full";
        }
        else if (cukes == 200)
        {
            return "full";
        }
        else if (cukes > 200)
        {
            return "crack";
        }
        else {
            return "unknown";
        }
    }
}
