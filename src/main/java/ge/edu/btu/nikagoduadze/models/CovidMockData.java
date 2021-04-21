package ge.edu.btu.nikagoduadze.models;

import java.util.ArrayList;
import java.util.List;

public class CovidMockData {
    private List<Covid> statistics;

    public CovidMockData()
    {
        this.statistics = new ArrayList<>();

        statistics.add(new Covid("Georgia", 123213, 123123, 123123));
        statistics.add(new Covid("USA", 123213, 123123, 123123));
        statistics.add(new Covid("Russia", 12321321, 123123, 123123));
        statistics.add(new Covid("Canada", 12321323, 123123, 123123));
        statistics.add(new Covid("Brazil", 12331467, 123123, 123123));
        statistics.add(new Covid("Germany", 12325113, 123123, 123123));

    }

    public List<Covid> getStatistics() {
        return statistics;
    }
}
