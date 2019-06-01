package jp.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 画面の設定と起動
 *
 */
public class FXCounterMain extends Application {
	public static void main(String[] args) {
		// 起動
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		String path = "Main.fxml";
		String title = "sample";
		// fxmlのロード
		Parent root = FXMLLoader.load(getClass().getResource(path));
		// タイトル設定
		stage.setTitle(title);
		// Sceneの作成
		Scene scene = new Scene(root);
		// sceneをセット
		stage.setScene(scene);
		// 公開
		stage.show();
	}
}
