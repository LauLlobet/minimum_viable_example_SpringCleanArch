


//----- IORest.java

@Get(PATH= /getweather/{city})
public Xml sayTheWeatherTo(String city){
    String query = "SELECT temp, rain FROM WEATHER WHERE city="+city;
    H2SqlRows rows = JdbTemplate.query(query);
    Xml weather = weatherReportMaker.report(rows);
    return answer;
}

public Xml minimumGoodWeatherRelativelyToThePlace(String city){
    return Integer.parseInt(httpRequest("192.168.1.5/minimumTempKelvin/"+city).getBody());
}

//----- WeatherReportMaker.java

private Xml report(H2SqlRows rows){
    int minimumGoodWeatherRelativelyToThePlace = IORest.minimumGoodWeatherRelativelyToThePlace(city) + 273;
    String report = "<Report>";
    if(rows.get(0) < minimumGoodWeatherRelativelyToThePlace && rows.get(1) == false){
        report += "<cold_but_good/>"
    }
    if(rows.get(0) < minimumGoodWeatherRelativelyToThePlace && rows.get(1) == true){
        report += "<bad_weather/>"
    }
    return report + "</Report>"
    
}