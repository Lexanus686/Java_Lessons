package sample;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Iterator;

import static com.sun.glass.ui.Cursor.setVisible;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    GridPane table;

    @FXML
    TextField textField;

    @FXML
    ChoiceBox btnChoice;

    @FXML
    Button btn2;

    @FXML
    Button btnBackGround;

    private String[] files;
    final String[] filepath = {null};

    public void sendMsg() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public void ChooseBack() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose an image");
        File file = fileChooser.showOpenDialog(null);
        BackgroundImage back = new BackgroundImage(new Image(file.toURI().toString() , table.getPrefWidth(), table.getPrefHeight(), false, true), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        table.setBackground(new Background(back));
        System.out.println(file.getAbsolutePath());
    }

    public void ChooseMusic() {
        final Label labelSelectedDirectory = new Label();

        btn2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btn2.setText("Open Music Directory");
            }
        });

        btn2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btn2.setText("Music");
            }
        });

        btn2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (!btnChoice.getItems().isEmpty())
                {
                    while(!btnChoice.getItems().isEmpty())
                        btnChoice.getItems().remove(0);
                }

                DirectoryChooser directoryChooser = new DirectoryChooser();
                File selectedDirectory =
                        directoryChooser.showDialog(null);

                try {
                    filepath[0] = selectedDirectory.getAbsolutePath();
                    labelSelectedDirectory.setText(selectedDirectory.getAbsolutePath());
                    File folder = new File(filepath[0].toString());
                    files = folder.list(new FilenameFilter() {

                        @Override public boolean accept(File folder, String name) {
                            return name.endsWith(".mp3") || name.endsWith(".waw");
                        }

                    });
                    for ( String fileName : files ) {
                        //System.out.println("File: " + fileName);
                        btnChoice.getItems().add(fileName);
                    }
                } catch (NullPointerException e) {
                    labelSelectedDirectory.setText("No Directory selected");
                }
            }
        });
    }

    public void MusicPlay(){
        String TrackName = btnChoice.getValue().toString();
        Media hit = new Media(new File(filepath[0] + '\\' + TrackName).toURI().toString());
        MediaPlayer player = new MediaPlayer(hit);
        player.play();
    }
}
