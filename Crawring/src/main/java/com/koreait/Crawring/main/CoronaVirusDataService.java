package com.koreait.Crawring.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Service
public class CoronaVirusDataService {

    String encodingString = "크루엘라";

    static String encodeResult = "";

    {
        try {
            encodeResult = URLEncoder.encode( encodingString, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    private static String KOREA_COVID_DATAS_URL = "https://www.youtube.com/results?search_query=" + encodeResult;

    @PostConstruct
    public void getKoreaCovidDatas() throws IOException {

        Document doc = Jsoup.connect(KOREA_COVID_DATAS_URL).get();
        System.out.println(doc);


    }



}
