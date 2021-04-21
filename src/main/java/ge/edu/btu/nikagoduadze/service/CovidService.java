package ge.edu.btu.nikagoduadze.service;

import ge.edu.btu.nikagoduadze.models.Covid;
import ge.edu.btu.nikagoduadze.models.CovidMockData;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CovidService {
    @WebMethod
    public List<Covid> getStatistics() {
        CovidMockData data = new CovidMockData();

        return data.getStatistics();
    }

    @WebMethod
    public Covid CountryStatistic(String country) {
        CovidMockData data = new CovidMockData();

        for (Covid covid: data.getStatistics() ) {
            if(covid.getCountry().equals(country))
            {
                return covid;
            }
        }
        return new Covid("Country is not on our map", 0, 0, 0);
    }

    @WebMethod
    public long TotalConfirmed()
    {
        CovidMockData data = new CovidMockData();
        long total = 0;
        for (Covid country : data.getStatistics()) {
            total += country.getConfirmed();
        }

        return total;
    }

    @WebMethod
    public long TotalDeathGet()
    {
        CovidMockData data = new CovidMockData();
        long total = 0;
        for (Covid country : data.getStatistics()) {
            total += country.getDeath();
        }

        return total;
    }

    @WebMethod
    public long TotalRecoveryget()
    {
        CovidMockData data = new CovidMockData();
        long total = 0;
        for (Covid country : data.getStatistics()) {
            total += country.getRecovered();
        }

        return total;
    }


}
