package main;

import database.DatabaseInitializer;
import domain.InvestmentHandler;
import gui.RegisterLoginScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) {
		DatabaseInitializer.initialize();

		InvestmentHandler investmenthandler = new InvestmentHandler();

		RegisterLoginScreen startscreen = new RegisterLoginScreen(investmenthandler, primaryStage);

		Scene scene = new Scene(startscreen, 1000, 600);

		primaryStage.setTitle("Investment Tracker");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
