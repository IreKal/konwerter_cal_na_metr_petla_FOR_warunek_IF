package com.example.konwerter_cal_na_metr_petla_for_warunek_if;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        double metr, cal;
        int licznik;
        licznik = 0;
        for(cal = 1; cal <= 12*12 ; cal ++ ){
            metr = cal * .03937;
            System.out.println(cal + " cali to " + metr + " metrow " );
            licznik ++;
            if(licznik == 12){
                System.out.println();
                licznik = 0;
            }
        }

    }
}