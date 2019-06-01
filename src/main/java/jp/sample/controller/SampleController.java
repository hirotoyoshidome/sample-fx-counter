package jp.sample.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * コントローラを実装
 *
 */
public class SampleController implements Initializable {

	/**
	 * ボタン（フィールドの名前とfx:idが紐づく）
	 */
	@FXML
	private Button button;

	/**
	 * ラベル
	 */
	@FXML
	private Label label;

	/**
	 * クリック回数
	 */
	private int count;

	/**
	 * フィールドの値を初期化する
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	/**
	 * クリックの回数をラベルに反映する
	 * 
	 * @param event
	 */
	@FXML
	public void onClick(ActionEvent event) {
		count = count + 1;
		System.out.println(count);
		this.label.setText(count + "times clicked");
	}

}
